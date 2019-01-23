package algo;

/**
 * 
 * 제곱 재귀함수
 * @author student
 *
 */

public class Z22_Power {
	static int power(int base, int ex) {
		
		// 종료 파트
		if( ex == 0 ) // 종료파트
			return 1;
		else if( ex == 1)
			return base;
		else if( ex % 2 == 0) {
			int n = power(base, ex/2);
			// 두번 호출하지 않게 하기 위해 n을 선언
			return n * n;
			
		}
		else {
			int n = power(base, (ex-1)/2);
			return n * n * base;			
		}		
	}

	public static void main(String[] args) {
		// 2^10을 출력
		// 똑같것을 두번 호출하지 않으므로
		// 저장해도 의미없음
		System.out.println(power(2,10));
		

	} // end of main
} // end of class
