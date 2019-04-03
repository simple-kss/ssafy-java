package algo0402;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Solution_4366_정식이의은행업무
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
 
        for (int i = 1; i <= t; i++)
        {
            int result = 0;
            String in2[] = br.readLine().split("");
            String in3[] = br.readLine().split("");
            int n2[] = new int[in2.length];
            int n3[] = new int[in3.length];
            for (int j = 0; j < n2.length; j++)
            {
                n2[j] = Integer.parseInt(in2[j]);
            }
            for (int j = 0; j < n3.length; j++)
            {
                n3[j] = Integer.parseInt(in3[j]);
            }
 
            String arr2[] = new String[n2.length];
            String arr3[] = new String[n3.length * 2];
            Arrays.fill(arr2, "");
            Arrays.fill(arr3, "");
            for (int j = 0; j < n2.length; j++)
            {
                n2[j] = (n2[j] + 1) % 2;
                for (int j2 = 0; j2 < n2.length; j2++)
                {
                    arr2[j] += n2[j2];
                }
                n2[j] = (n2[j] + 1) % 2;
            }
            for (int j = 0; j < n3.length; j++)
            {
                n3[j] = (n3[j] + 1) % 3;
                for (int j2 = 0; j2 < n3.length; j2++)
                {
                    arr3[j] += n3[j2];
                }
                n3[j] = (n3[j] + 1) % 3;
                for (int j2 = 0; j2 < n3.length; j2++)
                {
                    arr3[n3.length + j] += n3[j2];
                }
                n3[j] = (n3[j] + 1) % 3;
            }
//          System.out.println(Arrays.toString(arr2));
//          System.out.println(Arrays.toString(arr3));
 
            loop: for (int j = 0; j < arr2.length; j++)
            {
                for (int j2 = 0; j2 < arr3.length; j2++)
                {
                    if (Integer.parseInt(arr2[j], 2) == Integer.parseInt(arr3[j2], 3))
                    {
                        result = Integer.parseInt(arr2[j], 2);
                        break loop;
                    }
                }
            }
            System.out.println("#" + i + " " + result);
        }
    }
 
}
