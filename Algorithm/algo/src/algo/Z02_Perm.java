package algo;

public class Z02_Perm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) {			
			for (int j = 1; j <= 3; j++) {
				if(i == j) continue;
				for (int k = 1; k <= 3; k++) {
					if(i == k || j == k) continue;
					System.out.printf("%d %d %d\n",i,j,k);
					
				}
				
			}
			
		}
	}

}
