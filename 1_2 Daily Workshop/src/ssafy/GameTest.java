package ssafy;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int comWins = 0;
		int humWins = 0;
		int maxWins = 0;
		int in;
		
		System.out.println(">>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		System.out.print("번호를 입력하세요. ");
		in = scan.nextInt();
		scan.nextLine();
		
		if (in == 1) {
			maxWins = 3;
		}
		else if (in == 2) {
			maxWins = 2;
		}
		else if (in == 3) {
			maxWins = 1;
		}
		else {
			System.out.println("잘못된 번호입니다.");
			System.exit(0);
		}
		
		// 
		while(true) {
			if (comWins == maxWins || humWins == maxWins) {
				if(comWins == maxWins)
					System.out.println("### 컴퓨터 승!!!");
				else
					System.out.println("### 사람 승!!!");
				break;
			}
			// 가위바위보를 랜덤으로 발생시키게 함.
			int comData = (int) (Math.random() * 3) + 1;
			
			System.out.print("가위바위보 중 하나 입력 : ");
			String str = scan.nextLine();
			int humData = -999; // 가위 = 1, 바위 = 2, 보 = 3
			
			
			// 문자를 정수로 바꾸는 구분
			if ( str.equals("가위")) {
				humData = 1;
			}
			else if (str.equals("바위") ) {
				humData = 2;
			}
			else if (str.equals("보")) {
				humData = 3;
			}
			
			// 승패를 구분 짓는 구분
			if (humData - comData == 1 || humData - comData == -2) {
				humWins++; // 인간 승
			}
			else if ( comData - humData == 1 || comData- humData == -2) {
				comWins++; // 컴퓨터 승
			}
			
			// 결과 출력
			// System.out.println(" 컴퓨터 데이터 : " + comData + ", 인간 데이터 " + humData );
		}
	}
}
