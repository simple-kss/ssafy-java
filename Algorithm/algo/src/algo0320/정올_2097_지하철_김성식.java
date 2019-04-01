package algo0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 
 * 다익스트라로 구현하였음
 */

public class 정올_2097_지하철_김성식 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		int [][] map = new int[N+1][N+1];
		int [][] path = new int[N+1][N+1];
		
		int [] from = new int[N+1];
		
		int[] oneStart = new int[N+1]; // 1로 가는 것들 중에 최단 경로 저장배열
		
		for(int i = 1; i <= N; i++) {
			Arrays.fill(path[i], Integer.MAX_VALUE);
			stk = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		
		
		int s = 1; // 시작 정점
		int[] D = map[s].clone(); // 시작 정점의 진출 차수를 기준으로 가중치 배열을 초기화
		for(int i = 1; i <= N; i++) {
			if(D[i] != 0)
				from[i] = 1;
		}
		
		boolean[] used = new boolean[N+1];
		
		for(int i = 1; i <= N; i++) { // 정점의 개수만큼 반복, 한 사이클 돌면, 정점 1개가 선택됨
			// 사용하지 않은 정점 중, 최소 가중치 정점을 찾아서 추가하기.
			int minIndex = 0; 
			int min = Integer.MAX_VALUE; //D[0];// 얘는 최소 값을 저장하는 애, 범위의 첫번쨰 값을 넣어도 상관없고, 가장 큰 값을 넣어도 된다.
			
			// 가중치 배열을 쭉 돌면서 최솟값이 누구인지를 찾는다.
			for (int j = 1; j <= N; j++) {
				// 사용하지 않았다면
				if(!used[j] && min > D[j] ) {
					minIndex = j;
					min = D[j];
				}
			}
			used[minIndex] = true; // 사용한 집합에 표시
			
			// 최소 가중치로부터 뻗어나가는거 갱신하기!
			for (int j = 1; j <= N ; j++) {
				if(!used[j]
						&& D[j] > D[minIndex] + map[minIndex][j]) {
					D[j] = D[minIndex] + map[minIndex][j];
					from[j] = minIndex;
				}
			}
			
			
		}
		System.out.println(D[M]);
		int in = 0; // 번지 저장
		int step = M;
		
		while(true) {
			if(from[step] != 0) {
				oneStart[in++] = step;
				step = from[step];
			}
			else {
				break;
			}
		}
		sb.append('1').append(' ');
		for(int i = in - 1; i >= 0; i--) {
			sb.append(oneStart[i]).append(' ');
		}

		System.out.println(sb);

		
	} // end of main
} // end of class