package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 자바 팁!!
 *
 */

// Tip!!!!!

public class Z09_Source {

	public static void main(String[] args) throws IOException {
		// 제일 큰 덩어리
		// Scanner를 BufferRead로 바꾸는게 가장 빠르다.
		
		// 1번쨰 방법 **********************
		
		Scanner sc = new Scanner(System.in);
//		sc.nextLine(); // 엔터가입력될떄까지 모조리 쓸어버리기
		
		// 여기서부터는 엔터를 남겨놓는다. 그래서 nextLine으로 제거해야함
//		sc.next();
//		sc.nextInt(); // 앞에 white space를 제거하고 다 갖고옴. 엔터는 남겨놈!!
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//br.readLine();
//		for(int i = 0; i < 10; i++ ) {
//			int in = br.read() - '0';
//			System.out.printf("%3d",in);
//			
//			
//		}
		
		
		
		// 2번째 방법 *********************
		
		
		// Scanner => BufferedReader
		
//		System.out.println(); 
		String ss = "";
		ss += "sdfsdf\n";
		ss += "두번쨰줄\n";
		System.out.println(ss);
		
		
		
		// 3번쨰 방법 ***********하지만 위에꺼보단 시간 줄어드는 게 1/10크기 정도로 줄어듬
		// 문자열 쪼개기
		String str = "사자 호랑이 귤 사과 바나나 수박";
		String[] srr = str.split(" "); // 구분자로 쪼갬
		System.out.println(Arrays.toString(srr));
		
		StringTokenizer st = new StringTokenizer(str, " ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//System.out.println(Arrays.toString(st));
		
		
		// br로 읽어왔으면 split으로 짜르고
		// parsint로 해주어야한다.
		String s = "1 2 3";
		for (int i = 0; i < s.length(); i+=2) {
			System.out.println(s.charAt(i) - '0');
		}
		
		String ss1[] = s.split(" ");
		for (int i = 0; i < ss1.length; i++) {
			System.out.println(Integer.parseInt(ss1[i]));
			
		}
		
	} // end of main
} // end of class
