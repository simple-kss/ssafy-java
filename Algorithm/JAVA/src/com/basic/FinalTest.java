package com.basic;

// 상속 불가
final class Test{}

// public class FinalTest extends Test {
// public class FinalTest extends String {
// 컴파일 오류 난다.

class Test2{
	// overriding이 안됨
	final void go() {}
	void stop() {}
}

public class FinalTest extends Test2{
	// final field : 값 변경이 안됨.
	static final int x = 90;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalTest t = new FinalTest();

	}

}
