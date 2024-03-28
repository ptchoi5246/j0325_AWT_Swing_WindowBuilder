package t7_WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class T1_Basic extends JFrame {
	private JTextField txtName, txtKor, txtEng, txtMat;
	//TextField, Button 위로 빼서 필드 선언
	private JButton btnInput, btnReset, btnExit;

	public T1_Basic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("그린 중학교 성적표");
		lblTitle.setFont(new Font("HY엽서M", Font.BOLD, 26));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(51, 10, 694, 48);
		getContentPane().add(lblTitle);
		
		JLabel lblName = new JLabel("성  명");
		lblName.setFont(new Font("HY그래픽M", Font.BOLD, 20));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(30, 73, 136, 48);
		getContentPane().add(lblName);
		
		JLabel lblEng = new JLabel("영 어 점 수");
		lblEng.setHorizontalAlignment(SwingConstants.CENTER);
		lblEng.setFont(new Font("HY그래픽M", Font.BOLD, 20));
		lblEng.setBounds(30, 315, 136, 48);
		getContentPane().add(lblEng);
		
		JLabel lblKor = new JLabel("국 어 점 수");
		lblKor.setHorizontalAlignment(SwingConstants.CENTER);
		lblKor.setFont(new Font("HY그래픽M", Font.BOLD, 20));
		lblKor.setBounds(30, 194, 136, 48);
		getContentPane().add(lblKor);
		
		JLabel lblMat = new JLabel("수 학 점 수");
		lblMat.setHorizontalAlignment(SwingConstants.CENTER);
		lblMat.setFont(new Font("HY그래픽M", Font.BOLD, 20));
		lblMat.setBounds(30, 436, 136, 48);
		getContentPane().add(lblMat);
		
		txtName = new JTextField();
		txtName.setFont(new Font("HY중고딕", Font.BOLD, 16));
		txtName.setHorizontalAlignment(SwingConstants.LEFT);
		txtName.setBounds(230, 72, 270, 50);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtKor = new JTextField();
		txtKor.setHorizontalAlignment(SwingConstants.LEFT);
		txtKor.setFont(new Font("HY중고딕", Font.BOLD, 16));
		txtKor.setColumns(10);
		txtKor.setBounds(230, 194, 270, 50);
		getContentPane().add(txtKor);
		
		txtEng = new JTextField();
		txtEng.setHorizontalAlignment(SwingConstants.LEFT);
		txtEng.setFont(new Font("HY중고딕", Font.BOLD, 16));
		txtEng.setColumns(10);
		txtEng.setBounds(230, 316, 270, 50);
		getContentPane().add(txtEng);
		
		txtMat = new JTextField();
		txtMat.setHorizontalAlignment(SwingConstants.LEFT);
		txtMat.setFont(new Font("HY중고딕", Font.BOLD, 16));
		txtMat.setColumns(10);
		txtMat.setBounds(230, 438, 270, 50);
		getContentPane().add(txtMat);
		
		btnInput = new JButton("입  력");
		btnInput.setFont(new Font("HY중고딕", Font.BOLD, 20));
		btnInput.setBounds(111, 505, 162, 40);
		getContentPane().add(btnInput);
		
		btnReset = new JButton("다 시 입 력");
		btnReset.setFont(new Font("HY중고딕", Font.BOLD, 20));
		btnReset.setBounds(329, 505, 162, 40);
		getContentPane().add(btnReset);
		
		btnExit = new JButton("종   료");
		btnExit.setFont(new Font("HY중고딕", Font.BOLD, 20));
		btnExit.setBounds(556, 505, 162, 40);
		getContentPane().add(btnExit);
		//----------------------------------------------위쪽은 디자인
		setVisible(true);
		//----------------------------------------------아래는 메소드
		
		//입력 버튼
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//다시 입력 버튼
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtKor.setText("");
				txtEng.setText("");
				txtMat.setText("");
				txtName.requestFocus();
			}
		});
		
		//종료 버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(null, "작업을 종료하시겠습니까?", "작업 종료 창", JOptionPane.YES_NO_OPTION);
				if(ans == 0) System.exit(0);
			}
		});
		
		
		
		
		
	}
		
	public static void main(String[] args) {
		new T1_Basic();
	}
}
