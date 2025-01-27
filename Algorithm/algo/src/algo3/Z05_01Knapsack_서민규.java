package algo3;

import java.util.Arrays;

/**
 * 
 * 0-1 knapsack : DP로 풀기 
 * 
 *
 */

public class Z05_01Knapsack_서민규 {
	public static void main(String[] args) {
		System.out.println(f(10));
		
	} // end of main

	private static int f(int n) {
		// 배낭의 무게 n을 받았을 때, 최대가치를 찾아보자
		
		
		int[][] item = {
				{10, 5},
				{40, 4},
				{30, 6},
				{50, 3}
		};
		// {가격(만원), 무게(Kg)}
		
		// 0 번지도 만들어야함
		int[][] K = new int[item.length + 1][n + 1]; // [반영할 item][배낭의 무게]
		
		for(int i = 0; i < item.length; i++) {
			// 임시 배낭의 무게
			for(int w = 0; w < item[i][1]; w++ ) {
				K[i+1][w] = K[i][w]; // 임시 배낭의 무게보다 물건의 무게가 무거우면,
				// 이전 값을 가져오기
				
			}
			
			// 임시 배낭의 무게
			for(int w = item[i][1]; w <= n; w++ ) {
				int now = item[i][0] + K[i][w-item[i][1]]; // 현재 item을 반영한 경우
				int pre = K[i][w]; // 현재 item을 반영하지 않은 경우
				K[i+1][w] = now >= pre ? now : pre;
			}
			
		}
		

		
		// 배열 출력
		for (int i = 0; i < K.length; i++) {
			System.out.println(Arrays.toString(K[i]));
		}
		
		
		
		
		return K[item.length][n];
	}
} // end of class
