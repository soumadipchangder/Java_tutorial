package dp;

public class Fibonacci {
//	Memoization
	public static int memo_fibonacci(int n,int dp[]) {
		if (n <= 1) {
			return n;
		}
		if (dp[n] != -1) {
			return dp[n];
		}
		dp[n] = memo_fibonacci(n-1,dp) + memo_fibonacci(n-2,dp);
		return dp[n];
	}
//	Tabulation
	public static int tabu_fibonacci(int n) {
		int dp[] = new int[n + 1];
		for(int i = 0; i <= n; i++) {
			dp[i] = 0;
		}
		
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i <= n; i++ ) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
	
//	Space Optimization
//	Time = O(n)
//	Space = o(1)
	public static int space_opti_fibonacci(int n) {
		int prev = 1;
		int prev2 = 0;
		
		for (int i = 2; i <= n; i++) {
			int curr = prev + prev2;
			prev2 = prev;
			prev = curr;
		}
		return prev;
	}
//	time complexity :- O(n)
//space_complexity = O(n)
	public static void main(String[] args) {
		int n = 8;
		int dp[] = new int[n + 1];
		for(int i = 0; i <= n; i++) {
			dp[i] = -1;
		}
		
		System.out.println(memo_fibonacci(n,dp));
		System.out.println(tabu_fibonacci(8));
		System.out.println(space_opti_fibonacci(8));
	}
}
//time complexity :- O(N)
//Space_complexity = O(N) + O(N)
