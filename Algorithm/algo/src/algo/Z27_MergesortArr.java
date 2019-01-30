package algo;

import java.util.Arrays;

/**
 *
 * 병합정렬2 - 배열 사용
 *
 *
 */

public class Z27_MergesortArr {
	static int[] temp;
	public static void merge(int[] arr, int left, int mid, int right) {
		// 2개를 합치면서 정렬
		
		// int[] temp = new int[right-left]; // 병합하면서 저장할 임시 배열
		
		// 원본이랑 같이 간다고 생각한다.
		int l = left; // 왼쪽 배열의 index 시작값
		int r = mid; // 오른쪽 배열의 index
		int index = left; // 병합한 배열의 index
		
		// 양쪽에 모두 원소가 남은 경우
		while(l < mid && r < right) {
			if( arr[l] < arr[r] ) {
				temp[index++] = arr[l++];
			}
			else {
				temp[index++] = arr[r++];
			}
			
		}
		
		// 왼쪽만 원소가 남은 경우
		// System.arraycoppy를 쓰자!
		
		System.arraycopy(arr, l, temp, index, mid-l);
		// 오른쪽만 원소가 남은 경우
		System.arraycopy(arr, r, temp, index, right-r);
		
		
		// 병합 완료된 temp를 원본 arr에 복사하기
		System.arraycopy(temp, left, arr, left, right-left);
		
	}
	
	public static void mergeSort(int[] arr, int left, int right) {
		if(right - left <= 1) { // 종료 파트
			return;
		}
		else { // 반복 파트
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid, right);
			merge(arr, left, mid, right) ; // mid를 중심으로 영역을 반 나눔
			return;
		}
	}
	
	

	public static void main(String[] args) {
		int[] arr = {6, 4, 8, 5, 7, 2, 9, 3, 0, 1};
		temp = new int[arr.length];
		System.out.println(Arrays.toString(arr));
		mergeSort(arr, 0, 10);
		System.out.println(Arrays.toString(arr));
		

	}

}
