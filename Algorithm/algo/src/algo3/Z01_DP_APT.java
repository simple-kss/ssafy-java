package algo3;

import java.util.Arrays;

public class Z01_DP_APT {
	public static void main(String[] args) {
		System.out.println(f(1));
		System.out.println(f(8));
		
		

	} // end of main

	private static int f(int n) {
		int[] memo = new int[n+2]; // 1번째, 2번쨰 배열을 만들기 위해
		memo[1] = 2;
		memo[2] = 3;
		for(int i = 3; i <= n; i++) {
			memo[i] = memo[i-1] + memo[i-2];
		}
		System.out.println(Arrays.toString(memo));
		return memo[n];
	}
} // end of main