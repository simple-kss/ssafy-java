package com.ssafy;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv[] t = new Tv[4];
		Refri[] r = new Refri[4];
		t[0] = new Tv("120","샘숭티비",498000,100,33,"플라즈마");
		t[1] = new Tv("121","엘지티비",398000,90,34,"LCD");
		t[2] = new Tv("122","LE티비",412000,80,24,"LdD");
		t[3] = new Tv("123","SS티비",123000,70,14,"L3D");
		
		r[0] = new Refri("233","LG시그니처",898000,150,100);
		r[1] = new Refri("212","AB시그니처",123000,160,120);
		r[2] = new Refri("200","EE시그니처",456000,170,130);
		r[3] = new Refri("245","RR시그니처",222000,180,140);
		
		System.out.println("***************티비 목록***************");
		for (Tv te : t) {
			System.out.println(te.toString());			
		}
		
		
		System.out.println("***************냉장고 목록***************");
		for (Refri refri : r) {
			System.out.println(refri.toString());
		}
		

	}

}
