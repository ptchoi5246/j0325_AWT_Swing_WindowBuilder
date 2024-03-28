package t1_awt_Basic;

import java.awt.Frame;

//AWT 사용 방법 AWT -> SWING 앞에 J만 붙이면 된다.
//Frame 객체를 상속받아서 작업처리 extends
@SuppressWarnings("serial") //최종적으로 노란밑줄, 느낌표 없애고 싶을때 작성
public class Test2 extends Frame{
	
	// 객체를 생성시에 UI(User Interface) 설계 처리를 한다.
	public Test2() {
		super("AWT 프레임"); //부모 상속이라서 super
		//setTitle("AWT 프레임");
		setSize(300, 250); //프레임의 크기(폭 가로, 높이) : 픽셀단위(윈도우)
		
		setVisible(true); //화면에 프레임을 보여달라
		
	}
	
	public static void main(String[] args) { //메인메소드 - 실행
		new Test2(); //Frame을 상속 받았기 때문에 본인 Class 호출
		
	}
}
