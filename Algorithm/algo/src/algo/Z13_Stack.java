package algo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * Stack : LIFO 후입 선출
 * 
 * 
 * 
 */

public class Z13_Stack {
	static char[][] pair = {
		{'(',')'},
		{'{','}'},
		{'[',']'}		
	};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Character> st = new Stack<Character>();
		
		String s = scan.next();
		
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			// 넣어야 할게 닫힌과로면
			// 현재 맨 꼭대기가 열린괄호인지 확인 후 pop한다!
			if ( c == ')') {
				if(!st.empty() ) {
					char pkc = st.peek();
					if(pkc == '(')
						st.pop();						
				}
		
			}
			else if ( c == '}') {
				if(!st.empty() ) {
					char pkc = st.peek();
					if(pkc == '{')
						st.pop();		
				}
				
			}
			else if ( c == ']') {
				if(!st.empty() ) {
					char pkc = st.peek();
					if(pkc == '[')
						st.pop();	
				}
			}
			else
				st.push(c);		
		}

		if(!st.empty())
			System.out.println("괄호가 제대로 닫히지 않았습니다.");
		else
			System.out.println("괄호가 제대로 닫힌 문장");
		
		
		
		
		
	} // end of main


} // end of class
