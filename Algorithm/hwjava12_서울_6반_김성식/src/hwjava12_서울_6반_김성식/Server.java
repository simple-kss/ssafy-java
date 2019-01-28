package hwjava12_서울_6반_김성식;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;



public class Server {
	
	private static PersonManager pm = new PersonManager("whitePageServer.dat");
	private ServerSocket server;
	Socket socket;
	
	Server(int port) {
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void go() {
			while(true) {
				ArrayList<Person> list = pm.list;
				try {
					System.err.println("connect..");
					socket = server.accept();
					System.err.println("completed..");
					
					ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream()); // 전송
					ObjectInputStream ois = new ObjectInputStream(socket.getInputStream()); // 수신
					
					// 한번 비워준다.
					pm.list.clear();
					for(Person p; ( p = (Person)ois.readObject()) != null ;) {
						pm.list.add(p);
					}
					
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















