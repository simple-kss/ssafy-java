package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class test {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	System.out.println(" ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
         
        // 온도 배열
        int[] temp = new int[10271];
         
        // 범위를 저장하는 배열
        int[][] chemi = new int[N][2];
         
        boolean[] visited = new boolean[N];
         
        int cnt = 0;
         
         
        for(int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
            chemi[i][0] = Integer.parseInt(stk.nextToken()) + 270;
            chemi[i][1] = Integer.parseInt(stk.nextToken()) + 270;
            // rageSet하고
            rangeSet(chemi[i][0], chemi[i][1], temp);
        } // end of for
         
        // maxIndex 값 하나 찾자.
        int maxIn = findMax(temp);
         
        // temp에 속한 chemi들
        // visited를 false로 만든다.
        makeFalse(maxIn, visited, chemi, N);
        cnt++;
         
        while(true)  {
             
            // 새로 temp를 만든다.
            temp = new int[10271];
            for(int i = 0; i < N; i++) {
                if(!visited[i])
                    rangeSet(chemi[i][0], chemi[i][1], temp);
            }
             
            // maxIndex 값 하나 찾자.
            maxIn = findMax(temp);
             
            if(maxIn == 0) {
                break;
            }
             
            // maxIn에 속하는 애들 다 visted false로 만든다.
            makeFalse(maxIn, visited, chemi, N);
            cnt++;
        } // end of while
         
        System.out.println(cnt);
         
         
         
 
    } // end of main
     
    private static void makeFalse(int maxIn, boolean[] visited, int[][] chemi, int N) {
        // chemi에서 maxIn에 속한 애들을 visited false로 만든다.
         
        for(int i = 0; i < N; i++) {
            if(chemi[i][0] <= maxIn && chemi[i][1] >= maxIn) {
                // 더이상 개를 탐색하지 않는다.!!
                visited[i] = true;
            }
             
        } // end of for
         
    }
 
    private static int findMax(int[] temp) {
        int len = temp.length;
        int max = 0;
        int maxIn = 0;
        for(int i = 0; i < len; i++) {
            if(temp[i] > max) {
                max = temp[i];
                maxIn = i;
            }
        }
        return maxIn;
    }
 
    public static void rangeSet(int r1, int r2, int[] temp) {
        for(int i = r1; i <= r2; i++) {
            temp[i]++;
        } // end of for
         
    } // end of func
     
} // end of class
