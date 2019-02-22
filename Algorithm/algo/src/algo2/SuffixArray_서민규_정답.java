package algo2;

import java.util.Arrays;

/**
 * 
 * 문자열 검색을 빠르게 하려면
 *  보이어 무어 알고리즘
 *  
 *  문자열 검색을 빠르게 하려면
 *  특정 문자열에서 모든 부분문자열을 정렬된 상태로 알고 싶다면
 *   특정 문자열의 모든 접미사를 구현 -> 접미사를 정렬 -> 각 접미사의 모든 접두사를 구함
 *   
 *  트라이(Trie) : 문자열의 집합을 표현하는 트리
 *  Compressed Trie : 어떤 문자열의 접미사들을 트라이로 압축된 표현
 *  접미어 트리(Suffix Tree) : Compressed Trie 문제점(접미사가 다른 접미사의 접두어가 되는 경우 구분이 불가)을 해결 (문자열 끝에 $를 표시함으로써)
 *  	생성시간 복잡도 O[n^2] => O[n log n] => O[n]
 *  
 *  접미어 배열(Suffix Array) : 접미어들의 시작 index만 저장해서 문자열을 표현하는 방법
 *  	(접미어 트리에 비해) 메모리를 절약 1/4, 속도느리다.
 *  	생성시간 복잡도 O[n log n]
 *  
 *  LCP 배열 : 최장 공통 접두어(Longest Common Prefix), 접미어 배열 사용시 보조적으로 필요하다.
 *  	두 문자열의 공통 접두어 길이
 *  
 *  이걸 해결하기 위해
 * 
 * @author student
 *
 */

public class SuffixArray_서민규_정답 {

	public static void main(String[] args) {
		String s = "banana";
		
		// s 문자열의 모든 접미사 생성
		int[] sa = new int[s.length()]; // Suffix Array : index 번째에서 시작하는 s문자열의 접미사
		for(int i = 0; i < sa.length; i++) {
			sa[i] = i; // 초기화
		}
		
		// s 문자열의 접미사를 정렬
		// 선택 정렬

		for(int i = 0; i < sa.length; i++) {
			int minIndex = i;
			for (int j = i; j < sa.length; j++) {
				// s.substring(sa[minIndex]) ~~~ s.substring(j); 이 2개를 비교
				// minIndex가 더 크면, 즉 j가 더 작으면
				if(s.substring(sa[minIndex]).compareTo(s.substring(sa[j])) > 0) {
					minIndex = j;
				}
			}
			//minIndex <-> i 	swap
			int temp = sa[minIndex];
			sa[minIndex] = sa[i];
			sa[i] = temp;
		}
		
		// s 문자열의 정렬된 모든 접미사의 모든 접두사를 생성
		
		int[] LCP = new int[s.length()]; // 최장공통접두어를 저장할 배열
//		LCP[4] = s.substring(sa[3]); 과 s.substring(sa[4]) 의 최장공통접두어의 개수 이다 !
		for(int i = 1; i < LCP.length; i++) {
			String s1 = s.substring(sa[i-1]);
			String s2 = s.substring(sa[i]);
			// 같을떄 까지 반복해야한다!
			while( s1.length() > LCP[i]
				&& s2.length() > LCP[i] 
				&& s1.charAt(LCP[i]) == s2.charAt(LCP[i])) {
				// 같으면
				LCP[i]++;
				
			}
			
		}
		
		
		
		// 출력

		for(int i = 0; i < sa.length; i++) {
			String str = s.substring(sa[i]);
			System.out.println("<" + str + ">");
			
			// s 문잦열의 정렬된 모든 접미사의 모든 접두사 생성
			for(int j = LCP[i] + 1; j <= str.length(); j++) { // 접미사의 접두사를 구하자 ! = 부분 문자열
				System.out.println(str.substring(0, j));
			}
			System.out.println(str.length() + " : 접두사의 개수"); // 접두사의 개수는 해당 접미사의 길이와 같다.
			System.out.println(LCP[i] + " : 최장공통 접두사의 개수");
			System.out.println(str.length()-LCP[i]+" : 유효한 부분 문자열의 개수");
		}
		
		System.out.println(Arrays.toString(LCP) + " : LCP Array");
		System.out.println(Arrays.toString(sa) + " : Suffix Array");
		
		// s문자열에서 만들 수 있는 모든 부분문자열에서 사전식 정렬상태에서 k번째 문자열을 출력하시오.
		int k = 13;
		int index = k;
		for(int i = 0; i < sa.length; i++) {
			String str = s.substring(sa[i]); // 사전순으로 정렬된 접미사 하나 저장
			
			if(index - (str.length()-LCP[i]) > 0) index = index - (str.length()-LCP[i]);
			else {
				System.out.println(k + "번째 문자열 : " + str.substring(0, LCP[i] + index ));
				break;
			}
			
			
		}

		
		

	} // end of main
} // end of class
