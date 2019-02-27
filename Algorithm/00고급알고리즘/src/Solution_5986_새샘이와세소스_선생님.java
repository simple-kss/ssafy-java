import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_5986_새샘이와세소스_선생님 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());

		// 1.소수 배열 만들기, 소수: false
		int MAX = 1000;
		boolean[] compo = new boolean[MAX];
		compo[0] = compo[1] = true;
		for (int i = 2; i < MAX; i++) {
			for (int j = i * 2; j < MAX; j += i) {
				compo[j] = true;
			}
		}

		// 2. compo 배열에서 3개의 값을 꺼내 만들어 지는 합의 숫자를 카운트 하기
		int[] cnt = new int[MAX];
		for (int i = 2; i < MAX; i++) {
			if (compo[i])
				continue;
			for (int j = i; i + j < MAX; j++) {
				if (compo[j])
					continue;
				for (int k = j; i + j + k < MAX; k++) {
					if (compo[k])
						continue;
					cnt[i + j + k]++;
				}
			}
		}
        
		for (int z = 1; z <= testCase; z++) {
			sb.append("#").append(z).append(" ");
			int N = Integer.parseInt(br.readLine());
			sb.append(cnt[N]);
			sb.append("\n");
		}
		System.out.print(sb);

	}// end of main

}// end of class