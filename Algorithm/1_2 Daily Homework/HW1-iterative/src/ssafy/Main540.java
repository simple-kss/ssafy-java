package ssafy;

import java.util.Scanner;

public class Main540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner scan = new Scanner(System.in);
			int in = scan.nextInt();
			
			if(in == -1)
				break;
			
			if(in % 3 == 0)
				System.out.println(in / 3);
			
		}
			

	}

}
