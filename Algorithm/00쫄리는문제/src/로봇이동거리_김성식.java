import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로봇이동거리_김성식 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int t = 1; t <= tc; t++) {
			// 변수 선언부
			int N = Integer.parseInt(br.readLine()); // N/N행렬
			char map[][] = new char[N+2][N+2];
			int count = 0; // 갈수 있는 거리 카운트
			
			for(int i = 0; i < N+2; i++) {
				map[i][0] = 'P';
				map[i][N+1] = 'P';
				map[0][i] = 'P';
				map[N+1][i] = 'P';
			}
			
			
			for(int i = 1; i <= N; i++) {
				StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
				for(int j = 1; j <= N; j++) {
					map[i][j] = stk.nextToken().charAt(0);
				}
			}
			
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					if(map[i][j] == 'A') {
						// 우로 뻗을 수 있는거 카운트
						for(int z = j+1; z <= N; z++) {
							if(map[i][z] == 'S') count++;
							else break; // 못가변 break;
						}
					}
					else if(map[i][j] == 'B') {
						// 좌우
						int leftCheck = 0;
						int rightCheck = 0;
						for(int z = 1; z <= N; z++) {
							// 좌
							if(leftCheck == 0 && map[i][j-z] == 'S' ) {
								count++;
							}
							else leftCheck = 1;
							// 우
							if(rightCheck == 0 && map[i][j+z] == 'S') {
								count++;
							}
							else rightCheck = 1;
							
							if(leftCheck == 1 && rightCheck == 1) break;
						}
						
					}
					else if(map[i][j] == 'C') {
						// 상하좌우
						int upCheck = 0;
						int leftCheck = 0;
						int rightCheck = 0;
						int downCheck = 0;
						for(int z = 1; z <= N; z++) {
							// 상
							if(upCheck == 0 && map[i-z][j] == 'S' ) {
								count++;
							}
							else upCheck = 1;
							// 하
							if(downCheck == 0 && map[i+z][j] == 'S' ) {
								count++;
							}
							else downCheck = 1;
							
							// 좌
							if(leftCheck == 0 && map[i][j-z] == 'S') {
								count++;
							}
							else leftCheck = 1;
							// 우
							if(rightCheck == 0 && map[i][j+z] == 'S' ) {
								count++;
							}
							else rightCheck = 1;
							
							if(leftCheck == 1 && rightCheck == 1
									&& downCheck == 1 && upCheck == 1) break;
						}
						
					}
				}
			}
			
			sb.append('#').append(t)
			.append(' ').append(count).append('\n');
		}
		System.out.println(sb);
		
		
		
		
	} // end of main
} // end of class


//방향관련해서 복붙할떄는 항상
//i-z j
//i+z j
//+와 -부분 확인해서 수정해주자

