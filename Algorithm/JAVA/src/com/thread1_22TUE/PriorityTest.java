package com.thread1_22TUE;

class MyThread extends Thread {
	
	public void run() {
		System.out.println("name:" + getName());
	}
}


public class PriorityTest {

	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		MyThread m3 = new MyThread();
		
		System.out.println(m1.getPriority());
		System.out.println(m2.getPriority());
		System.out.println(m3.getPriority());
		
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.NORM_PRIORITY);
		m3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(m1.getPriority());
		System.out.println(m2.getPriority());
		System.out.println(m3.getPriority());
		
		// 자바는 생성한다해도 무작위로 생성되고
		// 우선순위를 정한다해도 무작위로 실행된다.
		
		m1.start();
		m2.start();
		m3.start();

	}

}
