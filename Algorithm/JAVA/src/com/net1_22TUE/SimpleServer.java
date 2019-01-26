package com.net1_22TUE;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleServer {
	
	public static void main(String[] args) {
		/* 1. ServerSocket(port) 생성
		 * 2. Server.accept() : 클라이언트가 접속해 오기를 기다렸다가 받는 메소드
		 * 3. Socket 객체로 I/O 스트림 생성
		 * 4. 스트림으로 통신
		 * 5. close(): 마무리
		 * */
		//70.12.108.99
		Scanner scan = new Scanner(System.in);
		ServerSocket server;
        Socket s1;
        String sendString = "만ㄹ랩 갓파";
        
        OutputStream s1out;
        DataOutputStream dos;
        InputStream s1in;
        DataInputStream dis;
        
        try
        {
            server = new ServerSocket(5432);
            System.out.println("클라이언트를 기다리는 중 ...");
            s1 = server.accept(); // 클라이언트 기다림, 이것도 블럭이 된다.
            // s1에는 클라이언트 소켓이 들어감
            System.out.println("클라이언트 접속!");
            
            s1out = s1.getOutputStream(); // 출력용 스트링 얻어냄
//            ObjectOutputStream oos = new ObjectOutputStream(s1out);
//            oos.writeObject(new Book("123","hello",100,2000));
            
            dos = new DataOutputStream(s1out); // filter
            s1in = s1.getInputStream();
            dis = new DataInputStream(s1in);
            

//        	sendString = scan.nextLine();
        	dos.writeUTF(sendString);
        	
            String message = dis.readUTF(); // 이부분도 블럭이됨, 읽을때까지
            System.out.println(message);

        
            dos.close();
            s1out.close();
            dis.close();
            s1in.close();
        	server.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
	}
}