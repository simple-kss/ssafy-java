package com.ssafy;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 
 * 채팅화면 만들기 
 *
 */

public class ChatGUI {

	public static void main(String[] args) {
		Frame f = new Frame("카카오톡");
		f.setBounds(600, 100, 300, 400);
		f.setLayout(new BorderLayout()); // 원래 Frame의 기본 매니저가 BorderLayout임

		TextArea ta = new TextArea(); // 여러 줄의 글자를 입력 받기도하고, 출력할 수 도 있는 Component
		ta.setEditable(false); // TextArea 수정못하게
		f.add(ta, BorderLayout.CENTER); // 두번쨰 인자는 어디부분에 넣을 지를 정하는 것이다.
		
		TextField tf = new TextField(); // 한줄에 글자를 입력, 출력하는 컴포넌트
		f.add(tf, BorderLayout.SOUTH);
		
		// 오른쪽에 Panel로 묶어서 넣겠다
		Panel p = new Panel(); // 동쪽 영역에 들어갈 묶음(덩어리)
		p.setLayout(new BorderLayout());
		
		Button bSend = new Button("Send");
		Button bExit = new Button("Exit");
		p.add(bSend, BorderLayout.NORTH);
		p.add(bExit, BorderLayout.SOUTH);
		
		f.add(p, BorderLayout.EAST);
		
		f.setVisible(true); // 화면에 보여주는 작업을 마지막에 한다
		
		/////////////////////////////////////////
		// 이벤트 처리
//		Send 버튼 클릭시 ! extField의 값을 읽어서, 서버에 전송(TextArea에 값을 작성)
//		그리고 TextField의 값은 삭제하기(공백으로 초기화)
//		Exit 버튼 클릭시 창을 닫기
//		Frame 닫기버튼 클릭 시 창을 닫기
//		TextField 엔터키 입력시 ! TextField의 값을 읽어서, 서버에 전송(TextArea에 값을 작성)
		
		// 텍스트 필드, 텍스트 입력창
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // 텍스트 필드에서 엔터키 입력시 호출되는 콜백 메서드
				String str = tf.getText(); // 문자열 읽어옴
				
				// 서버 전송
				ta.append("이근희: "+str+"\n"); // 텍스트 에어리어에 추가
				tf.setText(""); // 글자 지우기
				
			}
		});
		
		bSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = tf.getText(); // 문자열 읽어옴
				
				// 서버 전송
				ta.append("이근희: "+str+"\n"); // 텍스트 에어리어에 추가
				tf.setText(""); // 글자 지우기
				
			}
		});
		bExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // 버튼 클릭시 호출되는 콜백 메서드
				f.dispose(); // f는 외부의 지역번수인데 어떻게 호출?
				// 자바 1.7부터 가능했다고함. 늦은실행이 지원이 돼서 외부 지역변수를 임시변수로 저장?
			}
		});
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { // 창 닫기 버튼 클릭 시 호출되는 콜백 메서드
				f.dispose(); // 창을 닫기
			}
		});
	} // end of main
} // end of class
