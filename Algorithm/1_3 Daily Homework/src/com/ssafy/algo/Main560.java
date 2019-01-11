package com.ssafy.algo;

import java.util.Scanner;

public class Main560 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			int num = scan.nextInt();
			if( num < min )
				min = num;			
		}
		System.out.println(min);
	}
}
