package com.inherit;

public class BonusTest {
	
	// 매개변수로 개념이 큰 부모로 받는다.
	public void printBonus(Employee who) {
		
		// 그리고 그 타입이 자식타입이라면 다르게 수행
		// 둘 간의 상속관계가 있는지를 검증해야한다.
		if(who instanceof Manager) {
			System.out.println("hello,,,");
		}
		System.out.println(who.getClass().getName());
		System.out.println(who.getBonus());
	}
	
//	public void printBonus(Manager who) {
//		System.out.println(who.getClass().getName());
//		System.out.println(who.getBonus());
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BonusTest bt = new BonusTest();
		Employee tom = new Employee(100, "tom", 5000);
		Manager bill = new Manager(200, "bill", 5000, 1);
		
		bt.printBonus(tom); // Employee.getBonus 호출
		bt.printBonus(bill); // Manager.getBonus 호출

	}

}
