package com.exception1_21MON;

public class ThreadTest {

// checked exception임. 
	// 이러한 exception은 non-Runtime exception임
	public static void main(String[] args) {
		Thread t = new Thread();

		try {
			t.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 프로그램 실행을 주어진 시간동안 잠시 멈추는 메소드
		System.out.println("hello, world");
		
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
