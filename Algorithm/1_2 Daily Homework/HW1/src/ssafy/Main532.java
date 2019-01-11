package ssafy;

import java.util.Scanner;

public class Main532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		
		if (n1 >= 4.0 && n2 >= 4.0)
			System.out.println("A");
		else if (n1 >= 3.0 && n2 >= 3.0)
			System.out.println("B");
		else
			System.out.println("C");	
	}
}
