package algo0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


/*
 * 
 * 플로이드 워샬로 구현하였음
 * 
 */
public class 정올_2097_지하철_김성식3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		int [][] map = new int[N+1][N+1];
		int [][] path = new int[N+1][N+1];
		
		for(int i = 1; i <= N; i++) {
			Arrays.fill(path[i], Integer.MAX_VALUE);
			stk = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		
		
		for(int k = 1; k <= N; k++ ) {// 경유할 정점
			for(int i = 1; i <= N; i++) { // 시작정점
				if(k == i) continue;
				for(int j = 1; j <= N; j++) { // 도착정점
					if(k == j || i == j) continue; // 경유할 정점이 시작정점이거나 도착정점이면 continue
					if(map[i][j] > map[i][k] + map[k][j]) {
						map[i][j] = map[i][k] + map[k][j];
						path[i][j] = k; // 그 경로를 저장 (번째라서 +1해줬음)
					}
				}
			} // end of for1
		} // end of for2
		
		
		
		sb.append('1').append(' ');
		
		int pivot = path[1][M]; // 5번쨰 목적지 가려고
		
		// 1부터 M까지 가는 경로를 출력하자
		// 우선 1정점에서 5정점까지 가는데 거쳐야할 path를 출력
		while(true) {
			// 5번지에 해당하는 값이 0이라면 break
			if(pivot == Integer.MAX_VALUE) {
				sb.append(M);
				break;
			}
			else {
				sb.append(pivot).append(' ');
				pivot = path[pivot][M];
			}
		}
		System.out.println(map[1][M]);
		System.out.println(sb);
		
		
	} // end of main
} // end of class