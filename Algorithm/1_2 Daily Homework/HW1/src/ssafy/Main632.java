package ssafy;

import java.util.Scanner;

public class Main632 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		int min = n1 > n2 ? n2 : n1;
		min = min > n3 ? n3 : min;
		
		System.out.println(min);
	}

}
