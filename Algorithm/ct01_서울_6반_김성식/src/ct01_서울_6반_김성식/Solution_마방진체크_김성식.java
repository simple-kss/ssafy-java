package ct01_서울_6반_김성식;

public class Solution_마방진체크_김성식 {
	public static boolean odd(int arr[][]) {
		int rLen = arr.length;
		int cLen = arr[0].length;
		// 처음 합 구하기
		int sum = 0;
		int reSum = 0;
		for(int i = 0; i < rLen; i++ ) {
			reSum += arr[0][i];		
		}
		// 홀수 마방진
		
		for(int i = 0; i < rLen; i++ ) {
			sum = 0;
			for(int j = 0; j < cLen; j++ ) {
				sum += arr[i][j];
			}
			if(sum != reSum) return false;
		}
		
		for(int i = 0; i < rLen; i++ ) {
			sum = 0;
			for(int j = 0; j < cLen; j++ ) {
				sum += arr[j][i];
			}
			if(sum != reSum) return false;
		}
		
		// 오른쪽 대각선
		sum = 0;
		for(int i = 0; i < rLen; i++ ) {
			for(int j = 0; j < cLen; j++ ) {
				if(i + j == rLen - 1) sum += arr[i][j];
			}
		}
		if(sum != reSum) return false;
		
		// 왼쪽 대각선
		sum = 0;
		for(int i = 0; i < rLen; i++ ) {
			for(int j = 0; j < cLen; j++ ) {
				if(i == j) sum += arr[i][j];
			}
		}		
		if(sum != reSum) return false;
		
		return true;
	}
	
	
	public static boolean even(int arr[][]) {
		int rLen = arr.length;
		int cLen = arr[0].length;
		// 처음 합 구하기
		int sum = 0;
		int reSum = 0;
		
		for(int i = 0; i < rLen; i++ ) {
			reSum += arr[0][i];		
		}
		
		// 짝수 마방진 가로검사
		
		for(int i = 0; i < rLen; i++ ) {
			sum = 0;
			for(int j = 0; j < cLen; j++ ) {
				sum += arr[i][j];
			}
			if(sum != reSum) return false;
		}
		
		for(int i = 0; i < rLen; i++ ) {
			sum = 0;
			for(int j = 0; j < cLen; j++ ) {
				sum += arr[j][i];
			}
			if(sum != reSum) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		//홀수 마방진
		int oArr1[][] = {
				{17, 24, 1, 8, 15},
				{23, 5, 7, 14, 16},
				{4, 6, 13, 20, 22},
				{10, 12, 19, 21, 3},
				{11, 18, 25, 2, 9}
		};
		//홀수 마방진 x
		int oArr2[][]= {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}				
		};
		
		//짝수 마방진
		int oEven1[][] = {
				{1, 15, 14, 4},
				{12, 6, 7, 9},
				{8, 10, 11, 5},
				{13, 3, 2, 16}				
		};
		//짝수 마방진x
		int oEven2[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}				
		};
		
		System.out.println(odd(oArr1));
		System.out.println(odd(oArr2));
		System.out.println(even(oEven1));
		System.out.println(even(oEven2));
	}
}
