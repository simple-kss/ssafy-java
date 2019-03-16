import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1244 {
	static int max; // 제일 큰 값 저장할 변수
	static int[] jari = {1, 10, 100, 1000, 10000, 100000};

	public static void recur(int[] arr, int step, int end) {
		if(step == end) {
			// arr배열의 숫자를 sum에 저장
			int sum = convert(arr);
//			System.out.println(Arrays.toString(arr));
			if(max < sum)
				max = sum;
			// 가장 큰 값 검사
			return;
		}
		else {
			// 각자 하나씩만 바꾸고  바로 실행
			int len = arr.length;
			for(int i = 0; i < len-1; i++) {
				int temp = arr[i];
				for(int j = i; j < len; j++) {
					// 변환하는게 큰 경우만 하기
					// 와 이걸 넣었더니 훨씬 빨라지네....
					if(arr[j] > arr[i]) {
						arr[i] = arr[j];
						arr[j] = temp;
						recur(arr, step+1, end);
						// 상태 되돌리기
						arr[j] = arr[i];
						arr[i] = temp;
					}
				} // end of for 2
			} // end of for 1
		} // end of else
	}
	
	// arr 배열을 숫자로 변환
	public static int convert(int[] arr) {
		int len = arr.length;
		int sum = 0;
		for(int i = 0; i < len; i++) {
			sum += arr[len-i-1] * jari[i];
		}
		return sum;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());
		for(int t = 1 ; t <= tc; t++) {
			max = 0;
			// 123 1 이런식으로 들어올 예정
			// 123과 1을 짜른뒤 123을 먼저 숫자로 변환하여 arr[i]에 넣을거임
			String[] stArr = br.readLine().split(" ");
			String[] numArr = stArr[0].split("");
			int numArrLen = numArr.length;
			int[] arr = new int[numArrLen];
			for(int i = 0; i < numArrLen; i++) {
				int num = Integer.parseInt(numArr[i]);
				arr[i] = num;
			}
			
			int cnt = Integer.parseInt(stArr[1]);
			
//		System.out.println(max);
			// 2회 반복
			// 재귀로 풀어야할거 같은데...
			
			max = convert(arr);
			recur(arr, 0, cnt);
			sb.append('#').append(t).append(' ').append(max).append('\n');
		} // end of test case
		System.out.println(sb.toString());
		
	} // end of main
} // end of class
