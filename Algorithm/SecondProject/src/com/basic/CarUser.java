package com.basic;

import java.awt.Button;
import java.awt.Frame;

public class CarUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Frame f = new Frame(); // Ã¢
		Button b1 = new Button("ok"); // ¹öÆ°
		f.add(b1);
		f.setSize(300, 300);
		f.setVisible(true);
		
		c1.num = 1234;
		c1.model = "avante";
		c1.owner = "tommy";
		
		c1.info();
		c1.run();
		c1.stop();
	}

}
