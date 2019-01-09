import java.util.Scanner;

// 소금쟁이 클래스
class Point {
	int r;
	int c;
	int dir;
	boolean state = true;
}


public class solution22 {
	
	static int N; // 연못의 크기
	static int num;
	static int[][] map;

	static int[][] d = {
			{ 0, 0},
			{-1, 0}, // 상
			{ 1, 0}, // 하
			{ 0,-1},	// 좌
			{ 0, 1}	// 우
			};
	
	static boolean isValid(int r, int c) {
		return !(r < 0 || r >= N || c < 0 || c >= N);
	}
	
	// cnt만큼 dir방향으로 점프하기
	static boolean jump(Point an, int cnt) {
		
		int jR = an.r + d[an.dir][0] * cnt;
		int jC = an.c + d[an.dir][1] * cnt;
		map[an.r][an.c] = 0;
		// 범위 밖이어도 false
		if(!isValid(jR,jC)) {
			return false;
		}
		// 뛰는 자리에 있다면 false
		if(map[jR][jC] == 1) {
			return false;
		}
		else {
			map[an.r][an.c] = 0;
			an.r = jR;
			an.c = jC;
			map[jR][jC] = 1;
			return true;
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t_case = scan.nextInt(); 
		for(int t = 0; t < t_case; t++) {
			
			N = scan.nextInt();
			num = scan.nextInt();
			int alive = num;
			
			map = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = 0;
				}			
			}
			
			Point[] animal = new Point[num];
			for(int i = 0; i < num; i++) {
				animal[i] = new Point();
			}
			
			for(int i = 0; i < num; i++) {
				int r = animal[i].r = scan.nextInt();
				int c = animal[i].c = scan.nextInt();
				animal[i].dir = scan.nextInt(); // 방향
				
				// 이미 있다면
				if(map[r][c] == 1) {
					alive--;
					animal[i].state = false;
				}
				map[r][c] = 1;			
			}
			
			// 먼저 모든 소금쟁이 수 만큼 순회
			for (int i = 0; i < num; i++) {
				// 이미 죽은애면 continue
				if(animal[i].state == false)
					continue;
				// 뛰기
				// 3번 뛴다 3,2,1칸씩
				for (int j = 3; j >= 1; j--) {
					
					boolean check = jump(animal[i], j);

					// 만약 충돌해서 죽었따면
					if(!check) {
						alive--;
						break; // 더이상 움직일 필요 없다.
					}				
				}
			}
			System.out.printf("#%d %d\n",t+1,alive);		
			// 중간에 벗어나면 죽 (num --)		
		}
	}

}
