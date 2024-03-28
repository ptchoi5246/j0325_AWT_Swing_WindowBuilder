package t1_awt_Basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//종료 버튼 처리 (인터페이스를 이용)
@SuppressWarnings("serial")
public class Test5 extends Frame implements WindowListener, ActionListener { //add unimplement
	
	// 객체를 생성시에 UI(User Interface) 설계 처리를 한다.
	public Test5() {
		super("AWT 프레임"); //프레임 : GUI 애플리케이션의 창
		//setTitle("AWT 프레임");
		setBounds(300, 200, 350, 250); //프레임의 위치/크기(x축 가로, y축 세로 , 폭 가로, 높이) : 픽셀단위(윈도우)
		
		//레이블 컴포넌트 : 화면에 메세지 띄우는 것 생성
		//레이블 : 텍스트나 이미지를 표시하기 위한 컴포넌트
		Label lbl1 = new Label("레이블 테스트 입니다.");
		//this.add(lbl1); //한글 변환 : -Dfile.encoding=MS949 - Run - Run Configuration - Arguments - VM Arguments
		add(lbl1); //프레임에 올리기
		
		//버튼 : 사용자가 클릭하여 어떤 작업을 수행하도록 하는 컴포넌트
		Button btnExit = new Button("종료"); //컴포넌트 위에 프레임을 올리면 "종료"로 가득참
		add(btnExit);
		
		setVisible(true);
		
		//리스너(윈도우 감지부분 처리)
		addWindowListener(this); //윈도우 리스너 추가해서 닫기
		btnExit.addActionListener(this); //버튼은 항상 ActionListener -- 종료버튼 누르면 종료됨
	}
	
	public static void main(String[] args) {
		new Test5();
		
		
		
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);//JVM 닫기 - 실행종료(윈도우창 닫기)
	}

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

	//ActinListner
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0); //버튼을 누르는 애가 감지되면 윈도우 창을 닫아라
	}
}
