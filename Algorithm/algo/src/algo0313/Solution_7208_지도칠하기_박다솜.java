package algo0313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_7208_지도칠하기_박다솜 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());

		for (int t = 1; t <= tc; t++) {
			int count = 0;
			int N = Integer.parseInt(br.readLine().trim());
			int[] color = new int[N];
			int[] cnt = new int[N + 1];

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < 4; i++) {
				int c = Integer.parseInt(st.nextToken());
				color[i] = c;
				cnt[c]++;
			}

			int[][] G = new int[N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine().trim(), " ");
				for (int j = 0; j < N; j++) {
					G[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			
			
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					if (G[i][j] == 1 && color[i] == color[j]) {
						color[j] = color[i] % 4 + 1; // 나라색바꾸기
						count++;
					}
				}
			}

			System.out.println("#" + t + " " + count);
		}

	}// end of main
}// end of class