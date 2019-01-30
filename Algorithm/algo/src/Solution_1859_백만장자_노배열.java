import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 
 * 
 * 
3
3
10 7 6
3
3 5 9
5
1 1 3 1 2

1
5
1 1 3 1 2
	
 *
 */

public class Solution_1859_백만장자_노배열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		int T = Integer.parseInt(in);
		
		for(int t = 1; t <= T; t++) {
			in = br.readLine();
			int n = Integer.parseInt(in); // 길이

			int cnt = 0;
			int cache = 0; // 현재 자금
			int preNum = 0;
			for(int j = 0; j < n; j++) {
				
				in = br.readLine(); // 각 원소
				int num = Integer.parseInt(in);
				
				
				// 올라갈떄 물건산다
				// 마지막에 물건 팔아줘야하므로 <= 대신 <로 쓴다.
				if(preNum < num) {
					cnt++;
					cache -= preNum;
					//산다 
				}
				// 다음게 하락세이면 (다음번지가 작다면)
				// 그럼 다 팔아버려야한다.
				else {
	
					cache += preNum * cnt;
					cnt = 0;
					//판다
				}
				preNum = num;
			}
			
			System.out.println(t+ "# " + cache);
			
		}
		
		
		// 그다음이 내려가는거면 판다.
	}
}
