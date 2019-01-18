package algo;
/**
 * 자바정리1
 * @author student
 *
 */
public class Z15_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 : 기본형, 참조형
		String s = "c";
		switch (s) { // 조건값 : int, String
		case "d":
			System.out.println("hello");
			break;
		case "e":
			break;
		case "c":
			System.out.println("hellc");
			break;
		default:
			break;	
		}
		
		Boy boy = new Boy(26, "서민규");
		System.out.println(boy.name);
/*
		switch는 한번에 내려온다
		case "c"로 한번에 내려옴!
*/
		CC c = new CC();
		c.pp();
		
	} // end of main
} // end of class

// class에 사용할 수 있는 접근제어자 public, default
class Boy { // fields, 전역변수 : 클래스 안쪽 && 메서드 바깥쪽에 선언한 변수, 각타입의 초기값으로 초기화된다.
	int age;
	String name = ""; // null
	// 빈문자열을 넣는게 프로그래밍 관례
	
	// 모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
	// 생성자를 하나도 작성하지 않으면, 컴파일러가 기본 생성자를 추가해준다.
	// 생성자를 뭔가 작성하면, 컴파일러는 더아싱 기본 생성자를 추가해주지 않는다.
	
	// 생성자는 클래스명과 동일한 이름을 쓴다. 리턴 값을 줄 수 없다.
	// public 은 modifier라 한다. (제어자)
	// 객체를 생성할 때마다 가장먼저 한번씩 호출됨, 인스턴스변수들의 초기화 작업을 주로 담당
	public Boy() { // 기본 생성자 : 매개벼수가 하나도 없는 생성자
		this(1,"홍길동"); // 나의 클래스의 또다른 생성자 호출, 무조건 첫번쭐에 있어야함
		int z = 3;
		
	}
	
	// 모든 생성자의 첫번째 줄에는 또 다른 생성자를 호출해야 한다.!!
	// 생성자에서 다른 생성자를 호출하지 않으면, 컴파일러가 부모의 기본 생성자를 호출하는 super();
	// 를 삽입해 준다.
	public Boy(int age, String name) {
		super(); // 부모의 기본생성자 호출, 이것또한 첫줄에 삽입해야한다.
		this.age = age;
		this.name = name;
	}
	
	
}

// this : 나 자신의 객체를 가리키는 참조변수
// super : 부모의 객체를 가리키는 참조변수
class GP{
	int x = 40;
	public int getX() {
		return x;
	}
}
class PP extends GP {
	int x = 30;
	// 원래 생성자를 정의하지 않으면 기본생성자만 정의 되어있는데
	// 사용자 정의 생성자만 만들면 기본생성자가 정의되지 않음
	// 그래서 기본생성자를 따로 정의해줘야함(사용자 정의 생성자를 만들었을 경우)
	PP(int a ) {
		
	}
	PP () {}
	
	public int getX() {
		return x;
	}
	public int getX(int i) {
		return i;
	}
	
}
class CC extends PP{ // this, super 키워드
	int x = 20;
	
	void pp () {
		int x = 1;
		// 참조 기본 원칙 : 참조할 위치에서 가까운 곳에 선언된 변수를 참조한다.
		// 지역변수 > 전역변수 > 부모꺼 > 할배꺼 순서대로 변수를 참조한다!
		x = 50;

		System.out.println(x);
		System.out.println(this.x); // 나의 전역변수 이상의 멤버에 접근할 수 있다.
		System.out.println(super.x);
		System.out.println(this.getX());
	}
}

