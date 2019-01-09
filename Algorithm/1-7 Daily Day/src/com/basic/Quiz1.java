package com.basic;

public class Quiz1 {
	
	static void printGreeting(String str) {
		System.out.println(str + "...be happt");
	}
	
	static void reverse(String str) {
		System.out.println(str + "welcome!");
	}
	
	static void result(boolean a, boolean b) {
		if(a && b)
			System.out.println("ok");
		else
			System.out.println("cancel");		
	}
	
	static void loopString(int count, String msg) {
		for (int i = 0; i < count; i++) {
			System.out.println(msg);			
		}
	}
	
	static double getArea(int r) {
		return r * r * 3.14;		
	}
	
	static double printCircum(int r) {
		return 2 * 3.14 * r;
	}
	
	static int[] makeArray(int len) {
		return new int[len];
	}
	
	static void total() {
		
	}
	
	static void isExist() {
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
