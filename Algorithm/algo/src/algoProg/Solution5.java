package algoProg;

import java.util.Arrays;
import java.util.Scanner;

public class Solution5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cStart = sc.nextInt();
        int bStart = sc.nextInt();
        int result;
        int[][] dp = new int[200001][1001]; // 몇번째 스텝안에 갈 수 있는 지 저장
        int M = Integer.MAX_VALUE;
        Arrays.fill(dp, M);
        
        
        // 브라우니가 코니를 잡아야함
        // 브라우니가 갈 수 있는 모든 경위의 수 세기
        
        dp[bStart][1] = 0;
        int step = 1;
        int cnt = 1;
	   //초기설정
        dp[step][bStart-1] = 1;
        dp[step][bStart+1] = 1;
        dp[step][bStart*2] = 1;
        
        // Math.min(dp[N-1][step-1]1, dp[N+1][step-1]1, dp[N/2][step-1]+1
	   // 이제 1부터 다 돈다.
        // k는 스텝
        for(int k = 1; k < 1000; k++) {
        	for(int i = 1; i <= 199999; i++) {
        		if(dp[i][k] != M) {
        			dp[i-1][k+1] 
        			dp[i+1][k+1]
        			dp[i*2][k+1]
        		}
        			dp[i-1][k]= Math.min(dp[i][k-1] + 1, dp[i-1][k]);
        		if(dp[i][k] != M)
        			dp[i+1][k] = Math.min(dp[i][k-1] + 1, dp[i+1][k]);
        		if( (i * 2) <= 200000 && dp[i][k-1] != M) {
        			dp[i*2][k] = Math.min(dp[i][k-1] + 1, dp[i*2][k]);
        			continue;
        		}
        	}
        }
	   
	   // 코니가 갈 수 있는 번지 중 최소를 찾는다.
	   // 코니스텝과 일치해야한다.
        

       System.out.println("123");
		
		

	} // end of main
}
