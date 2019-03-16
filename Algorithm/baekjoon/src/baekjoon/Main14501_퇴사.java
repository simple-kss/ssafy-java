package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main14501_퇴사 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println(" ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] data = new int[N + 1][2];
		
		// 이 배열은 그날 얻을 수 있는 최대 이익을 저장한다.
		int[] dp = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			data[i][0] = Integer.parseInt(stk.nextToken()); // 시간
			data[i][1] = Integer.parseInt(stk.nextToken()); // 가중치
		}
		// 다 넣어준다
		
		// 메타는
		// 그날 할 수 있는 거로 채우고
		for(int i = 1; i <= N; i++) {
			// 만약 채울 수 있으면
			if( i + data[i][0] <= 7 ) {
				dp[i] = data[i][1];
			}
		}
		
		
		// OK 여기까지 OK
		
		
		// 그 전날에 했던 날들 중에 끝나고 그날을 할 수 있는지를 검사해서 갱신한다.
		// i는 최적일 수를 지정할 인덱스
		for(int i = 1; i <= N; i++ ) {
			// j는 해당 일 수를 반복적으로 돌 변수
			// j는 최적일 수 - (해당 일 수)를 뺴고
			// 그 결과가 갱신할 수 있으면
			for(int j = 1; j < i; j++) {
				if(i - j) {
					
				}
				dp[i] = dp[i], dp[i-j] + data[j][1] 
			}
		}
		
		

	} // end of main
} // end of class







