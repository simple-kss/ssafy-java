package com.io1_21MON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 원본파일 줄땐 갖고있는 파일 중에 주어야함
public class FileCopy {
	public static void main(String[] args) {
		FileInputStream fis;
		FileOutputStream fos;
		
		// args[0] : 원본 파일
		// args[1] : 복사본 파일
		
		try {
			fis = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);
			
			// i를 저장시킨 후에 -1이 아니라면 계속 작업
			// 파일의 끝을 만나면 -1을 리턴
			for(int i; (i = fis.read()) != -1; ) {
				fos.write(i);
				// fis로 읽어낸 코드값 = fis.read()
				// fos의 write라는 메소드는 그 코드에 해당하는 '글자'를  대신하여 출력
			}
			
			fis.close();
			fos.close();
			
			
		} catch (Exception e) {
		
		}
		
		
	}
	
}