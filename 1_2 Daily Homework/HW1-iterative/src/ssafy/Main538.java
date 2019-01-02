package ssafy;

import java.util.Scanner;

public class Main538 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.print("number? ");
			Scanner scan = new Scanner(System.in);
			int in = scan.nextInt();
			
			if(in == 0)
				break;
			
			if ( in > 0 )
				System.out.println("positive integer");
			else
				System.out.println("negative number");	
		}
	}

}
