package algo0306;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1494_사랑의카운슬러_김성식_틀린설계 {
	
	// 변수 선언부
	static boolean visited[];
	static int data[][];
	static long min = Long.MAX_VALUE; // 최솟값 담을 변수
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine().trim());
		
		for(int t = 1; t <= tc; t++) {
			
			// 변수 선언부
			int N = Integer.parseInt(br.readLine()); // 지렁이 갯수
			data = new int[N][2];
			visited = new boolean[N];
			
			
			for(int i = 0; i < N; i++) {
				StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
				data[i][0] = Integer.parseInt(stk.nextToken());
				data[i][1] = Integer.parseInt(stk.nextToken());
			}
			
			dfs(0, N, new long[2]);			
			
			
			
			sb.append('#').append(t).append(' ').append(min).append('\n');
		}
		System.out.println(sb);

	} // end of main.

	// vSum은 이떄까지 더한 백터들의 합
	private static void dfs(int step, int warmCnt, long[] vSum) {
		// 백트래킹
		
//		long sum = getVal(vSum[0], vSum[1]);
		
		
		if(step == warmCnt / 2) {
			long sum = getVal(vSum[0], vSum[1]);
			if(min > sum) {
//				System.out.println("sum : " + sum);
				min = sum;
			}
		}
		else {
			for(int i = 0; i < warmCnt; i++) {
				if( visited[i] ) continue;
				visited[i] = true;
				// 짝을 짓는다.
				for(int j = 0; j < warmCnt; j++) {
					if( visited[j] ) continue;
					visited[j] = true; // 선택
					
					// 백터의 누적합연산하기
					int[] c = calc(data[i], data[j]);
					vSum[0] += c[0];
					vSum[1] += c[1];
					
					// long getVal = getval(data[i],data[j]);
//					System.out.println("get Val : " +getVal);
					
//					sum += getVal;
					
					dfs(step + 1, warmCnt, vSum);
					
					// 상태 복귀
					visited[j] = false;
					vSum[0] -= c[0];
					vSum[1] -= c[1];
					
				}
				
				visited[i] = false;
			} // end of for
			
		} // end of else
		
	} // end of func

	private static long getVal(long x, long y) {
		return ( x * x ) + ( y * y );
	}
	
	// 백터의 합 연산
	private static int[] calc(int[] d1, int[] d2) {
		int x = (d1[0] - d2[0]);
		int y = (d1[1] - d2[1]);
		
		int[] data = new int[2];
		data[0] = x;
		data[1] = y;
		
		return data;
	}
	


} // end of class