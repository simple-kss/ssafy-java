package com.computer;

public class MyComputer {
	MainFrame frame;
	KeyBoard keyboard;
	Mouse mouse;
	Monitor monitor;
	
	void init() {
		this.frame = new MainFrame("123",1);
		this.keyboard = new KeyBoard("321","2");
		this.mouse = new Mouse("555",true);
		this.monitor = new Monitor("999",5);
	}
	
	void powerOn() {
		frame.powerOn();
		monitor.powerOn();
	}
	
	void dojob() {
		keyboard.keyType();
		mouse.click();
		mouse.scroll();
		keyboard.keyType();
	}
	
	void powerOff() {
		frame.powerOff();
		monitor.powerOff();		
	}

}
