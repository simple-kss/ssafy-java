package com.second;

import java.util.Arrays;
import java.util.Scanner;


//5 1000
//100 200
//300 500
//250 300
//500 1000
//400 400

abstract class Test {
	
}

class Subtest extends Test {
	
}


class Ele {
	int v;
	int w;
}

public class Solution {
	static int[][] dp = new int[21][10001];
	public static void main(String args[]) throws Exception
	{
		
//		Test t = new Subtest();
//		Test t = new Test();
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		//System.setIn(new FileInputStream("res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner scan = new Scanner(System.in);
		int T;
		T=scan.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
        

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int N = scan.nextInt();
			int M = scan.nextInt();
			Ele[] g = new Ele[N+1];
			for (int i = 0; i <= N; i++) {
				g[i] = new Ele();			
			}
			
			for (int i = 1; i <= N; i++) {
				g[i].v = scan.nextInt();
				g[i].w = scan.nextInt();
			}
			
			for (int i = 0; i <= N; i++) {
				for(int w = 0; w <= M; w++) dp[i][w] = 0;			
			}
			
			for(int i = 1; i <= N; i++) {
				for(int w = 0; w <= M; w++) {
//					System.out.println(i + " " + w);
					// 현재 해당하는 j가 담을 수 있다면
					if(g[i].w > w) {
						dp[i][w] = dp[i-1][w]; 
					}
					else {
						int selected_val = dp[i-1][w-g[i].w] + g[i].v;
						int unselected_val = dp[i-1][w];
						
						dp[i][w] = selected_val > unselected_val ? 
								selected_val : unselected_val;
						
					}
					
				}
			}
			
			System.out.printf("#%d %d\n",test_case,dp[N][M]);

		}
	}
}



//for(int i = 1; i <= N; i++) {
//for(int w = 0; w <= M; w++) {
////	System.out.println(i + " " + w);
//	// 현재 해당하는 j가 담을 수 있다면
//	if(g[i].w > w) {
//		dp[i][w] = dp[i-1][w]; 
//	}
//	else {
//		int selected_val = dp[i-1][w-g[i].w] + g[i].v;
//		int unselected_val = dp[i-1][w];
//		
//		dp[i][w] = selected_val > unselected_val ? 
//				selected_val : unselected_val;
//		
//	}
//	
//}
//}



