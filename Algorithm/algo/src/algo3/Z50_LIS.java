package algo3;

import java.util.Arrays;

/*
 * 최장 증가 수열
 * LIS(Longest Increasing Subsequence)
 * DP(동적계획법)
 * O[n^2]
 * 
 * 
 */

public class Z50_LIS {
	public static void main(String[] args) {
		int[] a = {3, 2, 6, 4, 5, 1};
		int[] LIS = new int[a.length]; // 0~i까지 숫자 중 i번째 숫자를 사용해서 만들 수 있는 최장증가수열의 길이
		int[] path = new int[a.length]; // 최장 증가 수열을 추적할 경로
		
		for(int i = 0; i < a.length; i++) {
			LIS[i] = 1; // 초기값 1 (나 자신 하나의 숫자로 만들 수 있는 수열의 길이)
			path[i] = -1; // 나 자신이 시작위치라면 추적할 경로 없음으로 초기화
			for(int j = 0; j < i; j++) {
				if(a[j] < a[i] && LIS[i] < LIS[j] + 1) { // 나보다 작은 수의 LIS+1한 값들 중 최대값을 저장
					LIS[i] = LIS[j] + 1;
					path[i] = j;
				}
			}
		} // end for
		
		int maxLISIndex = 0; // 최대값이 들어있는 방 index
		System.out.println(Arrays.toString(LIS));
		int max = 0;
		for(int i = 0; i < LIS.length; i++ ) {
			if( LIS[maxLISIndex] < LIS[i] ) {
				maxLISIndex = i;
			}
		}
		
		System.out.println(Arrays.toString(LIS) + " LIS");
		System.out.println(Arrays.toString(path) + " 경로");
		System.out.println("최장증가수열의 길이 : " + LIS[maxLISIndex]);
		System.out.println("최장증가수열의 길이를 저장한 방 : " + maxLISIndex);
		
		String result = " ";
		for(int i = maxLISIndex; i != -1 ; i = path[i]) {
			result = a[i] + " " + result;
		}
		System.out.println(result);

	} // end of main
} // end of class