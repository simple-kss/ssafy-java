import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Solution_1238_SW문제해결기본10일차_Contact_조동희 {
	static int n,start,front,rear;
	static int[] q = new int[1000];
	static boolean[] visited;
	static List<ArrayList<Integer>> list = new ArrayList<>();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = 10;
		for(int i=0;i<101;i++)
			list.add(new ArrayList<>());
		
		for(int z=1;z<=tc;z++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			n = Integer.parseInt(st.nextToken())/2;
			start = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine(), " ");
			// 2개씩 볼 것이므로 반절씩
			for(int i=0;i<n;i++) {
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				list.get(from).add(to);
			}
			
			visited = new boolean[101];
			visited[start] = true;
			int len = list.get(start).size();
			for(int i=0;i<len;i++) {
				q[++rear] = list.get(start).get(i);
			}
			
			int max = 0,tMax=0;
			while(front<rear) {
				int size = rear - front;
				tMax = 0;
				for(int i=0;i<size;i++) {
					int t = q[++front];
					len = list.get(t).size();
					for(int j=0;j<len;j++) {
						int tt = list.get(t).get(j);
						if(visited[tt]) continue;
						q[++rear] = tt;
						visited[tt] = true;
						if(tMax<tt) tMax = tt;
					}
				}
				if(tMax!=0) {
					max = tMax;
				}
			}
			if(tMax==0&&max==0) {
				len = list.get(start).size();
				for(int i=0;i<len;i++) {
					int tt = list.get(start).get(i);
					max = max>tt?max:tt;
				}
			}
			sb.append('#').append(z).append(' ').append(max).append('\n');
			// 초가화
			front = 0; rear = 0;
			for(int i=1;i<101;i++)
				list.get(i).clear();
		}// end of tc
		System.out.println(sb);
	}// end of main
}// end of class
