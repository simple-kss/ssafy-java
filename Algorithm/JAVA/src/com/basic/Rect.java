package com.basic;

public class Rect extends Shape {
	int width;
	int height;
	
	
	public Rect(int width, int hegiht) {
		this.width = width;
		this.height = hegiht;
	}

	public Rect() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double getCircum() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

}
