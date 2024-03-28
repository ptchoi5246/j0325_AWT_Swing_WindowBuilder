package t7_WindowBuilder;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class T5_Combo_ListBox extends JFrame {
	JButton btnCombo, btnExit, btnList1;
	JComboBox comboJob;
	JLabel lblMessage;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public T5_Combo_ListBox() {
		super("콤보상자 연습");
		setSize(600, 500);
		getContentPane().setLayout(null);
		
		JPanel pn4 = new JPanel();
		pn4.setBounds(0, 370, 584, 81);
		getContentPane().add(pn4);
		pn4.setLayout(null);
		
		lblMessage = new JLabel("출력메세지");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("굴림", Font.BOLD, 16));
		lblMessage.setBounds(12, 10, 560, 61);
		pn4.add(lblMessage);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 309, 584, 61);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnCombo = new JButton("콤보출력");
		btnCombo.setFont(new Font("굴림", Font.PLAIN, 16));
		btnCombo.setBounds(0, 10, 107, 41);
		pn3.add(btnCombo);
		

		btnExit = new JButton("종료버튼");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 16));
		btnExit.setBounds(448, 10, 136, 41);
		pn3.add(btnExit);
		
		btnList1 = new JButton("리스트상자출력1");
		btnList1.setFont(new Font("굴림", Font.PLAIN, 16));
		btnList1.setBounds(107, 10, 165, 41);
		pn3.add(btnList1);
		
		JButton btnList2 = new JButton("리스트상자출력2");
		
		btnList2.setFont(new Font("굴림", Font.PLAIN, 16));
		btnList2.setBounds(275, 10, 165, 41);
		pn3.add(btnList2);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 293, 309);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("직업을 선택하세요");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setBounds(12, 10, 269, 45);
		pn1.add(lblNewLabel);
		
		comboJob = new JComboBox();
		comboJob.setModel(new DefaultComboBoxModel(new String[] {"학  생", "회사원", "군  인", "변호사", "의  사", "공무원", "기  타"}));
		comboJob.setFont(new Font("굴림", Font.PLAIN, 16));
		comboJob.setBounds(12, 62, 269, 36);
		pn1.add(comboJob);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 108, 269, 191);
		pn1.add(scrollPane_1);
		
		JTextArea txtaMemo = new JTextArea();
		scrollPane_1.setViewportView(txtaMemo);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(296, 0, 288, 309);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JList listJob = new JList();
		listJob.setModel(new AbstractListModel() {
			String[] values = new String[] {"학생", "의사", "변호사", "회계사", "판사", "군인", "공무원", "간호사", "역무원", "기타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listJob.setBounds(12, 28, 264, 112);
		pn2.add(listJob);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 150, 264, 149);
		pn2.add(scrollPane);
		
		JList listJob2 = new JList();
		listJob2.setModel(new AbstractListModel() {
			String[] values = new String[] {"학생", "의사", "변호사", "회계사", "판사", "군인", "공무원", "간호사", "역무원", "기타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(listJob2);
		
    // --------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null);	// 윈도우창을 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 윈도우 종료버튼 활성화
		setVisible(true);
	  // --------------------- 아래쪽은 메소드 ----------------------------------------

		// 리스트상자2출력버튼(리스트상자2의 내용을 선택하면 왼쪽 메모창에 내용을 출력시켜준다.)
//		btnList2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String msg = "";
//				Object[] jobs = listJob2.getSelectedValuesList().toArray();
//				for(Object job : jobs) msg += job + "\n";
//				//msg = msg.substring(0, msg.length()-1);
//				txtaMemo.setText(msg);
//			}
//		});
		btnList2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtaMemo.append(listJob2.getSelectedValue() + "\n");
			}
		});

		// 리스트상자출력1...버튼
		btnList1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
				//Object[] jobs = listJob.getSelectedValues();
				Object[] jobs = listJob.getSelectedValuesList().toArray();
				for(Object job : jobs) {
					msg += job + "/";
				}
				msg = msg.substring(0, msg.length()-1);
				
				lblMessage.setText(msg);
			}
		});
		
		// 콤보상자의 내용 출력하는 버튼
		btnCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = comboJob.getSelectedItem().toString() + "("+comboJob.getSelectedIndex()+")";
				lblMessage.setText(msg);
			}
		});
		
		// 종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new T5_Combo_ListBox();
	}
}


