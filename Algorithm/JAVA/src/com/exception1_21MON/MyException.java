package com.exception1_21MON;

// 사용자 정의 예외 클래스
// 조건 : Exception 크래스 상속 받아야 됨
public class MyException extends Exception {
	
	MyException() {
		System.out.println("MyException 발생!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MyException!!!";
	}
	
}
