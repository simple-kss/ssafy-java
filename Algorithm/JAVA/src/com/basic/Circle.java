package com.basic;


//Shape의 자식 클래스 Shape가 가지고 있던 미완성 메소드 2개(getArea(), getCircum())을 완성 시켜야함
public class Circle extends Shape{
	int r;

	
	
	
	public Circle(int r) {
		this.r = r;
	}

	public Circle() {
		super();
		System.out.println("3");
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return r * r * Math.PI;
	}

	@Override
	public double getCircum() {
		// TODO Auto-generated method stub
		return 2 * r * Math.PI;
	}
	
	
}