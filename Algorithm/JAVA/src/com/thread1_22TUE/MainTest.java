package com.thread1_22TUE;

public class MainTest implements Runnable{
	
	MainTest() {
		Thread t = new Thread(this);
		t.start();
		try {
			// t라는 쓰레드가 죽을 때까지 기다린다는 것
			// t를 기다려라~하는 얘기
			// Main이 기다린다. 왜냐하면 Main이 실행시켜줬기 때문
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void test() {
		System.out.println("test method....");
	}

	public static void main(String[] args) {
		// 그냥 Runnable객체일 뿐이지 Thread는 아님
		// Thread들 간의 순서가 중요하다
		new MainTest().test();

	}

	@Override
	public void run() {
		System.out.println("thread...run()");
		//while(true) {}
	}

}
