package com.ssafy;

import java.util.ArrayList;

public interface IProductMgr {
	
	// 1. 데이터 입력 기능
	public void add(Product p);
	
	// 2. 데이터 저체 검색 기능
	public ArrayList<Product> search();
	
	// 3. Isbn 번호로 상품을 검색
	public ArrayList<Product> search(String num);
	
	// 4. 상품명으로 상품을 검색하는 기능
	public ArrayList<Product> searchName(String name);
	
	// 5. Tv만 검색하는 기능
	public ArrayList<Product> searchTv();
	
	// 6. Refrigerator만 검색하는 기능
	public ArrayList<Product> searchRefrigerator();
	
	// 7. 400L이상의 Refrigerator 검색
	public ArrayList<Refrigerator> search400L();
	// 9. 50inch이상의 TV 검색
	public ArrayList<Tv> search50inch();
	// 10. 상품번호와 가격을 입력 받아 상품 가격을 변경할 수 있는 기능
	public void updatePrice(String num, int price);
	
	// 11. 상품번호로 상품을 삭제하는 기능
	public void delete(String num);
	
	// 12. 전체 재고 상품 금액을 구하는 기능
	public double total();
	
	public int getSize();

}
