package com.basic;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class WrapperTest {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 123; // 기본형
		count++;
		//int --> Integer 
		Integer i = new Integer(count);
		// 객체로 바뀌었기 떄문에 연산이 안된다.
		i++; //125가 된다. auto-unboxing이 되어 연산을 실행하고
		// 다시 auto-boxing해서 Integer 객체로 만듦
		System.out.println(i);
		
		String snum = "567";
		int num = Integer.parseInt(snum);
		System.out.println(num);
		
		double d = 3.14;
		//Wrapper class로 바꾸기
		
		String snum2 = "2.56";
		//snum2를 double타입으로 바꾸기
		System.out.println(++d);
		
		WrapperTest w = new WrapperTest();
		System.out.println(w.toString());
		
		

	}

}
