package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * 
 *
13
1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13
 *
 */

public class Z28_Tree민규쌤 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t = "1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13";
		int V = Integer.parseInt(br.readLine()); // 정점의 갯수
		String str = br.readLine(); // 간선 정보
		StringTokenizer st = new StringTokenizer(str, " ");

		// 이진트리 저장
		// 편향으로 갔을 때 쭉 갈 수 있으므로 2^V-1 필요한데 1부터 시작하니까 2^V
		int arr[] = new int[1 << V]; // V정점의 개수
		arr[1] = 1; // 루트번호 지정
		while (st.hasMoreTokens())
		{
			int start = Integer.parseInt(st.nextToken()); // 간선의 시작 정점
			int end = Integer.parseInt(st.nextToken()); // 간선의 끝 정점

			for (int i = 1; i < arr.length; i++) // 0번 정점은 안씀, Start 정점값이 저장된 배열의 위치 찾기
			{
				if (start == arr[i])
				{
					// 간선에서 자식 정점을 저장, 왼쪽자식이 없으면 왼쪽에 저장, 왼쪽자식이 있으면 오른쪽에 저장
					if (arr[i * 2] == 0) // 왼쪽 자식이 없음
					{
						arr[i * 2] = end;
					}
					else // 왼쪽 자식이 있음
					{
						arr[i * 2 + 1] = end;
					}
					break;
				}
			}
		}
		// 저장된 트리를 출력하기
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 1; i < 6; i++)
		{
			hs.add(1 << i);
		}
		System.out.println(hs);

		for (int i = 1; i < arr.length; i++)
		{
			if(hs.contains(i))
			{
				System.out.println();
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 이진트리 순회
		
		//전위순회
		System.out.println("\n전위순회 : ");
		preOrder(arr, 1);
		//중위순회
		System.out.println("\n중위순회 : ");
		inOrder(arr, 1);
		//후위순회
		
	} // end of main
	
	public static void preOrder(int[] arr, int index) {
		// 부모(나)
		System.out.print(arr[index] + " ");
		
		// 왼쪽 자식
		if( index*2 < arr.length && arr[index * 2] != 0 ) { // 왼쪽 자식
			preOrder(arr, index*2);
		}
		
		// 오른쪽 자식
		if( index*2+1 < arr.length && arr[index * 2 + 1] != 0 ) { // 왼쪽 자식
			preOrder(arr, index*2+1);
		}
	}
	
	public static void inOrder(int[] arr, int index) {
		
		// 왼쪽 자식
		if( index*2 < arr.length && arr[index * 2] != 0 ) { // 왼쪽 자식
			inOrder(arr, index*2);
		}
		
		// 부모(나)
		System.out.print(arr[index] + " ");
		
		// 오른쪽 자식
		if( index*2+1 < arr.length && arr[index * 2 + 1] != 0 ) { // 왼쪽 자식
			inOrder(arr, index*2+1);
		}
	}

}
