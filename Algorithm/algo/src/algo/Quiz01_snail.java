package algo;

import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;

public class Quiz01_snail {
	
	static int[] num;
	static int k;
	
	public static void func(int[][] arr, int s, int l) {
		for(int i = s; i < l; i++) {
			arr[s][i] = num[k++];
			
		}
		for(int i = s; i < l; i++) {
			arr[i][l] = num[k++];			
		}
		for(int i = l; i > s; i--) {
			arr[l][i] = num[k++];		
			
		}
		for(int i = l; i > s; i--) {
			arr[i][s] = num[k++];			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{ 9, 20,  2, 18, 11},
				{19,  1, 25,  3, 21},
				{ 8, 24, 10, 17,  7},
				{15,  4, 16,  5,  6},
				{12, 13, 22, 23, 14}
		};
		
		num = new int[arr.length * arr[0].length];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num[k++] = arr[i][j];				
			}			
		}
		
		Arrays.sort(num);
		
		
		
		
		

		//4와 0을 바꾸기
		func(arr, 0, 4);
//		for(int i = 0; i < 4; i++) {
//			arr[0][i] = num[k++];
//			
//		}
//		for(int i = 0; i < 4; i++) {
//			arr[i][4] = num[k++];			
//		}
//		for(int i = 4; i > 0; i--) {
//			arr[4][i] = num[k++];		
//			
//		}
//		for(int i = 4; i > 0; i--) {
//			arr[i][0] = num[k++];			
//		}
		
		
		System.out.println(Arrays.toString(num));
		
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				min = arr[i][j];
//				minI = i;
//				minJ = j;
//				
//				for (int k = i; k < 5; k++) {
//					if(k == i) {
//						for (int l = j; l < 5; l++) {
//							if(min > arr[k][l]) {
//								min = arr[k][l];
//								minI = k;
//								minJ = l;								
//							}						
//						}
//					}
//					else {
//						for (int l = 0; l < 5; l++) {
//							if(min > arr[k][l]) {
//								min = arr[k][l];
//								minI = k;
//								minJ = l;								
//							}						
//						}
//					}					
//				}
//				int temp = arr[minI][minJ];
//				arr[minI][minJ] = arr[i][j];
//				arr[i][j] = temp;
//				// 여기다가 1차원 배열을 담는다.
//				num[cnt] = arr[i][j];
//				cnt++;
//			}
//		}
		
		// 1차원 배열 담는다.
		
		for (int _i = 0; _i < 5; _i++) {
			for (int _j = 0; _j < 5; _j++) {
				System.out.printf("%3d ",arr[_i][_j]);
			}
			System.out.println();
		}
		
		
		
	} //end of main
} //end of class

		
		
		
		
		
		
//		for (int k = 0; k < 5; k++) {
//			for (int l = 0; l < 5; l++) {
//				
//				for (int i = k; i < 5; i++) {
//					if(i == k) {
//						for (int j = l; j < 5; j++) {
//							if(arr[i][j] < min) {
//								minI = i;
//								minJ = j;
//								min = arr[i][j];					
//							}
//						}						
//					}
//					else {
//						for (int j = 0; j < 5; j++) {
//							if(arr[i][j] < min) {
//								minI = i;
//								minJ = j;
//								min = arr[i][j];					
//							}
//						}							
//					}
//		
//				}
//				result[k][l] = arr[minI][minJ];				
//			}
//		}
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.printf("%d ",result[i][j]);
//			}
//			System.out.println();			
//		}

