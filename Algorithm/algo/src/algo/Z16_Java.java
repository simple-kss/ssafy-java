package algo;

/*
 * 자바정리
 */

public class Z16_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// overloading 오버로딩  : 하나(깥은)의 클래스 내에서 똑같은 이름의 메서드명, 생성자를 방법 
		// overriding 오버라이딩 : 두 클래스 (부모-자식) 관계에서 부모클래스의 메서드를 자식클래스에서 재정의 하는 기법
		
		// abstract class는 객체생성불가
		
	} // end of main
} // end of class


// 패키지명 : 첫글자 소문자
// 인터페이스명 : 첫클자대문자, ~able
// 클래스명 : 첫글자 대문자
// 생성자명 : 첫글자 대문자 ()
// 메서드명 : 첫글자 소문자 ()
// 변수명 : 첫글자 소문자

interface Movable {
	void move();
}

interface Fightable {
	void fight();
}

interface Attackable extends Movable, Fightable { // 인터페이스 끼리는 다중상속이 가능
	
}

class Attack implements Attackable {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}
	
	
}


interface Testable { // 알맹이는 하나도 없는 완전한 껍대기, (상수와 추상메서드만 포함가능)
//	int b; 이건 안됨
	// 부족한 제어자는 컴파일러가 추가해준다.
	int a = 3; // 이건 됨 (public static final)이 생략된거 ****************** 시험
	public static final int b = 4; // 상수
	
	abstract void p();
	void q(); // 부족한 제어자는 컴파일러가 추가해준다. 
	
}


abstract class Men {
	int a;
	static int b;
	abstract void p(); // 선언부만 작성한 메서드는 추상메서드라한다.
	// 추상메서드가 하나라도 있으면 abstract 클래스가 된다! *************** 시험
	void q() {
		
	}
	
}

class ManMan extends Men {

	@Override
	void p() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}


