package algo;

/*
 * PowerSet : 어떤한 집합의 모든 부분집할을 원소로 하는 집합
 * 반복문, 바이너리카운팅, 재귀
 * 
 */


// 바이너리카운팅은 쉽게 만들 수 있음
// 0000부터 1111까지

public class Z07_PowerSet {
	public static void main(String[] args) {
		// 바이너리 카운팅
		int[] arr = {-7,-3,-2,5,8};
		for (int i = 0; i < ( 1 << arr.length ); i++) {
			int sum = 0;
			// 가장 마지막 원소
			for(int j = 0; j < arr.length; j++) {
				
				if((i & 1 << j) != 0) {
					sum += arr[j];
					System.out.print(arr[j] + " ");
				}
				
			}
			if(sum == 0) System.out.println("0됐다!");
			System.out.println();			
		}
	
		int[] l = { 1, 3, 5, 7};
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					for (int m = 0; m < 2; m++) {
						if(i == 1) System.out.print(arr[0] + " ");
						if(j == 1) System.out.print(arr[1] + " ");
						if(k == 1) System.out.print(arr[2] + " ");
						if(m == 1) System.out.print(arr[3] + " ");
						System.out.println("==>  "+i+","+j+","+k+","+m);
					}
				}
				
			}
			
		}
	} // end of main
} // end of class
