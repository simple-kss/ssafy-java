import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 미로도착지점_김성식 {
	static int[][] dir = {
			{ 0,  0},
			{-1,  0}, // 상
			{ 0,  1}, // 우
			{ 1,  0}, // 하
			{ 0, -1}  // 좌
	};
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer stk;
		
		
		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			stk = new StringTokenizer(br.readLine(), " ");
			
			// 변수 선언 부
			int N = Integer.parseInt(stk.nextToken()); // N/N행렬
			int R = Integer.parseInt(stk.nextToken()); // 출발점 r
			int C = Integer.parseInt(stk.nextToken()); // 출발절 c
			int jumpCnt = Integer.parseInt(stk.nextToken()); // 점퍼의 갯수
			
			int moveCnt = 0;
			int map[][] = new int[N+1][N+1];
			int count = 0;
			int max = 0;
			
			// start는 1로 표시
			map[R][C] = 1;
			
			stk = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < jumpCnt; i++ ) {
				int r = Integer.parseInt(stk.nextToken());
				int c = Integer.parseInt(stk.nextToken());
				// 점퍼는 9로 표시
				map[r][c] = 9;
			}
			
			moveCnt = Integer.parseInt(br.readLine());
			stk = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < moveCnt; i++ ) {
				int d = Integer.parseInt(stk.nextToken());
				int size = Integer.parseInt(stk.nextToken());
				// 점퍼는 9로 표시
				
				// 갈 수 잇는 방향 좌표를 구해본다 일단.
				// 사이즈만큼 반복
				for(int k = 0; k < size; k++) {
					int r = R + dir[d][0];
					int c = C + dir[d][1];
					
					// 그 좌표가 갈 수 있다면
					if(isValid(r, c, N)) {
						// 거기가 점퍼라면
						if(map[r][c] == 9) {
							R = 0;
							C = 0;
							break;
						}
						else {
							// 이동 칸수 만큼 간다.
							map[R][C] = 0;
							R = r;
							C = c;
							map[R][C] = 1;
						}
					}
					// 갈 수 없다면
					else {
						R = 0; C = 0;
						break;
					}
				}
				
			} // end of for
			
			
			sb.append('#').append(t)
			.append(' ').append(R).append(' ').append(C).append('\n');
		}
		System.out.println(sb);
		
	}

	private static boolean isValid(int r, int c, int N) {
		return r >= 1 && r <= N && c >= 1 && c <= N;
	} // end of main



} // end of class
