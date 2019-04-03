package algo0401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_4672_수진이의팰린드롬 {
	
	
	private static char[] print;
	private static boolean[] visited;
	private static int max;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		char[] arr;
		StringBuilder sb = new StringBuilder();
		
		for(int t = 1; t <= tc; t++) {
			String s = br.readLine().trim();
			arr = s.toCharArray();
			print = new char[s.length()];
			visited = new boolean[s.length()];
			
			perm(0, arr.length, arr);
			
			sb.append('#').append(t).append(' ').append(max).append('\n');
		}
		System.out.println(sb);
		
		
		
	} // end of main

	private static void perm(int step, int end, char[] arr) {
		if(step == end) {
			//각각의 print마다 팰린드롬의 갯수를 센다
			int sum = calc(print);
			if(max < sum)
				max = sum;
			
//			System.out.println(Arrays.toString(print));
			return;
		}
		else {
			// 모든 원소 순회
			for(int i = 0; i < end; i++) {
				if(visited[i]) continue;
				
				visited[i] = true;
				print[step] = arr[i];
				perm(step + 1, end, arr);
				visited[i] = false;
			}
		}
		
	}

	private static int calc(char[] arr) {
		// 현재문자열의 부분문자열의 갯수 센다.
		
		// 각각의 부분 문자열이 팰린드롬인지 센다
		// 길이가 arr.len일때
		// arr.len-1일댸 ...
		// len - 2일때,..
		
		
		// 1일떄 각 문자열의 갯수이다.
		int sum = arr.length;
		
		
		// 부분문자열 추출할려고
		char[] ch = new char[arr.length];
		int cnt = 0;
		
		// 뽑ㅂ을 문자열의갯수
		for (int i = 2; i <= arr.length; i++) {
			// 그 문자열의 갯수만큼 돈다.
			for(int j = 0; j <= arr.length-i; j++) {
				cnt = 0;
				// i글자만큼 뽑아야하는데
				for(int k = j; k < j+i; k++) {
					ch[cnt++] = arr[k];
				}
				// 다 뽑고 그게 팰린드롬인지 검사
				if(isPalin(ch, cnt)) {
					//System.out.println(Arrays.toString(ch));
					sum++;
				}
			}
		}
		return sum;
	}

	private static boolean isPalin(char[] ch, int cnt) {
		
		if(cnt % 2 == 0) {
			boolean check = true;
			for(int i = 0; i < cnt / 2; i++) {
				int first = (cnt / 2) - 1 - i;
				int back = (cnt / 2) + i;
				if(ch[first] != ch[back]) {
					return false;
				}
			}
			return check;
		}
		// 홀수라면
		else {
			boolean check = true;
			for(int i = 0; i < cnt / 2; i++) {
				int first = (cnt / 2) - 1 - i;
				int back = (cnt / 2) + 1 + i;
				if(ch[first] != ch[back]) {
					return false;
				}
			}
			return check;
		}

	}
} // end of class