import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * 최대상금
 * Backtracking, 169ms
 */
public class Solution_1244_최대상금_서민규샘_백트래킹 {
	public static int max; // 최대 상금 금액
	public static HashSet<String> s = new HashSet<String>(); // 가지치기해서 같은 숫자 있는거 볼려고 사용
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= TC; testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			int[] num = new int[s.length()];
			for (int i = 0; i < num.length; i++) {
				num[i] = s.charAt(i) - '0';
			}
			int N = Integer.parseInt(st.nextToken());
			
			max = 0; // 전역변수는 다음 testCase의 값에 영향이 없도록 초기화 해야 한다.
			find(num, N);
			
			System.out.println("#" + testCase+ " " + max);
			
		} // end of testCase
		
	} // end of main
	public static void find(int[] num, int N) {
		// num 숫자 배열의 값을 int형의 금액으로 변경
		int val = 0;
		for (int i = 0; i < num.length; i++) {
			val = val*10 + num[i];
		}
		String str = "" + val + N;
		if(s.contains(str)) { // 포함되었으면, 이미 체크한 상황이므로, 재귀호출을 종료
			return; // 가지치기
		} else {
			s.add(str);
		}
		
		if(N == 0) { // 종료 파트
			if(max < val) { // 현단계에서 구한 상금이 최대상금일 경우 max에 업데이트하기
				max = val;
			}
		} else { // 재귀파트
			for (int i = 0; i < num.length-1; i++) { // 교환할 첫번째 숫자
				for (int j = i+1; j < num.length; j++) { // 교환할 두번째 숫자
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					find(num, N-1);
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;	
				}
				
			}
		}
		
	}
} // end of class