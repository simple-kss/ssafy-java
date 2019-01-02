package ssafy;

import java.util.Scanner;

public class Main530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		
		if( in >= 20)
			System.out.println("adult");
		else
			System.out.println(20 - in + " years later");
	}

}
