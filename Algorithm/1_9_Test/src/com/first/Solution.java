package com.first;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int test_case = scan.nextInt();
		
		for (int t = 0; t < test_case; t++) {
			int len = scan.nextInt();
			long[] arr = new long[1000];
			
			for (int i = 0; i < len; i++) {
				arr[i] = scan.nextInt();
			}
			
			int max = Integer.MIN_VALUE;
			
			for (int i = 0; i < len - 1; i++) {
				int cnt = 1; // 최장수열의 길이를 세는 변수
				long pivot = arr[i];
				for (int j = i + 1; j < len; j++) {
					if ( pivot <= arr[j] ) {
						cnt++;
						pivot = arr[j];
//						System.out.println(i + " " + pivot);
					}				
				}
			
				if( cnt > max)
					max = cnt;		
			}
			System.out.printf("#%d %d\n",t+1,max);
		}		
	}
}
