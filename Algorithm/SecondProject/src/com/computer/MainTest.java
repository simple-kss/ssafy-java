package com.computer;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyBoard keyBoard = new KeyBoard();
		
		
		char[] cha = {'1','2','3','\0'};
		
		String str = new String(cha);

		Frame f = new Frame(str);
		f.setLayout(new FlowLayout());
	
		Button b = new Button("press");
		
		Checkbox ch = new Checkbox("123");
		Checkbox ch_ = new Checkbox("456",true);
		
		f.add(b);
		f.add(ch);
		f.add(ch_);
		f.setSize(300, 300);
		f.setVisible(true);
		
		System.out.println(str);
		
		

	}

}
