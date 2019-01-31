package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainTest {

	public static void main(String[] args) {
		try {
//			String s = "123";
//			FileOutputStream fos = new FileOutputStream("\\test1.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			FileInputStream fis = new FileInputStream("test1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
//			oos.writeObject(s);
//			System.out.println("기다리는중");
			String t;
			t = (String) ois.readObject();
			System.out.println(t);
//			System.out.println("완료");

			
			
			
			
			
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
