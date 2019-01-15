package com.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.basic.Circle;

// Map:(key, valule)의 쌍으로 저장되는 구조
public class HashmapTest {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("num",123);
		map.put("name",141);
		map.put("address",232);
		
		int name = map.get("name");
		int address = map.get("address");
		System.out.println(name + " " + address);
		


		
		Set<String> s = map.keySet();
		for (String string : s) {
			Integer value = map.get(string);
			System.out.println(string + " : " + value);
		}
		
//		System.out.println(s.getClass().getName());
//		System.out.println(s);
	}

}
