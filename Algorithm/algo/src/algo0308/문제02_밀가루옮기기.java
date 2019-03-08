package algo0308;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 문제02_밀가루옮기기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= TC; t++ ) {
			int W = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			
			int[] pack = new int[N]; // 밀가루 봉투 무게 종류
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < pack.length; i++) {
				pack[i] = Integer.parseInt(st.nextToken());
			}
			
			final int M = Integer.MAX_VALUE;
			int[] dp = new int[W+1];
			
			// 첫번쨰 종류의 봉투를 먽 ㅓ저장
			for(int i = 0; i < dp.length; i++) {
				if(i % pack[0] == 0) {
					dp[i] = i / pack[0];
				}
				else {
					dp[i] = M;
				}
			} // end of for
			
			// 두번째 봉투 부터는 반복문으로 한꺼번에 저장
			for(int i = 1; i < pack.length; i++) { // 봉투 종류
				for(int j = pack[i]; j < dp.length; j++) {
					if(dp[j-pack[i]] != M && dp[j] > dp[j-pack[i]] + 1) {
						dp[j] = dp[j-pack[i]] + 1;
					}
				}
				System.out.println(Arrays.toString(dp));
				
			}
			System.out.println("#"+t+" "+(dp[M] == M ? -1 : dp[W]));
			
		}

	} // end of main
} // end of class
