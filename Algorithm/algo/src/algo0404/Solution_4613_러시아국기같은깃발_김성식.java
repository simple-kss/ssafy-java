import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_4613_러시아국기같은깃발_김성식 {

	private static int[][] arr;


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		
		for (int t = 1; t <= T; t++) {
			
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(stk.nextToken());
			int M = Integer.parseInt(stk.nextToken());
			
			arr = new int[N][3]; // W:0, B:1, R:2, 문자의 갯수만 저장
			
			for (int i = 0; i < N; i++) {
				String s = br.readLine();
				for(int j = 0; j < s.length(); j++) {
					if		(s.charAt(j) == 'W') arr[i][0]++;
					else if	(s.charAt(j) == 'B') arr[i][1]++;
					else if	(s.charAt(j) == 'R') arr[i][2]++;
				} // end of for
			} // end of for
			
			
			int minCnt = Integer.MAX_VALUE;
			for(int i = 1; i <= N-2; i++) {
				for (int j = 1; i+j <= N-1; j++) { // i, j, N-i-j
					int w = cntChar(0, 	i, 	'W'); // 영역의 범위에서 글자를 바꿔야 하는 갯수를리턴
					int b = cntChar(i,	i+j,'B'); // 영역의 범위에서 글자를 바꿔야 하는 갯수를리턴
					int r = cntChar(i+j,N,	'R'); // 영역의 범위에서 글자를 바꿔야 하는 갯수를리턴
//					System.out.println("w" + w + "b" + b + "r" + r);
					
					if(minCnt > w+b+r) minCnt = w+b+r;
				} // end of for
			} // end of for2
			
			char[] result = new char[N]; // 출력결과
			
			System.out.println("#"+t+" "+minCnt);
		}
	}

	
	private static int cntChar(int s, int e, char c) {
		
		int cnt = 0;
		// c의 갯수를 센다.
		for (int i = s; i < e; i++) {
			if		(c == 'W') cnt += arr[i][1] + arr[i][2];
			else if	(c == 'B') cnt += arr[i][0] + arr[i][2];
			else if	(c == 'R') cnt += arr[i][0] + arr[i][1];
		}
		
		return cnt; // 임시로
	}

}





























