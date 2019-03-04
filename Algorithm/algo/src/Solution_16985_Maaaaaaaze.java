import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_16985_Maaaaaaaze {
	public static void main(String[] args) throws IOException {
		System.out.println(" ");
		// 행, 열, 높이
		int map[][][] =new int[5][5][5];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int z = 0; z < 5; z++) {
			for (int i = 0; i < 5; i++) {
				StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
				map[i][0][z] = Integer.parseInt(stk.nextToken());
				map[i][1][z] = Integer.parseInt(stk.nextToken());
				map[i][2][z] = Integer.parseInt(stk.nextToken());
				map[i][3][z] = Integer.parseInt(stk.nextToken());
				map[i][4][z] = Integer.parseInt(stk.nextToken());
			}
		}
		
/*		for (int z = 0; z < 5; z++) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(map[i][j][z]);
				}
				System.out.println();
			}
		}*/
		
		
		
		
		
		
		

	} // end of main
} // end of class