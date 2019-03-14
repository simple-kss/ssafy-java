package algo0313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_7208_지도칠하기_서민규 {
	private static int[] color;
	private static int[][] map;
	private static int N;
	private static int min;
	private static int[] nc;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int t = 1; t <= tc; t++ ) {
			// 변수선언부!
			N = Integer.parseInt(br.readLine()); //나라 수~
			color = new int[N];
			map = new int[N][N];
			
			String s = br.readLine();
			
			// 초기 나라 컬러
			for(int i = 0; i < N * 2; i += 2) {
				color[i/2] = s.charAt(i)-'0';
			}
			
			
			for(int i = 0; i < N; i++) {
				s = br.readLine();
				for(int j = 0; j < N * 2; j+=2) {
					map[i][j/2] = s.charAt(j)-'0';
				}
			}
			
			// 입력 끝
			// 모든 경우의 수를 따져볼라한다.
			
			min = Integer.MAX_VALUE; // 최소 변경량
			// 국가의 최소 변경량
			nc = new int[N]; // 새로 칠한 각 나라의 색상
			// 이거랑 원본컬러랑 몇개가 다른지 세서 min을 구하자!
			dfs(0, 0);
			
			sb.append('#').append(t).append(' ').append(min).append('\n');
		} // end of for
		System.out.println(sb);

	} // end of main
	
	
	/** 현재 step 단계의 나라색상 채우기, 재귀호출, cnt : 현재 단계에서 오면서 색깔을 바꾼 나라의 갯수 */
	private static void dfs(int step, int cnt) {
		
		if(step == N) { // 종료조건
			if(min > cnt) {
				min = cnt;
			}
		}
		else { // 반복조건
			// new color에다가
			// 각각의 한번색깔을 칠해보자
go:			for(int i = 1; i <= 4; i++) {
				nc[step] = i;
				
				// 인접한 국가와 색상이 다른 경우만 진행!! (가지치기1) --
				for(int j = 0; j < step; j++) { // 현재 국가 이전에 칠한
					// 나라들의 색상과 비교
					// 현재나라는 step나라
					// 인접나라는 j번째 나라
					if(map[step][j] == 1 && nc[j] == i) { // step 나라 색상이 인접한 나라 색상과 같으면
						continue go;  // 다음 차수로 올라가버려라 한다.
					}
					
				}
				
				// 만약 현재 선택한 나라의 색상이 초기 색상과 비교해서 다르면
				// 변경량을 본다.
				
				// 지금 내가 고른게 i인데 그게 다른지 확인
				if(color[step] != nc[step]) {
					// min보다 애초에 크면  (가지치기2) 그냥 return 해버린다.
					// min > cnt + 1 만 진행
					if( min > cnt + 1) {
						dfs(step + 1, cnt +1); 
					}
				}
				else {
					dfs(step + 1, cnt);
				}
				
			}
			
		}
		
	
	} // end of dfs
	
	
} // end of class