package algo;

/**
 * 검색
 * 순차검색 : O[N]
 * 이진검색 : O[lon N] - 데이터가 정렬된 상태여야한다.
 * 해시검색 : O[1]
 * @author student
 *
 */

public class Z08_BinarySearch {
	public static void binarySearch(int[] m, int key, int l, int r) {
		if(l > r) { // 종료파트
			System.out.println("못찾음");
		}
		else { // 재귀파트
			int mid = (l + r) / 2;
			if(key == m[mid]) System.out.println(m[mid]+" 찾음");
			else if (key < m[mid]) binarySearch(m, key, l, mid-1);
			else binarySearch(m, key, mid+1, r);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int l = 0; // 검색범위에 왼쪽 끝 index
		int r = 9; // 검색 범위의 오른쪽 끝 index m.length - 1
		int key = 80; // 찾고 싶은 값
		
		while(l <= r) {
			int mid = (l + r) / 2; // 중간 인덱스
			if ( key == m[mid]) {
				System.out.println(m[mid] + "찾음");
				break;
			}
			else if (key < m[mid]){
				r = mid - 1;
			}
			else
				l = mid + 1;
		}
		if( l > r)
			System.out.println("찾지못함");
		
		l = 0;
		r = 9;
		binarySearch(m, 9, l, r);
		
		
	} // end of main
} // end of class
