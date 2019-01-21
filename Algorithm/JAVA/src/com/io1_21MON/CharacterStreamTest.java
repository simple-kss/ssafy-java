package com.io1_21MON;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharacterStreamTest {
	
	public static void main(String[] args) throws Exception {
		// character stream : 한글자의 정보를 2byte에 담아서 전송
		
		// 임시 파일 생성
		File f = File.createTempFile("sample", "txt");
		// temp 파일하나 만들었음
		
		//System.out.println(f);
		
		// 파일에 내용을 쓰는 파이프
		// 그걸 가져다가 새로운 애를 하나 만듬
		FileWriter fw = new FileWriter(f); // node stream(목적지에 직접 연결되어 쓰기 작업 수행)
		BufferedWriter bw = new BufferedWriter(fw); // filter stream buffer 기능이 있는 가공 stream 
		
		
		bw.write("안녕하세요");
		bw.newLine(); // 개행을 입력
		bw.write("빨리 집에 가고 싶다");
		bw.newLine();
		
		bw.close();
		fw.close();
		
		// 여기서부터는 파일 읽어오는 기능
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr); // 필터는 일반 스트림이 있어야한다.
		
		// InputStreamReader : InputStream 타입의 스트림을 Reader 타입의 스트림으로 변경시켜줌!!
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		// 필터는 일반 스트림이 있어야한다. , InputStream을 Reader파입으로 바꾼다. System.in을 말이다.!
		
		
		// 스트림이 있어야 가공이 가능하다.
		for (String str; (str = br.readLine())!=null;) {
			System.out.println(str);
		}
		br.close();
		fr.close();
		
	}//end of main
}//end of class