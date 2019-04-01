package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15656_N과M7 {
	static int N; // N개
	static int sN; // N개중 sN개 선택
	static int[] arr;
	static int[] print;
	static StringBuilder sb = new StringBuilder();
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(stk.nextToken());
		sN = Integer.parseInt(stk.nextToken());
		
		arr = new int[N];
		print = new int[sN];
		
		stk = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		
		Arrays.sort(arr);
		
		
		// 현재스텝, 끝낼스탭
		perm(0, sN);
		
		
//		for(int i = 0; i < N; i++) {
//			System.out.println(arr[i]);
//		}
	
		System.out.println(sb);
		
		

	} // end of main



	private static void perm(int step, int end) {
		if(step == end) {
			for(int i = 0; i < sN; i++) {
				sb.append(print[i]).append(' ');
			}
			sb.append('\n');
		}
		else {
			for(int i = 0; i < N; i++) {
				print[step] = arr[i];
				perm(step+1, end);
			}
		}
		
	}
} // end of class






















