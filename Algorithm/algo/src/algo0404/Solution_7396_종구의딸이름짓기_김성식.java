import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7396_종구의딸이름짓기_김성식 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(stk.nextToken());
			int M = Integer.parseInt(stk.nextToken());
			
			int[][] map = new int[N+2][M+2];
			boolean[][] check = new boolean[N+2][M+2];
			
			// 울타리 처리
			for (int i = 0; i < N+2; i++) {
				check[i][0] = true;
				check[i][M+1] = true;
			}
			
			for (int i = 0; i < M+2; i++) {
				check[0][i] = true;
				check[N+1][i] = true;
			}
			
			for (int i = 1; i <= N; i++) {
				String s = br.readLine();
				int n = s.length();
				for (int j = 0; j < n; j++) {
					map[i][j+1] = s.charAt(j);
				} // end of for
				
			} // end of for
			
			// 각각의 문자를 담을 배열
			int[] result = new int[N+M+2];
			int rCnt = 0;
			result[rCnt++] = map[1][1];
			
			int cnt = 3;

			while(true) {
				if(cnt >  N + M) break;

				// cnt == 3인경우
				// 1,2 부터 시작
				
				// cnt == 4 인겨웅
				// 1 3 부터 시작
				
				int min = Integer.MAX_VALUE;
				int minI = 0;
				int minJ = 0;
				// cnt가 N + M을 넘어갈경우 
				// 우 삼각형
				
				int i = 0;
				int j = 0;
				// 대각선 도는거
				while(true) {
					i++;
					j = cnt - i;
					
					if( j < 1) break; // 예외처리
					
					if( i > N || j > M 
						|| i == 0
						|| j == 0) continue; // 예외처리
					
					// 만약 위 왼이 true면 true
					if(check[i-1][j] && check[i][j-1]) {
						check[i][j] = true;
						continue;
					}
					if(check[i][j]) continue;
					
					// 그게 아니면 최소를 찾아서 그거보다 큰애들 true
					// 최소를 찾는다.
					if(min > map[i][j]) {
						minI = i;
						minJ = j;
						min = map[i][j];
					}
				} // end of while
				
				i = 0;
				j = 0;
				// 그 최소가 아닌애들 다 true한다
				while(true) {
					// 범위 넘어갈떄 다시 체크한다.
					i++;
					j = cnt - i;
					
					if( j < 1) break; // 예외처리
					
					if( i > N || j > M 
						|| i == 0
						|| j == 0) continue; // 예외처리
					
					if(map[i][j] != min)
						check[i][j] = true;
					
				} // end of while
				
				result[rCnt++] = min;
				cnt++;
				// 끝
			} // end of while
			StringBuilder sb = new StringBuilder();
			sb.append('#').append(t).append(' ');
			for (int i = 0; i < rCnt; i++) {
				sb.append((char)result[i]);
			}
			System.out.println(sb);
			
		} // end of tc
		
		
	} // end of main
} // end of class
