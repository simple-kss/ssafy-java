package algo;

import java.util.Arrays;

public class Z26_InserionSort {

	public static void main(String[] args) {
		int[] arr = {4, 1, 7, 0, 5, 6, 8, 2, 9, 3};
		System.out.println(Arrays.toString(arr));
		
		// 내것이 왼쪽거보다 작고 오른쪽거보다 크면 정지
		// 그렇지 않으면 왼쪽으로 이동
		for(int i = 0 ; i < arr.length; i++) {
			int j = i;
			if(j == 0 || j == arr.length ) continue;
			while(!(arr[j] > arr[j-1])) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
				
				if(j-1 < 0 || j == arr.length) break;
			}
		}
		
		// 삽입정렬.... 구현!!
		
		System.out.println(Arrays.toString(arr));
	} // end of main
} // end of class
