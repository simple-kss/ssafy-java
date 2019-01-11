
public class ArrayTest {
	public static int[] list = {34, 23, 64, 25, 12, 75, 22, 88, 53, 37};
	
	public static void print() {
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%3d",list[i]);
		}
		System.out.println("");
		
	}
	public static void total() {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		System.out.println("배열의 합 : " + sum);
	}
	public static void average() {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		System.out.println("배열의 평균 : " + sum / (double)list.length);
		
	}
	public static void minimum() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list.length; i++) {
			if ( list[i] < min)
				min = list[i];
		}
		System.out.println("배열의 최소값 : " + min);
	}
	public static void selectionSort() {
		for(int i = 0; i < list.length -1; i++) {
			for (int j = i; j < list.length; j++) {
				if(list[i] > list[j]) {
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		total();
		average();
		minimum();
		System.out.println("=== selection sort (Ascending Order)===");
		selectionSort();
		print();

	}

}
