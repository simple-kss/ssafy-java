package algo0327;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1077_배낭채우기1_김성식 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int []w = new int[n];
		int []p = new int[n];
		int []d = new int[m+1];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			w[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 1; i*w[0] < m+1; i++) {
			d[i*w[0]] = p[0]*i;
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = w[i]; j < m+1; j++) {
				if(d[j] < d[j-w[i]] + p[i])
					d[j] = d[j-w[i]] + p[i];
			}
		}
		System.out.println(d[m]);
		
	}
}