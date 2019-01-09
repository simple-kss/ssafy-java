package com.basic;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle();
		Circle b = new Circle();
		a.r = 3;
		b.r = 4;
		System.out.println(a.getArea());
		System.out.println(a.getCircum());
		
		System.out.println(b.getArea());
		System.out.println(b.getCircum());
		
		Rect c = new Rect();
		Rect d = new Rect();
		
		c.height = 100;
		c.width = 100;
		
		d.height = 100;
		d.width = 200;
		
		System.out.println(c.getArea());
		System.out.println(c.getCircum());
		
		System.out.println(d.getArea());
		System.out.println(d.getCircum());
	}

}
