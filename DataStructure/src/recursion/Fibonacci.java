package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacciSeries(i) + " ");
		}

	}

	public static int fibonacciSeries(int n) {
		if (n == 1 || n == 0) {
			return n;
		}

		return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
	}

}
