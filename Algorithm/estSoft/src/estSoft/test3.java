package estSoft;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class test3 {
	static int maxStep;

	public static int dfs(int r, int c, int step, String[] A) {
		// 넘어서 갈 수 있으면
		// 왼쪽 위
		int rmax = 0;
		int lmax = 0;
//		System.out.println("wow:" + r + " "+ c);
		if(A[r-1].charAt(c-1) == 'X' && A[r-2].charAt(c-2) == '.') {
			dfs(r-2, c-2, step + 1, A);
		}
		
		// 오른쪽 위
		if(A[r-1].charAt(c+1) == 'X' && A[r-2].charAt(c+2) == '.') {
			dfs(r-2, c+2, step + 1, A);
		}
		
		// 현재 더 나아갈게 없다면, 현재스텝과 계속 max를 저장한 step을 비교하여 반환한다.
		if(step > maxStep)
			maxStep = step;
		
		return maxStep;
	}

	public static int solution(String[] B) {
		int len = B.length;
			
		// 새로운 배열을 만든다! 범위 밖 검사하기 귀찮아서
		String[] A = new String[len+4];
		int rlen = len+4;
		StringBuilder sb = new StringBuilder();
		
		
		// 사방 테두리를 만든다 (범위검사하는데 시간쓰기 싫어서)
		// P로 초기화
		char[] st = new char[len+4];
		Arrays.fill(st, 'P');
		
		A[0] = new String(st);
		A[1] = new String(st);
		A[len+2] = new String(st);
		A[len+3] = new String(st);

		// 범위검사 하기 싫어서 마지막을 P로 채우기
		for(int i = 0; i < len; i++) {
			sb.append('P').append('P').append(B[i]).append('P').append('P');
			A[i+2] = sb.toString(); 
			sb = new StringBuilder();
		}
		
		int r = 0;
		int c = 0;
		
		// 0의 좌표값 찾기
		for(int i = 0; i < rlen; i++) {
			for(int j = 0; j < rlen; j++) {
				if(A[i].charAt(j) == 'O') {
					r = i;
					c = j;
				}
			}
		}
		
		maxStep = 0;
		return dfs(r, c, 0, A);
	}

	public static void main(String[] args) {
		String B[] = {
			"..X...",
			"......",
			"....X.",
			".X....",
			"..X.X.",
			"...O.."
		};
		
		String A[] = {
			"X....",
			".X...",
			"..O..",
			"...X.",
			"....."
		};
		
		String C[] = {
			"....X..",
			".X.X.X.",
			".......",
			"...X...",
			".......",
			".....X.",
			"......0"
		};
		System.out.println(solution(new String[] {
				"..X.X...",
				"........",
				"..X.X...",
				"........",
				"X...X.X.",
				"........",
				"..X.X...",
				"...O...."} ));
		
		System.out.println(solution(new String[] {
				".........",
				"..X.X....",
				".....X...",
				"..X.X.X..",
				".........",
				"X...X.X..",
				".........",
				"..X.X....",
				"...O....."}
		));
		

	} // end of main
} // end of class
