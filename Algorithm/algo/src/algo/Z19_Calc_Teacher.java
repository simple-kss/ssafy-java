package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 12 + 5 * 2 + 3 + 4 * 2

public class Z19_Calc_Teacher {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] stack = new int[30];
		int top = -1;
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str); 
		// 토크나이저는 정규화 표현식 안됨, 표현안하면 5가지 띄어쓰기,탭,엔터 등을 갖고옴
		
		// 첫번쨰 피연산자를 숫자로 변환해서 스택에 저장
		stack[++top] = Integer.parseInt(st.nextToken());
		while(st.hasMoreTokens()) {
			char op = st.nextToken().charAt(0); // 연산자
			int num = Integer.parseInt(st.nextToken()); // 피연산자
			if ( op == '+') {
				stack[++top] = num;
			}
			else {
				int pre = stack[top];
				stack[top] = pre * num; // 그 자리에 덮어쓰기
			}
		}

		System.out.println(Arrays.toString(stack));
		int sum = 0;
		for (int i = 0; i < stack.length; i++) {
			sum += stack[i];
			
		}
		System.out.println(sum);
		

	}

}
