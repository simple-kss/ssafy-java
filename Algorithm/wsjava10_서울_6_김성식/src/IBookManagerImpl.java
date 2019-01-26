

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class IBookManagerImpl implements IBookMgr {
	private ArrayList<Book> bm = new ArrayList<>();
	
	
	
	public IBookManagerImpl() {
		// 처음에 생성할 때 초기 데이터 값 넣는다.
		try {
			FileInputStream fis = new FileInputStream("book.dat");

		} catch (FileNotFoundException e) {
			bm.add( new Book("00001","종만북",20000,2));
			bm.add( new Book("00002","Java 라",25000,4));
			bm.add( new Book("00003","분석설계",15000,6));
			bm.add( new Book("00004","계설석분",10000,5));
			bm.add( new Book("00005","설계분석",20000,5));
			
			bm.add( new Magazine("1001","그리스",12000,5,1));
			bm.add( new Magazine("1002","일본",24000,2,2));
			bm.add( new Magazine("1003","한국",10000,10,3));
			bm.add( new Magazine("1004","미국",25000,4,4));
			bm.add( new Magazine("1005","중국",30000,1,5));
			this.close();
			bm.clear();
			
		}
		open();
	}

	// 1. 데이터 입력 기능
	public void add(Book p) {
		bm.add(p);		
	}
	
	// 2. 데이터 저체 검색 기능
	public ArrayList<Book> search() {
		return bm;
	}

	// 3. 도서가 판매되어 재고 수량을 빼는 기능
	@Override
	public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException {
		for (Book book : bm) {
			if(book.getIsbn().equals(isbn)) {
				int q = book.getQuantity() - quantity;
				if(q < 0)
					throw new QuantityException();
				book.setQuantity(q);
				return;
			}
		}
		// 반복문을 모두 통과했다는 것은
		// 검색한 Isbn이 존재하지 않았다는 이야기
		throw new ISBNNotFoundException();
		
	}

	// 4. 도서가 구매되어 재고 수량을 더하는 기능
	@Override
	public void buy(String isbn, int quantity) throws ISBNNotFoundException {
		for (Book book : bm) {
			if(book.getIsbn().equals(isbn)) {
				int q = book.getQuantity() + quantity;
				book.setQuantity(q);
				return;
			}
		}		
		// 반복문을 모두 통과했다는 것은
		// 검색한 Isbn이 존재하지 않았다는 이야기
		throw new ISBNNotFoundException();
	}
	
	// 5. 재고 도서들의 수량*금액을 하여 총 재고 금액을 구하여 리턴
	@Override
	public int getTotalAmount() {
		int sum = 0;
		for (Book book : bm) {
			sum += book.getPrice() * book.getQuantity();
		}
		return sum;
	}

	// 6. 클래스 생성시에 호출되어 지며, 파일("book.dat")에 저장된 파일을 읽어서 ArrayList에 저장
	@Override
	public void open() {
		try {
			FileInputStream fis = new FileInputStream("book.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			for(Book b; ( b = (Book)ois.readObject() ) != null; ) {
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

	// 7. 플그램 종료시에 호출되어 지며, ArrayList에 있는 도서 정보를 파일로 저장.ㄴ
	@Override
	public void close() {
		// 객체 저장
		try {
			FileOutputStream fos = new FileOutputStream("book.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Book book : bm) {
				oos.writeObject(book);			
			}
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	public int getSize() {
		return bm.size();
	}
}
