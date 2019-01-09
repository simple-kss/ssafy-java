package com.ssafy;

import java.util.Iterator;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] b = new Book[5];
		Magazine[] m = new Magazine[5];
		
		b[0] = new Book("00001","Java 다","김상사","jjja.kr",19500,"자바기본문법");
		b[1] = new Book("00002","Java 라","김중사","jjjb.kr",24000,"c++문법");
		b[2] = new Book("00003","분석설계","이근희","kkkc.kr",56004,"SW모델");
		b[3] = new Book("00004","계설석분","전우형","kkkd.kr",24352,"HW모델");
		b[4] = new Book("00005","설계분석","김성식","kkke.kr",35212,"12모델");

		m[0] = new Magazine("12344","Java메거진!","홍진호","java.com",2018,2,5000,"첫걸음");
		m[1] = new Magazine("25233","c메거진!","홍정호","jaaa.com",2017,2,6600);
		m[2] = new Magazine("12423","c++메거진!","홍기호","jada.com",2014,2,2200,"3걸음");
		m[3] = new Magazine("11888","J메거진!","홍백호","ja2a.com",2012,2,1100,"4걸음");
		m[4] = new Magazine("12357","Jaa메거진!","홍시호","j3va.com",2011,2,1500,"5걸음");
		
		System.out.println("*********************** 도서 목록 **************************");
		for (Book book : b) {
			System.out.println(book.toString());			
		}
		
		System.out.println("*********************** 잡지 목록 **************************");
		for (Magazine magazine : m) {
			System.out.println(magazine.toString());
			
		}
	}

}
