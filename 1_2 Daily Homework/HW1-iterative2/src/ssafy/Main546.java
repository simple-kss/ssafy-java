package ssafy;

import java.util.Scanner;

public class Main546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < in; i++) {
			int score = scan.nextInt();
			sum += score;
		}
		avg = sum / (double)in;
		System.out.println("avg : " + avg);
		if (avg >= 80)
			System.out.println("pass");
		else
			System.out.println("fail");
		
	}

}
