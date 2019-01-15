package com.singleton;


public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonObject a = SingletonObject.getInstance();
		SgObject b = SgObject.getInstance();
		SgObject c = SgObject.getInstance();
		b.print();
		c.print();
		
		a.test();

	}

}
