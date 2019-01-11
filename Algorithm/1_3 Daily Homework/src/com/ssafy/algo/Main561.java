package com.ssafy.algo;

import java.util.Scanner;

public class Main561 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int udHu = 0;
		int upHu = 0;
		int diffUd = Integer.MAX_VALUE;
		int diffUp = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int num = scan.nextInt();
			
			// num is lather than 100
			if( num < 100) {
				if( (100 - num) < diffUd) {
					diffUd = 100 - num;
					udHu = num;
				}	
			}
			// num is more than 100
			// num >= 100
			else {
				if( (100 - num) < diffUp) {
					diffUp = num - 100;
					upHu = num;
				}
			}
		}
		
		System.out.print(udHu + " " + upHu);
	}

}
