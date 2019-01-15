package com.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		//1.allAll
		Collections.addAll(list, "apple","orange","banana");
		System.out.println(list.toString());
		
		//2.sort
		Collections.sort(list);
		System.out.println(list.toString());
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		//3.search
        System.out.println(Collections.binarySearch(list, "banana"));
        System.out.println(Collections.binarySearch(list, "apple"));
        
        //4.copy
        ArrayList<String> fruit = new ArrayList<>();
        Collections.copy(list, fruit);//destination, source
        
        
        //5.fill
        Collections.fill(list, "here i am");
        System.out.println(list.toString());
		
		
	}//end of main
}//end of class