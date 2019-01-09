package com.ssafy;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("21424","Java 다","김상사","jjjj.kr",19800,"자바기본문법");
		Book b2 = new Book("35355","분석설계","이근희","kkkk.kr",39800,"SW모델");

		Magazine m = new Magazine("12345","Java메거진!","홍진호","java.com",2018,2,8000,"첫걸음");
		
		System.out.println("*********************** 도서목록**************************");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(m.toString());
	}

}
