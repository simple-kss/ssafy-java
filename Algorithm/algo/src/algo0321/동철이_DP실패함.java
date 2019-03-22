package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동철이_DP실패함 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(br.readLine());
			int[][] data = new int[N][N];
			int[] store = new int[N];
			
			//N만큼 돌면서 br.read
			for(int i = 0; i < N; i++) {
				StringTokenizer stk = new StringTokenizer(br.readLine()," ");
				for(int j = 0; j < N; j++) {
					data[i][j] = Integer.parseInt(stk.nextToken());
				}
			}
			
			// 1을 고려 max값을 채택.
//			int min = Integer.MAX_VALUE;
//			int minIndex = -1;
//			for(int i = 0; i < N; i++ ) {
//				if(min > data[0][i]) {
//					min = data[0][i];
//					minIndex = i;
//				}
//			} // end of for
//			store[0] = minIndex; // 1에서 최대확률을 저장
			
			// 1을 고려
			// 0번쨰 사람은 0일 처리
			store[0] = 0; //
			double d = 0;
			
			for(int i = 1; i < N; i++) {
				// 2를 고려
				store[i] = i;
				// 만약 swap한게 더 확률이 크다면 그걸로 채택
				d = calc(data, store, i);
				
				// 3을 고려
				// N일때는 N-1를 고려한 최적값에서
				// 하나씩 빼서 비교한 것들의 최소값을 반환하면된다.
			}
			d *= 100;
			String.format("%.6f", d);
			sb.append('#').append(t).append(' ').append(String.format("%.6f", d)).append('\n');
		}
		System.out.println(sb);
		
		

	} // end of main

	private static double calc(int[][] data, int[] store, int pivot) {
		// pivot 1번지를 고려
		
		int index = pivot; // 계속 바뀔번지, 새로들어온 친구의 번지
		
		double result = 0;
		
		// 먼저 초기 계산
		double sum = 1;
		for(int i = 0; i <= pivot; i++) {
			sum *= data[i][store[i]] / 100.0;
		}
		
		int[] clon = store.clone();
		
		for(int i = 0; i < pivot; i++) {
			// store와 저장된 번지를 swap
			int temp = clon[i];
			clon[i] = clon[index];
			clon[index] = temp;
			
			double tempSum = 1;
			for(int j = 0; j <= pivot; j++) {
				tempSum *= data[i][store[i]] / 100.0;
			}
			
			// 만약에 tempSum이 크다면 store를 바꾸어 주어야함
			if(tempSum > sum) {
				temp = store[i];
				store[i] = store[index];
				store[index] = temp;
			}
		} // 새로 들어온애 처리
		return sum;
	}
	
	
} // end of class
