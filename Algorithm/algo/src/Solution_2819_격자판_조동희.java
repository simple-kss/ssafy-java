
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
  
public class Solution_2819_격자판_조동희 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int tc = Integer.parseInt(br.readLine());
         
        Pair[] queue = new Pair[100001];
        int[][] arr = new int[4][4];
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        for(int z=1;z<=tc;z++) {
             
            for(int i=0;i<4;i++) {
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                for(int j=0;j<4;j++)
                    arr[i][j] = Integer.parseInt(st.nextToken());
            }
             
            int front = -1,rear=-1;
             
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<4;i++) {
                for(int j=0;j<4;j++) {
                    queue[++rear] = new Pair(i, j, 0, 0);
                     
                    while(front<rear) {
                        Pair t = queue[++front];
                        if(t.cnt==7) {
                            set.add(t.num);
                            continue;
                        }
                        for(int k=0;k<4;k++) {
                            int tx = t.x+dir[k][0];
                            int ty = t.y+dir[k][1];
                            if(tx<0 || ty<0 || tx==4 || ty==4) continue;
                            queue[++rear] = new Pair(tx, ty, t.cnt+1, t.num*10+arr[tx][ty]);
                        }
                    }
                }
            }
            bw.write(String.format("#%d %d\n",z,set.size()));
        }// end of tc
        bw.flush();
    }// end of main
     
    static class Pair{
        int x,y,cnt,num;
 
        public Pair(int x, int y, int cnt, int num) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.num = num;
        }
    }// end of Pair class
}// end of class
 