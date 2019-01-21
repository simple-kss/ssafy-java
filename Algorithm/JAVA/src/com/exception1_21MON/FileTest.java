package com.exception1_21MON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileTest().go();

	}
	
	private void go() {
		hello();
	}
	
	private void hello() {
		// 파일로부터 내용을 읽어 들이는 입력 파이프
		try {
			FileInputStream fis = new FileInputStream("data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 스택 추척해서 화면에 뿌려주기
		}
		
	}

}
