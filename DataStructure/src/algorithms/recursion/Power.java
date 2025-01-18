package algorithms.recursion;

public class Power {

	public static void main(String[] args) {
		int x = 6;
		int index = 3;
		int result = power(x, index); // calculates power in logarithmic time
		System.out.println(x + " to the power " + index + " = " + result);
	}

	public static int power(int x, int index) {
		if (index == 1) {
			return x;
		}
		int res1 = power(x, index / 2);
		int res2 = res1 * res1;
		if (index % 2 == 1) {
			res2 = res2 * x;
		}
		return res2;

		/*
		 * if(n == 0) return 1; if(n<0){ n = -n; x = 1/x; } return (n%2 == 0) ? pow(x*x,
		 * n/2) : x*pow(x*x, n/2);
		 */
	}
}
