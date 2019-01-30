package algo;

public class Solution_BubbleSort_김성식 {
	static int[] arr = {3,7,4,6,3,5,1,0};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int k = arr.length - 1 ; k >= 0 ; k--) {
			for (int i = 0; i < k; i++) {
				if(arr[i] >= arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}		
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ",arr[i]);
			
		}
	}
}
