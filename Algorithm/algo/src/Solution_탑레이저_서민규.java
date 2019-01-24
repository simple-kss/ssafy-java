import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
5
6 9 5 7 4
 */

public class Solution_탑레이저_서민규 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		
		int N = Integer.parseInt(in);
		
		int[] arr = new int[N+1]; // 0번은 안씀
		int[] stack = new int[N]; // 탑의 index 저장
		int top = -1;
		
		in = br.readLine();
		int ci = 1;
		StringTokenizer stk = new StringTokenizer(in," ");
		StringBuilder sb = new StringBuilder(); // 최종 출력할 내용
		
		while(stk.hasMoreTokens()) {
			int a = Integer.parseInt(stk.nextToken());
			arr[ci++] = a;
		}
//		System.out.println(N);
//		System.out.println(Arrays.toString(arr));
		
		for(int i = 1; i <= N; i++) {
			// 스택에 나보다 작은 높이의 탑은 pop꺼내서 버리기
			// 같거나 높아야 수신할 수 있으니
			// 다 버렸으면 내꺼를 수신할 수 있는 애만 남아있을 거임
			while(top > -1 && arr[stack[top]] < arr[i] ) { // 스택에 나보다 작은 높이의 탑은 pop꺼내서 버리기
				top--; // 인덱스만 버림
			}
			
			// 공백스택
			if( top == -1 ) {
				sb.append("0 ");
			}
			else {
				// 남아있으면
				sb	.append(stack[top])
					.append(" "); // 내 레이저를 수신할 수 있는 탑
				
			}
			stack[++top] = i;
			// 스택에 내 탑의 index를 쌓기
		}
		System.out.println(sb.toString());

	} // end of main
} // end of class
