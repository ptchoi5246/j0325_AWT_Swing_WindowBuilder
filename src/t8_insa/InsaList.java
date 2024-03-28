package t8_insa;

import java.awt.Font;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class InsaList extends JFrame {
	private JTextField txtCondition;
	private final ButtonGroup buttonGroupGender = new ButtonGroup();
	private JTable table;
	private Vector title, vData;
	private DefaultTableModel dtm;
	private JScrollPane scrollPane;
	private JComboBox cbCondition;
	private JButton btnCondition, btnList, btnExit, btnIpsailAsc, btnIpsailDesc;
	private JRadioButton rdMale, rdFemale;
	
	InsaDAO dao = new InsaDAO();
	
	public InsaList() {
		super("전체 조회");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 57);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		cbCondition = new JComboBox();
		cbCondition.setFont(new Font("굴림", Font.PLAIN, 16));
		cbCondition.setModel(new DefaultComboBoxModel(new String[] {"성명", "나이", "성별", "입사일"}));
		cbCondition.setBounds(12, 10, 112, 37);
		pn1.add(cbCondition);
		
		txtCondition = new JTextField();
		txtCondition.setBounds(136, 10, 141, 37);
		pn1.add(txtCondition);
		txtCondition.setColumns(10);
		
		btnCondition = new JButton("조건검색");
		btnCondition.setFont(new Font("굴림", Font.PLAIN, 18));
		btnCondition.setBounds(289, 10, 141, 37);
		pn1.add(btnCondition);
		
		btnList = new JButton("전체검색");
		btnList.setFont(new Font("굴림", Font.PLAIN, 18));
		btnList.setBounds(455, 10, 141, 37);
		pn1.add(btnList);
		
		btnExit = new JButton("종  료");
		
		btnExit.setFont(new Font("굴림", Font.PLAIN, 18));
		btnExit.setBounds(619, 10, 141, 37);
		pn1.add(btnExit);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 60, 784, 441);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		//JScrollPane scrollPane = new JScrollPane();
		//scrollPane.setBounds(12, 10, 760, 421);
		//pn2.add(scrollPane);
		
		//table = new JTable();
		//scrollPane.setViewportView(table);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 504, 784, 57);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		rdFemale = new JRadioButton("여  자");
		buttonGroupGender.add(rdFemale);
		rdFemale.setFont(new Font("굴림", Font.PLAIN, 18));
		rdFemale.setBounds(21, 17, 82, 23);
		pn3.add(rdFemale);
		
		rdMale = new JRadioButton("남  자");
		buttonGroupGender.add(rdMale);
		rdMale.setFont(new Font("굴림", Font.PLAIN, 18));
		rdMale.setBounds(131, 18, 82, 23);
		pn3.add(rdMale);
		
		btnIpsailAsc = new JButton("입사일오름차순");
		
		btnIpsailAsc.setFont(new Font("굴림", Font.PLAIN, 16));
		btnIpsailAsc.setBounds(426, 10, 163, 37);
		pn3.add(btnIpsailAsc);
		
		btnIpsailDesc = new JButton("입사일내림차순");
		btnIpsailDesc.setFont(new Font("굴림", Font.PLAIN, 16));
		btnIpsailDesc.setBounds(609, 10, 163, 37);
		pn3.add(btnIpsailDesc);
		
		// JTable설계
		title = new Vector<>();
		title.add("번호");
		title.add("성명");
		title.add("나이");
		title.add("성별");
		title.add("입사일");
		
		vData = dao.getInsaList("","");
		dtm = new DefaultTableModel(vData, title);
		
		table = new JTable(dtm);
		table.setRowSorter(new TableRowSorter(dtm));
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 10, 760, 421);
		
		pn2.add(scrollPane);
		
		
		// 위쪽으로 UI 영역
// ----------------------------------------------------------
		// 아래로 메소드 영역
		
		// 전체 검색버튼 키보드 엔터키 입력시
		btnList.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				totalSearch();
			};
		});
		
		// 전체 검색버튼 마우스 클릭시
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalSearch();
			}
		});
		
		// 조건검색처리 키보드로 엔터키 입력시 처리할 내용
		btnCondition.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				conditionSearch();
			}
		});
		
		
		// 조건검색처리 마우스로 클릭시 처리할 내용
		btnCondition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conditionSearch();
			}
		});
		
		// 입사일 오름차순버튼 클릭
		btnIpsailAsc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vData = dao.getInsaList("ipsail", "a");
				dtm.setDataVector(vData, title);
			}
		});
		
		// 입사일 내름차순버튼 클릭
		btnIpsailDesc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vData = dao.getInsaList("ipsail", "d");
				dtm.setDataVector(vData, title);
			}
		});
		
		// 종료 버튼 클릭
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new InsaMain();
			}
		});
		
		
// ----------------------------------------------------------
		setVisible(true);
	}

	// 전체 검색시 처리할 메소드...
	protected void totalSearch() {
		vData = dao.getInsaList("", "");
		dtm.setDataVector(vData, title);
	}

	// 조건 검색시 처리할 메소드....
	protected void conditionSearch() {
		String cbCondi = cbCondition.getSelectedItem().toString();
		String txtCondi = txtCondition.getText();
		
		if(txtCondi.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "검색할 내용을 입력하세요!");
			txtCondition.requestFocus();
			return;
		}
		
		if(cbCondi.equals("성명")) vData = dao.getConditionSearch("name", txtCondi);
		else if(cbCondi.equals("나이")) {
			if(!Pattern.matches("^[0-9]+$", txtCondi)) {
				JOptionPane.showMessageDialog(null, "나이는 숫자로 입력하세요");
				txtCondition.requestFocus();
			}
			else vData = dao.getConditionSearch("age", txtCondi);
		}
		else if(cbCondi.equals("성별")) vData = dao.getConditionSearch("gender", txtCondi);
		else if(cbCondi.equals("입사일")) vData = dao.getConditionSearch("ipsail", txtCondi);
		
		dtm.setDataVector(vData, title);
	}
	
//	public static void main(String[] args) {
//		new InsaList();
//	}
}
