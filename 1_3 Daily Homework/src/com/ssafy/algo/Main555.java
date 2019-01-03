package com.ssafy.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main555 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char[] arr = new char[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 10; i++) {
			String str = br.readLine();
			arr[i] = str.charAt(0);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]);
		}
	}

}
