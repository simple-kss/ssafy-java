package algoKss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Z28_BinarySearch_Array {
	public static void leftVisited(int[] arr, int index, int num) {
		// 비어 있으면 넣기
		if(arr[index] == 0)
			arr[index] = num;
		// 안비어있으면
		// 크기비교해서 방문한다.
		else {
			if( arr[index] > num ) {
				leftVisited(arr, index * 2, num);
			}
			else {
				rightVisited(arr, index * 2 + 1, num);
			}
		}
		
	}
		
		
	public static void rightVisited(int[] arr, int index, int num) {
		// 비어 있으면 넣기
		if(arr[index] == 0)
			arr[index] = num;
		else {
			if( arr[index] > num ) {
				leftVisited(arr, index * 2, num);
			}
			else {
				rightVisited(arr, index * 2 + 1, num);
			}
		}
	}
	
	public static void middle(int[] bst, int index) {
		
		if(index * 2 < bst.length && bst[index * 2] != 0)
			middle(bst, index * 2);
		
		System.out.println(bst[index]);
		
		if(index * 2 + 1< bst.length && bst[index * 2 + 1] != 0)
			middle(bst, index * 2 + 1);
	}
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[] bst = new int[1 << cnt+1];
		
		String s = br.readLine();
		StringTokenizer str = new StringTokenizer(s, " ");
		bst[1] = Integer.parseInt(str.nextToken()); // 처음 원소
		int n = 2;
		while(str.hasMoreTokens()){
			int num = Integer.parseInt(str.nextToken());
			// root보다 작으면 왼쪽에 넣고
			if(bst[1] > num )
				leftVisited(bst, 1 * 2, num);
			else{
			// root보다 크면 오른쪽에 넣기!
				rightVisited(bst, 1 * 2 + 1, num);
			}
			//bst[n++] = num;
		}
		System.out.println(Arrays.toString(bst));
		
		// search
		// 중위 순회
		middle(bst, 1);
		
		

	} // end of main
} // end of class
