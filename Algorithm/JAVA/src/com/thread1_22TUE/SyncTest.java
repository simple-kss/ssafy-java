package com.thread1_22TUE;



//동기화(synchronization) : 멀티 thread가 공유 데이터에 접근해서 작업할때 동시 접근이 안되도록 락을 거는일 
//순차실행이 되는 결과 , 
public class SyncTest extends Thread{
	public static void main(String[] args) {
		new SyncTest();

	}//end of main
	
	@Override
	public void run() {	
		bedroom();
		kitchen();
	}

	private synchronized void bedroom() {	//동기화 키워드 : 락기능 // 이제 멀티스레드가 동시에 실행할수 없음***********
											//한스레드가 들어가있으면 다른 스레드는 못들어감 ************
		
		//근데 메소드에 걸어 놓으면 메소드내 굳이 필요 없는 부분까지 같이 락이 걸려서 비효율적임!!!!	*********
		//락을 걸어놓으면 순차실행 => 속도가 느려 ***********
		String name = Thread.currentThread().getName();
		System.out.println(name + "침실에 들어옴ㅎ");
		System.out.println(name + "침실에 나감ㅜㅜ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private synchronized void kitchen() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "부엌에 들어옴ㅎ");
		System.out.println(name + "부엌에 나감ㅜㅜ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	SyncTest() {
		Thread a = new Thread(this,"a");	//쓰레드 이름까지 주기, getName()으로 부름 ******
		Thread b = new Thread(this,"b");
		a.start();
		b.start();
	}
	
}//end of class