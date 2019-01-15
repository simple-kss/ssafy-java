package com.basic;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mylimeorange";
		String t = new String("mylimeorange");
		
		if(s == t)
			System.out.println("s == t");
		
		if(s.equals(t))
			System.out.println("s.equlas(t)");
		
		// 비파괴함수라서 s의 값이 바뀌지 않는다.
		// 그래서 p에 대입을 하고 p를 출력한다.
		String p = s.toUpperCase();
		System.out.println(p);
		
		s.concat("hello");
		System.out.println(s);
		
		s = s + "hello";
		System.out.println(s);
		
		// 원본에 수정 가능! 일반적인 String이랑 다르다.
		StringBuilder sb = new StringBuilder("mylimeorange");
		System.out.println(sb.length());
		sb.append("123"); // append는 문자열 결합
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(4));
		
		System.out.println(sb.indexOf("o"));
		
		String str = "hello123123";
		String s2 = str.substring(2, 7); // 인덱스 2부터 6까지 주의!
		System.out.println(s2);
		
		
		
		
		

	}

}
