package ssafy;

import java.util.Scanner;

public class Main539 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int cnt = 0;
		
		while(true){
			Scanner scan = new Scanner(System.in);
			int in = scan.nextInt();

			cnt ++;
			sum += in;
			if (in >= 100)
				break;
		}
		double avg = sum / (double)cnt;
		System.out.println(sum);
		System.out.println(Math.round(avg*10)/10.0);
	}

}
