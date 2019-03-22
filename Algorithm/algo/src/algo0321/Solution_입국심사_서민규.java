package algo0321;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Solution_입국심사_서민규 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int t = 1; t <= tc ; t++) {
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(stk.nextToken()); // 심사대 개수, 1 <= N <= 10^5
            int M = Integer.parseInt(stk.nextToken()); // 입국심사할 인원, 1 <= M <= 10^9
            long[] tester = new long[N];
            for(int i = 0; i < N; i++) {
                tester[i] = Integer.parseInt(br.readLine()); // 1 <= tk <= 10^9 걸림
            }
            // 소요시간의 범위 : 0 ~ 10^18
            long start = 0;
            long end = 1000000000L * M;
            long min = Long.MAX_VALUE;
            
            // 최솟값을 구할것이기 떄문에 min을 출력한다.
            // 역전이되면 그만해라!
            while(start <= end) {
            	long mid = (start + end) / 2;
            	
            	// 입국 심사대에 통과하는 인원 구하기.
            	long cnt = 0; // 통과한 인원
            	for(int i = 0; i < N; i++ ) {
            		cnt += mid / tester[i];
            	}
            	// M명, cnt명으 비교해서 범위를 재조정
            	if( cnt < M ) {
            		start = mid + 1;
            	}
            	else if(cnt >= M) { // M == Cnt 경우에도 시간을 더 줄여서 다시 확인한다.
            		// mid 시간동안 M명이 통과 했으면
            		// 갱신
            		if(min > mid) {
            			min = mid;
            		}
            		// 더 적은 시간으로도 되면 end를 더 줄여보자!
            		end = mid - 1;
            	}
            } // end of while
            sb.append('#').append(t).append(' ').append(min).append('\n');
        }
        System.out.println(sb);
 
    } // end of main
} // end of class
