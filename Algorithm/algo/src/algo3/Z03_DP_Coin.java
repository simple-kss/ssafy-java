package algo3;

import java.util.Arrays;

// 1, 4, 6원 동전을 고려하여
// 8원을 거슬러줄때 최소 동전의 갯수는?

public class Z03_DP_Coin {	
	public static void main(String[] args) {
		
		System.out.println(f(8));
		
 	} // end of main

	private static int f(int n) {
		// 3행을 만드는게 아니라 1행만 만들어 놓고 update 작업을 해보겠다.!
		int[] C = new int[n+1]; // 동전 거스름돈의 동전의 최소개수 (최적의 해)
		
		// 1원 동전을 고려한 경우
		for(int i = 1; i <= n; i++ ) {
			C[i] = i;
		}
		System.out.println(Arrays.toString(C));
		
		// 4원 동전을 고려한 경우 ( 1, 4원)
		for(int i = 4; i <= n; i++ ) {
			if(C[i] > C[i-4] + 1) {
				C[i] = C[i-4] + 1;
			}
		}
		System.out.println(Arrays.toString(C));
		
		// 6원 동전을 고려한 경우 ( 1, 4, 6원)
		for(int i = 6; i <= n; i++ ) {
			if(C[i] > C[i-6] + 1) {
				C[i] = C[i-6] + 1;
			}
		}
		System.out.println(Arrays.toString(C));
		
		// 동전의 배열을 만들어 for문안에 for를 넣어 한번에 반복으로 답을 구할 수 있다.
		
		
		return n;
	}
	
} // end of class