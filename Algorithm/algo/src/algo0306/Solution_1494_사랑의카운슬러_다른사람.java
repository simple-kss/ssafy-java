package algo0306;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
 
public class Solution_1494_사랑의카운슬러_다른사람 {
    public static long res;
    public static int N;
    public static ArrayList<worm> arr = new ArrayList<>();
     
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int testcase = 1; testcase <= T; testcase++) {
            arr.clear();
            N = Integer.parseInt(br.readLine());
            String s;
            StringTokenizer tk;
            for(int i=0; i<N; i++) {
                s = br.readLine();
                tk = new StringTokenizer(s," ");
                // 지렁이 다 저장
                arr.add(new worm(Integer.parseInt(tk.nextToken()),Integer.parseInt(tk.nextToken())));
            }
            
            res = Long.MAX_VALUE;
            
            Earthworm(0,0,0,0);
            System.out.println("#"+testcase+" "+res);
        } // end of testcase
    }// end of main
 
    public static void Earthworm(long a, long b, int index, int cnt) {
        if(index == N) {
	            if(cnt == N/2) {
	                res = Math.min(res, (a*a)+(b*b));
	            }
	        return;
	    }
        // 각각의 벡터의 누적차
		Earthworm(a - arr.get(index).x, b - arr.get(index).y, index + 1, cnt + 1);
		// 누적합 호출
		Earthworm(a + arr.get(index).x, b + arr.get(index).y, index + 1, cnt);
    }
     
    public static class worm{
        int x;
        int y;
        worm(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return "worm [x=" + x + ", y=" + y + "]";
        }
    }
     
}// end of class
