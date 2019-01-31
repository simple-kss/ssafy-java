package algoKss;

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
10
5 1 9 7 6 10 4 8 3 2
 *
 */

class Node {
	Node p;
	Node l;
	Node r;
	int value = 0;
}

public class Z28_BinarySearch_Linked {
	
	public static void middle(Node p) {
		
		//왼쪽 방문
		if(p.l != null) middle(p.l);
		
		System.out.print(p.value + " ");
		
		//오른쪽방문
		if(p.r != null) middle(p.r);
	}
	
	// 왼쪽에 넣기
	public static void leftVisited(Node par, Node child) {
		// 2. par왼쪽에 없으면 child넣기
		if(par.l == null)
			par.l = child;
		// 3. 왼쪽에 있으면 작으면 왼쪽, 크면 오른쪽에 넣으라 시키기
		else {
			if(par.l.value > child.value) {
				leftVisited(par.l, child);
			}
			else
				rightVisited(par.l, child);
		}
	}
	
	// 오른쪽에 넣기
	public static void rightVisited(Node par, Node child) {
		// 2. par 오른쪽 에 없으면 child넣기
		if(par.r == null)
			par.r = child;
		// 3. 왼쪽에 있으면 작으면 왼쪽, 크면 오른쪽에 넣으라 시키기
		else {
			if(par.r.value > child.value) {
				leftVisited(par.r, child);
			}
			else
				rightVisited(par.r, child);
		}
		
	}
	
	// 해당 숫자를 검색
	public static void search(Node node, int value) {
		// 자기랑 같으면 자기 반환
		if(node.value == value) {
			System.out.println("있습니다 !");
		}
		else if(node.value > value){
			// 자기보다 작으면
			// 왼쪽 값 순회
			if(node.l == null) {
				System.out.println("없습니다.. ");
				return;
			}
			search(node.l, value);
			
		}
		else if(node.value < value) {
			// 크먄
			// 왼쪽 값 가져오기
			if(node.r == null) {
				System.out.println("없습니다.. ");
				return;
			}
			search(node.r, value);			
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		//// 이진 탐색 트리에 넣기 ---------------------
		
		// 1번지를 안쓴다고 생각하면
		// x높이면 2^x 임
		Node root = new Node();
		
		String s = br.readLine();
		StringTokenizer stk = new StringTokenizer(s, " ");
		
		root.value = Integer.parseInt(stk.nextToken());
		
		while(stk.hasMoreTokens()) {
			Node N = new Node();
			N.value = Integer.parseInt(stk.nextToken());
			// 1. 자기보다 작으면 왼쪽에 넣기
			if( root.value > N.value )
				leftVisited(root, N);
			else
				rightVisited(root, N);
			// 2. 왼쪽에 있으면 왼쪽애 보고 넣으라 시키기
		}
		
		//// 이진 탐색 트리 탐색 ---------------------
		System.out.print("검색할 숫자 입력 :");
		int select = Integer.parseInt(br.readLine());
		System.out.println(select);
		
		search(root, select);
		
		// 오름차순 출력
		System.out.println("\n 중위 순회");
		middle(root);
	} // end of main
} // end of class
