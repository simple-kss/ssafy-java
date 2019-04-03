package algo0401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_3289_서로소집합_김성식 {
	private static int[] numArr;
	private static int[] parent;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(stk.nextToken()); // 숫자 범위
			int M = Integer.parseInt(stk.nextToken());
			
			numArr = new int[N+1];
			parent = new int[N+1];
			StringBuilder sb = new StringBuilder();
			sb.append('#').append(t).append(' ');
			
			for(int i = 1; i <= N; i++) {
				parent[i] = i;
			}
			
			for(int i = 1; i <= M; i++ ) {
				stk = new StringTokenizer(br.readLine(), " ");
				int c = Integer.parseInt(stk.nextToken());
				int n1 = Integer.parseInt(stk.nextToken());
				int n2 = Integer.parseInt(stk.nextToken());
				
				if ( c == 1 ) {
					// n1과 n2가 같은 집합에 있는지 확인
					// 속해있으면 1
					// 안속해있으면 0
					if(findSet(n1) == findSet(n2))
						sb.append('1');
					else
						sb.append('0');
				}
				else {
					// 합친다.
					unione(n1, n2);
				}
				
			}
			System.out.println(sb);
		}
		

	} // end of main

	private static void unione(int n1, int n2) {
		int x1 = findSet(n1); // n1의 부모를 찾는다.
		int x2 = findSet(n2);
		
		parent[x1] = x2;
	}

	private static int findSet(int n) {
		if(parent[n] == n) {
			return n;
		}
		// n의 부모를 슬러 올라간다.
		parent[n] = findSet(parent[n]);
		return parent[n];
	}
} // end of class
