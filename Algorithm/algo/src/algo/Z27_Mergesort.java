package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * 병합정렬 1 - ArrayList사용
 * 
 *
 */

public class Z27_Mergesort {
	
	// ArrayList로 쓰지 않은 이유는
	// subList가 List 자료형이기 때문에
	public static List<Integer> mergeSort(List<Integer> li) { // 리스트를 쪼개기
		if(li.size() <= 1) { // 종료파트
			return li;
		}
		else { // 재귀파트
			int m = li.size() / 2;
			List<Integer> left = mergeSort(li.subList(0, m));
			List<Integer> right = mergeSort(li.subList(m, li.size()));
			return merge(left, right); // 합치는 작업을 해야함
			
			
		}
	}
	
	public static List<Integer> merge(List<Integer> left, List<Integer> right) {
		// 사실 배열이 가장 빠름 리스트보다
		List<Integer> reList = new ArrayList<Integer>(left.size() + right.size()); // 내부 배열의 크기 지정
		// 두 덩어리를 합치는 방법
		// 양쪽리스트이 원소가 모두 있는 경우
		int l = 0; // 양쪽의 리스트를 관리할 변수
		int r = 0;
		while(l < left.size()  && r < right.size()) {
			if(left.get(l) < right.get(r) ) { // 첫번쨰 원소끼리 비교
				reList.add(left.get(l++));
			}
			else {
				reList.add(right.get(r++));
			}
			
		}
		
		
		// 왼쪽 리스트만 원소가 있는 경우
		// reList.addAll(c)
		while(l < left.size()) {
			reList.add(left.get(l++));
		}
		// 오른쪽 리스트만 원소가 있는 경우
		while(r < right.size()) {
			reList.add(right.get(r++));
		}
		return reList;		
	}
	public static void main(String[] args) {
		Integer[] arr = { 6, 4, 8, 5, 7, 2, 9, 3, 0, 1};
		// 앞에 int 대신 Integer로 선언이 되어 있어야 한다.
		
		//List li = Arrays.asList(arr);
		//System.out.println(Arrays.asList(arr));
		ArrayList<Integer> li = new ArrayList(Arrays.asList(arr));
		//System.out.println(li);
		
		System.out.println(mergeSort(li));
		
	}

}
