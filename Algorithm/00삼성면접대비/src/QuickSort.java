
public class QuickSort {
	public static int partition(int[] array, int left, int right) {
		int mid = (left + right ) / 2;
		swap(array, left, mid);
		
		int pivot = array[left];
		int i = left, j = right;
		
		while(i < j) {
			
			// 피벗보다 작은 애를 끝에서 부터 찾아.
			while(pivot < array[j]) {
				j--;
			}
			
			// 피벗보다 크거나 같은 애를 시작지점부터 찾아.
			while(i < j && pivot >= array[i]) {
				i++;
			}
			// 그 둘을 swap
			swap(array,i,j);
		}
		
		// 마지막의 i자리가 pivot자리가 돼.
		array[left] = array[i];
		array[i] = pivot;
		
		return i;
	}

	public static void main(String[] args) {
		int[] array = { 80, 70, 60, 50, 40, 30, 20 };
		quicksort(array, 0, array.length-1);
		
		for(int v : array) {
			System.out.println(v);
		}
	}
	
	public static void swap(int[] array, int a, int b) {
		int temp = array[b];
		array[b] = array[a];
		array[a] = temp;
	}
	
	public static void quicksort(int[] array, int left, int right) {
		
		if ( left >= right) {
			return;
		}
		
		// left, right
		int pi = partition(array, left, right);
		
		quicksort(array, left, pi - 1);
		quicksort(array, pi + 1, right);
	}

}
