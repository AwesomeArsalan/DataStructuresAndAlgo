package algorithms.recursion;

public class MaxOfArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 5, 8, 2, 5, 7, 9, 11, 4, 8 };
		int res = maxOfArray(arr, 0);
		System.out.println("The max number is " + res);
	}

	public static int maxOfArray(int[] arr, int idx) {
		if (idx == arr.length - 1) {
			return arr[idx];
		}
		int res = maxOfArray(arr, idx + 1);
    return Math.max(arr[idx], res);
	}

}
