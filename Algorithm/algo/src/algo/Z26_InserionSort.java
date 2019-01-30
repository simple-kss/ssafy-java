package algo;

import java.util.Arrays;
import java.util.Random;

public class Z26_InserionSort {

	public static void main(String[] args) {
		int[] arr = new int[60000];
		long time = System.currentTimeMillis(); // 현재 시스템으 시각 1970.01.01 0:0:0.0 ms
//		System.out.println(Arrays.toString(arr));
		
		Random ran = new Random();
		
		for(int i = 0; i < 60000; i++) {
			arr[i] = ran.nextInt(60000);
			
		}
		
		// 내것이 왼쪽거보다 작고 오른쪽거보다 크면 정지
		// 그렇지 않으면 왼쪽으로 이동
		for(int i = 0 ; i < arr.length; i++) {
			int j = i;
			if(j == 0 || j == arr.length ) continue;
			//&& arr[j] < arr[j+1]
			while(!(arr[j] > arr[j-1] )) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
				
				if(j-1 < 0 || j == arr.length) break;
			}
		}
		
//		민규썜이 짠거		
//		for(int i = 1 ; i < arr.length; i++) {
//			for(int j = i -1; j >= 0 ; j--) {
//				if(arr[j+1] < arr[j]) {
//					int temp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j] = temp;
//				}
//				else
//					break;
//			}
//		}
		
		// 삽입정렬.... 구현!!
		
		// 삽입할 위치를 찾을 때 이진 검색트리를 사용하낟.
		// 근데 퀵정렬이 빠르니 이진 검색트리를 사용
//		System.arraycopy(src, srcPos, dest, destPos, length); // 영역을 통쨰로 복사
		// 이거쓰면 시간을 엄청 단축할 수 있다.
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(System.currentTimeMillis() - time + "ms");
	} // end of main
} // end of class
