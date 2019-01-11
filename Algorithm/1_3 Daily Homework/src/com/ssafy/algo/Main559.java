package com.ssafy.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main559 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double[] score = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		Scanner scan = new Scanner(System.in);
	
				
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		double sum = score[num1-1] + score[num2-1];
		System.out.println(sum);
		
	}

}
