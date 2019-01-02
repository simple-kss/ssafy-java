package ssafy;

import java.util.Scanner;

public class Main534 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char alpha = scan.next().charAt(0);
		
		if (alpha == 'A') {
			System.out.println("Excellent");
		}
		else if(alpha == 'B') {
			System.out.println("Good");
		}
		else if(alpha == 'C') {
			System.out.println("Usually");
		}
		else if(alpha == 'D') {
			System.out.println("Effort");
		}
		else if(alpha == 'F') {
			System.out.println("Failure");
		}
		
	}

}
