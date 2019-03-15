package swexpert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution_1238_SW문제해결기본10일차_Contact_홍휘진 {

	static class Node {
		int x;
		int cnt;

		Node(int x, int cnt) {
			this.x = x;
			this.cnt = cnt;
		}
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			for (int t = 1; t <= 10; t++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int n = Integer.parseInt(st.nextToken());
				int start = Integer.parseInt(st.nextToken());
				boolean []check = new boolean[n+1];
				int []cc = new int[n+1];
				
				HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
				for (int i = 1; i <= n; i++) {
					hm.put(i, new ArrayList<>());
				}
				st = new StringTokenizer(br.readLine(), " ");
				while(st.hasMoreTokens()) {
					int from = Integer.parseInt(st.nextToken());
					int go = Integer.parseInt(st.nextToken());
					hm.get(from).add(go);
				}
				ArrayDeque<Node> q = new ArrayDeque<>();
				q.add(new Node(start, 1));
				check[start] = true;
				cc[start] = 1;
				int maxCnt = 0;
				int ans = 0;
				while(!q.isEmpty()) {
					Node now = q.poll();
					for (Integer next : hm.get(now.x)) {
						if(!check[next]) {
							q.add(new Node(next, now.cnt + 1));
							check[next] = true;
							cc[next] = now.cnt + 1;
							maxCnt = Math.max(now.cnt+1, maxCnt);
						}
					}
				}
				for (int i = 1; i <= n; i++) {
					if(maxCnt == cc[i])
						ans = i;
				}
				
				
				System.out.println("#" + t + " " + ans);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
