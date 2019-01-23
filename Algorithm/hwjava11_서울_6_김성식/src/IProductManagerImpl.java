

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;


public class IProductManagerImpl implements IProductMgr {
	private ArrayList<Product> bm = new ArrayList<>();
	
	
	//내부 클래스 : server로 Book 정보 전송
	class ProductClient extends Thread {
		public void run() { // thread가 작업할 내용이 있는 메소드-> server로 Book 정보 전송
			// Socket 생성
			// Stream 생성(Filter 포함: oo) oos로 보내야 함
			// 
			
	        Socket s1;
	        InputStream slin;
	        ObjectInputStream ois;
	        OutputStream slout;
	        ObjectOutputStream oos;
	        DataOutputStream dos;
	       
	        try {
				s1 = new Socket("localhost", 5433);
				//slin = s1.getInputStream();
				//ois = new ObjectInputStream(slin);
				slout = s1.getOutputStream(); // 출력용 스트림
				oos = new ObjectOutputStream(slout); // filter
				dos = new DataOutputStream(slout);
				
				
				ArrayList<Product> rArr = IProductManagerImpl.this.searchRefrigerator();
				ArrayList<Product> tArr = IProductManagerImpl.this.searchTv();
				ArrayList<Product> pm = new ArrayList<Product>();
				
				for (Product product : tArr) {
					pm.add(product);
				}
				for (Product product : rArr) {
					pm.add(product);					
				}
				
				dos.writeInt(pm.size());
				for (Product p : pm) {
					oos.writeObject(p);
				}
				
				//ois.close();
				//slin.close();
				oos.close();
				slout.close();
				s1.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}		
	}
	
	
	
	public IProductManagerImpl() {
		// 처음에 생성할 때 초기 데이터 값 넣는다.
		try {
			FileInputStream fis = new FileInputStream("product.dat");

		} catch (FileNotFoundException e) {
			try {

				
				// 상품번호, 이름, 가격, 수량, 인치, 타입
				this.add( new Tv("120","샘숭티비",20000,100,53,"플라즈마"));
				this.add( new Tv("121","엘지티비",30000,90,60,"LCD"));
				this.add( new Tv("122","LE티비",40000,80,24,"LdD"));
				this.add( new Tv("123","SS티비",13000,70,14,"L3D"));		
				
				// 상품번호, 이름, 가격, 수량, 용량
				this.add( new Refrigerator("233","LG시그니처",20000,150,500));
				this.add( new Refrigerator("212","AB시그니처",50000,160,600));
				this.add( new Refrigerator("200","EE시그니처",60000,170,300));
				this.add( new Refrigerator("245","RR시그니처",70000,180,350));
			} catch (DuplicateException e1) {
				e1.printStackTrace();
			}
			this.close();
			bm.clear();
			
		}
		open();
	}

	// 0. 데이터 입력 기능
	public void add(Product p) throws DuplicateException {
		for (Product product : bm) {
			if(product.getNum().equals(p.getNum())) {
				throw new DuplicateException();
			}
		}
		bm.add(p);		
	}
	
	// 1. 데이터 저체 검색 기능
	public ArrayList<Product> search() {
		return bm;
	}
	
	// 2. Isbn 번호로 상품을 검색
	public ArrayList<Product> search(String num) throws CodeNotFoundException {
		ArrayList<Product> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i).getNum().equals(num)) 
				temp.add(bm.get(i));
		}
		if(temp.size() == 0)
			throw new CodeNotFoundException();
		return temp;
	}
	
	// 3. 상품명으로 상품을 검색하는 기능
	public ArrayList<Product> searchName(String name) {
		ArrayList<Product> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i).getName().contains(name)) 
				temp.add(bm.get(i));
		}
		return temp;		
	}
	
	// 4. Tv만 검색하는 기능
	public ArrayList<Product> searchTv() {
		ArrayList<Product> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i) instanceof Tv) {
				temp.add(bm.get(i));
			}
		}
		return temp;
	}
	
	// 5. Refrigerator만 검색하는 기능
	public ArrayList<Product> searchRefrigerator() {
		ArrayList<Product> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i) instanceof Refrigerator) {
				temp.add(bm.get(i));
			}
		}
		return temp;
	}
	
	// 6. 400L이상의 Refrigerator 검색
	public ArrayList<Refrigerator> search400L() throws ProductNotFoundException {
		ArrayList<Refrigerator> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i) instanceof Refrigerator) {
				Refrigerator t = (Refrigerator)bm.get(i);
				if(t.getVolume() < 400) continue;
					temp.add(t);
			}
		}
		if(temp.size() == 0)
			throw new ProductNotFoundException();
		return temp;
	}
	
	// 7. 50inch이상의 TV 검색
	public ArrayList<Tv> search50inch() throws ProductNotFoundException {
		ArrayList<Tv> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i) instanceof Tv) {
				Tv t = (Tv)bm.get(i);
				if(t.getInch() < 50) continue;
				temp.add(t);
			}
		}
		if(temp.size() == 0)
			throw new ProductNotFoundException();
		return temp;
	}
	
	// 8. 상품번호와 가격을 입력 받아 상품 가격을 변경할 수 있는 기능
	public void updatePrice(String num, int price) {
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i).getNum().equals(num)) {
				bm.get(i).setPrice(price);
				System.out.println("업데이트 완료!");
			}
		}
	}
	
	// 9. 상품번호로 상품을 삭제하는 기능
	public void delete(String num) {
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i).getNum().equals(num)) {
				bm.remove(i);
			}
		}
	}
	
	// 10. 전체 재고 상품 금액을 구하는 기능
	public double total() {
		int total = 0;
		for (int i = 0; i < bm.size(); i++) {
			total += bm.get(i).getPrice() * bm.get(i).getAmount();
		}
		return total;
	}
	
	public int getSize() {
		return bm.size();
	}

	@Override
	public void close() {
		// 객체 저장
		try {
			FileOutputStream fos = new FileOutputStream("product.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Product product : bm) {
				oos.writeObject(product);
			}
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void open() {
		try {
			FileInputStream fis = new FileInputStream("product.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			for(Product b; ( b = (Product)ois.readObject() ) != null; ) {
				bm.add(b);
				// fis로 읽어낸 코드값 = fis.read()
				// fos의 write라는 메소드는 그 코드에 해당하는 '글자'를  대신하여 출력
			}	
			
		} catch (EOFException e) {
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("읽어들여올 파일이 없습니다.!");
			e.printStackTrace();
		}		
	}
	
	public void send() {
		ProductClient client = new ProductClient();
		client.start();
		System.out.println("전송완료!");
	}

}
