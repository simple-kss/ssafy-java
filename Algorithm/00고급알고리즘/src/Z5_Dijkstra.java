

import java.util.Arrays;
import java.util.Scanner;

/**
 *다익스트라 Dijkstra
 * 방향성 있든 없든 사용 가능
 * 하나의 정점에서 시작해서 각각의 정점까지 최단거리를 구하는 알고리즘
 * 음이 아닌 가중치에서만 사용 가능
 * O[n^2]
 *
 * 모든 정점에서 출발해서 각각의 모든 정점까지의 최단거리를 구하려면?
 * 다익스트라를 n번 돌려서 구하면 된다.
 * 다익스트라 * n (정점의 개수만큼 반복)
 * = 플로이드 워샬 알고리즘(DP적인 개념이 들어간다) O[n^3] 비교적 다익스트라보다 코드가 간단하다.
 * 
 * 
 * 
 * 
 */

public class Z5_Dijkstra {

	public static void main(String[] args) {
		final int M = Integer.MAX_VALUE;
//		System.out.println("");
//		Scanner sc = new Scanner(System.in);
//		sc.next();
		int[][] G = {
				{0, 3, 5, M, M, M},
				{M, 0, 2, 6, M, M},
				{M, 1, 0, 4, 6, M},
				{M, M, M, 0, 2, 3},
				{3, M, M, M, 0, 6},
				{M, M, M, M, M, 0},
		};
		
		int s = 0; // 시작 정점
		int[] D = G[s].clone(); // 시작 정점의 진출 차수를 기준으로 가중치 배열을 초기화
		// 이렇게 되면 참조변수라서 D의 값을 바뀌어버리면 G의 값도 바뀔 것이다.
		// 깊은 복사 ( 새로운 메모리에 복제본을 만드는 것 )을 하려면 clone메서드를 쓴다.
		// 솔직히 clone 안해도 되지만 그래도 깊은 복사를 활용해서 문제를 풀어보자.
		
		boolean[] used = new boolean[G.length]; // 사용한 정점을 저장할 배열 visited란 개념
		
//		u라는 집합이 모두 선택이 될떄까지 반복하자.
//		선택하지 않은 집합 중에 가중치가 최소인 집합을 찾자 !
		
		for(int i = 0; i < G.length; i++) { // 정점의 개수만큼 반복, 한 사이클 돌면, 정점 1개가 선택됨
			// 사용하지 않은 정점 중, 최소 가중치 정점을 찾아서 추가하기.
			int minIndex = 0; // 보통 검색할 것의 첫번쨰값을 넣어놓으면 된다., 최소 가중치의 인덱스
			int min = M; //D[0];// 얘는 최소 값을 저장하는 애, 범위의 첫번쨰 값을 넣어도 상관없고, 가장 큰 값을 넣어도 된다.
			
			// 가중치 배열을 쭉 돌면서 최솟값이 누구인지를 찾는다.
			for (int j = 0; j < D.length; j++) {
				// 사용하지 않았다면
				if(!used[j] && min > D[j] ) {
					minIndex = j;
					min = D[j];
				}
			}
			// 최소 가중치를 가진 점정을 선택, 정점번호 : minIndex
			used[minIndex] = true; // 사용한 집합에 표시
			
			// 최소 가중치의 정점을 선택해서 그 정점을 통해서 갈 수 있는 인접한 정점으 값을 업데이트
			for (int j = 0; j < D.length; j++) {
				// 사용하지 않은 정점 && 인접한 정점 && 가중치가 더 작다면 업데이트
				if(!used[j]
						&& G[minIndex][j] != M
						&& D[j] > D[minIndex] + G[minIndex][j]) {
					// G[miniINdex][i]는  != M라는 말은 연결되어있지 않은경우
					// 자기자신은 이미 방문했으므로 used에서 걸러진다.
					D[j] = D[minIndex] + G[minIndex][j];
					// 그럴 때 업데이트 해라!
				}
			}
			
			System.out.println(Arrays.toString(D));
			
			// 즉 이 알고리즘을 통해 아래를 알 수 있따.
			// 최단 거리 of a 정점에서 출발해서 b 정점까지의
			System.out.println(D[1]);
			// 최단 거리 of a 정점에서 출발해서 c 정점까지의
			System.out.println(D[2]);
			// 최단 거리 of a 정점에서 출발해서 d 정점까지의
			System.out.println(D[3]);
			
			
			
		}
		
		
		
		
		
		

	} // end of main
} // end of class
