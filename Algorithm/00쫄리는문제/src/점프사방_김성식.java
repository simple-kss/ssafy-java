import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 참가자
class Person {
	int r;
	int c;
	int count;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int r, int c, int count) {
		super();
		this.r = r;
		this.c = c;
		this.count = count;
	}
}



public class 점프사방_김성식 {
	static int[][] dir = {
			{ 0, 0},
			{ 0, 1}, // 동
			{ 1, 0}, // 남
			{ 0,-1}, // 서
			{-1, 0} // 북
	};
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int t = 1; t <= tc; t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			
			// 변수 선언 부
			int total = 0; // 토탈금액
			
			int R = Integer.parseInt(stk.nextToken()); // 행
			int C = Integer.parseInt(stk.nextToken()); // 렬
			int partN = Integer.parseInt(stk.nextToken()); // 참가자 숫자
			Person[] pArr = new Person[partN];
			int[][] map = new int[R+1][C+1];
			int trapN = 0;
			
			total = partN * -1000;
			
			for(int i = 1; i <= R; i++ ) {
				stk = new StringTokenizer(br.readLine(), " ");
				for(int j = 1; j <= C; j++ ) {
					map[i][j] = Integer.parseInt(stk.nextToken());
				}
			} // end of for
			
			for(int i = 0; i < partN; i++) {
				stk = new StringTokenizer(br.readLine(), " ");
				pArr[i] = new Person();
				pArr[i].r = Integer.parseInt(stk.nextToken());
				pArr[i].c = Integer.parseInt(stk.nextToken());
				pArr[i].count = Integer.parseInt(stk.nextToken());
			}
			
			stk = new StringTokenizer(br.readLine(), " ");
			trapN =  Integer.parseInt(stk.nextToken());
			for(int i = 0; i < trapN; i++) {
				int r = Integer.parseInt(stk.nextToken());
				int c = Integer.parseInt(stk.nextToken());
				map[r][c] = 99; // 함정 99
			}
			
			// 입력은 다받았음
			// 참가자 수만큼 반복
			for (int i = 0; i < partN; i++) {
				boolean check = true;
				int sum = 0;
				// 이동 횟수만큼 반복
				for(int k = 0; k < pArr[i].count; k ++) {
					// 요소를 뽑을 거임
					// 방향, 칸수
					int pr = pArr[i].r;
					int pc = pArr[i].c;
					int d = map[pr][pc] / 10;   // 방향
					int size = map[pr][pc] % 10;  // 칸수
					
					// 그 방향과 칸수 만큼 건너 뛰자!
					int r = pr + dir[d][0] * size;
					int c = pc + dir[d][1] * size;
					
					// 뛸 수 있으면 뙤자!
					if( isValid(r, c, R, C, map) ) {
						pArr[i].r = r;
						pArr[i].c = c;
					}
					else {
						// 못뛰는 구역이면
						// 끝
						check = false;
						break;
					}
				} // end of for 1
				if(check) sum += map[pArr[i].r][pArr[i].c] * 100;
				total += sum;
			} // end of for 2

			
			
			
			sb.append('#').append(t)
			.append(' ').append(total).append('\n');
		}
		System.out.println(sb);
		
		
		
		
	} // end of main


	private static boolean isValid(int r, int c, int R, int C, int[][] map) {
		// TODO Auto-generated method stub
		return r >= 1 && r <= R && c >= 1 && c <= C && map[r][c] != 99;
	}
} // end of class

// 1~R 까지 범위했으면
// valid함수도 바꿔야한다.
