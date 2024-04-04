package t7_WindowBuilder;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

import t8_insa.InsaDAO;

public class T7_2JTable extends JFrame {
	private JTable table;
	private Vector title, vData;
	private JScrollPane scrollPane;
	private DefaultTableModel dtm;
	
	InsaDAO dao = new InsaDAO();

	public T7_2JTable() {
		super("테이블 연습");
		setSize(600, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 584, 62);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 62, 584, 379);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		title = new Vector<>();
		title.add("번호");
		title.add("성명");
		title.add("나이");
		title.add("성별");
		title.add("입사일");
		
		vData = dao.getInsaList();
		
		dtm = new DefaultTableModel(vData, title);

		table = new JTable(dtm);
		//scrollPane.setViewportView(table);
		
		// 테이블의 내용을 행(타이틀)이름으로 정렬(오름차순/내림차순)하고자 한다면??
		table.setRowSorter(new TableRowSorter(dtm));
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 10, 560, 359);
		pn2.add(scrollPane);
		
		table.getColumnModel().getColumn(0).setMaxWidth(50);
//		table.getColumnModel().getColumn(0).setResizable(false);
		
		
		// 셀안의 내용 정렬하기
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
//		tcm.getColumn(2).setCellRenderer(dtcr);
		
		for(int i=0; i<5; i++) {
			table.getColumnModel().getColumn(i).setResizable(false);
			tcm.getColumn(i).setCellRenderer(dtcr);
		}
// -------------------------------------------------------
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new T7_2JTable();
	}
}
