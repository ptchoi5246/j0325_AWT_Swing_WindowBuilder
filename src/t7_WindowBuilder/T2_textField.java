package t7_WindowBuilder;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class T2_textField extends JFrame {
	private JTextField txtMid, txtName, txtAge;
	private JButton btnSubmit, btnReset, btnExit;
	private JPasswordField txtPwd;
	
	private String regAge = "^[0-9]+$"; //나이 정규식
	

	public T2_textField() {
		super("회원가입");
		setSize(600, 480);
		getContentPane().setLayout(null);

		
		JPanel pn1 = new JPanel();
		pn1.setBackground(Color.ORANGE);
		pn1.setBounds(12, 10, 560, 62);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회 원 가 입");
		lblNewLabel.setBackground(SystemColor.info);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 536, 42);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(Color.YELLOW);
		pn2.setBounds(12, 88, 560, 279);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblMid = new JLabel("아이디");
		lblMid.setHorizontalAlignment(SwingConstants.CENTER);
		lblMid.setFont(new Font("굴림", Font.PLAIN, 18));
		lblMid.setBounds(35, 26, 124, 34);
		pn2.add(lblMid);
		
		JLabel lblPwd = new JLabel("비밀번호");
		lblPwd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwd.setFont(new Font("굴림", Font.PLAIN, 18));
		lblPwd.setBounds(35, 91, 124, 34);
		pn2.add(lblPwd);
		
		JLabel lblName = new JLabel("성 명");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("굴림", Font.PLAIN, 18));
		lblName.setBounds(35, 156, 124, 34);
		pn2.add(lblName);
		
		txtMid = new JTextField();
		txtMid.setFont(new Font("굴림", Font.PLAIN, 18));
		txtMid.setBounds(209, 23, 276, 41);
		pn2.add(txtMid);
		txtMid.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.PLAIN, 18));
		txtName.setColumns(10);
		txtName.setBounds(209, 153, 276, 41);
		pn2.add(txtName);
		
		JLabel lblAge = new JLabel("나 이");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("굴림", Font.PLAIN, 18));
		lblAge.setBounds(35, 224, 124, 34);
		pn2.add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("굴림", Font.PLAIN, 18));
		txtAge.setColumns(10);
		txtAge.setBounds(209, 221, 276, 41);
		pn2.add(txtAge);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(209, 91, 276, 41);
		pn2.add(txtPwd);
		
		JLabel lblImage = new JLabel("");
		//lblImage.setIcon(new ImageIcon("D:\\javaclass\\java\\works\\j0325_AWT_Swing_WindowBuilder\\myimages\\4.jpg")); /이러면 안된다!!!!!
		//lblImage.setIcon(new ImageIcon(Test2.class.getResource("../../myimages/1.jpg"))); //폴더를 만들어서 이미지 저장
		lblImage.setIcon(new ImageIcon(T2_textField.class.getResource("/t7_WindowBuilder/images/16.jpg"))); //폴더를 만들어서 이미지 저장 가장 쉽다
		lblImage.setBounds(0, 0, 560, 279);
		pn2.add(lblImage);
		
		
		JPanel pn3 = new JPanel();
		pn3.setBackground(Color.CYAN);
		pn3.setBounds(12, 381, 560, 50);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnSubmit = new JButton("회원가입");
		btnSubmit.setFont(new Font("굴림", Font.PLAIN, 18));
		btnSubmit.setBounds(43, 10, 118, 30);
		pn3.add(btnSubmit);
		
		btnReset = new JButton("다시입력");
		btnReset.setFont(new Font("굴림", Font.PLAIN, 18));
		btnReset.setBounds(218, 10, 118, 30);
		pn3.add(btnReset);
		
		btnExit = new JButton("종료");
		btnExit.setIcon(new ImageIcon(T2_textField.class.getResource("/t7_WindowBuilder/images/exit.jpg"))); //패키지 이미지 저장
		btnExit.setFont(new Font("굴림", Font.PLAIN, 18));
		btnExit.setBounds(394, 10, 118, 30);
		pn3.add(btnExit);
		
		// --------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null); //윈도우 창을 가운데 정렬
		setResizable(false); //윈도우창 사이즈 조절 불가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 버튼 활성화
		setVisible(true);
		// --------------------- 아래쪽은 메소드 ----------------------------------------
		
		// 회원가입 버튼
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtMid.getText().trim().equals("")) { //.trim 공백제거
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요~!");
					txtMid.requestFocus();
				}
				else if(txtPwd.getText().trim().equals("")) { //.trim 공백제거
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요~!");
					txtPwd.requestFocus();
				}
				else if(txtName.getText().trim().equals("")) { //.trim 공백제거
					JOptionPane.showMessageDialog(null, "성명을 입력하세요~!");
					txtName.requestFocus();
				}
//				else if(txtAge.getText().trim().equals("regAge")) { //.trim 공백제거
//					JOptionPane.showMessageDialog(null, "나이를 입력하세요~!");
//					txtAge.requestFocus();
//				}
				else if(!Pattern.matches(regAge, txtAge.getText().trim())){
					JOptionPane.showMessageDialog(null, "나이는 숫자만 입력하세요.");
					txtAge.requestFocus();
				}
				else {
					JOptionPane.showMessageDialog(null, "반갑습니다 :) 회원가입이 완료되었습니다.");
					
				}
				
			}
		});
		
		// 다시입력 버튼
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMid.setText("");
				txtPwd.setText("");
				txtName.setText("");
				txtAge.setText("");
				txtMid.requestFocus();
			}
		});
		
		// 종료 버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T2_textField();
	}
}
