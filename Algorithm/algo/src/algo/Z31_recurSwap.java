package algo;

import java.util.Arrays;

public class Z31_recurSwap {

	static int[] arr = {4,2,1,3};
	
	public static void main(String[] args) {
		perm(4,0);	//n: 원소의 개수, k: 현재까지 교환된 원소의 개수
	}//end of main

	private static void perm(int n, int k) {
		if(k==n) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		else {
			for (int i = k; i < n; i++) {
				swap(k,i);
				perm(n, k+1);
				swap(k,i);
			}
		}
		
	}//end of perm()

	private static void swap(int k, int i) {
		int tmp = arr[k];
		arr[k]=arr[i];
		arr[i]=tmp;
	}
	
}//end of class
