import java.util.Scanner;

public class solution11 {
	static char[][] arr = new char[20][20];
	static int input;
	
	static boolean isValid(int i, int j) {
		return !(i < 0 || j < 0 || i >= input || j >= input); 
	}
	
	static int countRight(int r, int c) {
		// 우    세기
		// 우측 끝까지 세는데
		// S가 아닐때 까지 센다
		int count = 0;
		for (int j = c + 1; j < input; j++) {
			if(arr[r][j] == 'S')
				count++;
			else
				break;
		}
		return count;
		
	}
	static int countLeft(int r, int c) {
		// 좌    세기
		int count = 0;
		for (int j = c - 1; j >= 0; j--) {
			if(arr[r][j] == 'S')
				count++;
			else
				break;
		}
		return count;
	}
	static int countUnder(int r, int c) {

		// 하 세기
		// 좌    세기
		int count = 0;
		for (int i = r + 1; i < input; i++) {
			if(arr[i][c] == 'S')
				count++;
			else
				break;
		}
		return count;
	}
	static int countUpper(int r, int c) {
		// 상 세기
		int count = 0;
		for (int i = r - 1; i >= 0; i--) {
			if(arr[i][c] == 'S')
				count++;
			else
				break;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int t_case = scan.nextInt();
		
		while(t_case-- >= 0) {
			input = scan.nextInt();
			for (int i = 0; i < input; i++) {
				for (int j = 0; j < input; j++) {
					char c = scan.next().charAt(0);
					arr[i][j] = c;
				}			
			}
			
			int sum = 0;

			
			for (int i = 0; i < input; i++) {
				for (int j = 0; j < input; j++) {
					if( arr[i][j] == 'A') {
						sum += countRight(i, j);
					}
					else if( arr[i][j] == 'C') {
						sum += countRight(i, j);
						sum += countLeft(i, j);
						sum += countUnder(i, j);
						sum += countUpper(i, j);
					}
					else if( arr[i][j] == 'B') {
						int temp = 0;
						sum += countRight(i, j);
						sum += countLeft(i, j);
					}
				}			
			}
			
			System.out.println("#" + (3 - t_case) + " " + sum);
		}
	}
}
