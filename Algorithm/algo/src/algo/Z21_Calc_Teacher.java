package algo;

import java.util.Scanner;

// 6 5 2 8 - * 2 / + ( 

public class Z21_Calc_Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int[] stackNum = new int[str.length];
		int top = -1;
		for(int i = 0; i < str.length; i++) {
			char c = str[i].charAt(0);
			int num1, num2;
			
			switch(c) {
			case '+':
				num2 = stackNum[top--];
				num1 = stackNum[top--];
				stackNum[++top] = num1 + num2;
				break;
				
			case '-':
				num2 = stackNum[top--];
				num1 = stackNum[top--];
				stackNum[++top] = num1 - num2;
				break;
			case '*':
				num2 = stackNum[top--];
				num1 = stackNum[top--];
				stackNum[++top] = num1 * num2;
				break;
			case '/':
				num2 = stackNum[top--];
				num1 = stackNum[top--];
				stackNum[++top] = num1 / num2;
				break;
			default:
				stackNum[++top] = Integer.parseInt(str[i]);
				break;
				
			}
		}
		System.out.println(stackNum[0]);
		
		

	}

}
