package algo0401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution_4796_의석이의우뚝선산_김성식 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int t = 1; t <= tc; t++) {
			int N = sc.nextInt();
			
			int preNum = sc.nextInt();
			int bigCnt = 0;
			int smaCnt = 0;
			
			int bigflag = 0;
			int smaflag = 0;
			
			int sum = 0;
			
			
			int mode = 0; // 1이 올라가는거 2가 내려가는거
			for (int i = 1; i < N; i++) {
				int num = sc.nextInt();
				
				// 이전거 보다 크다면
				if(preNum < num) {
					// 이미 내려간 적이 있으면 0
					if(smaflag == 1) {
						//계산 파트
						sum += 1 + (bigCnt - 1) + (smaCnt - 1) +
								(bigCnt - 1) * (smaCnt - 1);
						bigCnt = 0;
						smaCnt = 0;
						smaflag = 0;

					}
					bigCnt++;
					bigflag = 1;
				}
				if(preNum > num && bigflag == 1){
					// 올라가는 중이었으면
					// 이전거 보다 작다면 continue
					smaCnt++;
					smaflag = 1;
					//내려가는데 마지막이라면
					if(i == N - 1) {
						//계산 파트
						sum += 1 + (bigCnt - 1) + (smaCnt - 1) +
								(bigCnt - 1) * (smaCnt - 1);
					}
				}
				preNum = num;
			} // end of for
			
			System.out.println("#"+t+" "+sum);
		}

	} // end of main
} // end of class
