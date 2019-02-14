import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;



/**
 * 
 * 최대상금
 * Greedy 122ms 빠르다.
 *
 */
public class Solution_1244_최대상금_선생님 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= TC; testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken(); // 숫자판의 값
			Integer [] num = new Integer[s.length()]; // 숫자판의 각 숫자를 저장할 배열
			for (int i = 0; i < num.length; i++) {
				num[i] = s.charAt(i) - '0'; // char -> int 숫자값으로 변경
			}

			int N = Integer.parseInt(st.nextToken()); // 교환회수
			
			// 동일한 숫자를 교환했는지 체크하기 위한 ArrayList를 담은 배열을 준비
			ArrayList<Integer>[] check  = new ArrayList[10];
			for(int i = 0; i < check.length; i++ ) {
				check[i] = new ArrayList<Integer>();
			}
			
			
			// 선택정렬
			for(int i = 0; i < num.length && N > 0; i++) {
				int maxIndex = i; // 가장 큰 숫자의 index
				for(int j = i; j < num.length; j++) {
					if(num[maxIndex] <= num[j]) { // 2737 1 -> 7732
						// j가 크면 바꾸어라
						maxIndex = j;
					}
				}
//				num[maxIndex] <-> num[i] swap
				// 최대 숫자의 위치가 MSB위치가 아닐때만 교환 312 1 => 321
				if(num[maxIndex] != num[i]) {
					int temp = num[maxIndex];
					num[maxIndex] = num[i];
					num[i] = temp;
					N--; // 교환횟수 감소
					
					// 교환시 동일한 숫자가 교환이 되면, 떠난자리를 기억했다가 (떠난 자리의 숫자들만) 교환 횟수의 감소없이 재정렬
					// 교환 후 시점, 최대숫자의 값 : temp, 최대숫자가 떠난 자리 : maxIndex
					ArrayList<Integer> alNum = check[temp]; // temp 최대 숫자의 떠난 자리를 기억하고 있는 ArrayList
					alNum.add(maxIndex); // 떠난 자리 추가
					// ArrayList크기 2개 이상이되면 재배치르 ㄹ 하자.
					
					if(alNum.size() >= 2) { // 떠난 자리가 2개 이상되면, 재정렬 작업 진행
						Collections.sort(alNum); // 떠난자리 index를 오름차순으로 정렬
						for(int j = 0; j < alNum.size(); j++) { // 선택정렬로 가자
							int maxI = alNum.get(j);
							for(int k = j; j < alNum.size(); k++) {
								if (num[maxI] < num[alNum.get(k)]) {
									maxI = alNum.get(k);
								}
							}
//							num[alNum.get(j)] <-> num[maxI] swap
							int tempN = num[alNum.get(j)];
							num[alNum.get(j)] = num[maxI];
							num[maxI] = tempN;
						}
					}
					
					
					
				}
			}
			
			// 똑같은 숫자가 한쌍이라도 있으면, 값의 변화 없이 교환횟수를 줄일 수 있다.
			HashSet<Integer> hs = new HashSet<Integer>( Arrays.asList(num) ); // 배열 -> List -> HashSet
			// num을 List로 만들어줌
			
			
			
			// 내림차순 정렬이 끝났는데도, 교환 횟수가 남은 경우
			// 자리수의 가치가 적은 LSB를 교환한다. (뒤쪽에있는 숫자 2개를 교환한다.)
			// 그리고 같은 숫자가 하나도 없는 경우 진행해라
			if( N % 2 == 1 && hs.size() == num.length) { // 홀수일 경우 (1회만 바꾸기, 끝자리 2개)
//				num.length-1 <-> num.length-2 swap
				int temp = num[num.length-1];
				num[num.length-1] = num[num.length-2];
				num[num.length-2] = temp;
			}
			else { // 짝수일 경우 (
				
			}
			
			
			System.out.println("#"+testCase+" ");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]);
			}
			System.out.println();
		} // end of testCase

	} // end of main

} // end of class