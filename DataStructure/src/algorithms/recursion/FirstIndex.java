package algorithms.recursion;

public class FirstIndex {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 8, 5, 3, 9, 2, 1 };
		int res = firstIndex(arr, 0, 2);
		if (res >= 0) {
			System.out.println("The first index is " + res);
		} else {
			System.out.println("Element not found..");
		}
	}

	public static int firstIndex(int[] arr, int idx, int x) {
		if (idx == arr.length) {
			return -1;
		} else if (arr[idx] == x) {
			return idx;
		}
		return firstIndex(arr, idx + 1, x);
	}

}
