package ssafy;

import java.util.Scanner;

public class Main533 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char sex = scan.next().charAt(0);
		int age = scan.nextInt();
		
		if( sex == 'M') {
			if(age >= 18)
				System.out.println("MAN");
			else {
				System.out.println("BOY");
			}
		}
		else if( sex == 'F') {
			if(age >= 18)
				System.out.println("WOMAN");
			else
				System.out.println("GIRL");
			
		}
	}
}
