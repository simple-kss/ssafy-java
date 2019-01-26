package com.thread1_22TUE;

// Runnable 구현해서 thread 사용
class Lion implements Runnable{
	
	//Thread가 해야 되는 작업내용을 가진 메소드. callback method
	@Override
	public void run() {
		System.out.println("thread is runnin..." + Thread.currentThread().getName());		
//		System.out.println("thread is runnin..." + getName());		
	}

//	private String getName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}

public class LionTest {
	
	public static void main(String[] args) {
		// l1은 Thread랑은 아무 상관없다.
		// l1은 쓰레드는 아니다.
		Lion l1 = new Lion(); // thread는 아님, Runnable 객체라함, run()은 가지고 있음
		// 쓰레드가 해야하는 작업을 하는 메소드를 갖고 있다.
		
		// t1이 일하러가긴 가는데
		// l1을 실행하러 간다.
		
		// 즉 쓰레드 만들떄 어떤 Runnable 객체를 넣느냐에따라서
		// 그 객체를 실행하게 된다.
		// 물론 Thread를 상속받은 객체도 실행할 수 있다.
		Thread t1 = new Thread(l1);
		t1.start();
		
		Thread t2 = new Thread(l1);
		t2.start();

		l1.run();
		
	}
	
	

}
