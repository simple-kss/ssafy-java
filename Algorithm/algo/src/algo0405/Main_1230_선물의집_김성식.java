
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1230_선물의집_김성식 {
	
	static int N;
	static int [][] map;
	static boolean [][]check;
	static int[][] dir = {
		{ 0,  1},
		{ 0, -1},
		{ 1,  0},
		{-1,  0}
	};
	
	static int result;
	
	static void dfs(int r, int c, int cnt) {
		// 끝좌표 도달했다면
		if(r == N && c == N) {
			if(result < cnt)
				result = cnt;
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			int tr = r + dir[i][0];
			int tc = c + dir[i][1];
			
			// 방문했고 벽이면 지나친다.
			if(check[tr][tc] || map[tr][tc] == 1)
				continue;
			
			check[tr][tc] = true;
			if(map[tr][tc] == 2) 
				dfs(tr,tc,cnt+1);
			else
				dfs(tr,tc,cnt);
			
			check[tr][tc] = false;
		}
		
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine().trim());
		map = new int[N+2][N+2];
		check = new boolean[N+2][N+2];
		
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < N+2; i++) {
			map[i][0] 	= 1;
			map[i][N+1] = 1;
			map[0][i] 	= 1;
			map[N+1][i] = 1;
		}
		
		
		check[1][1] = true;
		
		result = 0;
		if(map[1][1] == 2)
			dfs(1,1,1);
		else
			dfs(1,1,0);
		
		System.out.println(result);
	}
}
