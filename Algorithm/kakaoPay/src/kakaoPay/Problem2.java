package kakaoPay;

public class Problem2 {

	static int N = 250;
	static int[][] map = new int[N][N];
	static int robotR = N / 2;
	static int robotC = N / 2;
	public static void main(String[] args) {
		map = new int[N][N];
		// 4행 2열에 로봇
		
//		char[] moves = {'U', 'R', 'D', 'L', 'U', 'R', 'D', 'L'};
		char[] moves = {'U', 'U', 'R', 'D', 'L', 'L', 'L', 'U', 'R', 'D', 'D', 'D', 'L', 'U', 'R', 'R', 'R', 'D', 'L', 'U'};
		
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < N; j++) {
//				System.out.print(map[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
		
		for (char c : moves) {
			switch(c) {
			case 'U':
				map[robotR-1][robotC] = 1;
				robotR -= 2;
				break;				
			case 'R':
				map[robotR][robotC+1] = 1;
				robotC += 2;
				break;				
			case 'D':
				map[robotR+1][robotC] = 1;
				robotR += 2;
				break;
			case 'L':
				map[robotR][robotC-1] = 1;
				robotC -= 2;
				break;
			}
		}
		
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < N; j++) {
//				System.out.print(map[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
		int sum = 0;
		for(int i = 2; i < N-1; i+= 2) {
			for(int j = 2; j < N-1; j+=2) {
				// 자 이제 사방이 1인지 확인해보면된다.
				// <최적화할수 있는 부분> : 다 탐색 안해도됨
				if(check(i, j)) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	} // end of main
	
	public static boolean check(int i, int j) {
		if( map[i+1][j] == 1 && map[i-1][j] == 1 && map[i][j+1] == 1 && map[i][j-1] == 1)
			return true;
		return false;		
	}
} // end of class
