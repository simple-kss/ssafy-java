package algoProg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Solution2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> hs = new HashSet<String>();
		String s = br.readLine().trim();
		
		char[] input = s.toCharArray(); // input Charqoduf
		int len = s.length();
		
		// 저장할 배열
		char[][] ele = new char[len][2];
		int[] cnt = new int[len];
		
		boolean[] correct = new boolean[len];
		// 삭제할 걸 true로 저장!
		
		// 1. 원소가 이상한게 아니어야함!
		//// 대문자가 또나오면 그걸 ele에 저장한다!
		//// 숫자가 나오면 그떄부터 숫자 저장!
		//// 다음게 소문자면 그것도 저장
		int eleCnt = 0; // 요소 갯수
		int numCnt = 0; // 숫자 갯수
		int now = 0;
		
		int result = 0;
		for(int i = 0; i < len; i++) {
			
			// 문자면
			if( input[i] >= 'A' && input[i] <= 'Z') {
				ele[eleCnt][0] = input[i]; // 저장
				now = eleCnt;
				eleCnt++;
			}
			// 2번째에 저장
			else if(input[i] >= 'a' && input[i] <= 'z') {
				if(now == -1) { // 또 소문자가 나온다? 그러면 에러
					result = -1;
					break;
				}
				// 이전에꺼에 붙인다.
				ele[now][1] = input[i];
				now = -1;
			}
			else if( input[i] >= '0' && input[i] <= '9') {
				cnt[numCnt++] = input[i] - '0';
			}
		} // end of for
		// 소문자 나오면..
		// 이전에 했던거에 추가하자!
		
		// 다 담았다 이제 조건추가

		// 1) 먼저 숫자 쌍이 맞아야 함 ( 원소의 갯수와 숫자의 갯수)
		// 2) 똑같은문자가 또나오는 지 확인
		
		
		// 중복 검사를 위해서.
		for(int i = 0; i < eleCnt; i++) {
			hs.add(new String(ele[i]));
		}
		
		if(hs.size() != eleCnt) {
			System.out.println("error");
			return;
		}
		if(eleCnt != numCnt) {
			System.out.println("error");
			return;
		}
		if(result == -1 ) {
			System.out.println("error");
			return;
		}
		
		
		StringBuilder sb = new StringBuilder();

		// 다 거쳤다면 이젠 1을 제외해서 출력할 일만 남았다!
		for(int i = 0 ; i < eleCnt; i++) {
			// 선문자 출력후
			int le = ele[i].length;
			for(int j = 0; j < le; j++) {
				if(ele[i][j] != '\0')
					sb.append(ele[i][j]);
			}
			// 숫자출력 (1이면 제외)
			if(cnt[i] == 1)
				continue;
			sb.append(cnt[i]);
		}
		
		System.out.println(sb);
		
		
		

	} // end of main
} // end of class
