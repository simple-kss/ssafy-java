package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 
 * +, * 계산기
 * 
 * 12 + 5 * 2 + 3 + 4 * 2
 *
 */

public class Z19_Calc {

	public static void main(String[] args) {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "12 + 5 * 2 + 3 + 4 * 2";
		StringTokenizer sToken = new StringTokenizer(str," ");
		Stack<Integer> num = new Stack<Integer>();
		Stack<Character> op = new Stack<Character>();
		
		while(sToken.hasMoreTokens()) {
			String temp = sToken.nextToken();
			if(temp.equals("*") ) {
				int result = num.pop() *  1;
				
			}
			
		}
		
		
		
		
		


	} // end of main
} // end of class
