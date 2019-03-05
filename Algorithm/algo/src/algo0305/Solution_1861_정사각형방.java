package algo0305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1861_정사각형방 {
	static int N; // N/N행렬
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		for(int t = 1; t <= tc; t++) {
			// test case
			
			
			N = Integer.parseInt(br.readLine());
			
			int[][] map = new int[N+2][N+2];
			
			for(int i = 0; i < N; i++) {
				StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
				for(int j = 0; j < N; j++) {
					
					
					
					
				}
				
			}
			
			
			
			
			
			
			
			sb.append('#').append(t).append(' ');
		}
		
		System.out.println(sb);
		
		
		
		
	} // end of main
} // end of class
