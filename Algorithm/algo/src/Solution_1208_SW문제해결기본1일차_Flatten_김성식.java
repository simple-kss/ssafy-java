import java.util.Scanner;

public class Solution_1208_SW문제해결기본1일차_Flatten_김성식 {

	static final int IN_MAX = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int T = 10;
		
		
		for(int t = 1; t <= 10; t++) {
			int N = scan.nextInt(); // 덤프횟수
			int[] arr = new int[IN_MAX];
			
			// 상자높이 입력받기
			for (int i = 0; i < IN_MAX; i++) {
				arr[i] = scan.nextInt();				
			}
			// 3 덤프 횟수만큼 반복
			

			int maxIn = 0;
			int minIn = 0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			for(int k = 0; k < N; k++) {
				// 1. max, min 찾기, 번지도 찾기
				max = Integer.MIN_VALUE;
				min = Integer.MAX_VALUE;
				maxIn = 0;
				minIn = 0;
				for(int i = 0; i < IN_MAX; i++) {				
					if(max < arr[i]) {
						max = arr[i];
						maxIn = i;					
					}
					if(min > arr[i]) {
						min = arr[i];
						minIn = i;
					}
				}
				if(arr[maxIn] - arr[minIn] == 0) break;
				// 2. 갖다주기
				arr[maxIn]--;
				arr[minIn]++;
				
				
			}
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;			
			for(int i = 0; i < IN_MAX; i++) {				
				if(max < arr[i]) {
					max = arr[i];
					maxIn = i;					
				}
				if(min > arr[i]) {
					min = arr[i];
					minIn = i;
				}
			}
			System.out.printf("#%d %d\n",t,arr[maxIn] - arr[minIn]);
		}
	}
}
