package com.net1_22TUE;

import java.awt.*;
import java.net.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

public class Client implements ActionListener {
	OutputStream outputStream = null;
	InputStream inputStream = null;
	DataOutputStream dos = null;
	DataInputStream dis = null;
	Socket socket = null;
	String msg;

	JFrame f;
	JTextArea ta;
	JTextField tf;
	Container c;

	public Client() {
		makeGUI(); // 화면 만들기
		connect(); // network 준비작업
	}

	public void makeGUI() {
		f = new JFrame("클라이언트 프로그램");
		c = f.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new JLabel("전송할 메시지 : ", JLabel.CENTER), "North");

		ta = new JTextArea(5, 30);
		ta.setEditable(false);
		JScrollPane pane = new JScrollPane(ta);

		tf = new JTextField(30);
		tf.addActionListener(this);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w) {
				try {
					dis.close();
					dos.close();
					socket.close();
				} catch (Exception a) {
				}
				System.exit(0);
			}
		});
		c.add(pane, "Center");
		c.add(tf, "South");
		f.pack();
		f.setVisible(true);
		tf.requestFocus();
	}

	public void connect() {
		try {
			// Socket 생성
			socket = new Socket("localhost", 1056);
			inputStream = socket.getInputStream();
			dis = new DataInputStream(inputStream);
			outputStream = socket.getOutputStream();
			dos = new DataOutputStream(outputStream);

			// io Stream 생성

			// stream 준비

		} catch (Exception e) {
			System.out.println("에러가 발생했습니다." + e);
		}
	}

// 사건이 일어날때 자동 실행되는 메소드
	public void actionPerformed(ActionEvent e) {
		try {
			dos.writeUTF(tf.getText()); // tf의 내용 서버쪽으로 보내기
			ta.append(dis.readUTF()); // 서버에서 되돌아 온 내용을 자신의 ta에 붙이기
			tf.setText("");
		} catch (Exception except) {
		}
	}

	public static void main(String argv[]) {
		Client o = new Client();
	}
}
