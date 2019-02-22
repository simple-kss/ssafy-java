package algo2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SuffixArray_김지은 {
	public static void main(String[] args) {
		String s = "banana";
		String[] S = new String[s.length()];
		int[] A = new int[s.length()];
		
		for (int i = 0; i < S.length; i++) {
			S[i] = s.substring(i);
			A[i] = i;
		}
		
		for (int i = 0; i < S.length; i++) {
			for (int j = i; j < S.length; j++) {
				if(S[i].compareTo(S[j]) > 0) {
					String tmp = S[i];
					S[i] = S[j];
					S[j] = tmp;
					int t = A[i];
					A[i] = A[j];
					A[j] = t;
				}
			}
		}
		HashSet<String> hs = new HashSet<String>();
		int[] LCP = new int[s.length()];
		for (int i = 0; i < S.length; i++) {
			int cnt = 0;
			for (int j = 0; j < S[i].length(); j++) {
				int hsLen = hs.size();
				String temp = S[i].substring(0, j+1);
				hs.add(temp);
				if(hsLen == hs.size()) {
					cnt++;
				}
			}
			LCP[i] = cnt;
		}
		System.out.println(Arrays.toString(LCP)+" : LCP");
		System.out.println(Arrays.toString(A) + " : Suffix Array");
		int cnt = 0;
		for (int i = 0; i < S.length; i++) {
			System.out.println("<"+S[i]+">");
			for (int j = LCP[i]; j < S[i].length(); j++) {
				cnt++;
				if(cnt == 13) {
					System.out.println("s문자열에서 만들 수 있는 모든 부분 문자열에서 사전식 정렬 상태에서 13번째 문자열");
				}
				System.out.println(S[i].substring(0, j+1));
			}
		}
	}
}
