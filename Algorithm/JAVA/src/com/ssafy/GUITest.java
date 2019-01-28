package com.ssafy;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class GUITest {

	public static void main(String[] args) {
		Frame f = new Frame("안녕하세요 나는 창이에요"); // 윈도우 창 생성 
		// 독립적인 컴포넌트를 만들어야함
		// 독립적인 (컴포넌트)컨테이너 : 레이아웃 매니저
		
		f.setBounds(300, 200, 500, 600);
//		f.setSize(300, 200); // 창의 크기 지정
//		f.setLocation(500, 600); // 창의 위치 지정, 이 좌표는 좌측상단이 0,0 (x축의 양의방향, y축의 양의방향)
		// 데카르트 좌표게
		
		/*
		 * f.setsize와 f.setLocation을 한번에 지정할 수 있따.
		 * f.setBounds를 이용
		 */
		
		// 레이아웃 매니저
		// 여기다가 버튼하나 만들어보자
		
		
		f.setLayout(null); // 레이아웃 매니저 지정!!
		// null 로 한다는 건 기본 레이아웃 쓰겟다 라는 의미
		
		new FlowLayout(); // 위쪽줄부터 옆으로 옆으로 좌->우로 배치
		// 우측 끝에 자리가 부족하면 아래줄로
		new BorderLayout(); // 동서남북 센터로 배치
		new CardLayout(); // 항상 0,0위치를 기준으로 한자리에 덮어씀
		
//		f.setLayout(new FlowLayout());
		f.setLayout(new BorderLayout()); // 버튼마다 위치를 지정해야함
		
		Button b = new Button("내가 만든 버튼");
		
//		b.setSize(100, 200); // 레이아웃 매니저를 사용하면 의미없다.
//		b.setLocation(50,50);
//		
		
		f.add(b, BorderLayout.CENTER);
		f.add(new Button("버튼 1입니다"), BorderLayout.NORTH);
		f.add(new Button("버튼 2입니다"), BorderLayout.SOUTH);
		f.add(new Button("버튼 3입니다"), BorderLayout.WEST);
		f.add(new Button("버튼 4입니다"), BorderLayout.EAST);
//		f.add(new Button("버튼 5입니다"), BorderLayout.NORTH);
//		f.add(new Button("버튼 6입니다"));
//		f.add(new Button("버튼 7입니다"));
		
		// 4번대신 컨테이너를 대신한다.
		// 즉 동쪽을 컨테이너를 대신해서 내가 원하는 컴포넌트를 넣자!
		Panel p = new Panel(); // 여러개의 레이아웃 매니저로 혼합해서 사용할 때!
		p.setLayout(new BorderLayout()); // 하나의 덩어리를 만든다.
		// 이 패널을 FlowyLayout으로 만든다.
		p.add(new Button("Exit"), BorderLayout.NORTH);
		p.add(new Button("Send"), BorderLayout.CENTER);
		
		// 그리고 이 패널을 동쪽(4번자리에 넣는다)
		f.add(p, BorderLayout.EAST);
		
		f.setVisible(true); // 해야 화면에 보인다.

		// 창을 닫자
		// 이벤트 처리
		// 소스, 닫기, 처리할 내용
		// add~~Listener라 되어있다.
		// 내가~~를 클릭했을때 이벤트처리를 하고 싶으면
		
		b.addActionListener(new ActionListener() {// 버튼을 클릭 했을 때 ㅎ출되는 콜백 메서드
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = b.getLabel();
				System.out.println("한글");
			} 
			
			
			
		});
		
		
		f.addWindowListener(new WindowAdapter() {
			// 우리는 필요한거만 overriding하면 됨
			@Override
			public void windowClosing(WindowEvent e) { // 닫기 버튼을 눌렀을 때
				
				
//				3개 중 하나를 쓰면된다!
//				f.setVisible(false); // 화면에만 안보이게함, 메모리상에 남겨져 있어서, 다시 띄울 수 있따ㅏ.
				f.dispose(); // 창의 객체를 메모리에서 제거, 하지만 얘는 new, 셋팅 같은 걸 다시해야함
//				System.exit(0); // 시스템 자체를 종료시킬 수 있다.완전히 프로그램 종료, 프로그램이 완전히 다 끝나버림
			}
			
		});
		
//		아.. 7개 메서드 다 정의하는 거보다, 필요한거만 정의하자.
//		그러려면 WindowAdpater를 쓰자!
//		
//		f.addWindowListener(new WindowListener() {
//
//			@Override
//			public void windowOpened(WindowEvent e) { // 창이 열렸을 때 호출되는 콜백 메소드
//			}
//
//			@Override
//			public void windowClosing(WindowEvent e) { // 닫기 버튼을 눌렀을 때
//				
//				
////				3개 중 하나를 쓰면된다!
////				f.setVisible(false); // 화면에만 안보이게함, 메모리상에 남겨져 있어서, 다시 띄울 수 있따ㅏ.
//				f.dispose(); // 창의 객체를 메모리에서 제거, 하지만 얘는 new, 셋팅 같은 걸 다시해야함
////				System.exit(0); // 시스템 자체를 종료시킬 수 있다.완전히 프로그램 종료, 프로그램이 완전히 다 끝나버림
//			}
//
//			@Override
//			public void windowClosed(WindowEvent e) { // 닫은 뒤에 호출되는 함수
//			}
//
//			@Override
//			public void windowIconified(WindowEvent e) {// 최소화 되었을 때
//			}
//
//			@Override
//			public void windowDeiconified(WindowEvent e) {  // 최소화 되었던 것이 원래 창으로 뜰때
//			}
//
//			@Override
//			public void windowActivated(WindowEvent e) { // 창이 활성화 되었을 때
//			}
//
//			@Override
//			public void windowDeactivated(WindowEvent e) { // 비활성화 되었을 때
//			}
//
//		});
	
		
		
		
	} // end of main
} // end of class
