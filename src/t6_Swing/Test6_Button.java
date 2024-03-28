package t6_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Test6_Button extends JFrame {
	
	JButton btnExit;
	
	
	public Test6_Button() {
		super("컴포넌트 연습");
		setSize(300,300); //컴포넌트 창 사이즈
		setLocationRelativeTo(null); //윈도우 창 위치 중앙
		setResizable(false); //윈도우 창 사이즈 고정
		
		btnExit = new JButton("종료");
		add(btnExit);
		//여기까지가 디자인
		
		//지금부터 명령어
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 창 x 버튼으로 exit
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	
	public static void main(String[] args) {
		
		new Test6_Button();
	}
	
}
