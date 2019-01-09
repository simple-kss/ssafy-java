package com.computer;

public class Monitor {
	public Monitor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Monitor(String maker, double size) {
		super();
		this.maker = maker;
		this.size = size;
	}

	String maker;
	double size;
	
	void powerOn() {
		System.out.println("Monitor PowerOn");
		
	}
	void powerOff() {
		System.out.println("Monitor PowerOff");
		
	}
	
	void info() {
		System.out.println(maker + " " + size);
		
	}

}
