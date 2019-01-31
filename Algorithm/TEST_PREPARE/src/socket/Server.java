package socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;


class Person implements Serializable{ 
	int s;
	int t;
	
	public Person(int s, int t) {
		this.s = s;
		this.t = t;
	}

	@Override
	public String toString() {
		return "Person [s=" + s + ", t=" + t + "]";
	}
	
	
}

public class Server {
	
	private static ServerSocket server;
	
	public static void main(String[] args) {
		try {
			Person[] p;
			
			server = new ServerSocket(1230);
			Socket s;
			System.out.println("기다리는 중");
			s = server.accept();
			
			ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
			
			System.out.println("read 기다리는 중");
			p = (Person[]) ois.readObject();
			
			for(int i = 0; i < p.length; i++) {
				System.out.println(p[i].toString());
			}

			
			ois.close();
			s.close();
			
//			for(Person p; ( p = (Person)ois.readObject()) != null ;) {
//				pm.list.add(p);
//			}
			
			
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		

	}

}
