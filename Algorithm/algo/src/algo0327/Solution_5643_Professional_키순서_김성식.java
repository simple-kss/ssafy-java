package algo0327;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Solution_5643_Professional_키순서_김성식 {
	private static int N;
	private static int M;
	private static int[][] G;
	private static boolean[][] visited;
	private static ArrayList<Integer> tops;
	private static ArrayList<Integer> ends;
	private static int[] upData;
	private static int[] lowData;


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		StringBuilder sb = new StringBuilder();
		
		for(int t = 1; t <= tc; t++) {
			N = Integer.parseInt(br.readLine().trim()); // N개의 학생
			M = Integer.parseInt(br.readLine().trim()); // M개의 데이터
			G = new int[N+1][N+1];
			for (int i = 1; i < G.length; i++) {
				G[i][0] = -1; // 쓰지 않는 숫자로 초기화				
			}
			visited = new boolean[N+1][N+1];
			tops = new ArrayList<Integer>();
			ends = new ArrayList<Integer>();
			upData = new int[N+1]; // 내 아래로 몇명인지
			lowData = new int[N+1]; // 내 위로 몇명인ㄴ지
			
			StringTokenizer stk = null;
			for(int j = 0; j < M; j++ ) {
				stk = new StringTokenizer(br.readLine().trim(), " ");
				int r = Integer.parseInt(stk.nextToken());
				int c = Integer.parseInt(stk.nextToken());
				G[r][c] = 1; // 표시
			} // end of for
			
			// 부모들의 정보를 합친다.
			// 순회를 하면서 저장하겠다.
//			System.out.println("up(i)호출 전");
//			for (int i = 0; i < G.length; i++) {
//				System.out.println(Arrays.toString(G[i]));
//			}
			
			for (int i = 0; i < G.length; i++) {
				up(i); // 나보다 큰 애들을 순회
			}
			
			for (int i = 1; i < G.length; i++) {
				for (int j = 1; j < G.length; j++) { // 나보다 작은 애들의 숫자를 카운팅 0번에 저장
					G[0][i] += G[j][i]; // 이렇게하면 진입차수를 알 수 있따!!
				}
			}
			
			// 즉 나를 부모로 가진 정점들의 갯수가 진입차수, 나보다 낮은애들이다!
			
//			System.out.println("up(i)호출 후 ");
//			for (int i = 0; i < G.length; i++) {
//				System.out.println(Arrays.toString(G[i]));
//			}
			
			int cnt = 0;
			for (int i = 0; i < G.length; i++) {	
				if(G[0][i] + G[i][0] == N-1)
					cnt++;
			}
			
			
		
			sb.append('#').append(t).append(' ').append(cnt).append('\n');
		} // end of tc
		System.out.println(sb);		
	}

	/** v정점에 대해서 인접한 큰 친구를 탐색, 나보다 큰 친구가 가지고 있는 큰 친구목록을 나의 인접행렬에 추가등록*/
	private static void up(int v) {
		
		// 이것만해도 많은 양을 줄일 수 있다.
		if(G[v][0] != -1) { // 방문한 정점이면, 이미 큰 친구 목록을 구해서 저장한 상태이므로
			// 더 구할 필요가 없다.
			return;
		}
		
		for (int i = 0; i < G.length; i++) {
			if(G[v][i] == 1) { // 인접한 정점이면
				up(i); // 재귀 호출
				
				// i 는 부모
				// 타고 올라갔으므로
				for (int j = 0; j < G.length; j++) { // i의 큰 친구목록을 v의 큰 친구목록에 업데이트
//					G[v][j] = G[i][j] == 1 ? 1 : G[v][j]; 아래와 같은 코드
					G[v][j] = G[i][j] | G[v][j]; 
				}
			}
		}
		
		int sum = 0; // v정점보다 큰 친구들의 숫자를 셈
		for (int i = 1; i < G.length; i++) {
			sum += G[v][i];
		}
		// 인접행렬의 0번쨰칸을 이용해서 거기에 v정점보다 큰 친구들의 수를 넣는다.
		G[v][0] = sum;
		
		
		
	} // end of func


} // end of class

















