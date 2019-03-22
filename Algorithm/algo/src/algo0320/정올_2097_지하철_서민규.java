package algo0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 정올_2097_지하철_서민규 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		int [][] a = new int[N][N];
		
		
		for(int i = 0; i < N; i++) {
			stk = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				a[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		
		
		int[] path = new int[N]; // 나의 경로를 저장할 배열, 어떤 정점을 통해서 왔는지(부모를 저장)
		
		
		// 다익스트라 알고리즘 : 1개의 시작정점을 지정 ~ 나머지 정점으로 갈 수 있는 모든 최단 거리
		boolean[] used = new boolean[N];
		int v = 0;
		int[] D = a[v].clone();
		used[v] = true;
		for(int i = 1; i < N; i++) {
			int minIndex = -1;
			int min = Integer.MAX_VALUE;
			for(int j = 0; j < used.length; j++) {
				if(!used[j] && min > D[j]) { // 선택않난 정점 중 최소 가중치 선택
					min = D[j];
					minIndex = j;
					path[j] = minIndex; // 1, ...., minIndex,J
				}
			}
			used [minIndex] = true; // 사용한 정점을 체크
			
			// 새로 선택한 정점을 통해서 갈 수 있는 길을 D 가중치 배열에 업데이트
			for(int j = 0; j < D.length; j++) {
				if(!used[j] && D[j] > D[minIndex] + a[minIndex][j]) { // 선택하지 않은 인접한 정점을 업데이트
					D[j] = D[minIndex] + a[minIndex][j];
				}
			}
		}
		
		System.out.println(D[--M]);
		System.out.println(Arrays.toString(path));
		String s = (M+1)+""; // 도착점
		while(true) {
			if(M == path[M]) {
				break;
			}
			s = (path[M]+1) + " " + s;
			M = path[M];
		}
		System.out.println(s);

	} // end of main
} // end of class
