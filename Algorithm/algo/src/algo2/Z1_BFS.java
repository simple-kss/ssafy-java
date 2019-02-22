package algo2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//2.20
/**
 * 
 * BFS 너비 우선 탐색
 * 	queue 구조가 필요 (선입선출)
 * 	반복문, 재귀함수
 *
 */
public class Z1_BFS {
	public static void main(String[] args) {
		//input 1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7
		// 그래프를 저장하는 방식 : 인접행렬, 인접리스트, 간선배열
		int[][] G = new int[8][8];	//0번안씀!!!!!!하나크게 *******
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();		//입력 개수 제한 없을때 이렇게 라인으로 받아서 토크나이져!!! ********
		StringTokenizer st = new StringTokenizer(input," ");
		while(st.hasMoreTokens()) {
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
//			System.out.println(s+","+e);
			G[s][e]=1;
			G[e][s]=1;
		}
		
		//#구현
		int[] q= new int[100];	//선형 큐 생성, 부족하지 않게 크게!!!	
		int front = -1;
		int rear = -1;
		boolean[] visited = new boolean[8];//0번 안씀, 버림
		int[] visited2 = new int[8];
		
		int v = 1; //시작 정점
		q[++rear] = v;//시작정점 v를 큐에 삽입
		visited[v]=true; //정점 v를 방문한 것으로 표시
		visited2[v]=0; 
		
		while (front!=rear) {	//큐가 비어있지 않은 경우 반복
			//큐의 첫번째 원소 반환
			v = q[++front];	//위의 v 안쓰니까 v에 저장, 큐의 첫번째 원소 반환
			System.out.print(v+" ");
			for (int i = 1; i < visited.length; i++) {//v정점과 인접합 정점에 대해서,	이렇게 하면 작은순으로 반복*********
//			for (int i = visited.length-1; i >=1; i--) {//					이렇게 하면 큰  순으로 반복*********
				if(G[v][i]!=0 && !visited[i]) {	//연결이 된경우, 인접한 정점이면// 방문도 안한거면
					q[++rear]= i;
					visited[i] = true;
					visited2[i]=visited2[v]+1;
				}
			}
		}
		System.out.println(Arrays.toString(visited2));
		
	}//end of main
}//end of class















