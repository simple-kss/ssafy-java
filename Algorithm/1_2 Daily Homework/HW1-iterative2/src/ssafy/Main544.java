package ssafy;

import java.util.Scanner;

public class Main544 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		for(int i = num ; i <= 100; i++ ) {
			sum += i;
		}
		System.out.print(sum);

	}

}
