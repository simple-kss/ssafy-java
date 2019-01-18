package algo;

public class Z14_Recursive {
	public static int fact (int n ) {
		if ( n <= 1 ) {
			return 1;
		}
		else {
			return n * fact(n-1);
		}
	}
	
	public static int f(int n ) {
		if(n < 2) {
			return n;			
		}
		else if(memo[n] != 0)
			return memo[n];
		else {
			
			memo[n] = f(n-1) + f(n-2);
			return memo[n];
			
		}
	}
	
	public static int[] memo = new int[9];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		memo[0] = 0;
//		memo[1] = 1;
//		System.out.println(f(8));
		
		int[] dp = new int[9];
		
		dp[0] = 0; // seed value는 채워줘야함
		dp[1] = 1;
		
		for(int i = 2; i < dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		System.out.println(dp[8]);
		
				
		
	}
}
