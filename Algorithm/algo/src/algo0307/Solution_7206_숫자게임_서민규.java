package algo0307;
import java.util.Scanner;

/**
 * AD 수준정도로 예상 숫자 사이사이를 쪼개는 경우를 바이너리카운팅 이용, 각 숫자를 쪼갠 값을 곱해서 곱한 값으로 재귀호출 int
 * length = ((int)Math.log10(n))+1; //자릿수 알아내기
 * 
 * 재귀호출-> 중복호출 많이 발생 -> 메모이제이션(저장) -> DP(작은해 부터 구해서 큰 해를 구하는 방식 : bottom up 방식)
 *							4ms
 * 
 * 이 문제는 메모이제이션까지 하는게 최선
 * DP는 큰 해를 구할 때 작은 해까지 반드시 구하는 경우에만 좋다.
 */

public class Solution_7206_숫자게임_서민규 {
	// 한번만 배열객체를 생성해서 재활용하는 이유 : f 함수의 호출한 결과 값은
	// 동일하기 때문에 어떤 테스트케이스에서 한번이라도 구했으면, 재활용
	static int[] memo = new int[100000]; // f 함수를 호출한 결과를 저장할 배열
	

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine().trim());
		for (int t = 1; t <= tc; t++) {

			int n = sc.nextInt();

			System.out.println("#" + t + " " + f(n));

		} // end for test case
	}// end of main

	// 숫자 n으로 쪼갤 수 있는 최대 턴수 리턴하는 메서드
	public static int f(int n) {

		if (n < 10) {
			return 0;
		}

		String s = n + "";// int형을 string으로 만들기.
		int len = s.length() - 1; // 쪼갤 갯수
		int maxCnt = 0;

		for (int i = 1; i < 1 << len; i++) { // 쪼개는 방법을 바이너리카운팅을 이용, 0은 안쪼개는 거라서 1부터 시작
			int mul = 1; //곱셈 연산자에 대한 항등원 1로 초기화
			int num = s.charAt(0) - '0';
			for (int j = 0; j < len; j++) { // 각 자리 비트마스킹
				if ((i & 1 << j) == 0) { // 안쪼갬
					num = num * 10 + s.charAt(j+1) - '0'; //연결된 숫자로 계산
				} else { // 쪼갬
					mul *= num;
					num = s.charAt(j + 1) - '0';
				}
			}
			
			mul*= num;
//			int cnt = f(mul);
			if (mul >= 10 && memo[mul] == 0 ) { // 아직 구하지 않은 경우
				memo[mul] = f(mul);
				
			}
			if(maxCnt < memo[mul]) maxCnt = memo[mul];
			
		}
		return maxCnt + 1; // 임시 error 없애기
	}
}// end of class