package socket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	static Socket s;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person p[] = new Person[3];
		p[0] = new Person(10,20);
		p[1] = new Person(30,40);
		p[2] = new Person(50,60);
	
		try {
			s = new Socket("127.0.0.1",1230);
			
			ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
		
			oos.writeObject(p);
			
			
			oos.close();
			s.close();
//			while(true);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
