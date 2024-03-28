package t7_WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class T3_Image extends JFrame {
	
	JButton btnTotal, btn1, btn2, btn3, btn4, btnRandom, btnClose, btnExit;
	JLabel lblImg1, lblImg2, lblImg3, lblImg4, lblCount;
	
	int img1Cnt=0, img2Cnt=0, img3Cnt=0, img4Cnt=0; //카드 카운트 변수
	
	
	public T3_Image() {
		super("카드 횟수 Game");
		setSize(800, 480);
		
		getContentPane().setLayout(null);
				
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 50);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		btnTotal = new JButton("모두보기");
		btnTotal.setFont(new Font("굴림", Font.PLAIN, 16));
		btnTotal.setBounds(0, 0, 100, 50);
		pn1.add(btnTotal);
		
		btn1 = new JButton("1번보기");
		btn1.setFont(new Font("굴림", Font.PLAIN, 16));
		btn1.setBounds(100, 0, 100, 50);
		pn1.add(btn1);
		
		btn2 = new JButton("2번보기");
		btn2.setFont(new Font("굴림", Font.PLAIN, 16));
		btn2.setBounds(200, 0, 100, 50);
		pn1.add(btn2);
		
		btn3 = new JButton("3번보기");
		btn3.setFont(new Font("굴림", Font.PLAIN, 16));
		btn3.setBounds(300, 0, 100, 50);
		pn1.add(btn3);
		
		 btn4 = new JButton("4번보기");
		btn4.setFont(new Font("굴림", Font.PLAIN, 16));
		btn4.setBounds(400, 0, 100, 50);
		pn1.add(btn4);
		
		btnExit = new JButton("종 료");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 16));
		btnExit.setBounds(704, 0, 80, 50);
		pn1.add(btnExit);
		
		btnRandom = new JButton("랜덤보기");
		btnRandom.setFont(new Font("굴림", Font.PLAIN, 16));
		btnRandom.setBounds(500, 0, 100, 50);
		pn1.add(btnRandom);
		
		btnClose = new JButton("모두닫기");
		btnClose.setFont(new Font("굴림", Font.PLAIN, 16));
		btnClose.setBounds(600, 0, 100, 50);
		pn1.add(btnClose);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 51, 784, 340);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		lblImg1 = new JLabel("");
		lblImg1.setIcon(new ImageIcon(T3_Image.class.getResource("/t7_WindowBuilder/images/11.jpg")));
		lblImg1.setBounds(12, 10, 180, 320);
		pn2.add(lblImg1);
		lblImg1.setVisible(false); //1번 그림 감추기
		
		lblImg2 = new JLabel("");
		lblImg2.setIcon(new ImageIcon(T3_Image.class.getResource("/t7_WindowBuilder/images/14.jpg")));
		lblImg2.setBounds(204, 10, 180, 320);
		pn2.add(lblImg2);
		lblImg2.setVisible(false); //2번 그림 감추기
		
		lblImg3 = new JLabel("");
		lblImg3.setIcon(new ImageIcon(T3_Image.class.getResource("/t7_WindowBuilder/images/13.jpg")));
		lblImg3.setBounds(400, 10, 180, 320);
		pn2.add(lblImg3);
		lblImg3.setVisible(false); //3번 그림 감추기
		
		lblImg4 = new JLabel("");
		lblImg4.setIcon(new ImageIcon(T3_Image.class.getResource("/t7_WindowBuilder/images/15.jpg")));
		lblImg4.setBounds(592, 10, 180, 320);
		pn2.add(lblImg4);
		lblImg4.setVisible(false); //4번 그림 감추기
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 391, 784, 50);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		lblCount = new JLabel("1번: 0, 2번: 0, 3번: 0, 4번: 0");
		lblCount.setForeground(new Color(128, 128, 255));
		lblCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCount.setFont(new Font("굴림", Font.BOLD, 16));
		lblCount.setBounds(12, 10, 760, 30);
		pn3.add(lblCount);
		
		// --------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null); //윈도우 창을 가운데 정렬
		setResizable(false); //윈도우창 사이즈 조절 불가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 버튼 활성화
		setVisible(true);
		// --------------------- 아래쪽은 메소드 ----------------------------------------
		
		//모두보기 버튼
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allDisplay(); //메소드 함수 만들기
				img1Cnt++; img2Cnt++; img3Cnt++; img4Cnt++; //카드 횟수 증가
				dispalyCount(); //화면 출력
			}
		});
		
		//1번 보기 버튼
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(true);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img1Cnt++;
				dispalyCount();
			}
		});
		
		//2번 보기 버튼
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(true);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img2Cnt++;
				dispalyCount();
			}
		});
		
		//3번 보기 버튼
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(true);
				lblImg4.setVisible(false);
				img3Cnt++;
				dispalyCount();
			}
		});
		
		//4번 보기 버튼
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(true);
				img4Cnt++;
				dispalyCount();
			}
		});
		
		//랜덤 보기 버튼
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rand = (int) (Math.random()*4) +1;
				if(rand == 1) {
					lblImg1.setVisible(true);
					lblImg2.setVisible(false);
					lblImg3.setVisible(false);
					lblImg4.setVisible(false);
					img1Cnt++;
				}
				if(rand == 2) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(true);
					lblImg3.setVisible(false);
					lblImg4.setVisible(false);
					img2Cnt++;
				}
				if(rand == 3) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(false);
					lblImg3.setVisible(true);
					lblImg4.setVisible(false);
					img3Cnt++;
				}
				if (rand == 4) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(false);
					lblImg3.setVisible(false);
					lblImg4.setVisible(true);
					img4Cnt++;
				}
				dispalyCount();
			}
		});
		
		//모두 닫기 버튼
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allClose();
			}
		});
		
		
		// 종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
	}
	



	//모두 보기 allDisplay 함수
	protected void allDisplay() {
		lblImg1.setVisible(true);
		lblImg2.setVisible(true);
		lblImg3.setVisible(true);
		lblImg4.setVisible(true);
	}

	//모두 닫기 allClose
	protected void allClose() {
		lblImg1.setVisible(false);
		lblImg2.setVisible(false);
		lblImg3.setVisible(false);
		lblImg4.setVisible(false);
	}
	
	//카운트 레이블에 보여주기
	protected void dispalyCount() {
		lblCount.setText("1번: "+img1Cnt+", 2번: "+img2Cnt+", 3번: "+img3Cnt+", 4번: " + +img4Cnt);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new T3_Image();
		
	}
}
