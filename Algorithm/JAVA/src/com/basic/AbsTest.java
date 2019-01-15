package com.basic;

// 클래스 안에 추상 메소드가 있따면 클래스도 추상이 되어야 함. 미완성 클래스

// 추상 클래스를 상속 받는 자식 클래스를 만들고 그 자식 클래스에서 부모가 가지고 있던
// 미완성의 추상 메소드를 완성(구현, implement) 시켜 놔야함
abstract class AbstractClass{	
	// 추상 메소드 : 메소드의 바디({})가 없다. 미완성 메소드. 자식이 구현해주어야함.	
	abstract public void hello();	
	public void go() {}	
}

class MyAbstractClass extends AbstractClass{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello, abstract class....");
		
	}
	
}



public class AbsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAbstractClass c = new MyAbstractClass();
		c.hello();

	}

}
