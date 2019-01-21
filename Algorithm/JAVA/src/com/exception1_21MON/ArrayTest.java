package com.exception1_21MON;

public class ArrayTest {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };

		try {
			for (int i = 0; i <= ar.length; i++) {
				System.out.println(ar[i] + ": hello");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// e: 발생한 예외 정보를 담고 있는 변수
//			System.out.println("-----------------");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("인덱스 이탈됐다 얘야~");
//			try {
//				System.out.println("!");
//				System.out.println(ar[5]);
//			} catch (ArrayIndexOutOfBoundsException t) {
//				System.out.println("@");
//				System.out.println(ar[5]);
//			}
//			finally { // 예외 발생여부와 관계없이 매번 실행되는 블럭
//				System.out.println("finally...");				
//			}
//		

		}
		
		System.out.println(ar[5]);

		System.out.println("done...");

	}
}
