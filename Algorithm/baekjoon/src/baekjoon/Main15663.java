package baekjoon;

import java.util.Arrays;
import java.util.Scanner;


// 사전 순으로 증가

/*
 * 
 * 
4 2
9 7 9 1
 */

public class Main15663 {

	static int n;
	static int[] arr;
	static int[] print;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	// 처음에 셀렉한거를
	// 다시는 셀렉하지 못하게 해보자.
	public static void per(int start, int end) {
		if(start >= end) {
			for (int i : print) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
		}
		else {
			// 이전에 호출된 숫자와 같으면 다 true로 해준다.
//			if(start >= 1) {
//				for(int j = 0; j < n; j++) {
//					if(arr[j] == print[start-1])
//						visited[j] = true;
//				} // end of for
//			} // end of if
			
			for(int i = 0; i < n; i++) {
				
				// 검사
				if(visited[i] == true) continue;
				// 이전과 같은숫자면 true
				int check = 0;
				if(start >= 1) {
					if(arr[i] == print[start-1]) {
						visited[i] = true;
						check = 1;
					}
				}
				
				// 일단 거기까지는 출력해준다.
				print[start] = arr[i];
				
				
				per(start+1, end);
				
				if(check == 1)
					visited[i] = false;
					
				
				
				
				
			} // end of for
		} // end of if
		+
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int cnt = scan.nextInt();
		
		arr = new int[n];
		visited = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		print = new int[cnt];
		
		
		per(0, cnt);
		System.out.println(sb);
		

	}
}
