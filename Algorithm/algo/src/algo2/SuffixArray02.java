package algo2;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

class Str implements Comparable, Cloneable{
	String s;
	int num;
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return s.compareTo((String)o);
	}
}

public class SuffixArray {

	public static void main(String[] args) {
		String str = "banana$";
		Str[] strArr = new Str[str.length()];
		
		
		// S배열 만들기
		for(int i = 0; i < str.length(); i++) {
			strArr[i] = new Str();
			strArr[i].num = i;
			strArr[i].s = str.substring(i);
		}
		
		// S배열 출력하며 테스트
//		for(int i = 0; i < str.length(); i++) {
//			System.out.println(strArr[i]);
//		}
		
		// 사전순으로 정렬
		// []배열을 clone해도 전체 데이터들이 깊은 복사가 된다!
		Str[] sArr = strArr.clone();
		Arrays.sort(sArr);
		
		// lcp배열 출력하며 테스트
//		for(int i = 0; i < sArr.length ; i++) {
//			System.out.println(sArr[i]);
//		}
		
		int[] lcp = new int[sArr.length];
		int[] sufNum = new int[sArr.length];
		
		
		// 그 전꺼와 일치하는 문자의 갯수 반환
		for(int i = 1; i < lcp.length; i++) {
			if(sArr[i].s.charAt(0) == sArr[i-1].s.charAt(0)) {
				// 마지막에 $를 없애준다.
				String find = sArr[i-1].s.substring(0, sArr[i-1].s.length() - 1); 
				int index = sArr[i].s.indexOf(find); // find를 찾는다. 
				if(index != -1 ) lcp[i] = sArr[i-1].s.length() - 1;
			}
		} // end of for
		
		// lcp배열 출력하며 테스트
		System.out.println(Arrays.toString(lcp) + " : LCP");
		System.out.println(Arrays.toString(lcp) + " : SuffixArray");
		System.out.println();
		
		
		// 부분 문자열 만들기
		for(int i = 1; i < sArr.length; i++) {
			System.out.println("<<" + sArr[i] + ">>");
			
			// 1개출력..
			// 2개출력 .. 
			for (int j = 1; j < sArr[i].s.length() ; j++) {
				for (int k = 0; k < j; k++) {
					System.out.print(sArr[i].s.charAt(k));
				}
				System.out.println();
			}
		}

	} // end of main
} // end of main
