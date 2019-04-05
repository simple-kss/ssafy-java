package algo0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_4301_콩많이심기_김성식 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= tc; t++) {
			int ans = 0;
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(stk.nextToken());
			int M = Integer.parseInt(stk.nextToken());
			
			if( N >= 4 && M >= 4) {
				ans = (N * M) * 4 / 2;
			}
			else {
				if(N == 2 && M == 2) ans = 4;
				else
					ans = N + M - 1;
			}
			System.out.println("#" + t + " " + ans);
		}
		
		
		

	} // end of main
} // end of class
