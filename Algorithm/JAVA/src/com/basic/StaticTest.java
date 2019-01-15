package com.basic;

public class StaticTest {
	// static은 객체 만들지 않아도 사용 가능
	static int scount; // 앞으로 누워있으면 static, 클래스 변수, 객체들 간에 공유됨, class area에 생성
	// runtime 전에 이미 만들어짐
	int count = 3; // 인스턴스(객체) 변수, 객체 안에서 공유됨, heap에 생성, runtime 중에 만들어짐

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticTest s1 = new StaticTest();
		StaticTest s2 = new StaticTest();		
		StaticTest s3 = new StaticTest();
		
		int count = 5;
		
		System.out.println(count);
		
		System.out.println(StaticTest.scount);
		System.out.println(++s1.scount);
		System.out.println(++s2.scount);
		System.out.println(++s1.scount);
		
		

	}

}
