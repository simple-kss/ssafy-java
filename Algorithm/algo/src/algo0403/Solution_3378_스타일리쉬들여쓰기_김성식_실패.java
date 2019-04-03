package algo0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3378_스타일리쉬들여쓰기_김성식_실패 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(stk.nextToken());
			int M = Integer.parseInt(stk.nextToken());
			
			// 10개의 식 R, C, S
			int eq[][] = new int[10][4];
			
			// N개의 문자열 입력받기
			for (int i = 0; i < N; i++) {
				String s = br.readLine();
				// N개의 문자열에 해당하는 식
				
				if(i == 0) {
					for (int j = 0; j < s.length(); j++) {
						switch(s.charAt(j)) {
						case '(':
							eq[i][0]++;
							break;
						case '{':
							eq[i][1]++;
							break;
						case '[':
							eq[i][2]++;
							break;
						case ')':
							eq[i][0]--;
							break;
						case '}':
							eq[i][1]--;
							break;
						case ']':
							eq[i][2]--;
							break;
						
						}
					}
				}
				else {
					eq[i][0] = eq[i-1][0];
					eq[i][1] = eq[i-1][1];
					eq[i][2] = eq[i-1][2];
					boolean check = false;
					
					for (int j = 0; j < s.length(); j++) {
						switch(s.charAt(j)) {
						case '(':
							check = true;
							eq[i][0]++;
							break;
							
						case '{':
							check = true;
							eq[i][1]++;
							break;
							
						case '[':
							check = true;
							eq[i][2]++;
							break;
							
						case ')':
							check = true;
							eq[i][0]--;
							break;
							
						case '}':
							check = true;
							eq[i][1]--;
							break;
							
						case ']':
							check = true;
							eq[i][2]--;
							break;
						case '.':
							if(!check)
								eq[i-1][3]++;
							break;
						default:
							check = true;
							break;
						} // end of switch
					}  // end of for
				} // end of else
				
			} // end of for input string of N
			
			//식 입력 끝
			// N - 1개의 식 
			
			
			int R = -1;
			int C = -1;
			int S = -1;
			
			int cnt = 0;
			
			// 완탐한다. N-1개의 식을 만족할떄 까지 완탐
			for (int i = 1; i <= 20; i++) {
				for (int j = 1; j <= 20; j++) {
					for (int k = 1; k <= 20; k++) {
						boolean check = true;
						for (int n = 0; n < N-1; n++) {
							// N-1개의 식이 다 만족하는지 구한다.
							if(eq[n][3] != (eq[n][0] * i + eq[n][1] * j + eq[n][2] * k)) {
								check = false;
								break;
							}
						}
						if(check) {
							cnt++;
							R = i;
							C = j;
							S = k;
						}
					}					
				}
			}
			// 끝
			
			// M개의 문자열 입력받기
			// M개의 문자열에 대해서 괄호 연거를 센다.
			
			StringBuilder sb = new StringBuilder();
			int mq[][] = new int [M][4];
			for (int i = 0; i < mq.length; i++) {
				mq[i][3] = -1;
			}
			for (int i = 0; i < M; i++) {
				String s = br.readLine();
				if( i >= 1) {
					mq[i][0] = mq[i-1][0];
					mq[i][1] = mq[i-1][1];
					mq[i][2] = mq[i-1][2];
				}
				
				for (int j = 0; j < s.length(); j++) {
					switch(s.charAt(j)) {
					case '(':
						mq[i][0]++;
						break;
					case '{':
						mq[i][1]++;
						break;
					case '[':
						mq[i][2]++;
						break;
					case ')':
						mq[i][0]--;
						break;
					case '}':
						mq[i][1]--;
						break;
					case ']':
						mq[i][2]--;
						break;
					}
				}
			}
			
			// 각자 다 구했다면 그것을 적용, 그리고 해가 1개일 때 
			if( cnt == 1 && R != -1 && C != -1 && S != -1 ) {
				for (int i = 0; i < M-1; i++) {
					int sum = mq[i][0] * R + mq[i][1] * C + mq[i][2] * S;
					sb.append(sum).append(' ');
				}
				
				System.out.print("#"+t+" "+"0"+" ");
				System.out.println(sb);
				return;
			}
			else {
				// 해가 2개면 특정한 값으로 나온게 아님
				// 각자 다 구하지 않았으면 배수로 적용
				// mq에는 R C S가 몇개있는지 저장됨
				// eq에는 R C S가 몇개에 공백 몇개인지 저장딤
				
				// mq가 eq로 나뉘어져야함.
				// 0번쨰부터 mq와 eq를 나누어 덜어지는 지 확인
				for (int i = 0; i < M-1; i++) {
					
					// 3개를 확인해야함
					if(mq[i][0] > eq[i][0] || mq[i][1] > eq[i][1] || mq[i][2] > eq[i][2]) {
						// 0인거 셈
						// 0이 아닌거만 저장
						int[][] mmq = new int[2][3];
						int[][] eeq = new int[2][3];

						int count = 0;
						int ch = 0;
						// 0이 아닌거 압축
						for(int j = 0; j < 3; j++) {
							if( mq[i][j] == 0 || eq[i][j] == 0) 
								continue;
							
						}
						
						
						if((mq[i][0] % eq[i][0] == 0)
								&& (mq[i][1] % eq[i][1] == 0)
								&& (mq[i][2] % eq[i][2] == 0)) {
								
							if(mq[i][0] / eq[i][0] == mq[i][1] / eq[i][1]
								&& mq[i][0] / eq[i][0] == mq[i][2] / eq[i][2]) {
								mq[i][3] = (mq[i][0] / eq[i][0]) * eq[i][3];
							}
						}

						
					}
					else {				
						// 나누어 떨어진다면
						if((eq[i][0] % mq[i][0] == 0)
								&& (eq[i][1] % mq[i][1] == 0)
								&& (eq[i][2] % mq[i][2] == 0)) {
							if(eq[i][0] / mq[i][0] == eq[i][1] / mq[i][1]
									&& eq[i][0] / mq[i][0] == eq[i][2] / mq[i][2]) {
								mq[i][3] = eq[i][3] / (eq[i][0] / mq[i][0]);
							}
						}
					}
					// 다 구했다 sb appen 하자
					sb.append(mq[i][3]).append(' ');
				}
				
				System.out.print("#"+t+" "+"0"+" ");
				System.out.println(sb);
				
			}
			//System.out.println(R + " " + C + " " + S);
		}

	} // end of main

	
} // end of class