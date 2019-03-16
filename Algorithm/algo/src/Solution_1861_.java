import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Node {
	int r;
	int c;
	int val;
	int level;
	
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Node(int r, int c, int val, int level) {
		super();
		this.r = r;
		this.c = c;
		this.val = val;
		this.level = level;
	}
}

public class Solution_1861_ {
	static int dir[][] = {
			{-1, 0},
			{ 0, 1},
			{ 1, 0},
			{ 0,-1}
	};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Node> li = new LinkedList<Node>();
		ArrayList<Node> ai = new ArrayList<Node>();
		
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int t = 1 ; t <= tc ; t++ ) {
			int N = Integer.parseInt(br.readLine()); // N/N행렬
			int[][] map = new int[N+2][N+2];
			
			// 다 -1로 초기화
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = -1;
				}
			}
			
			
			for(int i = 1; i <= N; i++) {
				StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
				for(int j = 1; j <= N; j++) {
					map[i][j] = Integer.parseInt(stk.nextToken());
				}
			} // end of for
			

			// 가장큰수만 찍히게!
			
			// 삽입 정렬 이용
			// 초기 설정
			if(map[1][1] > map[1][2]) {
				ai.add(new Node(1, 2, map[1][2], 1));
				ai.add(new Node(1, 1, map[1][1], 1));
			}
			else {
				ai.add(new Node(1, 1, map[1][1], 1));
				ai.add(new Node(1, 2, map[1][2], 1));
			}
			
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					int size = ai.size();
					//그 사이즈만큼 돌아서 삽입한다.
				
					int cnt = 0;
					for(int z = 0; z < size; z++) {
						if(ai.get(z).val < map[i][j] && ai.get(z+1).val > map[i][j]) {
							ai.add(z+1, new Node(i, j, map[i][j], 1)); // 안에 넣기 !
							cnt ++;
							break;
						}
						else {
							// 다 만족하지 않는다면 젤 작은 것이거나 젤 큰것임
							if(map[i][j] < ai.get(0).val) {
								ai.add(0, new Node(i, j, map[i][j], 1));
								break;
							}
							else if(map[i][j] > ai.get(size - 1).val) {
								ai.add(size, new Node(i, j, map[i][j], 1));
								break;
							}
							//break;
						}
					}
					
//					br.readLine();
//					System.out.println("----------------");
//					for (int i1 = 0; i1 < ai.size(); i1++) {
//						System.out.print(ai.get(i1).val + " ");
//					}
//					System.out.println("----------------" + cnt);
					
					
				}
				
			} // end of for N
			
			
			
			int max = Integer.MIN_VALUE;
			
			// 가정 - 1,2,3,4,5,... 이렇게 순서대로 들어간다는 가정!!!!!!!!!!
			
			
			// 처음 하나는 무조건 
			int len = ai.size();
			
			for(int i = 0; i < len; i++) {
				// 값이 1차이 난다면
				// 사방에 나보다 1보다 작은 val이 있따면
				// 그 val의 level ++
				boolean check = false;
				for(int j = 0; j < 4; j++ ) {
					int r = ai.get(i).r + dir[j][0];
					int c = ai.get(i).c + dir[j][1];
					int level = ai.get(i).level;
					// 사방에 자기보다 1보다 큰 값이 있다면
					if(map[r][c] == ai.get(i).val - 1) {
//						System.out.println(ai.get(i).val + " " + map[r][c] + "-----");
						Node n = ai.get(i);
//						System.out.println("이전노드값 : " + ai.get(i).level);
						n.level = ai.get(i-1).level + 1;
//						System.out.println("Node값 비교 : " + ai.get(i).level + " " + n.level);
						check = true;
//						System.out.println();
					}
				}

			}
			
//			for (int i1 = 0; i1 < ai.size(); i1++) {
//				System.out.println(ai.get(i1).val + " : " + ai.get(i1).level + " ) ");
//			}
			
			int val = Integer.MIN_VALUE;

			for (int i1 = 0; i1 < ai.size(); i1++) {
				if(max < ai.get(i1).level) {
					if(val < ai.get(i1).val) {
						val = ai.get(i1).val;
					}
					max = ai.get(i1).level;
				}
			}
			sb.append('#').append(t).append(' ').append(val - max + 1 + " " + max).append('\n');
		} // end of tc
		
		System.out.println(sb);		
		
		

	} // end of main
} // end of class