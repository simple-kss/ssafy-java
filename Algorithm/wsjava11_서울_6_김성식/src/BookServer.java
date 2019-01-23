import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class BookServer {
	
	public static void readSocket() {
		
	}

	public static void main(String[] args) {
		/* 1. ServerSocket(port) 생성
		 * 2. Server.accept() : 클라이언트가 접속해 오기를 기다렸다가 받는 메소드
		 * 3. Socket 객체로 I/O 스트림 생성
		 * 4. 스트림으로 통신
		 * 5. close(): 마무리
		 * */
		//70.12.108.99
		ServerSocket server;
        Socket s1;
        String sendString = "만ㄹ랩 갓파";
        
        InputStream s1in;
        ObjectInputStream ois;
        DataInputStream dis;
        
        try
        {
            server = new ServerSocket(5432);
            System.out.println("클라이언트를 기다리는 중 ...");
            s1 = server.accept(); // 클라이언트 기다림, 이것도 블럭이 된다.
            // s1에는 클라이언트 소켓이 들어감
            System.out.println("클라이언트 접속!");
            
            s1in = s1.getInputStream();
            dis = new DataInputStream(s1in);
            ois = new ObjectInputStream(s1in);
            
            System.out.println("받을준비 됨!");
            int size = dis.readInt();
            for(int i = 0; i < size; i++) {
            	Book b = (Book) ois.readObject();
            	System.out.println(b.toString());
            	
            }
//        	sendString = scan.nextLine();
            // 이부분도 블럭이됨, 읽을때까지, readObject로 한다.
        	// String b = ois.readUTF(); 

            dis.close();
            ois.close();
            s1in.close();
        	server.close();
        	System.out.println("서버 닫음");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
