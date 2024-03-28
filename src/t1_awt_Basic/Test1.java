package t1_awt_Basic;

import java.awt.Frame;

//AWT 사용 방법 AWT -> SWING 앞에 J만 붙이면 된다.
//Frame 객체를 직접 생성해서 new 작업처리
public class Test1 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		//프레임 : GUI 애플리케이션의 창 
		
		frame.setTitle("AWT 프레임");
		frame.setSize(300, 250); //프레임의 크기(폭 가로, 높이) : 픽셀단위(윈도우)
		
		frame.setVisible(true); //화면에 프레임을 보여달라
		
		
		
		
	}
}
