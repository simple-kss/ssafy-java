import java.util.Scanner;

public class Solution_5432_쇠막대기자르기_김성식 {

	public static void main(String[] args) {
		// 입력부
		Scanner scan = new Scanner(System.in); 
		int test_case = scan.nextInt();
		
		for(int t = 1; t <= test_case; t++) {
			String inStr = scan.next();
			
			// ()를 레이저로 바꾸장
			inStr = inStr.replace("()","R");
			
			// 자 이제 돌면서
	//		'C'를 만나면 C를 세는 Ccnt++
	//		')'를 만나면 sum++후 Ccnt--
	//		R만나면 sum += Ccnt
			
			int len = inStr.length();
			int Ccnt = 0;
			int sum = 0;
			for (int i = 0; i < len; i++) {
				if ( inStr.charAt(i) == '(') {
					Ccnt++;				
				}
				else if ( inStr.charAt(i) == ')') {
					sum++;
					Ccnt--;				
				}
				else if ( inStr.charAt(i) == 'R') {
					sum+=Ccnt;				
				}			
			}
			System.out.printf("#%d %d\n",t,sum);			
		}	
	}
}
