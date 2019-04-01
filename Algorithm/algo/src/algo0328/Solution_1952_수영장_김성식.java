package algo0328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.sound.midi.Synthesizer;

public class Solution_1952_수영장_김성식 {

	private static int day;
	private static int mon;
	private static int tmon;
	private static int year;
	private static int[] plan;
	private static int[] dp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		
		StringBuilder sb = new StringBuilder();
		for (int t = 1; t <= tc; t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine().trim(), " ");
			day = Integer.parseInt(stk.nextToken());
			mon = Integer.parseInt(stk.nextToken());
			tmon = Integer.parseInt(stk.nextToken());
			year = Integer.parseInt(stk.nextToken());
			
			stk = new StringTokenizer(br.readLine().trim(), " ");
			plan = new int[13];
			for (int i = 1; i <= 12; i++) {
				plan[i] = Integer.parseInt(stk.nextToken());
			}
			dp = new int[13]; // dp[n] n월까지고려한 최소 금액
			
			// 초기값 배정
//			if(plan[1] != 0) {
				int v1 = plan[1] * day;
				int v2 = mon;
				int v3 = tmon;
				dp[1] = v1 < v2 ? v1 : v2;
				dp[1] = v3 < dp[1] ? v3 : dp[1];
//			}
//			if(plan[2] != 0) {
				v1 = plan[2] * day;
				v2 = mon;
				v3 = tmon;
				dp[2] = v1 < v2 ? v1 : v2;
				dp[2] = v3 < dp[2] ? v3 : dp[2];
				dp[2] += dp[1];
//			}
			
			// dp 돌리기
			for (int i = 3; i <= 12; i++) {
				v1 = dp[i-1] + plan[i] * day;
				v2 = dp[i-1] + mon;
				v3 = dp[i-3] + tmon;
				dp[i] = v1 < v2 ? v1 : v2;
				dp[i] = v3 < dp[i] ? v3 : dp[i];
			}
			int min = dp[12] > year ? year : dp[12];
			
			System.out.println("#" + t + " " + min);
//			sb.append('#').append(t).append(' ').append(min).append('\n');
		}
//		System.out.println(sb);
		
		
	} // end of main
	
} // end of class