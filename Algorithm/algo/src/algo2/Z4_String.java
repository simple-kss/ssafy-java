package algo2;

import java.util.Arrays;

public class Z4_String {

	public static void main(String[] args) {
		String str = "Starteatingwellwiththeseeighttipsforhealthyeating,whichcoverthebasicsofahealthydietandgoodnutrition";
		String p = "ti";
		// 방법 1
		// IndexOf메서드를 쓴다.
		
		// 방법2
		// split을 이용한다.
		
		//str.lastIndexOf("ti"); // 뒤에서부터 ti를 찾는다.
		String[] srr = str.split("ti");
		System.out.println(Arrays.toString(srr));
		System.out.println(srr.length);
//		System.out.println(str.indexOf("ti",11)); // 11번째 이후로 찾아라..
		
		// 문제점 맨뒤에 t가 놓였을 때 마지막 개수를 헤아려주지 않아서
		// 골뱅이를 붙인다.
		String str1 = "aataataa" + "@";
		String p2 = "t";
		
		System.out.println(str1.split(p2).length-1);
		
		

	} // end of main
} // end of class
