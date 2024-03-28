package t8_insa;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "rawtypes", "unchecked", "serial" })
public class InsaSearch extends JFrame {
	private JButton btnUpdate, btnDelete, btnClose;
	private JTextField txtName, txtAge;
	private final ButtonGroup btnGroupGender = new ButtonGroup();
	JComboBox cbYY, cbMM, cbDD;
	
	InsaDAO dao = new InsaDAO();
	InsaVO vo = null;
	int res = 0;

	public InsaSearch(InsaVO vo) {
		super("회원가입창");
		setSize(800, 600);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 76);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		

		
		JLabel lblTitle = new JLabel("회원 개별조회(수정/삭제처리)");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 28));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(122, 20, 542, 33);
		pn1.add(lblTitle);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 76, 784, 407);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblName = new JLabel("성    명");
		lblName.setFont(new Font("굴림", Font.PLAIN, 20));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(137, 45, 133, 45);
		pn2.add(lblName);
		
		JLabel lblAge = new JLabel("나    이");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("굴림", Font.PLAIN, 20));
		lblAge.setBounds(137, 135, 133, 45);
		pn2.add(lblAge);
		
		JLabel lblGender = new JLabel("성    별");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("굴림", Font.PLAIN, 20));
		lblGender.setBounds(137, 225, 133, 45);
		pn2.add(lblGender);
		
		JLabel lblIpsail = new JLabel("입 사 일");
		lblIpsail.setHorizontalAlignment(SwingConstants.CENTER);
		lblIpsail.setFont(new Font("굴림", Font.PLAIN, 20));
		lblIpsail.setBounds(137, 315, 133, 45);
		pn2.add(lblIpsail);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setFont(new Font("굴림", Font.PLAIN, 20));
		txtName.setBounds(330, 45, 290, 45);
		pn2.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtAge.setFont(new Font("굴림", Font.PLAIN, 20));
		txtAge.setColumns(10);
		txtAge.setBounds(330, 135, 290, 45);
		pn2.add(txtAge);
		
		JRadioButton rdGenderMale = new JRadioButton("남  자");
		btnGroupGender.add(rdGenderMale);
		rdGenderMale.setFont(new Font("굴림", Font.PLAIN, 20));
		rdGenderMale.setBounds(342, 225, 106, 45);
		pn2.add(rdGenderMale);
		
		JRadioButton rdGenderFeMale = new JRadioButton("여  자");
		btnGroupGender.add(rdGenderFeMale);
		rdGenderFeMale.setSelected(true);
		rdGenderFeMale.setFont(new Font("굴림", Font.PLAIN, 20));
		rdGenderFeMale.setBounds(503, 225, 106, 45);
		pn2.add(rdGenderFeMale);
		
		// 년도/월/일 초기값 생성하기
		String[] yy = new String[25];
		String[] mm = new String[12];
		String[] dd = new String[31];
		
		int imsi = 0;
		for(int i=0; i<yy.length; i++) {
			imsi = 2024 - i;
			yy[i] = imsi + "";
		}
		for(int i=0; i<mm.length; i++) {
			mm[i] = (i+1) + "";
		}
		for(int i=0; i<dd.length; i++) {
			dd[i] = (i+1) + "";
		}
		
		cbYY = new JComboBox(yy);
		cbYY.setFont(new Font("굴림", Font.PLAIN, 20));
		cbYY.setBounds(303, 319, 84, 36);
		pn2.add(cbYY);
		
		cbMM = new JComboBox(mm);
		cbMM.setFont(new Font("굴림", Font.PLAIN, 20));
		cbMM.setBounds(444, 319, 72, 36);
		pn2.add(cbMM);
		
		cbDD = new JComboBox(dd);
		cbDD.setFont(new Font("굴림", Font.PLAIN, 20));
		cbDD.setBounds(573, 319, 84, 36);
		pn2.add(cbDD);
		
		JLabel lblNewLabel = new JLabel("년");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(399, 315, 33, 45);
		pn2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("월");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(528, 315, 33, 45);
		pn2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("일");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(667, 315, 33, 45);
		pn2.add(lblNewLabel_2);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 485, 784, 76);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnUpdate = new JButton("수정하기");
		btnUpdate.setFont(new Font("굴림", Font.PLAIN, 22));
		btnUpdate.setBounds(57, 10, 185, 56);
		pn3.add(btnUpdate);
		
		btnDelete = new JButton("삭제하기");
		btnDelete.setFont(new Font("굴림", Font.PLAIN, 22));
		btnDelete.setBounds(299, 10, 185, 56);
		pn3.add(btnDelete);
		
		btnClose = new JButton("창 닫 기");
		btnClose.setFont(new Font("굴림", Font.PLAIN, 22));
		btnClose.setBounds(541, 10, 185, 56);
		pn3.add(btnClose);
		
		
		// vo에 담겨서 넘어온 회원의 정보를 검색창에 뿌려주도록 한다.
		txtName.setText(vo.getName());
		txtAge.setText(vo.getAge()+"");
		
		if(vo.getGender().equals("남자")) rdGenderMale.setSelected(true);
		if(vo.getGender().equals("여자")) rdGenderFeMale.setSelected(true);
		
		// DB의 날짜형식을 콤보상자의 날짜형식과 일치시켜서 비교하기 위한 작업
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-M-d");	// 2024-03-25을 2024-3-25로 변경하기위한 준비
		LocalDate date = LocalDate.parse(vo.getIpsail().substring(0,10),dtf);
		String strDate = date.format(dtf);
		String[] ymds = strDate.split("-");
		cbYY.setSelectedItem(ymds[0]);
		cbMM.setSelectedItem(ymds[1]);
		cbDD.setSelectedItem(ymds[2]);
		
		
		// --------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null);	// 윈도우창을 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 윈도우 종료버튼 활성화
		setVisible(true);
		// --------------------- 아래쪽은 메소드 ----------------------------------------

		// 회원정보 수정 버튼
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String age = txtAge.getText().trim();
				String gender = "";
				String ipsail = cbYY.getSelectedItem()+"-"+cbMM.getSelectedItem()+"-"+cbDD.getSelectedItem();
				
				// 유효성 검사
				if(!Pattern.matches("^[0-9]+$", age)) {
					JOptionPane.showMessageDialog(null, "나이는 숫자로 입력하세요");
					txtAge.requestFocus();
				}
				else {
					if(rdGenderMale.isSelected()) gender = "남자";
					else gender = "여자";
					
					// 모든체크가 끝나면 DB에 새로운 회원정보를 수정처리한다.
					vo.setName(txtName.getText());
					vo.setAge(Integer.parseInt(age));
					vo.setGender(gender);
					vo.setIpsail(ipsail);
					
					res = dao.setInsaUpdate(vo);
					
					if(res != 0) {
						JOptionPane.showMessageDialog(null, "회원정보가 수정되었습니다.");
					}
					else {
						JOptionPane.showMessageDialog(null, "회원정보 수정 실패~~");
					}
				}
			}
		});
		
		// 삭제 버튼
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				
				int ans = JOptionPane.showConfirmDialog(null, name + "회원을 삭제하시겠습니까?", "회원삭제창", JOptionPane.YES_NO_OPTION);
				if(ans == 0) {
					res = dao.setInsaDelete(name);
					if(res != 0) {
						JOptionPane.showMessageDialog(null, name + "회원 삭제 완료!!!");
						dispose();
						new InsaMain();
					}
					else JOptionPane.showMessageDialog(null, name + "회원 삭제 실패~~~");
				}
				else JOptionPane.showMessageDialog(null, name + "회원 삭제 취소!!!");
			}
		});
		
		// 창닫기 버튼
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.exit(0);
				dispose();
				new InsaMain();
			}
		});
		
	}
	
//	public static void main(String[] args) {
//		new InsaInput();
//	}
}
