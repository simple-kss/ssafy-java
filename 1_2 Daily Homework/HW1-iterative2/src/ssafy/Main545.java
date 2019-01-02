package ssafy;

import java.util.Scanner;

public class Main545 {

	public static void main(String[] args) {
		int five = 0;
		int three = 0;
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			if ( num % 3 == 0)
				three++;
			if(num % 5 == 0)
				five++;
		}
		
		System.out.println("Multiples of 3 : " + three);
		System.out.println("Multiples of 5 : " + five);

	}

}
