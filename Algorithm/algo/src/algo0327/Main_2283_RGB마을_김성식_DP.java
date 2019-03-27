package algo0327;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2283_RGB마을_김성식_DP {

	private static int[][] cData;
	private static int N;
	private static int min;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // number of house
		
		cData = new int[N+1][3]; // color 데이터
		
		for (int i = 1; i <= N; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			cData[i][0] = Integer.parseInt(stk.nextToken());
			cData[i][1] = Integer.parseInt(stk.nextToken());
			cData[i][2] = Integer.parseInt(stk.nextToken());
		}
		
		int[][] dp = new int[N+1][3];
		for(int i = 1; i <= N; i++) {
			dp[i][0] = (dp[i-1][1] < dp[i-1][2]
					? dp[i-1][1] : dp[i-1][2]) + cData[i][0]; // i번째 집을 R로 칠할 경우 최솟값.
					
			dp[i][1] = (dp[i-1][0] < dp[i-1][2]
					? dp[i-1][0] : dp[i-1][2]) + cData[i][1]; // i번째 집을 G로 칠할 경우 최솟값.
					
			dp[i][2] = (dp[i-1][0] < dp[i-1][1]
					? dp[i-1][0] : dp[i-1][1]) + cData[i][2]; // i번째 집을 B로 칠할 경우 최솟값.
					
			min = Integer.MAX_VALUE;
			for(int z = 0; z < 3; z++) {
				if(min > dp[N][z]) {
					min = dp[N][z];
				}
			}
		}
		
		System.out.println(min);
	} // end of main

} // end of class