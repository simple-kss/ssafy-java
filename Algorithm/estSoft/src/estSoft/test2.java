package estSoft;

public class test2 {
	public static int solution(int[] A) {
		int N = A.length;
		if(A.length == 0) return 0;
		
		int maxLen = 0; // 최대 길이를 저장할 변수
		int pivot; // 처음 구슬 시작점
		boolean[] visited = new boolean[N];
		int half = (N+1) / 2 ;
		for(int i = 0; i < N; i++) {
			// 이미 maxLen이 절반이상 넘었다면 더이상 검사할 필요가 없다.
			if( maxLen >= half ) break;
			if(visited[i] == false) {
				// 맨처음 피봇
				int iter = A[i]; // 반복변수
				int next = 0;
				int len = 1; // 길이 저장
				
				// 길이가 1일때
				if(A[i] == i) {
					if(len > maxLen) {
						maxLen = len;
					}
					continue;
				}
				// 계속 방문
				while(true) {
					next = A[iter];
					// 길이 증가
					len++;
					// 처음 구슬과 같다면
					if(i == next) {
						if(len > maxLen) {
							maxLen = len;
						}
						break;
					}
					
					iter = next;
					
					// N이 넘으면 안됨.
					if(len > N) {
						break;
					}
				} // end of while
				
				visited[i] = true;
			} // end of if
			else
				continue;
		}
		return maxLen;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {5, 4, 0, 3, 1, 6, 2}));
		System.out.println(solution(new int[] {1, 2, 3, 4, 5, 1, 1}));
		System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6, 0}));
		System.out.println(solution(new int[] {1, 0}));
	}

}
