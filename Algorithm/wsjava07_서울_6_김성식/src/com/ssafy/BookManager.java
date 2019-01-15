package com.ssafy;


public class BookManager {
	private Book[] bm = new Book[100];
	private int index;
	
	
	// 1. 데이터 입력 기능
	public void add(Book p) {
		bm[index++] = p;		
	}
	
	// 2. 데이터 저체 검색 기능
	public Book[] search() {
		return bm;
	}
	
	// 3. Isbn 번호로 상품을 검색
	public Book[] search(String isbn) {
		Book[] temp = new Book[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i].getIsbn().equals(isbn)) 
				temp[tempCnt++] = bm[i];
		}
		return temp;
	}
	
	// 4. Title 으로 상품을 검색하는 기능
	public Book[] searchName(String name) {
		Book[] temp = new Book[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i].getTitle().contains(name)) 
				temp[tempCnt++] = bm[i];
		}
		return temp;		
	}
	
	// 5. Book만 검색하는 기능
	public Book[] searchBook() {
		Book[] temp = new Book[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Magazine) continue;
			temp[tempCnt++] = bm[i];
		}
		return temp;
	}
	
	// 6. Magazine만 검색하는 기능
	public Book[] searchMagazine() {
		Book[] temp = new Book[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Magazine) {
				temp[tempCnt++] = bm[i];
			}
		}
		return temp;
	}
	
	// 7. Magazine중 올해 잡지만 검색하는 기능
	public Magazine[] searchYear(int n) {
		Magazine[] temp = new Magazine[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Magazine) {
				Magazine t = (Magazine)bm[i];
				if (t.getYear() == n)
					temp[tempCnt++] = t;
			}
		}
		return temp;
	}
	
	// 8. 출판사로 검색하는 기능
	public Book[] searchPub(String pub) {
		Book[] temp = new Book[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i].getPublisher().equals(pub)) {
				temp[tempCnt++] = bm[i];
			}
		}
		return temp;
	}
	
	// 9. 가격으로 검색 기능
	public Book[] searchPrice(int price) {
		Book[] temp = new Book[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i].getPrice() < price) {
				temp[tempCnt++] = bm[i];
			}
		}
		return temp;
	}
	
	// 10. 저장된 모든 도서의 금액 합계를 구하는기능
	public int totalPrice() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += bm[i].getPrice();
		}
		return total;
	}
	
	// 11. 저장된 모든 도서의 금액 평균을 구하는 기능
	public double totalAverage() {
		int total = totalPrice();
		double avg = (double)total / index;
		return avg;
	}
	
	public int getSize() {
		return index;
	}

	
}
