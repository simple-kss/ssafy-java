

public class Z55_모든최단경로_플로이드워샬 {
	public static void main(String[] args) {
		final int M = Integer.MAX_VALUE;
		int[][] D = {
				{ 0, 4, 2, 5, M},
				{ M, 0, 1, M, 4},
				{ 1, 3, 0, 1, 2},
				{-2, M, M, 0, 2},
				{ M,-3, 3, 1, 0}
		};
		
		
		for (int k = 0; k < D.length; k++) { // 경유할 정점
			for (int i = 0; i < D.length; i++) { // 시작 정점
				if(k == i) continue; // 같아버리면 넘어가라
				for (int j = 0; j < D.length; j++) { // 도착 정점
					if(k == j || i == j) continue;
					
					// Math.min을 무작정쓰면안된다. 왜냐면 경유해서가는게 무한대이고, 기존값도 무한대일 수도 있기 떄문에
					// 밑에는 점화식이다.
//					D[i][j] = min(D[i][j], D[i][k] + D[k][j]);
//					기존값 		경유 정점으 거쳐가는 새 경로 값
//					D[i][j] = D[i][k] + D[k][j]; // 뒤에꺼가 더 작을 경우 업데이트해라!
//					M			M (둘다 무한대인경우)		-> 그냥 둠
//					1			M (경유만 무한대인 경우)	-> 그냥 둠
//					M			1					-> 새 경로를 저장
//					1			1					-> 비교 후 작은 숫자를 갱신
					
					// 이러한 경우
					if (D[i][k] != M && D[k][j] != M // 새 경로가 무한대가 아니다.
							&& D[i][j] > D[i][k] + D[k][j]) {
						D[i][j] = D[i][k] + D[k][j];
					}
					
				}
				
			}
			
		}
		//출력
		for (int i = 0; i < D.length; i++) {
			for (int j = 0; j < D[i].length; j++) {
				System.out.printf("%2s, ", D[i][j] == M ? "M" : D[i][j]);
			}
			System.out.println();
		}
		
		
	} // end of main
} // end of class
