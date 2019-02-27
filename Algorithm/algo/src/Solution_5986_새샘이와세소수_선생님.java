

import java.util.Scanner;

public class Solution_5986_새샘이와세소수_선생님 {

	public static void main(String[] args) {
		System.out.println(" ");
		int MAX = 1000;
		boolean[] compo = new boolean[MAX];
		compo[0] = compo[1] = true;
		
		//1. 소수 배열 만들기
		// 에라토스체네스의 체
		for (int i = 2; i < MAX; i++) {
			for (int j = i * 2; j < MAX; j+= i) {
				compo[j] = true;//합성수. false면 소수
			}
		}		
		//System.out.println(Arrays.toString(compo));
		
		//2. compo 배열에서 3개의 값을 꺼내 만들어 지는 합의 숫자를 카운트 해놓기  
		int[] cnt = new int[MAX];
		
		for (int i = 2; i < MAX; i++) {
			if(compo[i]) continue;
			
			for (int j = i; i + j < MAX; j++) {
				if(compo[j]) continue;
				
				for (int k = j; i+ j + k < MAX; k++) {
					if(compo[k]) continue;
					cnt[i+j+k]++;
				}				
			}			
			
			Scanner s = new Scanner(System.in);
			int tnum = s.nextInt();
			
			for (int tc = 1; tc <= tnum; tc++) {
				int num = s.nextInt();
				System.out.println("#" + tc + " " + cnt[num]);
			}			
		}				
	}
}








