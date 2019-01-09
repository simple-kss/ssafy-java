package com.test;

public class Circle {
	int r;
	
	
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int r) {
		super();
		this.r = r;
	}
	
	public double getArea() {
		return r * r * 3.14;
	}
	
	double getCircum() {
		return 2 * r * 3.14;
	}

}
