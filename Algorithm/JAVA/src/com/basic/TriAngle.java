package com.basic;

public class TriAngle extends Shape {
	int x;
	int y;
	int z;
	int height;
	

	
	

	public TriAngle(int x, int y, int z, int height) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.height = height;
	}

	public TriAngle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return x * height / 2.0;
	}

	@Override
	public double getCircum() {
		// TODO Auto-generated method stub
		return x+y+z;
	}

}
