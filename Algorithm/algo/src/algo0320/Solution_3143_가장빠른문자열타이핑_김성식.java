package algo0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3143_가장빠른문자열타이핑_김성식 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int t = 1; t<= tc; t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			String s1 = stk.nextToken(); // 입력받을 문자열
			String s2 = stk.nextToken(); // 속한 문자열
			String temp;
			
			int n = s1.length();
			int p = s2.length();
			int start = 0;
			int step = 0;
			
			while(true) {
				start = s1.indexOf(s2);
				if(start == -1) {
					break;
				}
				else {
					start += p;
					s1 = s1.substring(start);
//					System.out.println(s1.indexOf(s2) + p);
					n -= (p - 1);
				}
			}

			
			sb.append('#').append(t).append(' ').append(n).append('\n');
		} // end of for
		System.out.println(sb);
		
		
	} // end of main
} // end of class
