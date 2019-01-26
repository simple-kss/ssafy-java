package com.net1_22TUE;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {

	public static void main(String[] args) throws Exception {
        /*
         * 1. Socket(ip, port) 생성 --> server로 접속해 들어감
         * 2. Socket 객체로 I/O 스트림 생성 
         * 3. 스트림으로 통신
         * 4. close() : 마무리
         */
        
        Socket s1;
        InputStream slin;
        DataInputStream dis;
        OutputStream slout;
        DataOutputStream dos;
        
        
        s1 = new Socket("localhost", 5432);
        slin = s1.getInputStream();
        dis = new DataInputStream(slin);
        slout = s1.getOutputStream(); // 출력용 스트림
        dos = new DataOutputStream(slout); // filter
        
        
        String message = dis.readUTF(); // 이부분도 블럭이됨, 읽을때까지
        System.out.println(message);
        
        
        dos.writeUTF("hi im client");
        
        dis.close();
        slin.close();
        dos.close();
        slout.close();
        s1.close();
	}

}
