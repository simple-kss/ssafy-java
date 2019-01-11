package ssafy;

import java.util.Scanner;

public class Main633 {

	public static void main(String[] args) {
		while(true) {
			// TODO Auto-generated method stub
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");
			Scanner scan = new Scanner(System.in);
			int in = scan.nextInt();
			
			if( in == 1)
				System.out.println("Seoul");
			else if(in == 2)
				System.out.println("Washington");
			else if(in == 3)
				System.out.println("Tokyo");
			else if(in == 4)
				System.out.println("Beijing");
			else {
				System.out.println("none");
				break;
			}
		}

	}

}
