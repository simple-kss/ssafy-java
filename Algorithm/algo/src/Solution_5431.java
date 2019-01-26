import java.util.Scanner;

public class Solution_5431{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int N = scan.nextInt(); // �л� ��
			int K = scan.nextInt(); // ������ ������ ��� ��
			
			int[] stu = new int[N+1];
			
			for (int i = 0; i < K; i++) {
				int temp = scan.nextInt();
				stu[temp]++;			
			}
			

			System.out.printf("#%d ",t);
			
			for (int i = 1; i <= N; i++) {
				if(stu[i] == 0) {
					System.out.printf("%d ",i);
				}				
			}
			System.out.println("");
		}
	}
}
