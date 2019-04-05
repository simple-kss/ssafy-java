package algo0404;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.sound.midi.Synthesizer;

public class Solution_6109_추억의2048게임 {
	private static int N;
	private static int[][] map;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine().trim(), " ");
			N = Integer.parseInt(stk.nextToken());
			map = new int[N+2][N+2];
			String dirStr = stk.nextToken();
			
			for (int i = 0; i < N+2; i++) {
				map[i][N+1] = -1;
				map[i][0] = -1;
				map[N+1][i] = -1;
				map[0][i] = -1;
			}
			
			for (int i = 1; i <= N; i++) {
				stk = new StringTokenizer(br.readLine().trim()," ");
				for (int j = 1; j <= N; j++) {
					map[i][j] = Integer.parseInt(stk.nextToken());
				} // end of for
			} // end of for2
			
			
			// 구현부
			if(dirStr.equals("up")) {
				mergeUp();
			}
			else if(dirStr.equals("down")){
				mergeDown();
			}
			else if(dirStr.equals("right")){
				mergeRight();
			}
			else if(dirStr.equals("left")){
				mergeLeft();
			}
			
			// 출력
			
			StringBuilder sb = new StringBuilder();
			System.out.println("#"+t);
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					sb.append(map[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.print(sb);
			
		}
		

	} // end of main

	private static void mergeRight() {
		// 위에 것이 숫자일 때 까지 반복 , 0이 아닐떄 까지
		// 같은 숫자면 합치고
		// 같은 숫자가 아니면 그 -1번지에 자기꺼 배치 후
		// 자기자리 0만들기
		
		for (int i = 1; i <= N; i++) {
			for (int j = N-1; j >= 1; j--) {
				if(map[i][j] == 0) continue;
				// 북쪽
				// 앞에 것이 숫자를 발견할떄 까지 반복
				int pivot = j + 1;
				while(map[i][pivot] == 0 ) {
					pivot++;
				}
				// 빠져나오면 숫자임
				if(map[i][pivot] == map[i][j]) {
					map[i][pivot] *= 2;
					map[i][j] = -1;
				}
				else {
					// 같은 숫자가 아닐경우
				}
			} // end of for
		} // end of for2
		
		// 그리고 0과 -1이면 땅겨주면됀다.
		for (int i = 1; i <=  N; i++) {
			int cnt = 0;
			int[] temArr = new int[N+1];
			for (int j = 1; j <= N; j++) {
				if(map[i][j] > 0) {
					temArr[cnt++] = map[i][j];
				}
			} // end of for
			
			for (int j = 1; j <= N; j++) {
				// 0~ cnt -1
				if(j > cnt) map[i][N - j + 1] = 0;
				else map[i][N - j + 1] = temArr[cnt-j];
			} // end of for
			
		} // end of for2
	}

	private static void mergeLeft() {
		// 위에 것이 숫자일 때 까지 반복 , 0이 아닐떄 까지
		// 같은 숫자면 합치고
		// 같은 숫자가 아니면 그 -1번지에 자기꺼 배치 후
		// 자기자리 0만들기
		
		for (int i = 1; i <= N; i++) {
			for (int j = 2; j <=  N; j++) {
				if(map[i][j] == 0) continue;
				// 북쪽
				// 앞에 것이 숫자를 발견할떄 까지 반복
				int pivot = j - 1;
				while(map[i][pivot] == 0 ) {
					pivot--;
				}
				// 빠져나오면 숫자임
				if(map[i][pivot] == map[i][j]) {
					map[i][pivot] *= 2;
					map[i][j] = -1;
				}
				else {
					// 같은 숫자가 아닐경우
				}
			} // end of for
		} // end of for2
		
		// 그리고 0과 -1이면 땅겨주면됀다.
		for (int i = 1; i <=  N; i++) {
			int cnt = 0;
			int[] temArr = new int[N+1];
			for (int j = 1; j <=  N; j++) {
				if(map[i][j] > 0) {
					temArr[cnt++] = map[i][j];
				}
			} // end of for
			
			for (int j = 1; j <=  N; j++) {
				// 0~ cnt -1
				if(j > cnt) map[i][j] = 0;
				else map[i][j] = temArr[j-1];
			} // end of for
			
		} // end of for2
	}

	private static void mergeDown() {
		// 하나를 잡고
		// 위에 것이 숫자일 때 까지 반복 , 0이 아닐떄 까지
		// 같은 숫자면 합치고
		// 같은 숫자가 아니면 그 -1번지에 자기꺼 배치 후
		// 자기자리 0만들기
		

		for (int j = 1; j <=  N; j++) {
			for (int i = N-1; i >= 1; i--) {
				if(map[i][j] == 0) continue;
				// 북쪽
				// 앞에 것이 숫자를 발견할떄 까지 반복
				int pivot = i + 1;
				while(map[pivot][j] == 0 ) {
					pivot++;
				}
				// 빠져나오면 숫자임
				if(map[pivot][j] == map[i][j]) {
					map[pivot][j] *= 2;
					map[i][j] = -1;
				}
				else {
					// 같은 숫자가 아닐경우
				}
			} // end of for
		} // end of for2
		
		
		// 그리고 0과 -1이면 땅겨주면됀다.
		for (int j = 1; j <= N; j++) {
			int cnt = 0;
			int[] temArr = new int[N+1];
			for (int i = 1; i <= N; i++) {
				if(map[i][j] > 0) {
					temArr[cnt++] = map[i][j];
				}
			} // end of for
			
			for (int i = 1; i <= N; i++) {
				// 0~ cnt -1
				if(i > cnt) map[N - i + 1][j] = 0;
				else map[N - i + 1][j] = temArr[cnt-i];
			} // end of for
			
		} // end of for2
				
	}

	private static void mergeUp() {
		// 하나를 잡고
		// 위에 것이 숫자일 때 까지 반복 , 0이 아닐떄 까지
		// 같은 숫자면 합치고
		// 같은 숫자가 아니면 그 -1번지에 자기꺼 배치 후
		// 자기자리 0만들기
		
		for (int j = 1; j <=  N; j++) {
			for (int i = 2; i <=  N; i++) {
				if(map[i][j] == 0) continue;
				// 북쪽
				// 앞에 것이 숫자를 발견할떄 까지 반복
				int pivot = i - 1;
				while(map[pivot][j] == 0 ) {
					pivot --;
				}
				// 빠져나오면 숫자임
				if(map[pivot][j] == map[i][j]) {
					map[pivot][j] *= 2;
					map[i][j] = -1;
				}
				else {
					// 같은 숫자가 아닐경우
				}
			} // end of for
		} // end of for2
		
		// 그리고 0과 -1이면 땅겨주면됀다.
		for (int j = 1; j <=  N; j++) {
			int cnt = 0;
			int[] temArr = new int[N+1];
			for (int i = 1; i <=  N; i++) {
				if(map[i][j] > 0) {
					temArr[cnt++] = map[i][j];
				}
			} // end of for
			
			for (int i = 1; i <=  N; i++) {
				// 0~ cnt -1
				if(i > cnt) map[i][j] = 0;
				else map[i][j] = temArr[i-1];
			} // end of for
			
		} // end of for2
		
	}
} // end of class