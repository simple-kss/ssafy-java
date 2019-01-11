package ssafy;

import java.util.Scanner;

public class Main543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i = 2; i <= num; i+=2)
			System.out.print(i + " ");
	}

}
