package com.second;

/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */

//
//class Ele {
//	int v;
//	int w;
//}

public class Solution1
{
    static int[][] dp = new int[21][10001];
	public static void main(String[] args) throws Exception
	{
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
			int N = scan.nextInt(); // 햄버거 갯수
			int M = scan.nextInt(); // 햄버거 무게
			
			
			Ele[] g = new Ele[N+1];
			for (int i = 0; i < N; i++) {
				g[i] = new Ele();			
			}
			
			for (int i = 0; i < N; i++) {
				g[i].v = scan.nextInt();
				g[i].w = scan.nextInt();
			}
			
			for (int i = 0; i <= N; i++) {
				for(int w = 0; w <= M; w++) dp[i][w] = 0;			
			}
			
			// 초기화
			for(int i = 0; i < 20; i++) {
				for(int j = 0; j < 1001; j++) {
					dp[i][j] = 0;
				}
			}
			
			// 처음 햄버거
			for(int k = 0; k <= M; k++ ) {
				// 현재 무게가 담으려고하는 무게보다 작으면 애초에 이전 것을 담는다.
				if( g[0].w > k ) {
					dp[0][k] = 0;
				}
				else {
					dp[0][k] = dp[0][k-g[0].w] + g[0].v; 
				}
			}
			
			
			// i는 햄버거 갯수
			for(int i = 1; i < N; i++) {
				for(int j = 0; j <= M; j++ ) {
					// 현재 무게가 담으려고하는 무게보다 작으면 애초에 이전 것을 담는다.
					if( g[i].w > j ) {
						dp[i][j] = dp[i-1][j];
					}
					else {
						int selected_val = dp[i-1][j-g[i].w] + g[i].v;
						int unselected_val = dp[i-1][j];
						
						dp[i][j] = selected_val > unselected_val ? 
								selected_val : unselected_val;
						dp[i][j] = Math.max(dp[i][j-g[i].w]+g[i].v, dp[i-1][j]);
					}
				}
			}	
			System.out.printf("#%d %d",test_case,dp[N-1][M]);
		
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////

		}
	}
}