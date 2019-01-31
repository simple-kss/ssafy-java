
// in main 객체를 생성하지 않고 ->
// 메써드로 객체를 얻는다. ->



// 한 클래스안에 한 객체를 공유해야한다.

public class MainTest {
	static Product c;

	public static void main(String[] args) {
//		Person s = new Person();
//		Person s = new Person();
		Person s = Person.getInstance();
		Person p = s.getInstance();
		
		System.out.println(s);
		System.out.println(p);
		
		// 아니 그럼 객체에 static 붙이면 되지 않느냐
		
		c.name = new String("123");
		c.age = 3;
			
		System.out.println(c.name);
		System.out.println(c.age);
		
		Product m = c;
		System.out.println(m);
		System.out.println(c);
		
		c.print();
		
		printObj(c);
		// c.print2();
//		MainTest m = new MainTest();
	}
	
	static void printObj(Product m) {
		m.print2();
	}
	
//	public static class Per {
//		int x;
//	}

}
