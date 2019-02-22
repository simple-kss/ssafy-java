package algo2;

import java.awt.Checkbox;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;

// 예제 입력1 : CBBCBAAB
// 예제 입력2 : APPACBCDDDEDDD

public class 연습문제3_모든회문출력_김성식 {
	// 중복제거를 위한 링크드해쉬샛
	static LinkedHashSet<String> hs = new LinkedHashSet<String>();
	public static void main(String[] args) throws IOException {
		System.out.println("");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		// 먼저 펠린드롬인지 아닌지를 반환하는 boolean 함수를 만든다.
		// 이함수는 문자열을 인자로 넘김
		// 그냥 그함수에서 true면 출력을 하자.
		
		
		// 그리고 길이가 n인 문자열, n-1문자열 .... 2인 문자열까지 모두다
		// 펠린드롬인지 검사한다.
		
		int sLen = s.length(); // string의 길이
		check(s);
		
		// 처음엔 2번 반복할 것이다.
		for (int i = 2; i < sLen; i++) {
			// 문자열 길이를 하나씩 줄어가면서
			// 1234567 이 있따면 123456, 234567 이 펠린드롬인지 검사한다.
			for (int j = 0; j < i; j++) {
				int rLen = j + sLen - i + 1; // 실제 추줄할 배열의 길이 펠린드롬을 검사할 길이 !
				check(s.substring(j, rLen));
			}
		} // end of for 2
		
		for (String string : hs) {
			System.out.println(string);
		}
		
	} // end of main

	private static void check(String s) {
		int len = s.length();
		boolean isPalin = true;
		// 홀수이면
		if(len % 2 == 1) {
			int middle = len / 2;
			// middle 횟수만큼 반복하면 된다.
			for (int i = 0; i < middle; i++) {
				if(s.charAt(i) != s.charAt(middle * 2 - i)) {
					isPalin = false;
					break;
				} 
			} // end of for
			
		} // end of if
		// 짝수이면
		else {
			for(int i = 0; i < len / 2; i++) {
				if(s.charAt(i) != s.charAt(len - i - 1)) {
					isPalin = false;
					break;
				} 
			}
		}
		
		if(isPalin) 
			hs.add(s);
		
		
	} // end of function	
} // end of main




















