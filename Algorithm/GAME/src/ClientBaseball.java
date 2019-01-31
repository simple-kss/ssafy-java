
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * #클라이언트 역할
 * 
 * 1. GUI
 * 2. 사용자로 부터 값 입력시 서버로 전송  ㅇ
 * 3. 결과 수신 
 *
 */
public class ClientBaseball implements ActionListener{
	
	private Socket socket;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private JFrame f;
	private JTextArea ta;
	private Component add;;
	private Container c;
	private JPanel p;
	private JTextField tf;
	private JButton b1;
	private JButton b;
	private Font f1;
	
	public ClientBaseball() {
		GUI();
		connect();
	}

	private void prosess(String n) {
		try {
			oos.writeObject("running");	// tf의 내용 서버쪽으로 보내기
			oos.writeObject(n);	// tf의 내용 서버쪽으로 보내기
		} catch (IOException e) {
		} 
		
	}

	private void connect() {
		try {
			socket = new Socket("70.12.108.88",1234);
			System.out.println(1);
//			socket = new Socket("127.0.0.1",1234);
			//입출력 스트림생성
			//서버로 값 전송	
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			System.out.println("연결성공");
			ta.setText("---서버와의 접속 성공---");
			ta.setText("---숫자를 입력 하세요---");
			new ClientBaseballThread(ois).start();
		} catch (Exception e) {
		}
	}

	public void GUI() {
	//사용자로부터 값 입력시 서버로 전송!!
		f = new JFrame("Baseball game");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(600, 200, 450, 600);
		f.setLayout(new GridLayout(1,2,10,0));
		ta = new JTextArea();
		ta.setEditable(false);
		f1 = new Font("돋움", Font.PLAIN, 15);
		ta.setFont(f1);
		
		p = new JPanel(new FlowLayout());
		tf = new JTextField("",10);
		b = new JButton("재시작하기");
		b.setVisible(false);
		b1 = new JButton("위에 공백 채우고 겜 시작 ㄱㄱ");
		p.add(tf,BorderLayout.CENTER);
		p.add(b,BorderLayout.SOUTH);
		p.add(b1,BorderLayout.SOUTH);
		
		c = f.getContentPane();
		c.add(ta);
		c.add(p);
		
		f.setVisible(true);
		tf.addActionListener(this);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//재시작
				try {
					oos.writeObject("restart");
					oos.writeObject("1");
				} catch (IOException e1) {
				}
				ta.setText("");
				b.setVisible(false);
			}
		});
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//시작
				try {
					oos.writeObject("start");
					oos.writeObject(tf.getText().toString());
				} catch (IOException e1) {
				}
				tf.setText("");
				b1.setVisible(false);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//엔터 입력하면 데이터 입력
		if(tf.getText().length()==3) {
			prosess(tf.getText());
			tf.setText("");
		}
	}
	
	//서버로 부터 결과데이터 수신
	class ClientBaseballThread extends Thread{
		
		ObjectInputStream ois;
		
		ClientBaseballThread(ObjectInputStream ois) {
			this.ois = ois;
		}

		public void run() {
			//객체를 전달받아서 저장하고 출력하는 함수를 호출하자
			String strForCheck;
			String str;
			try {
				while(true) {
					strForCheck= ois.readObject().toString();
					str = ois.readObject().toString();
					System.out.println("데이터 수신완료!!!");
					if(strForCheck.equals("end")) {	//끝난경우
						b.setVisible(true);
					}
					ta.setText(str);
					
				}
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		ClientBaseball a = new ClientBaseball();
	}//end of main


}//end of class