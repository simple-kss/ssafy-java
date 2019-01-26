package algo;

import java.util.Stack;

/*
 * 그래프에서 모든 정점을 빠짐없이 순회하는 방법
 *  DFS
 *  BFS
 *  
 */

public class Z18_DFS {


	static boolean[] visited = new boolean[8];
	

	

	public static void main(String[] args) {
		// 정점에 연결된 정보 저장
		int [][] G = { // 그래프에서 연결된 정점들의 간선정보를 저장
				{}, // 정점 0에 인접한 정점들, 안씀	
				{2, 3}, // 정점 1에 인접한 정점들	
				{1, 4, 5}, // 정점 2에 인접한 정점들	
				{1, 7}, // 정점 3에 인접한 정점들	
				{2, 6}, // 정점 4에 인접한 정점들
				{2, 6}, // 정점 5에 인접한 정점들
				{4, 5, 7}, // 정점 6에 인접한 정점들
				{6, 3}, // 정점 7에 인접한 정점들				
		};
		
		int[] stack = new int[10];
		int top = -1; // 스택의 인덱스를 관리할 변수
		boolean[] visited = new boolean[8];
		
		// 시작정점 하나를 결정후 방문, 스택에 넣고, 반복을 시작
		int v = 1; // 시작 정점 A를 의미
		System.out.println(v + " "); // 방문해서 할 일
		visited[v] = true; // 방문 여부 체크
		stack[++top] = v; // 마지막 갈림길을 확인하기 위해 지나가는 정점들을 저장
		
		// 반복, 스택에서 값을 꺼내서 인접한 정점 중에 방문안한 정점을 찾아서 방문
		while(top > - 1) { // 반복종료 : 스택이 비워지면 종료
			v = stack[top]; // 마지막 정점을 읽어옴 (삭제는 안함)
			int w = -1; // 다음 갈 정점, 초기 값으로 -1을 넣어놓자.
			// 플래그 변수 역할로도 하려고 w로 함
			
			// 인접한 정점들을 모두 확인
			for (int i = 0; i < G[v].length; i++) {
				if ( !visited[G[v][i]] ) { // 방문하지 않았으면
					w = G[v][i];
					System.out.println(w + " "); // 방문해서 할일
					visited[w] = true; // 방문 여부 체크
					stack[++top] = w; // 스택에 마지막 갈림길 저장
					break; // 확인이 되면 반복을 빠져나감
				}				
			}
			
			if( w == -1 ) { // 인접한 정점중 방문 안한 정점이 없음
				top--;
			}
			
			
		}
		
		
		
		

	} // end of main
} // end of class