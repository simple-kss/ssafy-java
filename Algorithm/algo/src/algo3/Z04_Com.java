package algo3;

import java.util.Arrays;

public class Z04_Com {
	public static void main(String[] args) {
		System.out.println(bino(4,2)); // 6
		// n = 4, k = 2 x^k의 계수 (x+y)^n 했을 때
	} // end of main

	private static int bino(int n, int k) {
		// 
		int[][] B = new int[n+1][k+1];
		for(int i = 0; i <= n; i++ ) {
			int min = i < k ? i : k ;
			for(int j = 0; j <= min ; j++ ) {
				if(j == 0 || j == i) {
					B[i][j] = 1;
				}
				else {
					B[i][j] = B[i-1][j-1] + B[i-1][j];
				}
			}
		} // end of for
		
		for (int j = 0; j < B.length; j++) {
			System.out.println(Arrays.toString(B[j]));
		} // end of for
		
		return B[n][k];
		
		
	}
} // end of class

















