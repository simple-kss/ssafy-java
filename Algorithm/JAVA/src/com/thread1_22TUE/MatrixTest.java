package com.thread1_22TUE;

class Matrix extends Thread{
	
	int num; // 자기가 맡은 단 값
	
	public Matrix(int num) {
		this.num = num;
	}
	
	// thread가 해야할 작업 내용을 가지고 있는 메소드 :
	// 자기가 맡은 단 한개를 출력
	public void run() {
		for(int i = 2; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",num,i,num*i);
		}
		
	}
}

public class MatrixTest {

	public static void main(String[] args) {
		Matrix[] m = new Matrix[8];
		for (int i = 0; i < m.length; i++) {
			m[i] = new Matrix(i+2);
			m[i].start();
			try {
				m[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
					
		System.out.println("----");
	}

}
