package algo;

public class Z02_Perm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 7, 9};
		for (int i = 0; i < 3; i++) {			
			for (int j = 0; j < 3; j++) {
				if(i == j) continue;
				for (int k = 0; k < 3; k++) {
					if(i == k || j == k) continue;
					System.out.printf("%d %d %d\n",arr[i],arr[j],arr[k]);
					
				}
				
			}
			
		}
	}

}
