package algo;

import java.util.Iterator;
import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		int data[] = {7,4,2,0,0,6,0,7,0};
		
		int maxCnt = 0; // 최대 낙차
		
		for (int i = 0; i < data.length; i++) {
			int cnt = 0; // 각 칸의 박스 낙차수 카운팅
			for (int j = i+1; j < data.length; j++) {
				if(data[i] > data[j]) {
					cnt++;
				}
				
			}
			if (maxCnt < cnt) maxCnt = cnt;
		}
		System.out.println(maxCnt);
		

//		------------------------------
//		int arr[][] = new int[8][9];
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < data[i]; j++) {
//				arr[7-j][i] = 1;			
//			}			
//		}
//		
//		// 오른쪽으로 90도 회전
//		int[][] nbox = new int[9][8];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				nbox[j][7-i] = arr[i][j];
//				
//			}
//			
//		}
//		
//		int maxCnt= 0;
//		// 중력을 아래쪽으로 발생시켜서 이동 , 밑에서부터 해나가겠다.
//		for (int i = nbox.length -2; i >= 0 ; i--) { // 9행 8~0
//			for (int j = 0; j < nbox[i].length; j++) {
//				int cnt = 0; // nbox[i][j]의 박스가 몇칸 떨어졌는지 누적할 변수
//				for(int k = 0; k < nbox.length; k++ ) {
//					// 박스가 떨어지려면, 난 박스여야하고 아래칸은 공간이어야 한다! index가 유효한지도 체크
//					if(i+k + 1 < nbox.length && nbox[i+k][j] == 1 && nbox[i+k+1][j] == 0) {
//						nbox[i+k][j] = 0;
//						nbox[i+k+1][j] = 1;			
//						cnt++;
//						
//					}
//					if (maxCnt < cnt) maxCnt = cnt;
//				}				
//			}
//		}
//		
//		System.out.println(maxCnt);
//		// 각 박스마다 낙차를 구하기
//		// 각 박스들의 낙차의 최댓값을 구해서 출력하기
//		
		
//		int arr[][] = new int[8][9];
//		
//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j < 9; j++) {
//				arr[i][j] = scan.nextInt();	
//			}			
//		}
//		
//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j < 9; j++) {
//				System.out.print(arr[i][j]);			
//			}			
//			System.out.println("");
//		}
//		
//		int in = -1;
//		int prevIn = 0;
//		int cnt = 0;
//		int max = 0;
//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j < 9; j++) {
//				if(arr[i][j] == 1) {
//					if(in != -1) {
//						prevIn = j;
//						cnt = prevIn - in;
//						if ( max < cnt) {
//							max = cnt;
//						}
////						System.out.println(max);
//						in = prevIn;
//					}
//					else
//						in = j;
//					
//				}
//			}
//			in = -1;
//			cnt = 0;
//		}
//		System.out.println(max);
//		
		

	}

}

