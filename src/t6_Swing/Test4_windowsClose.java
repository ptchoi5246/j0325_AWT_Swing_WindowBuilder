package t6_Swing;
//Swing은 AWT에 J만 붙이면 된다.
import javax.swing.JFrame;

//JFrame
@SuppressWarnings("serial")
public class Test4_windowsClose extends JFrame {

	public Test4_windowsClose() {
		super("스윙 연습4");
		
		setBounds(300,250,300,250);
		
		setVisible(true);
		
		//윈도우 창 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	
	public static void main(String[] args) {
		new Test4_windowsClose();
			
	}
	
}
