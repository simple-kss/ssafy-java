package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1504 {
	static int maxLen;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(stk.nextToken());
		int E = Integer.parseInt(stk.nextToken());
		
		
		maxLen = Integer.MAX_VALUE;
		int[][] v = new int[N+1][N+1];
		boolean[] visited = new boolean[N+1];
		
		for(int i = 1; i <= E; i++) {
			String str = br.readLine();
			stk = new StringTokenizer(str, " ");
			int r = Integer.parseInt(stk.nextToken());
			int c = Integer.parseInt(stk.nextToken());
			v[r][c] = Integer.parseInt(stk.nextToken());
			v[c][r] = v[r][c];
		}
		stk = new StringTokenizer(br.readLine(), " ");
		int v1 = Integer.parseInt(stk.nextToken());
		int v2 = Integer.parseInt(stk.nextToken());
		
		visited[0] = true;
		
		for(int i = 1; i <= N; i++) {
			// 정점배열, 출발정점, 현재까지 누적길이, 방문배열, step, N : 정점의 개수
			findLen(v, i, 0, visited, 0, N);
		}
		
		System.out.println(maxLen);
		
		
//		for(int i = 1; i <= N; i++) {
//			for(int j = 1; j <= N; j++) {
//				System.out.print(v[i][j] + " ");
//			}
//			System.out.println();
//		}
	} // end of main

	private static void findLen(int[][] v, int start, int len, boolean[] visited, int step, int N) {
		if(step == N) {
			// 2와 3을 방문하지 않았다면 return
			if(!visited[2]) {return;};
			if(!visited[3]) {return;};
			
			if(maxLen > len) {
				maxLen = len;
			}
		}
		else {
			for(int i = 1; i <= N; i++) {
//				if(!visited[i]) {
					visited[i] = true;
//					if(maxLen > len + v[start][i]) continue;
					findLen(v, i, len + v[start][i], visited, step + 1, N);
					visited[i] = false;
//				}
			}
		} // end of false
		
	} // end of function

} // end of class
