package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

// LinkedHashSet이용!!

// 사전 순으로 증가 

/*
 * 
 * 
4 2
9 7 9 1
 */

public class Main15663_N과M9 {

	static int n;
	static int[] arr;
	static int[] print;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	static LinkedHashSet<String> hs = new LinkedHashSet<String>();
	
	// 처음에 셀렉한거를
	// 다시는 셀렉하지 못하게 해보자.
	public static void per(int start, int end) {
		if(start >= end) {
			int len = print.length;
			StringBuilder sb = new StringBuilder();
			String temp = Arrays.toString(print);
			
			temp = temp.replaceAll(", ", " ");
	
			
			sb.append(temp).append(" ");
//			for(int i = 0; i < len; i++) {
//				sb.append(print[i]).append(" ");
//			}
			hs.add(sb.toString());
		}
		else {
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
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(stk.nextToken());
		int cnt = Integer.parseInt(stk.nextToken());
		//char[] c = new char[100];
		
		
		
		arr = new int[n];
		visited = new boolean[n];
		
		stk = new StringTokenizer(br.readLine(), " ");
		int i = 0;
		while(stk.hasMoreTokens()) {
			arr[i++] = Integer.parseInt(stk.nextToken());
		}
		
		
		Arrays.sort(arr);
		print = new int[cnt];
		
		
		per(0, cnt);
		
		StringBuilder sb = new StringBuilder();
		for (String s : hs) {
			sb.append(s.substring(1, s.length()-2)+"\n");

		}
		System.out.println(sb.toString());
	}
}
