package com.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

//Set : 중복 x, 순서 x
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		TreeSet<Integer> tset = new TreeSet<>();
		set.add("one");
		set.add("two");
		set.add("one");
		set.add("three");
		set.add("two");
		
		System.out.println(set);
		System.out.println(set.toString());
		
		// Iterator(): set안에 있는 모든 데이터 꺼냄
        Iterator<String> iter = set.iterator();
        
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
		
		
		for (String string : set) {
			
			
		}
	}
}
