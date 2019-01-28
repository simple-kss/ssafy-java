package com.ssafy;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductMgr implements Manageable<Product>{
	ArrayList<Product> list = new ArrayList<Product>();
	int size;
	NameCompare nameCompare = new NameCompare();
	
	//저장	
	public void add(Product m) {
		list.add(m);		
	}
	
	//검색 , 제품 이름으로 검색후 그 이름과 일치하는 객체 반환
	public Product search(String name) {		
		for (Product Movie : list) {
			if(Movie.getName().equals(name))
				return Movie;
		}
		return null;		
	}
	
	//검색, 제품 아이디로 검색 후 객체 반환
	public Product search(int id) {
		for (Product Movie : list) {
			if(Movie.getId() == id)
				return Movie;
		}
		return null;	
		
	}
	
	//검색, 객체로 ID반환
	public int search(Product m) {
		for (Product movie : list) {
			if(movie.equals(m) ) {
				return movie.getId();
			}
		}
		return -1;
	}
	
	//수정, 이름과 이름을 입력하여 제품이름 수정
	void update(String name, String str) {
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if( list.get(i).getName().equals(name) ) {
				list.get(i).setName(str);				
			}
		
		}
	}
	
	//전체 출력
	void info() {
		for (Product movie : list) {
			System.out.println(movie.toString());
		}
	}
	
	// 삭제
	public void delete(String s) {
		for (Product movie : list) {
			if(movie.getName().equals(s)) {
				list.remove(movie);
				return;
			}
		}
	}
	
	// Comperator 정의
	class NameCompare implements Comparator<Product> {
		@Override
		public int compare(Product o1, Product o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	}
	
}
