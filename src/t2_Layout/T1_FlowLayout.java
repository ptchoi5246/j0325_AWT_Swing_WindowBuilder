package t2_Layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T1_FlowLayout extends Frame implements WindowListener, ActionListener {
	//Frame을 상속 받고 WindowListener, ActionListener 인터페이스를 구현
	
	//생성자를 통해서 UI 설계 처리 한다.
	public T1_FlowLayout() {
		super("FlowLayout 연습!"); //왼->오 위->아래
		setLayout(new FlowLayout()); //버튼 박스가 생긴다
		setBounds(300, 250, 300, 300);
		
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button();
		btn2.setLabel("버튼2");
		Button btn3 = new Button("종료");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
		
		this.add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		setVisible(true);
		
		addWindowListener(this);
		btn3.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new T1_FlowLayout();
	}

	@Override
	public void actionPerformed(ActionEvent e) { 
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) { System.exit(0); }

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
}
