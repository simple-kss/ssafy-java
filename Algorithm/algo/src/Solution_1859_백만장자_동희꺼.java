import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
  
public class Solution_1859_백만장자_동희꺼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
          
        for(int z=1;z<=tc;z++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int i=0;i<n;i++)
                arr[i] = Integer.parseInt(st.nextToken());
              
            long result = 0;
            int t = arr[n-1];
            for(int i=n-2;i>=0;i--) {
                if(t<=arr[i]) {
                    t = arr[i];
                }else result+=t-arr[i];
            }
            sb.append('#').append(z).append(' ')
            .append(result).append('\n');
        }
        System.out.println(sb);
    }// end of main
}// end of class
