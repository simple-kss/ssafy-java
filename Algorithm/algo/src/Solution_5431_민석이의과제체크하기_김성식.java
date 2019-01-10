import java.util.Scanner;

public class Solution_5431_민석이의과제체크하기_김성식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int N = scan.nextInt(); // 학생 수
			int K = scan.nextInt(); // 과제를 제출한 사람 수
			
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
