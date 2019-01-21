package com.ssafy;

import java.util.ArrayList;

public class IProductManagerImpl implements IProductMgr{
	private ArrayList<Product> bm = new ArrayList<>();
	
	// 0. 데이터 입력 기능
	public void add(Product p) {
		bm.add(p);		
	}
	
	// 1. 데이터 저체 검색 기능
	public ArrayList<Product> search() {
		return bm;
	}
	
	// 2. Isbn 번호로 상품을 검색
	public ArrayList<Product> search(String num) {
		ArrayList<Product> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i).getNum().equals(num)) 
				temp.add(bm.get(i));
		}
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
	public ArrayList<Refrigerator> search400L() {
		ArrayList<Refrigerator> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i) instanceof Refrigerator) {
				Refrigerator t = (Refrigerator)bm.get(i);
				
				if(t.getVolume() < 400) continue;
					temp.add(t);
			}
		}
		return temp;
	}
	
	// 7. 50inch이상의 TV 검색
	public ArrayList<Tv> search50inch() {
		ArrayList<Tv> temp = new ArrayList<>();
		for (int i = 0; i < bm.size(); i++) {
			if(bm.get(i) instanceof Tv) {
				Tv t = (Tv)bm.get(i);
				if(t.getInch() < 50) continue;
				temp.add(t);
			}
		}
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
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
