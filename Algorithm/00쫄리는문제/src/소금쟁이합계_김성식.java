import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Point {
	int r;
	int c;
	int val;
	
	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Point(int r, int c, int val) {
		super();
		this.r = r;
		this.c = c;
		this.val = val;
	}
}

public class 소금쟁이합계_김성식 {
	static int[][] dir = {
		{0 , 0},
		{-1, 0}, //상
		{ 1, 0}, //하
		{ 0,-1}, //좌
		{ 0, 1}	 //우
	};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int t = 1; t <= tc; t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(stk.nextToken()); // N / N행렬
			int cnt = Integer.parseInt(stk.nextToken()); // 소금쟁이 마리
			Point[] sArr = new Point[cnt];
			int map[][] = new int[N+6][N+6]; // 3부터  N+2까지
			
			for(int i = 0; i < N+6; i++) {
				map[i][0] = 9;
				map[i][1] = 9;
				map[i][2] = 9;
				
				map[i][N+3] = 9;
				map[i][N+4] = 9;
				map[i][N+5] = 9;
				
				map[0][i] = 9;
				map[1][i] = 9;
				map[2][i] = 9;
				
				map[N+3][i] = 9;
				map[N+4][i] = 9;
				map[N+5][i] = 9;
			}
			
			// 소금쟁이 다 넣기
			for(int i = 0; i < cnt; i++) {
				stk = new StringTokenizer(br.readLine(), " ");
				int r = Integer.parseInt(stk.nextToken()) + 3; // r
				int c = Integer.parseInt(stk.nextToken()) + 3; // c
				int dir = Integer.parseInt(stk.nextToken()); // 방향
				sArr[i] = new Point(r, c, dir);
				map[r][c] = 9;
			}
			
			// 각 소금쟁이마다 뛰기
			int result = cnt;
			for(int i = 0; i < cnt; i++) {
				// 3, 2, 1칸 뛰기
				for(int j = 3; j >= 1; j--) {
					int r = sArr[i].r + dir[sArr[i].val][0] * j;
					int c = sArr[i].c + dir[sArr[i].val][1] * j;
					
					// 일단 뛴다.
					map[sArr[i].r][sArr[i].c] = 0;
					
					// 죽음.
					if(map[r][c] == 9) {
						result--; // 최종 마리
						break;
					}
					// 뛸 수 있다면 갱신
					else {
						sArr[i].r = r;
						sArr[i].c = c;
						map[r][c] = 9;
					}
					
				} // end of for
				
				
			} // end of for

			
			
			
			

		
			
			sb.append('#').append(t).append(' ').append(result).append('\n');
		}
		System.out.println(sb);

	} // end of main
} // end of class

//시간지체했던 이유
//
//반복문에서 i가 i < cnt 조건을 충족시킬때 까지 반복하는데
//원래 입력받은 소금쟁이 갯수 cnt를 줄이면 이 반복문 조건이 흐트러질 수 있음
//그래서 result에 cnt를 대입 후 result를 --하는 방향으로 했어야 했음