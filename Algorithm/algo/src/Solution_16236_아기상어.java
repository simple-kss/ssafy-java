import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_16236_아기상어 {
	static int[][] dir = {
			{-1, 0}, // 북
			{ 0,-1}, // 서
			{ 0, 1}, // 동
			{ 1, 0}  // 남
	};
	static int findRow = 0;
	static int fincCol = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		int[][] map = new int[len+2][len+2];
		// 0번쨰와
		// len번째는 P로 채워야함
		for(int i = 0; i < len + 2; i++) {
			map[0][i] = 99;
			map[i][0] = 99;
			map[len+1][i] = 99;
			map[i][len+1] = 99;
		}
		
		for(int i = 1; i <= len; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine()," ");
			int j = 1;
			while(stk.hasMoreTokens()) {
				map[i][j++] = Integer.parseInt(stk.nextToken());
			}
		}
		
		int fRow = -1;
		int fCol = -1;
		
		for(int i = 1; i <= len; i++) {
			for(int j = 1; j <= len; j++) {
				if(map[i][j] == 9) {
					fRow = i;
					fCol = j;
				}
			}
		}
		
		int eat = 0;
		int level = 2; // 현재 래밸
		int step = 0;
	

		// bfs로 젤 작은애 찾는다.
		
//		for (int i = 0; i <= len+1; i++) {
//			for (int j = 0; j <= len+1; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
		while(true) {
			System.out.println("123");
			int[] point = bfs(map, fRow, fCol, level, new boolean[len+2][len+2]);
			System.out.println(Arrays.toString(point));
			if(point == null) break;
			
			map[fRow][fCol] = 0;
			

			
			// 거기로 이동.
			fRow = point[0];
			fCol = point[1];
			step += point[2]; // 스탭 수 증가
			System.out.println("step :" + step);
			System.out.println("point[2] :" + point[2]);
			eat++; // 1개 먹음
			
			// 조정
			map[fRow][fCol] = 9;
			
			
			System.out.println("------------");
			for(int i = 1 ; i <= len; i++ ) {
				
				for(int j = 1; j <= len; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			
			
			
			// cnt 세서 자기렙과 같으면 렙업
			if(level == eat) {
				level++;
				eat = 0;
			}
			//// 더이상 찾을 때 없을 때까지 무한반족
		}
		
		System.out.println("답 : ");
		System.out.println(step);
		
		
		
		
		

	} // end of main

	// 자기보다 랩 낮은 최단거리에 찾는 함수.
	private static int[] bfs(int[][] map, int fRow, int fCol, int level, boolean[][] visited) {
		int rear = -1;
		int head = 0;
		int size = 0;
		int[][] que = new int[100000][3];
		
		visited[fRow][fCol] = true;
		
		for(int i = 0; i < 4; i++) {
			int row = fRow + dir[i][0];
			int col = fCol + dir[i][1];
			
			// 다 넣는다.
			// 넣을 때 검사하자 ! 

			if(map[row][col] != 99) {
				// level보다 낮으면 그 좌표 리턴
				if(map[row][col] < level && map[row][col] != 0) {
					int[] point = {row, col, 1};
					return point;
				}
				visited[row][col] = true;
				que[++rear][0] = row;
				que[rear][1] = col;
				que[rear][2] = 1; // 걸음 수
				
				
			}

		}
		
		// 걸음거리
		
		
		// 한번 찾은다음에  que 계속 생성
		// 자기보다 레벨 낮은 애 껄 찾는다.
		while(rear - head >= 0) {
			// 하나를 꺼내서 
			// 그 하나가 레벨보다 낮으면
			// 그 위치로 이동하고 
			// 돈 만큼 레벨을 cnt에 넣는다.
			int row = que[head][0];
			int col = que[head][1];
			int qLevel = que[head++][2];
			// 꺼냇을때 그걸 꺼냈다고 표시한다.
			

			
			// 큐에 넣는다 !
			for(int i = 0; i < 4; i++) {
				int r = row + dir[i][0];
				int c = col + dir[i][1];
				// 다 넣는다.
				if(map[r][c] != 99) {
					if(visited[r][c]) continue;
					System.out.println(r + " " + c + " " + qLevel + " " + level);
					// level보다 낮으면 그 애를 리턴
					if(map[r][c] < level && map[r][c] != 0) {
						int[] point = {row, col, qLevel};
						System.out.println("!!!!!!!!!!!!!!!!!!!");
						return point;
					}
					// 큐에 넣기 전에 이미 넣엇다면 넣지 않는다.
					que[++rear][0] = r;
					que[rear][1] = c;
					que[rear][2] = qLevel + 1;
					visited[r][c] = true;
				}
				
			} // end of for
			
		} // end of while
		
		
		System.out.println("null!!!");
		return null;
		
		
		
		
	}
	
	
} // end of main
