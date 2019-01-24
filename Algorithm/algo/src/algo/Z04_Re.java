package algo;

import java.util.Arrays;

/**
 * 
 * 재귀 함수
 * 디버깅하기 어렵다
 * 
 * @author student
 *
 */

class Test {
	int a;
	static int s = 0;
}

public class Z04_Re {
	
	static int[] arr1 = new int[6];
	static int[] www = {2,4,6,8};
	
	static void a(int[] arr, int step, int end, int save[]) {
		if( step == end) {
			System.out.println(Arrays.toString(save));
		}
		else {
			for(int i = 0; i < end; i++) {
				// 여기서 중복 검사를 해주어야 한다.
				// save[0]부터 save[step-1]까지 중복하지 않은
				// 수를  save[step]에 넣어야 한다.
				
				boolean check = false;
				for(int j = 0; j < step; j++) {
					if(save[j] == arr[i]) {
						check = true;
						break;
					}
				}
				if(check == true) continue;
				
				save[step] = arr[i];
				a(arr, step+1, end, save);	
			}
				
		}
	}
	

	
	static void c(int start, int end, int step) {
		if(start == end) {
			System.out.println();
		}
		else {
			System.out.println(start + " ");
			c(start+1, end, step);
			
		}
	}
	
	static int d(int start, int end) {

		if(start == end) {
			return end;
		}
		else {
			return start + d(start+1, end);
		}
		
	}
	
	static int f(int n, int pos) {
		if(pos < 1) {
			return n % 10;
		}
		else {
			return n % 10 + f(n/10, pos - 1);
		}
	}
	
	static void g(int n , int[] arr) {
		if ( n >= arr.length) {
			// 종료파트
			System.out.println(Arrays.toString(arr));
		} 
		else {
			arr[n] = 0;
			g(n+1, arr);
			arr[n] = 1;
			g(n+1, arr);
		}
	}
	
	static void h(int n) {
		if(n == arr1.length) {
			System.out.println(Arrays.toString(arr1));			
		}
		else {
			arr1[n] = 0;
			h(n+1);
			arr1[n] = 1;
			h(n+1);
			arr1[n] = 2;
			h(n+1);
		}
	}
	
	static void k(int n, int[] arr) {
		if( n >= arr.length) {
			for(int i = 0; i < n; i++)
				System.out.print(www[arr[i]]+" ");
			System.out.println("");
		}
		else {
			boolean[] check = new boolean[arr.length];
			for (int i = 0; i <n; i++) {
				check[arr[i]] = true;
				
			}
			// 사용하지 않은 숫자들만 채우고 재귀호출
			for (int i = 0; i < check.length; i++) {
				// true라면 사용한거
				if(!check[i]) {
					arr[n] = i;
					k(n+1, arr);
				}
			}
				
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 1, 9, 8, 3};
		int[] save = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println();
//		}

		
		
//		System.out.println();
//		c(0, 10, 2);
//		
//		
//		System.out.println("--------------");
//		System.out.println(d(1,10));
//		
//		int num = 1357;
//		System.out.println("--------------");
//		System.out.println(f(num,4));
//		
//		System.out.println("--------------");
//
//		
//		int grr[] = {0, 0, 0};
//		int krr[] = {0, 0, 0, 0, 0};
//		g(0, grr); // 3자리 2징수
//		h(0); // 5자리 3진수
		
		a(arr, 0, arr.length, save);
		
//		k(0, new int[4]);
		
	}
}
