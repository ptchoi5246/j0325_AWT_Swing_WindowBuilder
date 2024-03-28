package t6_Swing;
//Swing은 AWT에 J만 붙이면 된다.
import javax.swing.JFrame;

//화면 중앙에 윈도우 정렬, 윈도우 크기 고정
@SuppressWarnings("serial")
public class Test5_windowsAlign extends JFrame {

	public Test5_windowsAlign() {
		super("스윙 연습5");
		
		//setBounds(300,250,300,250);
		//위치 고정을 위해 좌표 사용 못함, 크기만 지정
		setSize(300,250); //폭(width), 높이(height)
		setLocationRelativeTo(null); //윈도우 화면 중앙에 위치 고정
		setResizable(false); //크기 고정
		
		setVisible(true);
		
		//윈도우 창 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	
	public static void main(String[] args) {
		new Test5_windowsAlign();
			
	}
	
}
