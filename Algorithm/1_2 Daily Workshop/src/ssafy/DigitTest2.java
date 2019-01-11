package ssafy;

public class DigitTest2 {
	public static void main(String[] args) {
		int count = 1;
		for(int i = 0 ; i < 5 ;i++) {
			for(int j = 0; j < 5; j++ ) {
				if( j >= i && i+j <= 4 || j <= i && i+j >= 4 )
					System.out.printf("%-3d", count++);
				else
					System.out.print("   ");
			}
			System.out.print("\n");
		}
	}
}
