package algo3;

public class 배낭01_DP_김성식 {
	public static void main(String[] args) {
		int[] v = new int[]{0, 10, 40, 30, 50};
		int[] w = new int[]{0, 5, 4, 6, 3};
		
		int bSize = 10;
		
		int[][] dp = new int[v.length][bSize+1];
		
		// j 가방의 무게
		for(int j = 0; j <= bSize; j++ ) {
			dp[0][j] = 0;
		}
		
		// i 고려하는 보석의 개수
		for(int i = 1; i < v.length; i++ ) {
			// 그 이전까지는 전에있는거 복사한다.
			for(int j = 0; j < w[i]; j++ ) {
				dp[i][j] = dp[i-1][j];
			}
			// j 가방의 무게
			// 고려하는 해당 보석의 무게부터 시작해도 된다.
			for(int j = w[i]; j <= bSize; j++ ) {
				if( i == 0 || j == 0 )
					dp[i][j] = 0;
				else {
					dp[i][j] = Math.max(dp[i-1][j], v[i] + dp[i-1][j-w[i]]);
				}
				// 넣는 것과 이전 최적에서 하나빼서 넣는 것 중 큰거 선택
			}
		}
		
		for(int i = 0; i < v.length; i++ ) {
			for(int j = 0; j <= bSize; j++ ) {
				System.out.print(dp[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println(dp[4][bSize]);
		
		
		

	} // end of main
} // end ofm class
