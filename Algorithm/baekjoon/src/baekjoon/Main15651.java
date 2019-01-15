package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class Main15651 {
	static BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] real;
	static boolean[] check;
	
	static void k(int n, int[] arr, int end) throws IOException {
		int len = arr.length;
		if( n >= end) {
			for(int i = 0; i < n; i++)
				bf.append(real[ arr[i] ]+" ");
			bf.append("\n");
		}
		else {
			// 사용하지 않은 숫자들만 채우고 재귀호출
			for (int i = 0; i < len; i++) {
				arr[n] = i;
				k(n+1, arr, end);
			}				
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // 1~N까지
		int M = scan.nextInt(); // M개의 수열
		
		//arr = new int[M];
		real = new int[N];
		check =  new boolean[N];
		for (int i = 0; i < N; i++) {
			real[i] = i+1;			
		}
		//System.out.println(Arrays.toString(real));
		k(0, new int[N], M);
		bf.close();
	}
	
}
