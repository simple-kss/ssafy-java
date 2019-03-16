import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 빌딩_김성식 {
	static int[][] dir = {
			{-1, -1},
			{-1,  0},
			{-1,  1},
			
			{ 0, -1},
			{ 0,  1},
			
			{ 1, -1},
			{ 1,  0},
			{ 1,  1}
	};
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(br.readLine()); // N/N행렬
			char map[][] = new char[N+2][N+2];
			int count = 0;
			int max = 0;
			
			
			for(int i = 0; i < N+2; i++) {
				map[i][0] = 'B';
				map[i][N+1] = 'B';
				map[0][i] = 'B';
				map[N+1][i] = 'B';
			}
			
			for(int i = 1; i <= N; i++) {
				StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
				for(int j = 1; j <= N; j++) {
					map[i][j] = stk.nextToken().charAt(0);
				}
			}

			// B를 다돌면서 8방향 B만 있는경우
			// 세로 가로의 B를 다한다
			
			// 그걸 max값에 저장
			// 다른 B도 돌면서 max값이 크면 그 max값 갱신
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					if(map[i][j] == 'B') {
						boolean check = false;
						count = 0;
						for(int z = 0; z < 8; z++) {
							int r = i + dir[z][0];
							int c = j + dir[z][1];
							// 하나라도 B가 아닌거 발견하면 if문 탈출
							if(map[r][c] != 'B') {
								check = true;
								break;
							}
						}
						if(check) continue;
						// 무사히 나왔다면 8방향이 다 B라는 것
						for(int z = 1; z <= N; z++) {
							if(map[i][z] == 'B') count++;
							if(map[z][j] == 'B') count++;;
						}
						count --; // 자기자신꺼 하나 와 테두리 4개 빼기
						// 이전 max보다 크면갱신
						if(max < count) max = count;
					}
				}
			} // end of for
			
			sb.append('#').append(t)
			.append(' ').append(max).append('\n');
		}
		System.out.println(sb);
		
		
		
		
	} // end of main
} // end of class
