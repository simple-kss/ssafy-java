package algo0328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1733_오목_김성식 {
	private static int[][] map;
	private static int N;
	private static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		N = 19;
		map = new int[21][21];
		visited = new boolean[21][21];
		for (int i = 1; i <= N; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine().trim(), " ");
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(stk.nextToken());
			} // end of for
		} // end of for2
		
		for(int i = 0; i < 21; i++) {
			visited[i][20] = true;
			visited[i][0] = true;
			visited[0][i] = true;
			visited[20][i] = true;
		}
		
		
		int ri = 0;
		int rj = 0;
		int win = 0;
		
		// 1을 발견하면 dfs
		// 2를 발견하면 dfs
		
		// 1이 이겼을 경우 1
		// 2가 이겼을 경우 2
		// 둘다 이겼을 경우 가장 왼쪽 위에있는 바둑알 반환
xx:		for (int j = 1; j <= N-3; j++) {
			for (int i = 1; i <= N-3; i++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					// 가로보기
					int r = i;
					int c = j;
					int cnt = 1;
					while(true) {
						c++;
						if(map[r][c] != 1) {
							break;
						}
						visited[r][c] = true;
						cnt++;
					}
					if(cnt == 5) {
						ri = i;
						rj = j;
						win = 1;
						break xx;
					}
					
					// 세로보기
					r = i;
					c = j;
					cnt = 1;
					while(true) {
						r++;
						if(map[r][c] != 1) {
							break;
						}
						visited[r][c] = true;
						cnt++;
					}
					if(cnt == 5) {
						ri = i;
						rj = j;
						win = 1;
						break xx;
					}
					
					// 대각선보기 우하
					r = i;
					c = j;
					cnt = 1;
					while(true) {
						r++;
						c++;
						if(map[r][c] != 1) {
							break;
						}
						visited[r][c] = true;
						cnt++;
					}
					if(cnt == 5) {
						ri = i;
						rj = j;
						win = 1;
						break xx;
					}
					
					// 대각선보기 우상
					r = i;
					c = j;
					cnt = 1;
					while(true) {
						r--;
						c++;
						if(map[r][c] != 1) {
							break;
						}
						visited[r][c] = true;
						cnt++;
					}
					if(cnt == 5) {
						ri = i;
						rj = j;
						win = 1;
						break xx;
					}
					
				} // end of if
				
				else if(map[i][j] == 2 && !visited[i][j]) {
					// 가로보기
					int r = i;
					int c = j;
					int cnt = 1;
					while(true) {
						c++;
						if(map[r][c] != 2) {
							break;
						}
						visited[r][c] = true;
						cnt++;
					}
					if(cnt == 5) {
						ri = i;
						rj = j;
						win = 2;
						break xx;
					}
					
					// 세로보기
					r = i;
					c = j;
					cnt = 1;
					while(true) {
						r++;
						if(map[r][c] != 2) {
							break;
						}
						visited[r][c] = true;
						cnt++;
					}
					if(cnt == 5) {
						ri = i;
						rj = j;
						win = 2;
						break xx;
					}
					
					// 대각선보기
					r = i;
					c = j;
					cnt = 1;
					while(true) {
						r++;
						c++;
						if(map[r][c] != 2 ) {
							break;
						}
						visited[r][c] = true;
						cnt++;
					}
					if(cnt == 5) {
						ri = i;
						rj = j;
						win = 2;
						break xx;
					}
					
					// 대각선보기 우싱
					r = i;
					c = j;
					cnt = 1;
					while(true) {
						r--;
						c++;
						if(map[r][c] != 2) {
							break;
						}
						visited[r][c] = true;
						cnt++;
					}
					if(cnt == 5) {
						ri = i;
						rj = j;
						win = 2;
						break xx;
					}
				} // end of else if
			} // end of for1
		} // end of for2
		
		System.out.println(win);
		if(win != 0)
			System.out.println(ri + " " + rj);
		

	} // end of main

	
} // end of class
