package algo2;

import java.util.Arrays;


// 내 알고리즘은 String따로 new로 만들었다.
// 이러면 틀린 것이다.

import javax.swing.plaf.synth.SynthSeparatorUI;


public class SuffixArray_김성식 {

	public static void main(String[] args) {
		String str = "banana$";
		String[] strArr = new String[str.length()];
		
		// S배열 만들기
		for(int i = 0; i < str.length(); i++) {
			strArr[i] = str.substring(i);
		}
		
		// S배열 출력하며 테스트
//		for(int i = 0; i < str.length(); i++) {
//			System.out.println(strArr[i]);
//		}
		
		// 사전순으로 정렬
		// []배열을 clone해도 전체 데이터들이 깊은 복사가 된다!
		String[] sArr = strArr.clone();
		Arrays.sort(sArr);
		
		// lcp배열 출력하며 테스트
//		for(int i = 0; i < sArr.length ; i++) {
//			System.out.println(sArr[i]);
//		}
		
		int[] lcp = new int[sArr.length];
		int[] sufNum = new int[sArr.length];
		
		
		// 그 전꺼와 일치하는 문자의 갯수 반환
		for(int i = 1; i < lcp.length; i++) {
			if(sArr[i].charAt(0) == sArr[i-1].charAt(0)) {
				// 마지막에 $를 없애준다.
				String find = sArr[i-1].substring(0, sArr[i-1].length() - 1); 
				int index = sArr[i].indexOf(find); // find를 찾는다. 
				if(index != -1 ) lcp[i] = sArr[i-1].length() - 1;
			}
		} // end of for
		
		// lcp배열 출력하며 테스트
		System.out.println(Arrays.toString(lcp) + " : LCP");
		System.out.println(Arrays.toString(lcp) + " : SuffixArray");
		System.out.println();
		
		
		// 부분 문자열 만들기
		int cnt = 0;
		for(int i = 1; i < sArr.length; i++) {
			System.out.println("<<" + sArr[i] + ">>");
			
			// 1개출력..
			// 2개출력 .. 
			// lcp값 + 1해서 출력하면 된다.
			for (int j = lcp[i]+1; j < sArr[i].length() ; j++) {
				cnt++;
				if(cnt == 13) System.out.println("s문자열에서 만들 수 있는 모든 부분 문자열에서 사전식 정렬 상태에서 13번째 문자열");
				for (int k = 0; k < j; k++) {
					System.out.print(sArr[i].charAt(k));
				}
				System.out.println();
			}
		}

	} // end of main
} // end of main
