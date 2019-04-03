package algoProg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++ ) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		// 자기보다 아래인거 세기
		int pivot = arr[0];
		
		int cnt = 0;
		boolean check = false;
		int max = 0;
		
		// 하나라도 나오면
		for(int i = 1; i < N; i++) {
			if(pivot > arr[i]) {
				cnt++;
			}
			// 자기보다 큰거 or 같은거 나오면 갱신
			else {
				cnt++;
				if(max < cnt)
					max = cnt;
				cnt = 0; 
				pivot = arr[i]; // 피벗 교체
			}
		}
		System.out.println(max);

		
		
	} // end of main

}
