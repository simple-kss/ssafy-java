package com.ssafy;

public class ProductMgr {
	private Product[] bm = new Product[100];
	private int index;
	
	
	// 1. 데이터 입력 기능
	public void add(Product p) {
		bm[index++] = p;		
	}
	
	// 2. 데이터 저체 검색 기능
	public Product[] search() {
		return bm;
	}
	
	// 3. Isbn 번호로 상품을 검색
	public Product[] search(String num) {
		Product[] temp = new Product[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i].getNum().equals(num)) 
				temp[tempCnt++] = bm[i];
		}
		return temp;
	}
	
	// 4. 상품명으로 상품을 검색하는 기능
	public Product[] searchName(String name) {
		Product[] temp = new Product[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i].getName().contains(name)) 
				temp[tempCnt++] = bm[i];
		}
		return temp;		
	}
	
	// 5. Tv만 검색하는 기능
	public Product[] searchTv() {
		Product[] temp = new Product[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Tv) {
				temp[tempCnt++] = bm[i];
			}
		}
		return temp;
	}
	
	// 6. Refrigerator만 검색하는 기능
	public Product[] searchRefrigerator() {
		Product[] temp = new Product[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Refrigerator) {
				temp[tempCnt++] = bm[i];
			}
		}
		return temp;
	}
	
	// 7. 400L이상의 Refrigerator 검색
	public Refrigerator[] search400L() {
		Refrigerator[] temp = new Refrigerator[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Refrigerator) {
				Refrigerator t = (Refrigerator)bm[i];
				
				if(t.getVolume() < 400) continue;
				temp[tempCnt++] = t;
			}
		}
		return temp;
	}
	
	// 9. 50inch이상의 TV 검색
	public Tv[] search50inch() {
		Tv[] temp = new Tv[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm[i] instanceof Tv) {
				Tv t = (Tv)bm[i];
				if(t.getInch() < 50) continue;
				temp[tempCnt++] = t;
			}
		}
		return temp;
	}
	
	// 10. 상품번호와 가격을 입력 받아 상품 가격을 변경할 수 있는 기능
	public void updatePrice(String num, int price) {
		for (int i = 0; i < index; i++) {
			if(bm[i].getNum().equals(num)) {
				bm[i].setPrice(price);
				System.out.println("업데이트 완료!");
			}
		}
	}
	
	// 11. 상품번호로 상품을 삭제하는 기능
	public void delete(String num) {
		for (int i = 0; i < index; i++) {
			// 일치한다면 앞으로 떙기기
			if(bm[i].getNum().equals(num)) {
				
				// 땡기는 작업
				for(int j = i; j < index-1; j++) {
					bm[j] = bm[j+1];
				}
				i--; // 그 위치를 다시 비교해야한다
				index--; // 유효한 데이터 갯수를 하나 줄인다.
				System.out.println("삭제되었습니다!");
			}
		}
	}
	
	// 12. 전체 재고 상품 금액을 구하는 기능
	public double total() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += bm[i].getPrice() * bm[i].getAmount();
		}
		return total;
	}
	
	public int getSize() {
		return index;
	}

}
