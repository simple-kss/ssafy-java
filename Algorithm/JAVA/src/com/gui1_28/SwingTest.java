package com.gui1_28;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
1.SwingTest가 MouseListener를 상속받는 방법
2.SwingTest가 MouseAdapter를 상속받는 방법
2가지 방법이 있따.
2번째 방법은 오버라이딩하고싶은 메소드만 구현하면 된다.

 */

// 1. 클래스 선언시에 listener implements하자
// 2. 사건이 발생하는 감시자한테 붙여넣어라
public class SwingTest extends MouseAdapter implements ActionListener{
	//field
	JFrame f;
	JButton ok, cancel;
	JLabel la;
	JTextArea ta; // 여러 줄 입력 칸
	JTextField tf; // 한줄 입력 칸
	JList list; // 목록바
	
	public SwingTest() {
		//화면 만들기 작업
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 버튼 클릭시 프로그램 종료
		f.setLayout(new BorderLayout()); // layout manager 지정
		
		
		
		ok = new JButton("ok");
		cancel = new JButton("cancel");
		
		// 2. 사건이 발생 대상에 리스너 등록
		ok.addActionListener(this);
		cancel.addActionListener(this);
		
		la = new JLabel("Swing Test", JLabel.CENTER);
		Font font = new Font("맑은 고딕", Font.BOLD, 50);
		la.setFont(font);
		la.setForeground(Color.PINK);
		
		ta = new JTextArea(5, 30); // 5행 30글자
		ta.setFont(font);
		
		JScrollPane pane = new JScrollPane(ta); // JScrollPane 위에 ta를 올림
		
		JPanel panel = new JPanel(new FlowLayout()); // JFrame보다 작은 컨테이너(내부에 다른 화면 구성요소를 담을 수 있음)
		// 자체를 화면에 보여주기 위한 기능이아니라
		// 그룹으로써 묶기 위한 기능
		panel.add(ok);
		panel.add(cancel);
		
		tf = new JTextField(30); 
		String[] season = {"spring", "summer", "fall", "winter"};
		list = new JList<>(season);
		list.setVisibleRowCount(4);
		list.addMouseListener(this);
		
		JScrollPane pane2 = new JScrollPane(list);
		
		
		Container c = f.getContentPane();
		c.add(la, "North");
//		c.add(ok, "South");
//		c.add(cancel);
		c.add(list, "Center");
//		c.add(ta);
//		c.add(tf);
//		c.add(pane2);
//		c.add(list,"South");
		c.add(panel,"South");
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingTest();
	}

	// ActionListener가 가지고 있는 추상 메소드
	// 3. 사건이 발생했을 때 처리해야할 작업 내용
	@Override
	public void actionPerformed(ActionEvent e) {
		// 맨날 똑같은 작업을해서
		// 구분해서 실행할 필요가 있따!
		Object o = e.getSource(); // Source : 사건이 발생한 대상
		if(o == ok) {
			System.out.println("press me!");
		}
		else {
			System.out.println("don't press me!");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(list.getSelectedValue());
		int index = list.getSelectedIndex();
		System.out.println(index);
		
	}



}
