package com.ssafy;

import java.util.ArrayList;

public class IProductManagerImpl {
	private ArrayList<Product> bm = new ArrayList<>();
	private int index;
	
	
	// 1. 데이터 입력 기능
	public void add(Product p) {
		bm.add(p);		
	}
	
	// 2. 데이터 저체 검색 기능
	public ArrayList<Product> search() {
		return bm;
	}
	
	// 3. Isbn 번호로 상품을 검색
	public ArrayList<Product> search(String num) {
		ArrayList<Product> temp = new ArrayList<>();
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm.get(i).getNum().equals(num)) 
				temp.add(bm.get(i));
		}
		return temp;
	}
	
	// 4. 상품명으로 상품을 검색하는 기능
	public ArrayList<Product> searchName(String name) {
		ArrayList<Product> temp = new ArrayList<>();
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm.get(i).getNum().contains(name)) 
				temp.add(bm.get(i));
		}
		return temp;		
	}
	
	// 5. Tv만 검색하는 기능
	public ArrayList<Product> searchTv() {
		ArrayList<Product> temp = new ArrayList<>();
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm.get(i) instanceof Tv) {
				temp.add(bm.get(i));
			}
		}
		return temp;
	}
	
	// 6. Refrigerator만 검색하는 기능
	public ArrayList<Product> searchRefrigerator() {
		ArrayList<Product> temp = new ArrayList<>();
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm.get(i) instanceof Refrigerator) {
				temp.add(bm.get(i));
			}
		}
		return temp;
	}
	
	// 7. 400L이상의 Refrigerator 검색
	public ArrayList<Refrigerator> search400L() {
		ArrayList<Refrigerator> temp = new ArrayList<>();
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm.get(i) instanceof Refrigerator) {
				Refrigerator t = (Refrigerator)bm.get(i);
				
				if(t.getVolume() < 400) continue;
					temp.add(t);
			}
		}
		return temp;
	}
	
	// 9. 50inch이상의 TV 검색
	public ArrayList<Tv> search50inch() {
		ArrayList<Tv> temp = new ArrayList<>();
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(bm.get(i) instanceof Tv) {
				Tv t = (Tv)bm.get(i);
				if(t.getInch() < 50) continue;
				temp.add(t);
			}
		}
		return temp;
	}
	
	// 10. 상품번호와 가격을 입력 받아 상품 가격을 변경할 수 있는 기능
	public void updatePrice(String num, int price) {
		for (int i = 0; i < index; i++) {
			if(bm.get(i).getNum().equals(num)) {
				bm.get(i).setPrice(price);
				System.out.println("업데이트 완료!");
			}
		}
	}
	
	// 11. 상품번호로 상품을 삭제하는 기능
	public void delete(String num) {
		for (int i = 0; i < index; i++) {
			if(bm.get(i).getNum().equals(num)) {
				bm.remove(i);
			}
		}
	}
	
	// 12. 전체 재고 상품 금액을 구하는 기능
	public double total() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += bm.get(i).getPrice() * bm.get(i).getAmount();
		}
		return total;
	}
	
	public int getSize() {
		return index;
	}

}
