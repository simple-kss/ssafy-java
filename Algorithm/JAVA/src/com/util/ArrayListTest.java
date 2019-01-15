package com.util;

import java.util.ArrayList;

import com.basic.Circle;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ¾Ï¹¬ÀûÀ¸·Î StringÀÌ ÁöÁ¤µÊ
		ArrayList<String> list = new ArrayList<>();
		ArrayList<Integer> l1 = new ArrayList<>();
		
		ArrayList<Circle> list3 = new ArrayList<>();
		ArrayList<String> l11 = new ArrayList<>();
		
		list.add("spring");
		list.add("summer");
		list.add("fall");
		list.add("winter");
		list.add("spring");
		
		list3.add(new Circle(3));
		list3.add(new Circle(5));
		list3.add(new Circle(7));
		
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
			
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		list.remove(3);
		
		System.out.println(list);
	
		list.clear();
		
		

		

	}

}
