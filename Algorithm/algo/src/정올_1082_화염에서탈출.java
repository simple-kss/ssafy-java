import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class 정올_1082_화염에서탈출 {
	static int R;
	static int C;
	
	static int[][] dir = {
			{-1, 0}, // 북
			{ 0, 1}, // 동
			{ 1, 0}, // 남
			{ 0,-1}  // 서
	};
	
	public static void main(String[] args) throws IOException {
		System.out.println(" ");
		
		// 큐 2개생성
		// bfs로 불 먼저 지피고
		// S가 D를 찾기위해 bfs
		ArrayDeque<Poi> fq = new ArrayDeque<Poi>();
		ArrayDeque<Poi> sq = new ArrayDeque<Poi>();
		
		// S가 D를 찾으면 끝남
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		
		R = Integer.parseInt(stk.nextToken());
		C = Integer.parseInt(stk.nextToken());
		char[][] map = new char[R+2][C+2];
		int[][] visited = new int[R+2][C+2];
		
		Poi F = null;
		Poi D = null;
		Poi S = null;
		
		for(int i = 1; i <= R; i++) {
			String s = br.readLine();
			int cnt = 0;
			for(int j = 1; j <= C; j++) {
				map[i][j] = s.charAt(cnt++);
				if(map[i][j] == '*') {
					fq.add(new Poi(i,j,0));
				}
				else if(map[i][j] == 'S') {
					S = new Poi(i,j,0);
				}
				else if(map[i][j] == 'D') {
					D = new Poi(i,j,0);
				}
			}
		} // 입력 끝
		
		// bfs로 *부터 하고
		// 처음 *가 갈수 있는대를 다 지펴버리자
		
		// --- 초기설정부분!
//		for(int i = 0; i < 4; i++) {
//			int tR = F.r + dir[i][0];
//			int tC = F.c + dir[i][1];
//			if(map[tR][tC] == '.') {
//				fq.add(new Poi(tR, tC, 0));
//				visited[tR][tC] = 2; // fire
//				map[tR][tC] = '*';
//			}
//		}
		
		for(int i = 0; i < 4; i++) {
			int tR = S.r + dir[i][0];
			int tC = S.c + dir[i][1];
			if(map[tR][tC] == '.') {
				sq.add(new Poi(tR, tC, 1));
				visited[tR][tC] = 1; // person
			}
		}
		
		boolean isGoOut = false;
		int step = 0;
		
		// 비어있지 않을떄까지 무한반복!!
loop:	while(!sq.isEmpty()) {

			
			// 하나꺼내서 갈수있으면 간다.
			Poi root = sq.poll();
			
			// 자기 위치가 불이 아닐떄만 자기 주변에 담는다.
			if(map[root.r][root.c] != '*' ) {
				for(int i = 0; i < 4; i++) {
					int tR = root.r + dir[i][0];
					int tC = root.c + dir[i][1];
					if(map[tR][tC] == '.' && visited[tR][tC] != 1) {
						sq.add(new Poi(tR, tC, root.val + 1));
						visited[tR][tC] = 1; // person
					}
					if(tR == D.r && tC == D.c) {
						step = root.val + 1;
						isGoOut = true;
						break loop;
					}
				}
			}
			
			// 불하나 꺼내서서 퍼뜨린다.
			Poi fir = fq.poll();
			
			for(int i = 0; i < 4; i++) {
				int tR = fir.r + dir[i][0];
				int tC = fir.c + dir[i][1];
				if(map[tR][tC] == '.' && visited[tR][tC] != 2) {
					fq.add(new Poi(tR, tC, 0));
					visited[tR][tC] = 2; // fire
					map[tR][tC] = '*';
				}
			}
		}
		
		// 그리고 S가 D를 찾을때까지
		if(!isGoOut) {
			System.out.println("impossible");
		}
		else {
			System.out.println(step);
		}
		

		

	} // end of main

	
	
	
} // end of class

class Poi {
	int r;
	int c;
	int val;
	
	public Poi(int r, int c, int val) {
		super();
		this.r = r;
		this.c = c;
		this.val = val;
	}
	
	public Poi() {
		super();
		// TODO Auto-generated constructor stub
	}
}
