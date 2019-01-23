package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 2 + 3 * 4 / 5
// 2 3 4 * 5 /

// 6 + 5 * ( 2 - 8 ) / 2
public class Z19_Calc1 {
	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] op = new int[30];
		int[] num = new int[30];
		
		int oTop = -1;
		int nTop = -1;
		
		str = br.readLine();
		
		StringTokenizer s = new StringTokenizer(str, " ");
		
		num[++nTop] = Integer.parseInt(s.nextToken());
		
		while(s.hasMoreTokens()) {
			char a = s.nextToken().charAt(0);
			int n = Integer.parseInt(s.nextToken());
			
			if( a == '+' || a == '-') {
				num[++nTop] = n;
				op[++oTop] = a;
			}
			else if( a == '*' || a == '/' ) {
				// 곱하기나 나누기나오면 숫자와 뒤바꿔서 저장
				// 숫자 먼저 저장
				num[++nTop] = n;
				num[++nTop] = a;
			}
			
		}
		
		while( oTop <= -1) {
			num[++nTop] = op[oTop--];
		}
		//System.out.println(Arrays.toString(num));
		
		for (int i = 0; i <= nTop; i++) {
			if(num[i] > 10) {
				System.out.printf("%c ",num[i]);
				
			}
			else
				System.out.print(num[i]+ " ");
			
		}
		
		
	}

}
