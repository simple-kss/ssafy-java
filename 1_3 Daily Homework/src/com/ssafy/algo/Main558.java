package com.ssafy.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jdk.internal.util.xml.impl.Input;

public class Main558 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = 0;
		int[] arr = new int[100];
		while(true) {
			String str = br.readLine();
			int in = Integer.parseInt(str);
			if( in == 0)
				break;
			arr[size] = in;
			size++;			
		}
		for (int i = 0; i < size; i++) {
			int j = arr[i];
			System.out.print(j + " ");
		}
	}
}
