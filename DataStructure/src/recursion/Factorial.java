package recursion;

public class Factorial {

	public static void main(String[] args) {
		int x = 5;
		long res = factorial(6);
		System.out.println("Factorial of " + x + " is " + res);
	}

	public static long factorial(int x) {
		if (x == 1) {
			return 1;
		}

		return x * factorial(x - 1);
	}

}
