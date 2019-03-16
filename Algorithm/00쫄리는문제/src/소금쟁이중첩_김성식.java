import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Poin {
	int r;
	int c;
	int val;
	
	public Poin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Poin(int r, int c, int val) {
		super();
		this.r = r;
		this.c = c;
		this.val = val;
	}
}

public class 소금쟁이중첩_김성식 {
	static int[][] dir = {
		{ 0, 0},
		{ 1, 0}, //하
		{ 0, 1}, //우
	};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int t = 1; t <= tc; t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(stk.nextToken()); // N / N행렬
			int ct = Integer.parseInt(stk.nextToken()); // 소금쟁이 마리 수 입력
			int cnt = 0; // 소금쟁이의 실제 마리
			Poin[] sArr = new Poin[ct];
			int map[][] = new int[N+6][N+6]; // 3부터  N+2까지
			int jumpPos[][] = new int[N+6][N+6]; // jumpPos // 뛰었는지 안뛰었는지 확인
			
			for(int i = 0; i < N+6; i++) {
				map[i][0] = 5;
				map[i][1] = 5;
				map[i][2] = 5;
				
				map[i][N+3] = 5;
				map[i][N+4] = 5;
				map[i][N+5] = 5;
				
				map[0][i] = 5;
				map[1][i] = 5;
				map[2][i] = 5;
				
				map[N+3][i] = 5;
				map[N+4][i] = 5;
				map[N+5][i] = 5;
			}
			
			// 소금쟁이 다 넣기
			for(int i = 0; i < ct; i++) {
				stk = new StringTokenizer(br.readLine(), " ");
				int r = Integer.parseInt(stk.nextToken()) + 3; // r
				int c = Integer.parseInt(stk.nextToken()) + 3; // c
				int dir = Integer.parseInt(stk.nextToken()); // 방향
				
				// 이미 있는 곳이라면 그 소금쟁이는 죽는다.
				if(map[r][c] == 9) continue;
				
				
				sArr[cnt] = new Poin(r, c, dir);
				cnt++;
				map[r][c] = 9;
			}
			
			// 각 소금쟁이마다 뛰기
			int result = 0; // 소금쟁이 번호
loop:		for(int i = 0; i < cnt; i++) {
				// 3, 2, 1칸 뛰기
				for(int j = 3; j >= 1; j--) {
					int r = sArr[i].r + dir[sArr[i].val][0] * j;
					int c = sArr[i].c + dir[sArr[i].val][1] * j;
					
					// 뛰려하는 위치가 밖이면
					// 아무것도하지않고 그냥 다음소금쟁이
					if(map[r][c] == 5) {
						// 다음 소금쟁이로 select한다.
						break;
					}
					// 그게 아니면
					else {
						// 뛴다 (갱신)
						// 뛰는 부분을 1로 만든다.
//						System.out.println("123");
						// 현재 이미 뛰었었더라면 반복문 나가고, 그 소금쟁이 번호 출력
						if(jumpPos[sArr[i].r][sArr[i].c] == 1) {
							result = i+1;
							break loop; 
						}
						jumpPos[sArr[i].r][sArr[i].c] = 1;
						
						// 이동하는 부분
						map[sArr[i].r][sArr[i].c] = 0;
						sArr[i].r = r;
						sArr[i].c = c;
						map[r][c] = 9; // 그 소금쟁이 이동
					}
					
				} // end of for
				
			} // end of for
		
			
			sb.append('#').append(t).append(' ').append(result).append('\n');
		}
		System.out.println(sb);
		

	} // end of main
} // end of class


//시간지체했던 이유
//문제를 꼼꼼히 읽지 않았음 
//방향이 하, 우 밖에 없었었음



