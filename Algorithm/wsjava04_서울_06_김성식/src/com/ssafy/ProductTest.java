package com.ssafy;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv("120","샘숭티비",498000,100,33,"플라즈마");
		Tv t2 = new Tv("121","엘지티비",398000,90,34,"LCD");
		Refri refri = new Refri("233","LG시그니처",898000,150,100);
		
		System.out.println("***************재고 목록***************");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(refri);
		

	}

}
