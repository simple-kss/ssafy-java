package ssafy;

import java.util.Scanner;

public class Main531 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double weight = scan.nextDouble();
		
		if (weight <= 50.8)
			System.out.println("Flyweight");
		else if(weight <= 61.23)
			System.out.println("Lightweight");
		else if(weight <= 72.57)
			System.out.println("Middleweight");
		else if(weight <= 88.45)
			System.out.println("Cruiserweight");
		else
			System.out.println("Heavyweight");
	}

}
