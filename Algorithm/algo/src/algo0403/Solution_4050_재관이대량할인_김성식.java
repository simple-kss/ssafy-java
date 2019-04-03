package algo0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution_4050_재관이대량할인_김성식 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			int[] tarr = new int[N+1];
			int[] arr = new int[N+1];
			for(int i = 1; i <= N ;i++ ) {
				tarr[i] = Integer.parseInt(stk.nextToken());
			}
			
			Arrays.sort(tarr);
			for(int i = 1; i <= N ; i++) {
				arr[i] = tarr[N-i+1];
			}
			
			int sum = 0;
			for(int i = 1 ; i <= N; i++ ) {
				sum += arr[i];
			}
			for(int i = 3 ; i <= N; i+=3 ) {
				sum -= arr[i];
			}
			
			System.out.println("#" + t + " "+ sum);
		}

	} // end of main
} // end of class