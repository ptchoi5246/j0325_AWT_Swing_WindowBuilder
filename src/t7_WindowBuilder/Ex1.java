package t7_WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

public class Ex1 extends JFrame {
	private JTextField txtID, txtName, txtAdd2, txtPostno, txtAdd1, txtEmail1, txtEmail2, txtPhone2, txtPhone3;
	private JPasswordField pwFPW, pwFPWCheck;
	private JButton btnCancle, btnUpdate, btnComplete;
	
	public Ex1() {
		super("회원가입");
		setSize(868,721);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 852, 49);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSignup = new JLabel("회     원     가     입");
		lblSignup.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignup.setFont(new Font("함초롬돋움", Font.BOLD, 30));
		lblSignup.setBounds(12, 0, 828, 49);
		panel.add(lblSignup);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 633, 852, 49);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		btnCancle = new JButton("취     소");
		btnCancle.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		btnCancle.setBounds(92, 10, 161, 29);
		panel_1.add(btnCancle);
		
		btnUpdate = new JButton("다 시 입 력");
		btnUpdate.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		btnUpdate.setBounds(345, 10, 161, 29);
		panel_1.add(btnUpdate);
		
		btnComplete = new JButton("완     료");
		btnComplete.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		btnComplete.setBounds(598, 10, 161, 29);
		panel_1.add(btnComplete);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 59, 830, 565);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblID = new JLabel("아   이   디");
		lblID.setBounds(12, 35, 125, 32);
		lblID.setHorizontalAlignment(SwingConstants.CENTER);
		lblID.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		panel_2.add(lblID);
		
		JLabel lblPwd = new JLabel("비 밀 번 호");
		lblPwd.setBounds(12, 85, 125, 32);
		lblPwd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwd.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		panel_2.add(lblPwd);
		
		JLabel lblPwdCheck = new JLabel("비밀번호확인");
		lblPwdCheck.setBounds(12, 135, 125, 32);
		lblPwdCheck.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwdCheck.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		panel_2.add(lblPwdCheck);
		
		JLabel lblEmail = new JLabel("이   메   일");
		lblEmail.setBounds(12, 185, 125, 32);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		panel_2.add(lblEmail);
		
		JLabel lblName = new JLabel("이        름");
		lblName.setBounds(12, 235, 125, 32);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		panel_2.add(lblName);
		
		JLabel lblBirth = new JLabel("생 년 월 일");
		lblBirth.setBounds(12, 285, 125, 32);
		lblBirth.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirth.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		panel_2.add(lblBirth);
		
		JLabel lblGender = new JLabel("성        별");
		lblGender.setBounds(12, 335, 125, 32);
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		panel_2.add(lblGender);
		
		JLabel lblPhone = new JLabel("전 화 번 호");
		lblPhone.setBounds(12, 385, 125, 32);
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		panel_2.add(lblPhone);
		
		JLabel lblPostno = new JLabel("우 편 번 호");
		lblPostno.setBounds(12, 435, 125, 32);
		lblPostno.setHorizontalAlignment(SwingConstants.CENTER);
		lblPostno.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		panel_2.add(lblPostno);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(149, 35, 300, 32);
		panel_2.add(txtID);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(149, 235, 300, 32);
		panel_2.add(txtName);
		
		txtAdd2 = new JTextField();
		txtAdd2.setColumns(10);
		txtAdd2.setBounds(146, 520, 600, 32);
		panel_2.add(txtAdd2);
		
		JRadioButton rdbtnGender1 = new JRadioButton("남     자");
		rdbtnGender1.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rdbtnGender1.setBounds(145, 335, 121, 23);
		panel_2.add(rdbtnGender1);
		
		JRadioButton rdbtnGender2 = new JRadioButton("여     자");
		rdbtnGender2.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rdbtnGender2.setBounds(327, 335, 121, 23);
		panel_2.add(rdbtnGender2);
		
		pwFPW = new JPasswordField();
		pwFPW.setBounds(149, 85, 300, 32);
		panel_2.add(pwFPW);
		
		pwFPWCheck = new JPasswordField();
		pwFPWCheck.setBounds(149, 135, 300, 32);
		panel_2.add(pwFPWCheck);
		
		JLabel lblAddress = new JLabel("주        소");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		lblAddress.setBounds(12, 485, 125, 32);
		panel_2.add(lblAddress);
		
		txtPostno = new JTextField();
		txtPostno.setColumns(10);
		txtPostno.setBounds(146, 435, 300, 32);
		panel_2.add(txtPostno);
		
		JButton btnPostNo = new JButton("우편번호검색");
		btnPostNo.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		btnPostNo.setBounds(473, 435, 150, 32);
		panel_2.add(btnPostNo);
		
		txtAdd1 = new JTextField();
		txtAdd1.setColumns(10);
		txtAdd1.setBounds(146, 485, 300, 32);
		panel_2.add(txtAdd1);
		
		txtEmail1 = new JTextField();
		txtEmail1.setColumns(10);
		txtEmail1.setBounds(149, 185, 100, 32);
		panel_2.add(txtEmail1);
		
		JComboBox comboBirthYear = new JComboBox();
		comboBirthYear.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		comboBirthYear.setBounds(149, 285, 90, 32);
		panel_2.add(comboBirthYear);
		
		JComboBox comboBirthMonth = new JComboBox();
		comboBirthMonth.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		comboBirthMonth.setBounds(251, 285, 90, 32);
		panel_2.add(comboBirthMonth);
		
		JComboBox comboBirthDay = new JComboBox();
		comboBirthDay.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		comboBirthDay.setBounds(353, 285, 90, 32);
		panel_2.add(comboBirthDay);
		
		JButton btnIDCheck = new JButton("중 복 확 인");
		btnIDCheck.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		btnIDCheck.setBounds(473, 35, 150, 32);
		panel_2.add(btnIDCheck);
		
		txtEmail2 = new JTextField();
		txtEmail2.setColumns(10);
		txtEmail2.setBounds(279, 185, 170, 32);
		panel_2.add(txtEmail2);
		
		JComboBox comboPhone1 = new JComboBox();
		comboPhone1.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		comboPhone1.setBounds(149, 385, 90, 32);
		panel_2.add(comboPhone1);
		
		txtPhone2 = new JTextField();
		txtPhone2.setColumns(10);
		txtPhone2.setBounds(251, 385, 90, 32);
		panel_2.add(txtPhone2);
		
		txtPhone3 = new JTextField();
		txtPhone3.setColumns(10);
		txtPhone3.setBounds(355, 385, 90, 32);
		panel_2.add(txtPhone3);
		
		JComboBox comboEmail = new JComboBox();
		comboEmail.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		comboEmail.setBounds(473, 185, 150, 32);
		panel_2.add(comboEmail);
		
		setVisible(true);
		
		//다시 입력 버튼
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//완료 버튼
		btnComplete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//취소 버튼
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
	
	public static void main(String[] args) {
		new Ex1();
	}
}
