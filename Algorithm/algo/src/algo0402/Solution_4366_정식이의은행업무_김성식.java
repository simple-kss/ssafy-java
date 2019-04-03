package algo0402;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4366_정식이의은행업무_김성식 {
	private static long[] two;
	private static long[] thr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		two = new long[41];
		thr = new long[41];
		
		//먼저 1 <= 2, 3 <= 40자리이므로
		// 각자 자리수에 해당하는 값을 구하자!
		
		two[1] = 1;
		thr[1] = 1;
		for(int i = 2; i <= 40; i++) {
			two[i] = two[i-1] * 2;
		}
		for(int i = 2; thr[i-1] <= two[40]; i++) {
			thr[i] = thr[i-1] * 3;
		}
		
		
		for(int t = 1; t<= tc; t++) {
			char[] tbrC = br.readLine().toCharArray();
			char[] ttrC = br.readLine().toCharArray();
			
			char[] brC = tbrC.clone();
			char[] trC = ttrC.clone();

			// reverse
			for (int i = 0; i < brC.length; i++) {
				brC[i] = tbrC[brC.length - i - 1];
			}
			
			for (int i = 0; i < trC.length; i++) {
				trC[i] = ttrC[trC.length - i - 1];
			}
			
			long brSum = 0L;
			// 하나씩 바꿔가면서 생각해본다.
xx:			for (int i = 0; i < brC.length; i++) {
				brSum = 0L;
				if(brC[i] == '1') {
					brC[i] = '0';
					
					// 이진수 값 계산
					for(int j = 0; j < brC.length; j++) {
						brSum += (brC[j] - '0') * two[j+1];
					}
					
					// 모든 3차원 배열 원소 돌리기
					// thr배열을 2번 돌린다.
					for(int j = 0; j < trC.length; j++) {
						// 2번 돌린다. j번지에 대해서
						char temp = trC[j];
						for(int k = 1; k <= 2; k++ ) {
							// 값을 바꾼다
							if(trC[j] == '1') {
								trC[j] = '2';
								// 바꾸고 계산해본다. 맞는지 안맞는다.
								long sum = threeCalc(trC);
								if(brSum == sum)
									break xx;
							}
							else if( trC[j] == '2') {
								trC[j] = '0';
								// 바꾸고 계산해본다. 맞는지 안맞는다.
								long sum = threeCalc(trC);
								if(brSum == sum)
									break xx;
							}
							else if( trC[j] == '0') {
								trC[j] = '1';
								// 바꾸고 계산해본다. 맞는지 안맞는다.
								long sum = threeCalc(trC);
								if(brSum == sum)
									break xx;
							}
						}
						trC[j] = temp;
					}
					// 길이만큼
					
					brC[i] = '1';
				}
				else {
					brC[i] = '1';
					// 이진수 값 계산
					for(int j = 0; j < brC.length; j++) {
						brSum += (brC[j] - '0') * two[j+1];
					}
					
					// 모든 3차원 배열 원소 돌리기
					// thr배열을 2번 돌린다.
					for(int j = 0; j < trC.length; j++) {
						// 2번 돌린다. j번지에 대해서
						char temp = trC[j];
						for(int k = 1; k <= 2; k++ ) {
							// 값을 바꾼다
							if(trC[j] == '1') {
								trC[j] = '2';
								// 바꾸고 계산해본다. 맞는지 안맞는다.
								long sum = threeCalc(trC);
								if(brSum == sum)
									break xx;
							}
							else if( trC[j] == '2') {
								trC[j] = '0';
								// 바꾸고 계산해본다. 맞는지 안맞는다.
								long sum = threeCalc(trC);
								if(brSum == sum)
									break xx;
							}
							else if( trC[j] == '0') {
								trC[j] = '1';
								// 바꾸고 계산해본다. 맞는지 안맞는다.
								long sum = threeCalc(trC);
								if(brSum == sum)
									break xx;
							}
						}
						trC[j] = temp;
					}
					// 길이만큼
					brC[i] = '0';
				}
			} // end of two for
			
			// tr을 다바꿔본다.
			
			System.out.println("#" + t + " " + brSum);
		}
		
		
		
		

	} // end of main

	private static long threeCalc(char[] trC) {
		long result = 0;
		for (int i = 0; i < trC.length; i++) {
			result += (trC[i] - '0') * thr[i+1];
		}
		return result;
	}

} // end of class