import java.util.Scanner;

/**
 * 문제 33 사방
 *  [제한조건] 
⦁	X와 Y은 자연수 3~20 의 값이다.
⦁	참가자 N은 1~5사이값이다.
⦁	숫자판에 숫자가 없고 색칠된 부분은 함정이다.(0으로 표시)
⦁	점프 시 함정에 빠지거나 경계를 벗어나면 상금을 받기 못한다. 참가비 1000을 내고 상금을 받지 못하면 -1000이 더해진다.
⦁	참가자에게 주어지는 점프 횟수는 1~100 사이 값이다.
[입력]
⦁	첫 줄에는 테스트 케이스 T가 주어진다.
⦁	두 번째 줄에는 배열의 크기인 Y, X,  참가자 수(N)이 주어진다.
⦁	세 번째 줄부터는 X*Y의 숫자판 정보가 주어진다.
⦁	그 다음부터는 참가자의 시작위치 행, 열, 횟수가 참가자 수만큼 주어진다.
⦁	그 다음엔 함정 수, 함정의 좌표 * 수로 주어진다.
⦁	다음 테스트 케이스가 반복적으로 주어진다.
[출력]
각 줄은 #Ti(테스트케이스 번호) 공백을 하나 둔 다음 테스트 케이스 내 참가자들의 상금 합계를 출력한다.

 *
 *
 *
6 6 2
34 42 22 32 21 24
22 32 21 33 33 33
13 11 12 21 43 13
34 23 22 24 32 11
22 24 21 41 41 42
31 42 34 32 15 32
2 3 2
2 6 6
3 3 4 4 2 6 5

 */

class Ele {
	int dir;
	int jNum;
}

class Player {
	int r;
	int c;
	int cnt;
}


public class solution32 {
	
	static Ele[][] map;
	static int R;
	static int C;
	static int dir[][] = {
			// 동남서북
			{ 0, 0},
			{ 0, 1},
			{ 1, 0},
			{ 0,-1},
			{-1, 0}
	};
	
	static boolean isValid(int r, int c) {
		return !(r <= 0 || r >= R+1 || c <= 0 || c >= C+1);
	}
	
	static boolean jump(Player p) {
		// 점프횟수만큼 점프할거임
		for(int i = 0; i < p.cnt; i++) {
			// 점프
			// 맵에 해당하는 방향만큼 이동
			int r_jump = dir[ map[p.r][p.c].dir ][0] * map[p.r][p.c].jNum;
			int c_jump = dir[ map[p.r][p.c].dir ][1] * map[p.r][p.c].jNum;
			p.r = p.r + r_jump;			
			p.c = p.c + c_jump;
			// 범위 밖이라면 이상한 데로 점프한 것이므로 false
			// 함정으로 점프했다면 그것은 실패! -> false
			if( !isValid(p.r, p.c) ) return false;
			if( map[p.r][p.c].jNum == -1) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
	
		
		
		// -------------- 입력부
		R = scan.nextInt();
		C = scan.nextInt();
		int pnum = scan.nextInt(); // 플레이어 수
		int tnum; // 함정 수
		
		int total = -1000 * pnum;
		
		map = new Ele[R+1][C+1];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = new Ele();
			}
		}
		
		Player[] P = new Player[pnum];
		for(int i = 0; i < pnum; i++) {
			P[i] = new Player();
		}
		
		for (int i = 1; i <= R; i++) {
			for (int j = 1; j <= C; j++) {
				int input = scan.nextInt();
				map[i][j].dir = input / 10;
				map[i][j].jNum = input % 10;
			}			
		}
		
		for (int i = 0; i < pnum; i++) {
			P[i].r = scan.nextInt();
			P[i].c = scan.nextInt();
			P[i].cnt = scan.nextInt();
		}
		
		tnum = scan.nextInt();
		
		// 함정 입력 받기
		for (int i = 0; i < tnum; i++) {
			int r = scan.nextInt();
			int c = scan.nextInt();
			map[r][c].jNum = -1; 
		}
		
		// ----------------------- 입력부 끝
		
		// 출력 해보기
//		System.out.printf("%d %d %d \n",R,C,pnum);
//		for (int i = 1; i <= R; i++) {
//			for (int j = 1; j <= C; j++) {
//				System.out.printf("%d%d ", map[i][j].dir,map[i][j].jNum);
//			}
//			System.out.println("");			
//		}
//		for ( int i = 0; i < pnum ; i++) {
//			System.out.printf("%d %d %d\n",P[i].r, P[i].c, P[i].cnt);
//		}
//		System.out.printf("%d", tnum);
//		for (int i = 1; i <= R; i++) {
//			for (int j = 1; j <= C; j++) {
//				if(map[i][j].jNum == -1)
//					System.out.printf("%d %d\n", i, j);
//			}		
//		}
		
		for(int i = 0; i < pnum; i++) {
			// 다 점프를 했다면
			if ( jump(P[i]) ) {
				Ele e = map[ P[i].r ][ P[i].c ];
				// 점수계산하는 중
				int num = (e.dir * 10 + e.jNum) * 100;
				total += num; 				
			}
		}
		
		System.out.printf("total : %d \n",total);
	}
}
