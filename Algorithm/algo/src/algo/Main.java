package algo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[][] N = new int[7][7];
		int[][] arr = new int[7][7];
		int[][] d = {
				{-1, 0},
				{ 1, 0},
				{ 0,-1},
				{ 0, 1}
		};
		// 1~5
		
//		int[][] arr = {
//				{0,0,0,0,0},
//				{1,2,3,4,5}
//		};
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				N[i][j] = scan.nextInt();
			}			
		}
		
		// 1번째줄을 0번쨰줄 복사
		for (int i = 0; i < N.length; i++) {
			N[i][0] = N[i][1]; // 0열
			N[0][i] = N[1][i]; // 0행
			N[N.length-1][i] = N[N.length-2][i];
			N[i][N.length-1] = N[i][N.length-2];						
		}
		
		for (int i = 0; i < N.length; i++) {
			for (int j = 0; j < N[i].length; j++) {
				System.out.printf("%d ",N[i][j]);
			}
			System.out.println();
		}
		
		int total = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				int dist = 0;
				for (int k = 0; k < 4; k++) {
					dist += Math.abs(N[i][j] - N[i + d[k][0] ][j + d[k][1] ]);
					arr[i][j] = dist;					
				}
				total += dist;
			}			
		}
		System.out.println(total);
		
		for (int i = 1; i < N.length - 1; i++) {
			for (int j = 1; j < N[i].length - 1; j++) {
				System.out.printf("%7d ", arr[i][j]);
			}
			System.out.println();			
		}
		
		
		
		
		
		
		
	}
}
