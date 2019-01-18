
public class Solution_이진검색_김성식 {
	
	//재귀방법
	public static void binarySearch(int arr[], int s, int e, int key) {
		int m = (s + e)/2;
		if(s > e) {
			System.out.println("못찾음");
			return;
		}		
		
		if(arr[m] == key) {
			System.out.println("찾음");
		}
		else if(key > arr[m]) {
			binarySearch(arr, m+1, e, key );
		}
		else {
			binarySearch(arr, s, m-1, key );			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		// 반복문 방법
		int key = 5;
		int s = 0;
		int e = 9;
		int m;
		
		while(s <= e) {
			
			m = (s + e) / 2;
			if(arr[m] == key) {
				System.out.println("찾음");
				break;
			}
			else if( key > arr[m]) {
				s = m + 1;
				
			}
			else if( key < arr[m]) {
				e = m - 1;
				
			}	
		}
		if( s > e ) {
			System.out.println("못찾음");
		}
		
		
		binarySearch(arr, s, e, key);

	}

}
