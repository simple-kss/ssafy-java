package algo;

import java.util.Scanner;

// 2 + 3 * 4 / 5

// ( 6 + ( 5 * ( 2 - 8 ) / 2 ) )


public class Z20_Calc_Teacher {
	
	static char[] reform = new char[10];
	static int rTop = -1;
	
	static int calc(int rTop, char[] re) {
		
		int[] cal = new int[10];
		int top = -1;
		
		
		for(int i = 0; i <= rTop; i++) {
		
			
			// 연산자이면
			if(re[i] == '*' || re[i] == '+' || 
					re[i] == '-' || re[i] == '/') {
				// 전, 전전꺼 계산
				if(re[i] == '*') {
					cal[top-1] = cal[top-1] * cal[top];  
					//re[i] == ;
					
				}
				else if(re[i] == '+') {
					cal[top-1] = cal[top-1] + cal[top];  
				}
				else if(re[i] == '-') {
					cal[top-1] = cal[top-1] - cal[top];  
				}
				else if(re[i] == '/') {
					cal[top-1] = cal[top-1] / cal[top];  
				}
				top--;
			}
			// 피연산자이면
			else {
				cal[++top] = re[i];
		
			}			
		}
		
		
		
		
		return cal[0];		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] stackOp = new char[10];
		
//		char[] reform = new char[10];
//		int rTop = -1;
		
		int top = -1;
		String[] str = sc.nextLine().split(" ");
		
		for( int i = 0; i < str.length; i++) {
			// 아직은 연산자인지 숫자인지 모름
			// 그래서 그걸 파악해야함
			char c = str[i].charAt(0); // 문자열의 첫글자를 짤라옴
			switch (c) {

			case '(': // 무조건 스택에 저장해라, 우선순위 3
				// 여는 괄호면 넣으면 끝이다.
				stackOp[++top] = c;
				break; 
			case '*': // 우선순위 2
			case '/': // 우선순위 2
				// 스택을 확인해서 나보다 우선순위가 낮으면 스택에 넣기, 나보다 우선순위가 높거나 같으면 빼버리기 pop
				// 나보다 우선순위가 높은 건 없다.
				// 언제까지인지는 모르겠다.
				while(top >= 0 && (stackOp[top] == '*' || stackOp[top] == '/')) {
					// 하나를 버려라
					
					reform[++rTop] = stackOp[top];
					System.out.print(stackOp[top] + " ");
					top--;					
				}
				stackOp[++top] = c; // 스택 위에 내 연산자를 쌓기
				
				break;
			case '+': // 우선순위 1
			case '-': // 우선순위 1
				// 스택을 확인해서 나보다 우선순위가 낮으면 스택에 넣기, 나보다 우선순위가 높거나 같으면 빼기 pop
				while(top >= 0 && (stackOp[top] == '*' || stackOp[top] == '/'
						|| stackOp[top] =='+' || stackOp[top] == '-')) {
					reform[++rTop] = stackOp[top];
					System.out.print(stackOp[top] + " ");
					top--;					
				}
				stackOp[++top] = c; // 스택 위에 내 연산자를 쌓기
				break;
			case ')': // 스택에 넣지는 않음, 스택에서 (나올떄까지 pop한다
				while(top >= 0 && stackOp[top] != '(' ) {
					reform[++rTop] = stackOp[top];
					System.out.print(stackOp[top] + " ");
					top--;				
				}
				// 스택에 여는 괄호가 남았다.
				// 앞에것때문에 종료됐는지, 뒤에꺼 떄문에 종료됐는지 모르므로
				// 사실 이건 확인할 필요가 없다.
				if(top > 0 && stackOp[top] == '(') { // 이거는 버려라
					top--;					
				}
				break;
			default: // 숫자는 무조건 출력
				reform[++rTop] = (char) Integer.parseInt(str[i]);
				System.out.print(str[i]+" ");
				break;
			}


			
		}
		// 혹시 스택에 남아있는 찌끄래기가 있으면
		// 스택에 남아았는 연산자를 모조리 출력해라
		
		// 토근 분석 작업이 다 끝난뒤에
		// 스택에 연산자가 남아 있으면, 남은 연산자를 pop 출력
		while(top > -1) {
			System.out.print(stackOp[top--] + " ");
		}
		
		
		int result = calc(rTop, reform);
		System.out.println("\n---------------");
		System.out.println(result);
		
		
//		( 6 + ( 0 * 2 ) )
	} // end of main
} // end of class
