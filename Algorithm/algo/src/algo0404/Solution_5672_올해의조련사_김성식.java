import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5672_올해의조련사_김성식 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		
		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine().trim());
			char[] c = new char[N];
			
			for (int i = 0; i < c.length; i++) {
				c[i] = br.readLine().charAt(0); // 대문자 한글자
			}
			
			char[] result = new char[N]; // 출력결과
			
			int s = -1; // 앞쪽 앵무새 인덱스
			int e = N; // 뒤쪽 앵무새 인덱스
			
			for (int i = 0; i < c.length; i++) {
				// 앞에 글자랑 뒤에글자랑 비교
				if(c[s+1] < c[e-1] ) {
					result[i] = c[++s];
				}
				else if(c[s+1] > c[e-1]) {
					result[i] = c[--e];
				}
				else { // 두글자가 서로 같은 경우
					// 그 다음글자를 비교한다.
					
					// 역전되지 않도록 한다. 그리고 글자가 다를 떄 까지 j를 증가
					int j;
					for (j = 1; s+j < e-j && c[s+j] == c[e-j] ; j++);
					
					if(c[s+j] < c[e-j]) {
						// 앞쪽 녀석 넣기
						result[i] = c[++s];
					}
					else if(c[s+j] < c[e-j]){
						// 뒤쪽녀석 넣기
						result[i] = c[--e];
					}
					// 인덱스가 역전됐다면. 같은 글자란 얘기
					// 또는 한글자 남았다는 얘기, 아무거나 선택해도 됨. -> 그 땐 아무거나 선택해도 됨
					else {
						result[i] = c[++s];
						
					}
					
				} // end of else
			}
			
			
			
			
			
			
			
			
			System.out.println("#"+T+" "+new String(result));
			
		}
		

	}

}
