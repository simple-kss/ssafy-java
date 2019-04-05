import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.sound.midi.Synthesizer;

public class Main_1018_체스판_김성식 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		int map[][] = new int[N+1][M+1];
		
		for (int i = 1; i <= N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				if(s.charAt(j) == 'W') {
					map[i][j+1] = 0;
				}
				else {
					map[i][j+1] = 1;
				}
			}
		}
		
		// 1부터 N-7, M-8까지 돈다.
		
		int b = 1;
		int min = 0;
		int rMin = Integer.MAX_VALUE;
		for (int i = 1; i <= N-7; i++) {
			for (int j = 1; j <= M-7; j++) {
				// 1 2 3 4 5 6 7 8
				// i 부터 n i+7까지 셈
				
				int cnt = 0;
				int zero = 0; // 1010
				int one = 0; // 0101
				
				for (int i2 = i; i2 <= i+7; i2++) {
					cnt = 1 - cnt;
					for (int j2 = j; j2 <= j+7; j2++) {
						
						if(map[i2][j2] == cnt) {
							zero++;
						}
						if(map[i2][j2] == 1 - cnt) {
							one++;
						}
						cnt = 1 - cnt;
					}
				}
				
				// 다돌았을 떄 둘중에 큰거를 max로 채택
				if(one < zero )
					min = one;
				else
					min = zero;
				
				if(min < rMin ) rMin = min;
			
			}
			
		}
		
		//0101 인지세고
		//1010 인지 세서 최소 저장
		
		System.out.println(rMin);
		
		
		
		
		
		
		
		
		
		

	} // end of main
} // end of class
