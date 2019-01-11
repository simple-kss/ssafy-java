package ssafy;

import java.util.Scanner;

public class Main529 {
	public static void main(String[] args) {
		int weight;
		int tall;
		int result;
		Scanner scan = new Scanner(System.in);
		tall = scan.nextInt();
		weight = scan.nextInt();
		
		result = weight + 100 - tall;
		System.out.println(result);
		if(result > 0 )
			System.out.println("Obesity");
	}
}
