package com;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;



public class Server {
	
	private static PersonManager pm = new PersonManager("src/whitePageServer.dat");
	private ServerSocket server;
	Socket socket;
	
	Server(int port) {
		try {
			server = new ServerSocket(port);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void go() {
		ArrayList<Person> list = pm.list;
		try {
			socket = server.accept();
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream()); // 전송
			oos.writeObject(list);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
		while(true) {
			try {
				System.err.println("connect..");
				socket = server.accept();
				System.err.println("completed..");
				
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream()); // 전송
				
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream()); // 수신
				// 한번 비워준다.
				pm.list.clear();
				pm.list = (ArrayList<Person>) ois.readObject();
//					for(Person p; ( p = (Person)ois.readObject()) != null ;) {
//						pm.list.add(p);
//					}
				System.out.println("123");
				
			} catch (IOException | ClassNotFoundException e) {
				//System.out.println("error");
			}
			//전송완료!
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			pm.save();
		}
		//new ChatServerThread(ois).start();
	}

	public static void main(String[] args) {
		ArrayList<Person> list = pm.list;
		
		Server s = new Server(1055);
		
		s.go();
	}

}

