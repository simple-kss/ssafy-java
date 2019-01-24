

class A {
	int a;
	int b;
	
}

public class MainTest {

	public static void main(String[] args) {
		A a = new A();
		a.a = 3;
		a.b = 4;
		
		A b = a;
		b.a = 20000;
		
		System.out.println(a.a + " " + a.b);

	}

}
