package estSoft;

import java.util.Arrays;

public class test {
	
	public static int solution(int[] ranks) {
		Arrays.sort(ranks);
		int sum = 0;
		int N = ranks.length;
		
		//int pivot = ranks[0];
		int prePivot = -2;
		int cnt = 0;
		for(int i = 0; i < N; i++ ) {
			if(prePivot == ranks[i]) {
				cnt++;
			}
			// 다르다면
			else {
				// 차이가 1 나는지 확인하고 그 cnt만큼 더한다.
				if(ranks[i] - prePivot == 1){
					sum += cnt;
				}
				cnt = 1;
			}
			prePivot = ranks[i];
		}
		return sum;
		
	}

	public static void main(String[] args) {

	}

}
