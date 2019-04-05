

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2577_회전초밥_김성식 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine().trim(), " ");
		int N = Integer.parseInt(stk.nextToken()); // 벨트 5000
		int D = Integer.parseInt(stk.nextToken()); // 초밥의 가짓수
		int K = Integer.parseInt(stk.nextToken()); // 연속해서 먹을 수 있음
		int C = Integer.parseInt(stk.nextToken()); // 쿠폰번호
		
		int[] arr = new int[N + K + 2];
		int[] cnt = new int[D+1]; // 숫자 세는 배열
		int count = 0; // 숫자의 종류 카운트
		int mCnt = 0; // 카운트들중 최대
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine().trim());
		}
		
		// K - 1개만큼 복사해서 붙여넣는다
		System.arraycopy(arr, 0, arr, N, K-1);
		
//		System.out.println("123");
		
		// 앞뒤로 만들어주기
		
		//쿠폰 썻는지 안썻는지 확인.
		boolean check = false;
		boolean fCheck = false;
		
		// 쿠폰이 있을 경우 ?...
		// 한칸 앞당긴다.
		int plus = 0;
		
		// 1번지부터 다센다 k개만큼 센다. 일단 센다 boolean으로 말고
		for (int i = 0; i < K; i++) {
			// 0이라면 기존에 없었던 것 이므로 ++
			if(cnt[arr[i]]++ == 0) count++;
			
		}
		
		// 그런뒤 2번지부터 시작한다.
		for (int i = 1; i < N; i++) {
			// 검사해야할 번지
			if(cnt[arr[i + K - 1]]++ == 0) count++;
			
			// 그리고 이전꺼 뺀다. 그게 0이면 max--;
			cnt[arr[i-1]]--;
			if( cnt[arr[i-1]] < 1) count--; 
			
			
			int temp = count;
			
			if(cnt[C] == 0)
				temp++;
			
			if(temp > mCnt) {
				mCnt = temp;
			}
		}
		
		System.out.println(mCnt);
	} // end of main
} // end of class