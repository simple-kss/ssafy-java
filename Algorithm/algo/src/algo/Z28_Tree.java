package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 *
13
1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13
 *
 */

class Node {
	Node p;
	Node l;
	Node r;
	int value = 0;
}

public class Z28_Tree {
	public static void forward(Node p) {
		
		System.out.print(p.value + " ");
		
		//왼쪽 방문
		if(p.l != null) forward(p.l);
		
		//오른쪽방문
		if(p.r != null) forward(p.r);
	}
	
	public static void middle(Node p) {
		
		//왼쪽 방문
		if(p.l != null) middle(p.l);
		
		System.out.print(p.value + " ");
		
		//오른쪽방문
		if(p.r != null) middle(p.r);
	}
	
	public static void back(Node p) {
		
		//왼쪽 방문
		if(p.l != null) back(p.l);
		
		//오른쪽방문
		if(p.r != null) back(p.r);
		
		System.out.print(p.value + " ");
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		// 1번지를 안쓴다고 생각하면
		// x높이면 2^x임
		Node[] N = new Node[1 << x];
		
		for(int i = 1; i <= x; i++) {
			N[i] = new Node();
			N[i].value = i;
		}
		
		String s = br.readLine();
		StringTokenizer stk = new StringTokenizer(s, " ");
		
		while(stk.hasMoreTokens()) {
			String s1 = stk.nextToken();
			String s2 = stk.nextToken();
			//N[i] = new Node();
			int dest = Integer.parseInt(s1);
			int child = Integer.parseInt(s2);
			
			//N[dest].value = dest;
			// 왼쪽 자식이 비어있으면 삽입
			if(N[dest].l == null) {
				N[dest].l = N[child];
			}
			// 왼쪽 자식 차있으면 오른쪽 자식 삽입
			else {
				N[dest].r = N[child];
			}
		}
		
		// 전위
//		System.out.println("\n 전위 순회");
//		forward(N[1]);
//		
//		System.out.println("\n 중위 순회");
//		middle(N[1]);
		
		System.out.println("\n 후위 순회");
		back(N[1]);
		
	} // end of main
} // end of class
