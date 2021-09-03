package dynamicProgramming;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10;
		int[] dp = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacciSeries(i, dp) + " ");
		}
	}

	public static int fibonacciSeries(int n, int[] dp) {
		if (n == 1 || n == 0) {
			return n;
		}

		if (dp[n] != 0) {
			return dp[n];
		}
		dp[n] = fibonacciSeries(n - 1, dp) + fibonacciSeries(n - 2, dp);

		return dp[n];
	}

}
