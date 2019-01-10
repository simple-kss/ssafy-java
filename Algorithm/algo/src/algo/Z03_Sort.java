package algo;
import java.util.Arrays;

/**
 * [정렬]
 * (1초)
 * 카운팅 정렬 O[N]			// 가장 빠른 정렬 방법 : 제약사항, 정렬할 데이터가 정수(0 이상의 정수)
 * 	// 실수도 안되고, 문자열도 안된다.
 * 
 * 
 * (1분)
 * 퀵정렬		O[NlogN]	// 구현하기 어렵다, 시간이 중간정도 빠르다.
 * 병합정렬	O[NlogN]
 * 힙정렬		O[NlogN]
 * 
 * (10년)
 * 거품정렬	O[N^2]		// 구현하기 쉽다, 상대적으로 시간이 많이 걸린다.
 * 선택정렬	O[N^2]		// 얘가 더 쉽다.
 * 삽입정렬	O[N^2]
 * 
 * @author student
 *
 */
public class Z03_Sort {
	public static void main(String[] args) {
		// 거품 정렬
		// 0~n-1
		// 0~n-2
		int[] arr = {10,5,5,8,3,7,4,6,4,9,2};
		// 11 -> 5 max i = 10
		for(int j = arr.length - 1; j >= 0 ; j--) {
			for (int i = 0; i < j; i++) { 
				if(arr[i] > arr[i+1]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			if(j == arr.length / 2 )
				break;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length/2);
		System.out.println(arr[arr.length/2]);
		
		
		
		
	}

}
