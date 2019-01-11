package com.ssafy.algo;

import java.util.Scanner;

public class Main563 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = scan.nextInt();				
		}
		for (int i = 0 ; i < arr.length - 1; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.print(j + " ");
		}
	}
}
