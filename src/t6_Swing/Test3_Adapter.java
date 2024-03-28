package t6_Swing;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Swing은 AWT에 J만 붙이면 된다.
import javax.swing.JFrame;

//스윙의 종료를 어댑터를 이용
@SuppressWarnings("serial")
public class Test3_Adapter extends JFrame {

	public Test3_Adapter() {
		super("스윙 연습3");
		
		setBounds(300,250,300,250);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
	
	public static void main(String[] args) {
		new Test3_Adapter();
			
	}
	
}
