package com.singleton;

public class SgObject {
	private static SgObject instance;
	
	private SgObject() {
		
	}
	
	
	public static SgObject getInstance() {
		if(instance == null)
			instance = new SgObject();
		
		return instance;
	}
	
	
	public void print()  {
		System.out.println("123123123");
	}
	
	

}
