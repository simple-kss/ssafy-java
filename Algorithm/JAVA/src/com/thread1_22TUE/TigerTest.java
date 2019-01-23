package com.thread1_22TUE;

// Thread를 상속받아서 thread 사용
class Tiger extends Thread{
	
	// thread가 해야 되는 작업 내용을 가진 메소드
	public void run() {
		// 어떤 블록안에서 메소드 썻는데
		// 그 클래스에서 정의한 게 아니라면 부모 메소드임
		System.out.println("thread is running..." + getName());
		
	}
	
}

public class TigerTest {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.start(); // -> Thread가 이 메서드 실행, 일해라 , run이 실행됨
		//t1.run(); // -> 메인이 이 메서드 실행
		
		Tiger t2 = new Tiger();
		t2.start(); // 일해라 , run이 실행됨
		
		Tiger t3 = new Tiger();
		t3.start(); // 일해라 , run이 실행됨
		
		
		
	}
}
