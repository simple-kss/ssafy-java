package algo;

/**
 * 
 * PowerSet
 * 반복문 - n의 개수가 동적으로 바뀌는 것에 대응하기 어렵다
 * 바이너리 카운팅
 * 백트래킹
 *
 */

public class Z32_BacktrackingPowerSet {
	static int[] arr = {1, 3, 5}; // 부분집합을 구하고자하는 원래 배열

	public static void main(String[] args) {
		// arr배열의 모든 부분집합을 구해보자(powerset)
		boolean[] a = new boolean[arr.length];
		backtrack(a, 0, a.length);
		
	} // end of main
	
	
	/**
	 * 
	 * @param a : 각비트의 사용 여부를 저장한 배열
	 * @param k : 현재 단계
	 * @param input : 종료단계
	 */
	public static void backtrack(boolean[] a, int k, int input) {
		boolean[] c = new boolean[a.length]; // 후보군을 저장할 배열
		
		// 합이 10이 넘어가면 다시 탐색하지 마라
		
		if ( k == input ) { // 종료파트
			process_solution(a, k);
		}
		else { // 재귀파트
			// 후보군을 받아오는 메서드, 후보군의 개수를 리턴받음
			int ncands = make_candidate(a, k, input, c);
			for (int i = 0; i < ncands; i++) { // 후보군의 개수만큼 반복
				a[k] = c[i];
				backtrack(a, k+1, input);
			}
		}
	}
	
	/**
	 * 
	 * @param a : 각비트의 사용 여부를 저장한 배열
	 * @param k : 현재 단계
	 * @param input : 종료단계
	 * @param c : 후보군을 저장할 배열
	 * @return ncands : 후보군의 개수
	 */
	private static int make_candidate(boolean[] a, int k, int input, boolean[] c) {
		c[0] = true;
		c[1] = false;
		return 2;
		
	}

	private static void process_solution(boolean[] a, int k) {
		for(int i = 0; i < a.length; i++) {
			if(a[i]) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
} // end of class
