package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class oneZeroOneZero {
	
	static int[] arr = {1,2,3};
	static int[] visited;

	public static void exe(int num, int step, int cnt) {
		// len 만큼 돌자
		int len = visited.length;
		// step : 0 ~ len -1
		if(step >= num) {
			for (int i = 0; i < len; i++) {
				if(visited[i] == 1)
					System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	
		else {
			visited[step] = 0;
			exe(num , step+1, cnt);
			visited[step] = 1;
			exe(num , step+1, cnt);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 숫자의 갯수
		int cnt = sc.nextInt(); // 조합할 갯수
		
		visited = new int[num];
		
		exe(num, 0, cnt);
//		exe

	}
}