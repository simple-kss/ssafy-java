package com.inter;

public class ShapeMakerTest {
	ShapeMaker maker;
	
	public ShapeMakerTest() {
		maker = new ShapeMaker();	
	}
	
	public void test() {
		ICircle x = maker.makeShape();
		System.out.println(x.getArea());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ShapeMakerTest().test();

	}

}
