package com.inherit;

class Parent {
	String name = "Tom";
	String address = "Seoul";
	
	
	
	public Parent() {
		super();
		System.out.println("Parent");
		// TODO Auto-generated constructor stub
	}

	public void printName() {
		System.out.println("name : " + name);
	}
	
	public void printAddress() {
		System.out.println("address : " + address);
	}

}

// sub Class, child class, derived class

// 사용자에게 공개하는 클래스는 하나만 만들자고 약속했음
public class child extends Parent {
	
	
	
	public child() {
		super();
		System.out.println("chlid");
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void printAddress() {
		// TODO Auto-generated method stub
		super.printAddress();
		System.out.println("!23");
	}



	public static void main(String[] args) {
		child c = new child();
		c.printAddress();
		c.printName();
//		c.main(new String[] {"123","321"});
	}

}
