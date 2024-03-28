package t7_WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class T4_Radio_CheckBox extends JFrame {

	JRadioButton rdMale, rdFemale;
	JCheckBox ckHobby1, ckHobby2, ckHobby3, ckHobby4;
	JButton btnGender, btnHobby, btnExit;
	JLabel lblMessage;
	private final ButtonGroup btnGroupGender = new ButtonGroup();
	
	public T4_Radio_CheckBox() {
		super("라디오/체크박스 연습");
		setSize(600,400);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(255, 255, 255));
		pn1.setBounds(0, 0, 584, 60);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("라디오버튼/체크박스 연습");
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 584, 60);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 63, 584, 235);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("성   별");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(50, 10, 100, 40);
		pn2.add(lblNewLabel_1);
		
		rdMale = new JRadioButton("남   자");
		btnGroupGender.add(rdMale);
		rdMale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdMale.setBounds(187, 20, 87, 23);
		pn2.add(rdMale);
		
		rdFemale = new JRadioButton("여   자");
		btnGroupGender.add(rdFemale);
		rdFemale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdFemale.setBounds(327, 20, 87, 23);
		pn2.add(rdFemale);
		
		JLabel lblNewLabel_1_1 = new JLabel("취   미");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(50, 70, 100, 40);
		pn2.add(lblNewLabel_1_1);
		
		ckHobby1 = new JCheckBox("등 산");
		ckHobby1.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby1.setHorizontalAlignment(SwingConstants.CENTER);
		ckHobby1.setBounds(187, 79, 69, 23);
		pn2.add(ckHobby1);
		
		ckHobby2 = new JCheckBox("낚 시");
		ckHobby2.setHorizontalAlignment(SwingConstants.CENTER);
		ckHobby2.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby2.setBounds(270, 80, 69, 23);
		pn2.add(ckHobby2);
		
		ckHobby3 = new JCheckBox("수 영");
		ckHobby3.setHorizontalAlignment(SwingConstants.CENTER);
		ckHobby3.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby3.setBounds(359, 80, 69, 23);
		pn2.add(ckHobby3);
		
		ckHobby4 = new JCheckBox("바 둑");
		ckHobby4.setHorizontalAlignment(SwingConstants.CENTER);
		ckHobby4.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby4.setBounds(448, 80, 69, 23);
		pn2.add(ckHobby4);
		
		lblMessage = new JLabel("메세지 출력");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("굴림", Font.PLAIN, 20));
		lblMessage.setBounds(50, 137, 467, 88);
		pn2.add(lblMessage);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 301, 584, 60);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnGender = new JButton("성별출력");
		btnGender.setFont(new Font("굴림", Font.PLAIN, 16));
		btnGender.setBounds(71, 10, 100, 40);
		pn3.add(btnGender);
		
		btnExit = new JButton("종   료");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 16));
		btnExit.setBounds(413, 10, 100, 40);
		pn3.add(btnExit);
		
		btnHobby = new JButton("취미출력");
		btnHobby.setFont(new Font("굴림", Font.PLAIN, 16));
		btnHobby.setBounds(242, 10, 100, 40);
		pn3.add(btnHobby);
		
		// --------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null); //윈도우 창을 가운데 정렬
		setResizable(false); //윈도우창 사이즈 조절 불가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 버튼 활성화
		getContentPane().setLayout(null);
		setVisible(true);
		// --------------------- 아래쪽은 메소드 ----------------------------------------
		
		//성별 출력 버튼
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "선택하신 성별은 : ";
				if(rdMale.isSelected()) gender += rdMale.getText();
				else gender += rdFemale.getText();
				
				lblMessage.setText(gender);
				
				//JOptionPane.showMessageDialog(null, "선택하신 성별은 " + gender);
			}
		});
		
		//취미 출력 버튼
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hobby = "";
				if(ckHobby1.isSelected()) hobby += ckHobby1.getText() + "/";
				if(ckHobby2.isSelected()) hobby += ckHobby2.getText() + "/";
				if(ckHobby3.isSelected()) hobby += ckHobby3.getText() + "/";
				if(ckHobby4.isSelected()) hobby += ckHobby4.getText() + "/";
				
				hobby = hobby.substring(0,hobby.length()-1); //마지막 / 빼기 외우기!!! 제발!!!
				
				lblMessage.setText("선택하신 취미는 : " + hobby);
				
				JOptionPane.showMessageDialog(null, "선택하신 취미는 " + hobby);
			}
		});
		
		//종료 버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
				
	}
	
	public static void main(String[] args) {
		new T4_Radio_CheckBox();
		
	}
}
