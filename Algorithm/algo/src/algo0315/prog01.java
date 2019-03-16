package algo0315;

import java.util.Arrays;

public class prog01 {
	static int MAXV;
	static int dis;
	
	public static int solution(int distance, int[] rocks, int n) {
		int answer = 0;
		int len = rocks.length + 2;
		int end = rocks.length - n;
		
		dis = distance;
		MAXV = Integer.MIN_VALUE;
		Arrays.sort(rocks);
		
		combi(0,0, end, rocks.length, rocks, new int[end]);
		
		
		return MAXV;
	}
	
	
	private static void combi(int start, int step, int end, int N, int[] rocks, int[] arr) {
		if(step == end) {
//			System.out.println(end);
//			System.out.println(Arrays.toString(arr));
			int min = arr[0];
			// 0부터 arr배열 그리고 distance값까지 다 차를 구해 최솟값을 구한다.
			for(int i = 1; i < end; i++) {
				int temp = arr[i] - arr[i-1];
				if(temp < min)
					min = temp; 
			}
			int temp = dis - arr[end-1];
			if(temp < min)
				min = temp; 
			// 최솟값중에 최댓값 구한다.
			if(MAXV < min)
				MAXV = min;
			
			return;
		}
		else {
			for(int i = start; i < N; i++ ) {
				arr[step] = rocks[i];
				combi(i+1, step+1, end, N, rocks, arr);
			}
		}
		
	}

	public static void main(String[] args) {
		System.out.println(solution(25, new int[]{2, 14, 11, 21, 17}, 2));
	}

}
