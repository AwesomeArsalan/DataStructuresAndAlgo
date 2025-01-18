package algorithms.recursion;

public class PrintArrayElements {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 4, 1, 2, 4 };
		printArray(arr, 0);
	}

	public static void printArray(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		printArray(arr, idx + 1);

		// to print reverse
		/*
		 * printArray(arr, idx + 1); System.out.println(arr[idx]);
		 */
	}

}
