package ssafy;

public class Main548 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i <= 4; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.printf("%d * %d =%3d   ",i,j,i*j);
				if( j != 5)
					System.out.printf("   ");
				else
					System.out.println("");
			}
		}
	}
}
