package algo0328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.sound.midi.Synthesizer;

public class Solution_2105_모의SW역량테스트_디저트카페_김성식 {
	
	private static int N;
	private static int[][] map;
	private static int[] root;
	private static int rCnt;
	private static boolean[][] visited;
	
	private static int[] count;
	
	private static int result;
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		
		StringBuilder sb = new StringBuilder();
		
		for (int t = 1; t <= tc; t++) {
			N = Integer.parseInt(br.readLine().trim());
			map = new int[N+2][N+2];
			visited = new boolean[N+2][N+2];
			result = 0;
			
			for (int i = 1; i <= N; i++) {
				StringTokenizer stk = new StringTokenizer(br.readLine().trim()," ");
				for (int j = 1; j <= N; j++) {
					map[i][j] = Integer.parseInt(stk.nextToken());
				}
			}
			
			// 0이 아니면 시작!
			// 1행부터 N-2행까지! N-1과 N-2행은 돌아도 어차피 안됨.
			int max = -1;
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if(map[i+1][j+1] != 0) {
						// 방문설정
						visited = new boolean[N+2][N+2];
						root = new int[3*N];
						count = new int[101];
						
						visited[i+1][j+1] = true;
						
						// 시작점,   방문할점,   현재 방향
						rCnt = 0;
						root[rCnt++] = map[i+1][j+1];
						count[root[rCnt-1]]++;
						dfs(i, j, i+1, j+1, 1);
					}
				} // end of for1
			} // end of for2
			
			if(result == 0)
				result = -1;
			sb.append('#').append(t).append(' ').append(result).append('\n');
		}
		System.out.println(sb);
		
		
	} // end of main
	
	

	/**
	 *  
	 * @param i 도착
	 * @param j 도착
	 * @param k 갈곳
	 * @param l 갈곳
	 * @param step 자세
	 * 1 -> 우하
	 * 2 -> 좌하
	 * 3 -> 좌상
	 * 4 -> 우상
	 */
	private static void dfs(int i, int j, int k, int l, int step) {
		
		if(count[root[rCnt-1]] >= 2) {
			return;
		}
		
		if(k == i && l == j) {
			int sum = 0;
			for (int m = 1; m <= 100; m++) {
				if(count[m] != 0)
					sum++;
			}
			if(result < sum)
				result = sum;
			return;
		}
		
		if(step == 1) {
			
			if(!visited[k+1][l+1] && map[k+1][l+1] != 0) {
				visited[k+1][l+1] = true; 		// 재방문하는거 금지하기 위해
				root[rCnt++] = map[k+1][l+1]; 	// 루트저장
				count[root[rCnt-1]]++; 			// 카운팅
				
				dfs(i, j, k+1, l+1, 1); // 우하
				
				count[root[rCnt-1]]--;
				rCnt--;
				visited[k+1][l+1] = false;
			}
			if(!visited[k+1][l-1] && map[k+1][l-1] != 0) {
				visited[k+1][l-1] = true;
				root[rCnt++] = map[k+1][l-1];
				count[root[rCnt-1]]++;
				
				dfs(i, j, k+1, l-1, 2); // 좌하
				
				count[root[rCnt-1]]--;
				rCnt--;
				visited[k+1][l-1] = false;
			}
		}
		else if(step == 2) {
			if(!visited[k+1][l-1] && map[k+1][l-1] != 0) {
				visited[k+1][l-1] = true;
				root[rCnt++] = map[k+1][l-1];
				count[root[rCnt-1]]++;
				
				dfs(i, j, k+1, l-1, 2); // 좌하
				
				count[root[rCnt-1]]--;
				rCnt--;
				visited[k+1][l-1] = false;
			}
			if(!visited[k-1][l-1] && map[k-1][l-1] != 0) {
				visited[k-1][l-1] = true;
				root[rCnt++] = map[k-1][l-1];
				count[root[rCnt-1]]++;
				
				dfs(i, j, k-1, l-1, 3); // 좌상
				
				count[root[rCnt-1]]--;
				rCnt--;
				visited[k-1][l-1] = false;
			}

		}
		else if(step == 3) {
			if(!visited[k-1][l-1] && map[k-1][l-1] != 0) {
				visited[k-1][l-1] = true;
				root[rCnt++] = map[k-1][l-1];
				count[root[rCnt-1]]++;
				
				dfs(i, j, k-1, l-1, 3); // 좌상
				
				count[root[rCnt-1]]--;
				rCnt--;
				visited[k-1][l-1] = false;
			}
			if(!visited[k-1][l+1] && map[k-1][l+1] != 0) {
				visited[k-1][l+1] = true;
				root[rCnt++] = map[k-1][l+1];
				count[root[rCnt-1]]++;
				
				dfs(i, j, k-1, l+1, 4); // 우상
				
				count[root[rCnt-1]]--;
				rCnt--;
				visited[k-1][l+1] = false;
			}
		}
		// step 4
		else {
			if(!visited[k-1][l+1] && map[k-1][l+1] != 0) {
				visited[k-1][l+1] = true;
				root[rCnt++] = map[k-1][l+1];
				count[root[rCnt-1]]++;
				
				dfs(i, j, k-1, l+1, 4); // 우상
				
				count[root[rCnt-1]]--;
				rCnt--;
				visited[k-1][l+1] = false;
			}
		}
	}
} // end of class
