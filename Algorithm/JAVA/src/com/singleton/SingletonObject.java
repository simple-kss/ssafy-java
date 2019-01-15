package com.singleton;

// Singleton Pattern : 메모리 상에서  생성된 객체가 하나임을 보장하는 디자인패턴

class A {

}

public class SingletonObject {
	// 조건1. 필드에 private static을 붙여 주어야함
	// static을 붙여주어서 메모리 공유
	private static SingletonObject instance;
	
	// 조건2. 생성자에 private
	// 생성자는 내부에서만 호출하기 위해서 private
	private SingletonObject() {
		
	}
	
	// 조건3. 객체 생성 메소드는 public static으로
	// 생성 메소드만 public 이어야함. 메소드로 객체 생성하기 위해서.
	// CA에 있는 객체를 반환한다. 이미 생성되어있으면 또다시 생성하지 않는다 (필드가 static인 이유)
	public static SingletonObject getInstance() {
		if(instance == null) {
			instance = new SingletonObject();
		}
		return instance;
	}
	
	public void test() {
		System.out.println("hello...");
	}
	

}
