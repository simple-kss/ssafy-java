package algo0327;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2283_RGB마을_김성식 {

	private static int[][] cData;
	private static int N;
	private static int[][] memo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // number of house
		
		cData = new int[N][3]; // color 데이터
		memo = new int[N][3]; //메모이제이션
		
		for (int i = 0; i < N; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			cData[i][0] = Integer.parseInt(stk.nextToken());
			cData[i][1] = Integer.parseInt(stk.nextToken());
			cData[i][2] = Integer.parseInt(stk.nextToken());
		}
		// dfs, 백트래킹, 메모이제이션 -> 칠했을 때 가중치의 합을 저장해서
		// 백트래킹했을 떄 이미
		
		// 다 빨간색으로 칠한다고 가정
		// step또 N
		// 인접하는지 검사
		
		// dfs, 메모이제이션, 그 현재 step까지의 최소값을 다 저장한다..
		
		//step
//		int x = dfs(0, N, 0);
//		int y = dfs(0, N, 1);
		int z = dfs(0, N, 0);
		
//		System.out.println(x + " " + y + " " + z);
		
//		x = x < y ? x : y;
//		z = x < z ? x : z;
		
		System.out.println(z);
		
	} // end of main

	private static int dfs(int step, int end, int color) {
		
		// 종료조건
		if(step == end) {
			return 0;
		}
		
		// 이미 저장되어있으면 그것을 리턴
		if(memo[step][color] != 0) {
			return memo[step][color];
		}

		int min = Integer.MAX_VALUE;
		for(int i = 0; i < 3; i++) {
			// 백트래킹
			if(step != 0 && i == color) {
				// 색이 이번거랑 같으면 건너뛴다
				continue;
			}
			// 현재 집의 가중치에 다음단계 빠지는거 더함
			int next = dfs(step + 1, end, i) + cData[step][i];
			if(min > next)
				min = next;
		}

		memo[step][color] = min;
		return min;
		
	}
} // end of class