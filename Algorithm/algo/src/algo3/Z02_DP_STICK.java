package algo3;

import java.util.Arrays;

public class Z02_DP_STICK {
	public static void main(String[] args) {
		System.out.println(f(6));
		System.out.println(f1(6));

	} // end of main

	private static int f(int n) {
		int[] memo = new int[n+2];
		memo[1] = 2;
		memo[2] = 5;
		
		for(int i = 3; i <= n; i++) {
			memo[i] = 2 * memo[i-1] + memo[i-2];
		}
		System.out.println(Arrays.toString(memo));
		return memo[n];
	}
	
	// 1cm짜리가 3개, 2cm짜리가 1개 있을 때
	private static int f1(int n) {
		int[] memo = new int[n+2];
		memo[1] = 3;
		memo[2] = 10;
		
		for(int i = 3; i <= n; i++) {
			memo[i] = 3 * memo[i-1] + memo[i-2];
		}
		System.out.println(Arrays.toString(memo));
		return memo[n];
	}
} // end of class
