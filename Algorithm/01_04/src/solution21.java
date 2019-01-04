import java.util.Scanner;

// 소금쟁이 클래스
class Animal {
	int r;
	int c;
	int dir;
	boolean state = true;
}


public class solution21 {
	
	static int N; // 연못의 크기
	static int num;
	static int[][] map;

	static int[][] d = {
			{ 0, 0},
			{ 1, 0}, // 하
			{ 0, 1}	// 우
	};
	
	static boolean isValid(int r, int c) {
		return !(r < 0 || r >= N || c < 0 || c >= N);
	}
	
	// cnt만큼 dir방향으로 점프하기
	static boolean jump(int num, Animal an, int cnt) {
		
		int jR = an.r + d[an.dir][0] * cnt;
		int jC = an.c + d[an.dir][1] * cnt;
		// 범위 밖이어도 false
		if(!isValid(jR,jC)) {
			// 밖이면 이동하지 않는다.
			return true;
		}
		// 뛰는 자리에 있다면 false
		if(map[jR][jC] == 1) {
			return false;
		}
		// 그게아니라면 점프!
		else {
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
			
			Animal[] animal = new Animal[num];
			for(int i = 0; i < num; i++) {
				animal[i] = new Animal();
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
xx:			for (int i = 0; i < num; i++) {
				// 이미 죽은애면 continue
				if(animal[i].state == false)
					continue;
				// 뛰기
				// 3번 뛴다 3,2,1칸씩
				for (int j = 3; j >= 1; j--) {
					
					boolean check = jump(i+1, animal[i], j);
					
					//		--------------------
							for(int zi = 0; zi < N; zi++) {
								for(int zj = 0; zj < N; zj++) {
									System.out.printf("%d ", map[zi][zj]);
								}
								System.out.println("");
							}
							System.out.println("");
					//		-------------------

					// 같은 자리에 뛰었다면
					if(!check) {
						System.out.printf("#%d %d\n",t+1,i+1);
						break xx;
					}				
				}
				
				if( i == num - 1)
					System.out.printf("#%d %d\n",t+1,0);
			}
			
		} // end of test for
	} // end of main

}
