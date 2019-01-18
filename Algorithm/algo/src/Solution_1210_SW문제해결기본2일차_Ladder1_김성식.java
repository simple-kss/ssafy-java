import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution_1210_SW문제해결기본2일차_Ladder1_김성식 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// 한줄 씩 읽기
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[102][102];
		// 상하좌우씩 2칸씩 늘리기~
		
		// 0행
		for (int i = 0; i < 102; i++) {
			arr[0][i] = -1;
			
		}
		// 끝행		
		for (int i = 0; i < 102; i++) {
			arr[101][i] = -1;
		}
		
		// 0열
		for (int i = 0; i < 102; i++) {
			arr[i][0] = -1;
		}
		
		// 끝열
		for (int i = 0; i < 102; i++) {
			arr[i][101] = -1;
			
		}
		
		for(int i = 1; i <= 10; i++ ) {
			int test_case = bf.read();
			bf.readLine();
			String str;
//			String str = bf.readLine();
//			int test_case = Integer.parseInt(str);
			for (int j = 1; j <= 100; j++) {
				str = bf.readLine();
				String[] ss = str.split(" ");
				int k = 1;
				for (String string : ss) {
					arr[j][k++] = Integer.parseInt(string);
				}		
			}
	
			
			// 일단 2 찾자
			int twoJ = 0;
			int twoI = 100;
			for(int m = 1; m <= 100; m++) {
				if ( arr[100][m] == 2) {
					twoJ = m;
				}
			}
			
			// 계속 반복할거임!
			while(true) {
				//System.out.println(twoI + " " + twoJ);
				if(twoI == 1) break;
				
				// 왼/오 1이 있는지 없을 떄 까지 쭉 올라가기
				
				// 오 1있는지 없는지
				if(arr[twoI][twoJ+1] == 1 ) {
					while(true) {
						// 오른쪽으로 계속 이동
						// 벽이 있을 때 까지
						twoJ++;
						
						// 옆에 갈 곳이 0이거나 -1이면 break;
						if(arr[twoI][twoJ+1] == 0 || arr[twoI][twoJ+1] == -1) {
							if(arr[twoI+1][twoJ] != -1 ) {
								twoI--;								
							}
							break;
						}
					}
					
				}
				// 왼 1있는지 없는지
				else if(arr[twoI][twoJ-1] == 1) {
					while(true) {
						// 왼쪽으로 계속 이동
						// 벽이 있을 때 까지
						twoJ--;
						
						// 벽이라면
						if(arr[twoI][twoJ-1] == 0 || arr[twoI][twoJ-1] == -1) {
							if(arr[twoI+1][twoJ] != -1 ) {
								twoI--;								
							}
							break;
							
						}
					}
					
				}
				// 아니면 쭉 올라가기
				else
					twoI--;

			}

			System.out.printf("#%d %d\n", test_case,(twoJ - 1));
		}		
	}
}


