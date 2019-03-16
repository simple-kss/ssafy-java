import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_4408_자기방으로돌아가기_greedy {
	
	public static int second = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println(" ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] bridge = new int[200];
			int[] now = new int[N];
			int[] after = new int[N];
			boolean[] visited = new boolean[N];
			
			int max = 0;
			
			// 일단 가장 큰 브릿지 부터 찾자
			int bSize = 0;
			for(int i = 0; i < N; i++) {
				StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
				int n = now[i] = Integer.parseInt(stk.nextToken());
				int a = after[i] = Integer.parseInt(stk.nextToken());
				if(after[i] > max) 
					max = after[i];
			
				if(now[i] > after[i]) {
					n = after[i];
					a = now[i];
				}
				
				//System.out.println(n + " " + a);
				//System.out.println(Arrays.toString(bridge));
					
					
				setVisited(n, a, bridge);
				
			} // end of for
			
			int bNum = (max + 1) / 2;
			// 조합을 만드는 문제!
			// 조합 번지를 만들자
			
			int maxVal = 0;
			for(int i = 0; i < 200; i++) {
				if( maxVal < bridge[i])
					maxVal = bridge[i];
			}
			
			sb.append("#").append(t).append(" ").append(maxVal).append('\n');
		}
		
		System.out.println(sb);
		
		
		
		
	} // end of main
	
	private static void combi() {
		// TODO Auto-generated method stub
		
	}


	public static boolean setVisited(int now, int after, int[] bridge) {
		int start = (now - 1) / 2;
		int end = (after + 1) / 2;
		
		
		for(int i = start; i < end; i++) {
			// 이미 갔던대라면 false
			bridge[i]++;
		}
		return true;
	}
} // end of class