import java.util.Random;

/**
 * 랜덤, 변수 스코프, 기타
 * @author student
 *
 */
public class Z14_Quiz {
	
	// 전역변수 : 클래스 안쪽 && 메서드 바깥쪽에 선언
	// 초기값 : 각 타입의 기본값 정수 : 0, 실수:0,0, 문자:\u0000, 논리형:false, 참조형:null
	int b; // non-static변수, 인스턴스 변수라고도 한다.
			// 사용범위 : 객체생성 시점 ~ 참조변수 없어질때 까지
			// 삭제시점 : 참조변수가 없어지만, 가비지 컬렉터에 의해 자동으로 삭제
	
	static int c; // static 변수 ~ 속도가 빠르다.
				// 사용범위 : 클래스정보가 처음 로딩될때 ~ 프로그램종료 시까지
				// 삭제범위 : 프로그램 종료시
				// 현업에서는 static 메서드, 변수를 많이 쓰면 안된다. 쓸 수 있는 메모리가 줄어들기 때문에.
				// 알고리즘 대회에서는 static 많이 쓴다. 빠르기 때문에
	
//	알고리즘 설계기법
//	1. BruteForce
//	2. Greedy
//	3. BackTracking
//	4. Divid & Conquer
//	5. DP
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		랜덤 2가지가 있다. in java
		Math.random(); // 무작위 난수 double 리턴 0.0 <= x < 1.0
		// 자바에서는 앞에껀 포함, 뒤에껀 미포함
		
		Random ran = new Random();
		System.out.println(ran.nextInt(45)); // 0<= a < 45
		
		// 
		

	}

}
