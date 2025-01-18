package algorithms.dynamicProgramming;

public class Factorial {

	public static void main(String[] args) {
		int x = 6;
		int[] dp = new int[x];
		int res = factorial(x, dp);
		System.out.println("Factorial of " + x + " is " + res);
	}

	public static int factorial(int x, int[] dp) {
		if (x == 1) {
			return 1;
		}
		if (dp[x - 1] != 0) {
			return dp[x - 1];
		}
		dp[x - 1] = x * factorial(x - 1, dp);
		return dp[x - 1];
	}

}
