package hwjava12_서울_6반_김성식;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;


public class PersonManager implements ActionListener{
	ArrayList<Person> list = new ArrayList<Person>();
	// Name
	String fileName;
	
	// GUI Object Part
	Frame frame;
	TextArea ta;
	TextField tf;
	TextField tfName;
	TextField tfHp;
	TextField tfAddress;
	
	Panel p;
	Button bInsert;
	Button bUpdate;
	Button bDelete;
	Button bSelect;
	
	Button bUpload;
	Button bClear;
	Button bExit;
	
	public PersonManager(String _fileName) {
		fileName = _fileName;
		try {
			FileInputStream fis = new FileInputStream(_fileName);
		} catch (FileNotFoundException e) {
			list.add(new Person("김성식","010-1234-1234","서울시 관악구"));
			list.add(new Person("전우형","010-4444-1000","서울시 서초구"));
			list.add(new Person("김재룡","010-3333-2001","서울시 동작구"));
			list.add(new Person("이정연","010-2222-3004","서울시 구로구"));
			list.add(new Person("이근희","010-1111-5006","서울시 영등포구"));
			this.save();
			list.clear();
		}
		this.load();
	}
	
	class ClientThread extends Thread{
		Socket s;
		ObjectInputStream ois;	// 수신
		ObjectOutputStream oos;	// 전송
		ClientThread() {
			try {
				System.out.println("socket want to connect");
				s = new Socket("127.0.0.1",1055);
				oos = new ObjectOutputStream(s.getOutputStream());
				ois = new ObjectInputStream(s.getInputStream());
				System.out.println("end of socket");
			} catch (IOException e) {
			}
		}
		
		@Override
		public void run() {	
			try {
				for (Person person : list) {
					oos.writeObject(person);
				}
				oos.close();
				//s.close();
			} catch (IOException e) {
			}
		}
	}
	
	// GUI생성
	void createGUI() {
		frame = new Frame("Phone Book");
		frame.setBounds(700, 100, 400, 600);
		frame.setLayout(new GridLayout(5,0));
//		frame.setLayout(new BorderLayout());
		
		ta = new TextArea();
		ta.setEditable(false);
		
		bInsert = new Button("INSERT");
		bUpdate = new Button("UPDATE");
		bDelete = new Button("DELETE");
		bSelect = new Button("SELECT");
		
		bUpload = new Button("Upload");
		bClear = new Button("Clear");
		bExit = new Button("Exit");

		tfName = new TextField(6);
		tfHp = new TextField(6);
		tfAddress = new TextField(6);
		
		Panel p = new Panel();
		Panel p2 = new Panel(new GridLayout(3,2));
		Panel p3 = new Panel();
		p.setSize(950, 50);
		
		p.add(bInsert);
		p.add(bUpdate);
		p.add(bDelete);
		p.add(bSelect);
		
		p2.add(new Label("이 름"));
		p2.add(tfName);
		p2.add(new Label("핸드폰"));
		p2.add(tfHp);
		p2.add(new Label("주소"));
		p2.add(tfAddress);
		
		p3.add(bUpload);
		p3.add(bClear);
		p3.add(bExit);
		
		
		frame.add(new Label("Phone Book"));
		frame.add(ta);
		frame.add(p);
		frame.add(p2);
		frame.add(p3);
		
		bInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Person p = new Person();
				
				String name = tfName.getText();
				String hp = tfHp.getText();
				String address = tfAddress.getText();
				p.setName(name);
				p.setHp(hp);
				p.setAddress(address);
				
				PersonManager.this.add(p);
				tfClear();
			}
			
		});
		bUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				String hp = tfHp.getText();

				//예외처리 필요한 부분
				PersonManager.this.update(name, hp);
				tfClear();
			}
		
			
		});
		bDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				
				PersonManager.this.remove(name);
				
				tfClear();
				
			}
			
		});
		bSelect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				ta.setText("");
				String t = tfName.getText();
				if(t.equals("")) {
					for (Person person : list) {
						ta.append(person.toString() + "\n");
					}
					return;
				}
				
				try {
					Person temp = PersonManager.this.select(t);
					System.out.println(tfName.getText());
					ta.setText(temp.toString());
				}catch (NullPointerException e1) {
					
				}
				tfClear();
			}
			
		});
		
		bUpload.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("upload! start~");
				ClientThread c = new ClientThread();
				c.start();
				System.out.println("upload! end~");
				
			}
		});
		bClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			}
		});
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {		
//				try {
//					s.close();
//					ois.close();
//					oos.close();
//				} catch (IOException e1) {
//					e1.printStackTrace();
//				}
				frame.dispose();
			}
		});
		
		bExit.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
//				try {
//					s.close();
//					ois.close();
//					oos.close();
//				} catch (IOException e1) {
//					e1.printStackTrace();
//				}
				frame.dispose();
			}
		});
		
		frame.setVisible(true);

	} // end of createGUI

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
	
	void tfClear() {
		tfName.setText("");
		tfHp.setText("");
		tfAddress.setText("");
	}
	
	void add(Person p) {
		for (Person person : list) {
			if(person.equals(p)) {
				System.out.println("이미 존재 함!");
				return;
			}
		}
		list.add(p);
	}
	
	Person select(String inName) {
		for (Person person : list) {
			if(person.getName().equals(inName)) {
				return person;
			}
		}
		System.out.println("존재하지 않음");
		return null;
	}
	
	void update(String inName, String inHp) {
		for (Person person : list) {
			if(person.getName().equals(inName)) {
				person.setHp(inHp);
				return;
			}
		}
		System.out.println("존재하지 않음");
	}
	
	void remove(String inName) {
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			if(p.getName().equals(inName)) {
				it.remove();
			}
		}
	}
	
	void print() {
		for (Person person : list) {
			System.out.println(person.toString());
		}
		System.out.println();
	}
	
	// 파일 저장하기
	void save() {
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			for (Person p: list) {
				oos.writeObject(p);			
			}
			oos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			System.out.println("읽어들어올 파일이 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 파일 불러들이기
	void load() {
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			for(Person p; ( p = (Person)ois.readObject()) != null ;) {
				list.add(p);
			}
		} catch (EOFException p) {
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		PersonManager pm = new PersonManager("whitePage.dat");
		pm.createGUI();
		
	}

}


