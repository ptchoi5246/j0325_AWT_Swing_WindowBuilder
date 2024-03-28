package t5_Adapter;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Test2 extends Frame {
	
	Button btnPlayStop, btnExit; //토글 : Caps Lock, Print Screen, Scroll Lock 한번 누르면 기능
	
	public Test2() {
		super("어댑터 연습");
		setLayout(new FlowLayout());
		setBounds(300,350,300,280);
		
		btnPlayStop = new Button("Play");
		btnExit = new Button("Exit");
		add(btnPlayStop);
		add(btnExit);
		
		setVisible(true);
		
		btnPlayStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Button btnLabel = (Button) e.getSource(); //강제 다운 캐스팅
				if(btnLabel.getLabel().equals("Play")) {
					btnLabel.setLabel("Stop");
					System.out.println("출발~!~!~!");
				}
				else if(btnLabel.getLabel().equals("Stop")) {
					btnLabel.setLabel("Play");
					System.out.println("정지~!~!~!");
				}
				
			}
		});
		
		
		
		
		
		//어댑터 : 오버라이드 WindowListener 7가지 메소드 사용 가능
		//어댑터를 이용한 윈도우 종료 (익명 이너 클래스) !!!연습하세요!!!
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//버튼 클릭시(버튼을 이용한) 익명 클래스를 이용한 종료
		btnExit.addActionListener(new ActionListener() { //ActionListener 1개 밖에 없어서 바로 뜬다.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Test2();
	}
}
