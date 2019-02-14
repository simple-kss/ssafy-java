import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class MainTest {
    public static int min;
    public static boolean[] check;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for (int testCase = 1; testCase <= TC; testCase++) {
            StringBuilder sb = new StringBuilder();
            min = Integer.MAX_VALUE;
            int N = Integer.parseInt(br.readLine());
            int map[][] = new int[N+2][2];
            check = new boolean[N];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            map[0][0] = Integer.parseInt(st.nextToken()); // 회사 좌표 넣기
            map[0][1] = Integer.parseInt(st.nextToken());
            map[map.length-1][0] = Integer.parseInt(st.nextToken()); // 집 좌표 넣기
            map[map.length-1][1] = Integer.parseInt(st.nextToken());
            for (int i = 1; i < N+1; i++) { // 맵에 각 좌표 넣기
                map[i][0] = Integer.parseInt(st.nextToken());
                map[i][1] = Integer.parseInt(st.nextToken());
            }
             
             
//          for (int i = 0; i < map.length; i++) { // 잘 들어갔나 좌표 뽑아보기 
//              System.out.print(map[i][0] + " ");
//              System.out.println(map[i][1]);
//          }
             
            recur(0, new int[N], map); // 모든 경로를 탐색하기 위한 재귀함수
             
             
            sb.append("#").append(testCase).append(" ").append(min);
            System.out.println(sb);
        }
    } // end of main
     
    public static void recur(int N, int arr[], int[][] map) {
        if(N == arr.length) { // 종료파트
            int temp = 0;
            temp += Math.abs(map[arr[0]+1][0] - map[0][0]); // 회사에서 출발할 때
            temp += Math.abs(map[arr[0]+1][1] - map[0][1]); // 회사에서 출발할 때
            for (int i = 1; i < arr.length; i++) {
                temp += Math.abs(map[arr[i]+1][0] - map[arr[i-1]+1][0]);
                temp += Math.abs(map[arr[i]+1][1] - map[arr[i-1]+1][1]);
            }
            temp += Math.abs(map[map.length-1][0] - map[arr[arr.length-1]+1][0]); // 집으로 갈때
            temp += Math.abs(map[map.length-1][1] - map[arr[arr.length-1]+1][1]); // 집으로 갈때
            if(min > temp) {
                min = temp;
            }
        } else { // 재귀파트
             
             
            for (int i = 0; i < check.length; i++) {
                if(check[i]) continue;

                 check[i] = true;
                 arr[N] = i;
                 recur(N+1, arr, map);
                 check[i] = false;

            }
        }
    }
} // end of class
