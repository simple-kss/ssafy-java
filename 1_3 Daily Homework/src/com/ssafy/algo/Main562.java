package com.ssafy.algo;

import java.util.Scanner;

public class Main562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = scan.nextInt();
			//짝수번째
			if ( (i+1) % 2 == 0 ) {
				sumEven += arr[i];
			}
			//홀수번째
			else {
				sumOdd += arr[i];				
			}				
		}	
		System.out.println("sum : " + sumEven);
		System.out.println("avg : " + sumOdd/5.0);
	}
}
