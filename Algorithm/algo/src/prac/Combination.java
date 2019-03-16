package prac;

import java.util.Arrays;

public class Combination {


	public static int arr[] =
	{ 23, 3, 5, 9 };
	public static int save[];
	public static int visited[];
	public static int n;
	public static int r;

	public static void main(String[] args)
	{
		n = 4;
		r = 2;
		save = new int[r];
		visited = new int[4];

		System.out.println("=======중복순열========");
		OverPerm(0);
		System.out.println("=======순열========");
		perm(0);
		System.out.println("=======중복조합========");
		OverComb(0, 0);
		System.out.println("=======조합========");
		comb(0, 0);
	}
	public static void comb(int start, int cnt)
	{
		if (cnt == r)
		{
			System.out.println(Arrays.toString(save));
		}
		else
		{
			for (int i = start; i < n; i++)
			{
				if (visited[i] == 0)
				{
					visited[i] = 1;
					save[cnt] = i;
					comb(i + 1, cnt + 1);
					visited[i] = 0;
				}
			}
		}
	}
}
