package algo0403;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_3378_스타일리쉬들여쓰기_김성식 {
	private static String[] prr;
	private static String[] qrr;
	private static int[] result;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());

		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int p = Integer.parseInt(st.nextToken()); // 1 <= p, q <= 10
			int q = Integer.parseInt(st.nextToken());

			prr = new String[p]; // 마스터 코드
			qrr = new String[q]; // 유저 코드
			result = new int[q]; // 출력할 결과 저장할 배열

			Arrays.fill(result, -2); // 초기값으로 사용하지 않는 숫자 -2로 초기화

			for (int i = 0; i < p; i++) {
				prr[i] = br.readLine().trim(); // 각 줄은 최대 80자
			}
			for (int i = 0; i < q; i++) {
				qrr[i] = br.readLine().trim(); // 각 줄은 최대 80자
			}

			for (int r = 1; r <= 20; r++) {
				for (int c = 1; c <= 20; c++) {
					for (int s = 1; s <= 20; s++) {
						if (pOK(r, c, s)) { // 마스터 코드를 만족시키는 값인지 확인?
							qCheck(r, c, s); // 유저 코드의 해를 구해서, result 배열에 저장
						}
					}
				}
			}

			StringBuilder sb = new StringBuilder(); // 단일 쓰레드용
			sb.append('#').append(t).append(" 0"); // append를 연속으로 쓰는게 메모리에 유리하다.
			for (int i = 1; i < result.length; i++) {
				sb.append(' ').append(result[i]);
			}
			System.out.println(sb);
		}
	}

	/** 마스터 코드를 만족시키는 값인지 확인 */
	private static boolean pOK(int r, int c, int s) {
		int rr = 0; // () 소괄호 열린 개수
		int cc = 0; // {} 중괄호 열린 개수
		int ss = 0; // [] 대괄호 열린 개수
		int dot = 0; // .의 개수
		// 0 ~ n 번째 줄 까지의 각 괄호의 열린 개수를 구해서 rr * r + cc * c + ss * s == dot 개수만큼 n+1번째 줄에
		// .이 나오는지 검사
		for (int i = 0; i < prr.length; i++) {
			dot = 0;
			String str = prr[i]; // 한 줄의 코드
			int j = 0;
			for (; j < str.length(); j++) {
				if (str.charAt(j) == '.')
					dot++; // 앞쪽에 나오는 연속된 .의 개수를 셈
				else
					break;
			}

			if (rr * r + cc * c + ss * s != dot) return false; // 답이 될 수 없다.
			for (; j < str.length(); j++) { // 괄호의 개수를 셈
				if (str.charAt(j) == '(')	   rr++;
				else if (str.charAt(j) == ')') rr--;
				else if (str.charAt(j) == '{') cc++;
				else if (str.charAt(j) == '}') cc--;
				else if (str.charAt(j) == '[') ss++;
				else if (str.charAt(j) == ']') ss--;
			}
		}
		return true;	// 답이 될 수 있는 r, c, s 쌍이다.
	}

	private static void qCheck(int r, int c, int s) {
		int rr = 0;
		int cc = 0;
		int ss = 0;
		for (int i = 0; i < qrr.length - 1; i++) {
			String str = qrr[i];	// 유저코드의 한 줄을 저장
			for (int j = 0; j < str.length(); j++) {	// 괄호의 개수 세기
				if (str.charAt(j) == '(')	   rr++;
				else if (str.charAt(j) == ')') rr--;
				else if (str.charAt(j) == '{') cc++;
				else if (str.charAt(j) == '}') cc--;
				else if (str.charAt(j) == '[') ss++;
				else if (str.charAt(j) == ']') ss--;
			}
			int dot = rr * r + cc * c + ss * s;
			if(result[i+1] == -2) {	// 처음 저장하는 상황
				result[i+1] = dot;
			} else if(result[i+1] == -1) {	// 답을 정확히 알 수 없는 상황
				
			} else if(result[i+1] >= 0 && result[i+1] != dot) {	// 이미 저장되있는 값이 있고 기존값이랑 현재값이 다르다면, 알수 없다.
				result[i+1] = -1;
			}
		}
	}
}