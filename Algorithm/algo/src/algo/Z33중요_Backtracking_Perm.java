package algo;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * << 순열 backtracking 푸는 방법!!!  3가지 >>
 * 반복문 - n의 개수가 동적으로 바뀌는 것에 대응하기 어렵다!!
 * 재귀함수 1. swap 하면서 하는 방법 (이게 약간 더 좋다, 얘도 백트래킹도 할 수 있다)
 * 재귀함수 2. 후보군 구하기 (백트래킹 해서 하는 방법)
 *
 */

public class Z33중요_Backtracking_Perm {
	public static int[] arr = { 1, 3, 5, 7};
	public static void main(String[] args) {
		// arr 배열의 순열을 구해보자
		int[] a = new int[arr.length];
		backtrack(a, 0, a.length);
		
		
		String str = "hello";
		char[] s = str.toCharArray();
		List<char[]> al = Arrays.asList(s);
		for(int i = 0; i < al.size(); i++ ) {
			System.out.println(al.get(i));
		}
	}
	
	/**
	 * 
	 * @param a : 각비트의 사용 여부를 저장한 배열
	 * @param k : 현재 단계
	 * @param input : 종료단계
	 */
	public static void backtrack(int[] a, int k, int input) {
		int[] c = new int[a.length]; // 후보군을 저장할 배열
		
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
	private static int make_candidate(int[] a, int k, int input, int[] c) {
		boolean[] in_perm = new boolean[a.length]; // 이전 단계까지 사용한 숫자를 체크할 배열 (플래그변수)
		for(int i = 0; i < k; i++) {
			// 사용했으면 true로 바꾸자 !
			in_perm[a[i]] = true;
		}
		int ncands = 0; // 후보군의 개수
		for(int i = 0; i < in_perm.length; i++) {
			if(!in_perm[i]) {
				c[ncands] = i;
				ncands++;
			}
		}
		return ncands;
	}

	/**
	 * 완성된 배열을 보고, 순열을 출력하는 메서드
	 * @param a
	 * @param k
	 */
	private static void process_solution(int[] a, int k) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(arr[a[i]]+" ");
		}
		System.out.println();
	}
	
} // end of class
