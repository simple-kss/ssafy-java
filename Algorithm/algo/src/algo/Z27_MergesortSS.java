package algo;

import java.util.Arrays;

public class Z27_MergesortSS {
	
	public static void main(String[] args) {
		int[] arr = {69, 10, 30, 2, 16, 8, 31, 22}; // 8
		// 반쪼갬
		int[] result;
		
		// 0, 1, 2, 3
		// 4, 5, 6, 7
		System.out.println(Arrays.toString(arr));
		
		result = merge_sort(arr);
		
		System.out.println(Arrays.toString(result));
	}
	public static int[] merge_sort(int[] arr) {
		int len = arr.length;
		if( len == 1) return arr;
		
		// divide
		int middle = len / 2;
		int[] lArr = new int[middle];
		int[] rArr = new int[arr.length - middle];
		int cnt = 0;
		for(int i = 0; i < middle; i++) {
			lArr[cnt++] = arr[i];			
		}
		cnt = 0;
		for(int i = middle; i < len; i++) {
			rArr[cnt++] = arr[i];			
		}
		// 리스트의 크기가 1이 될때 까지 merge_sort 재귀 호출
		lArr = merge_sort(lArr);
		rArr = merge_sort(rArr);
		//분할된 리스트들을 병합
		return merge(lArr, rArr);
	}
	private static int[] merge(int[] lArr, int[] rArr) {
		int rlen = lArr.length;
		int len = lArr.length + rArr.length;
		int[] result = new int[len];
		
		// 제일 첫번쨰 요소랑 비교해서
		// 젤 작은애가 들어가고
		// 그 들어간 배열 cnt++
		int reIndex = 0;
		int lCnt = 0;
		int rCnt = 0;
		while(reIndex < len ) {
			// 한쪽이 다 찼을 때
			if(rCnt == rlen && lCnt < rlen) {
				result[reIndex++] = lArr[lCnt++];
			}
			else if(lCnt == rlen && rCnt < rlen) {
				result[reIndex++] = rArr[rCnt++];
			}
			else if(lArr[lCnt] < rArr[rCnt]) {
				result[reIndex++] = lArr[lCnt];
				lCnt++;
			}
			else if(lCnt == len || lArr[lCnt] >= rArr[rCnt]) {
				result[reIndex++] = rArr[rCnt];
				rCnt++;
				// 다도달했으면 상대방꺼 다 집어넣고 끝				
			}
		}
		return result;
		
		
		
	}
	

}
