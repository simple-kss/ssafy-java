package com.thread1_22TUE;

import java.util.Date;

public class ThreadClock implements Runnable {
	
	public ThreadClock() {
		//thread 생성, start
		Thread t = new Thread(this);
		t.start();
		
	}
	public static void main(String[] args) {
		ThreadClock clock = new ThreadClock();
		
	}
	
	@Override
	public void run() {
		// thread가 해야 하는 작업 내용 : 1초 간격으로 콘솔에 시간 출력하기
		while(true) {
			Date d = new Date(); // 년월일 시분초 정보 저장
			System.out.println(d.toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
