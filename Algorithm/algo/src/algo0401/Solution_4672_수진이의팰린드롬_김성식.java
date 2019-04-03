package algo0401;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
 
public class Solution_4672_수진이의팰린드롬_김성식 {
		public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for(int tc = 1; tc <= testcase; tc++) {
            char[] arr = br.readLine().toCharArray();
            int[] result = new int[26]; // 알파벳 갯수 26개 저장
            
            // 알파벳하나씩 카운트
            for(int i = 0; i < arr.length; i++) {
                result[arr[i]-'0']++;
            }
            int cnt = 0;
            
            // 알파뱃 갯수만큼 돈다.
            for(int i = 0; i< result.length; i++) {
            	// 1개만 있따면 그것 카운트
                if(result[i] == 1) {
                    cnt++;
                } else if(result[i] > 1) {
                	// 2개이상이면
                    cnt += result[i] * (result[i]+1) / 2;
                }
            }
            sb.append("#").append(tc).append(" ").append(cnt).append("\n");
        }
        System.out.println(sb);
    }
     
     
}