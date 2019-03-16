import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_6485_삼성시의버스노선 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int t = 1; t <= tc; t++ ) {
			
			int N = Integer.parseInt(br.readLine());
			int[][] bus = new int[N][2];
			
			for(int j = 0; j < N; j++) {
				StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
				bus[j][0] = Integer.parseInt(stk.nextToken());
				bus[j][1] = Integer.parseInt(stk.nextToken());
			}
			
			sb.append('#').append(t).append(' ');
			// 버스정류장 개수
			int P = Integer.parseInt(br.readLine());
			int[] arrP = new int[P];
			int cnt = 0;
			for(int j = 0 ; j < P; j++) {
				int in = Integer.parseInt(br.readLine());
				cnt = 0;
				// arrP[j]가 범위안에 있는지 그 범위들을 센다.
				for(int k = 0; k < N; k++) {
					if(bus[k][0] <= in && bus[k][1] >= in )
						cnt++;
				}// cnt를 마쳤으면
				sb.append(cnt).append(' ');
			}
			sb.append('\n');
			
		} // end of tc
		System.out.println(sb);
		
	} // end of main
} // end of class
