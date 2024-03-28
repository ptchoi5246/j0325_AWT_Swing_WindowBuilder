package t6_Swing;
//Swing은 AWT에 J만 붙이면 된다.
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Test1_Basic extends JFrame {

	public Test1_Basic() {
		super("스윙 연습1");
		
		setBounds(300,250,300,250);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test1_Basic();
			
	}
	
}
