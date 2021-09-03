package recursion;

public class LastIndex {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 8, 5, 3, 9, 2, 1 };
		int res = lastIndex(arr, 0, 2);
		if (res >= 0) {
			System.out.println("The first index is " + res);
		} else {
			System.out.println("Element not found..");
		}
	}

	public static int lastIndex(int[] arr, int idx, int x) {
		if (idx == arr.length) {
			return -1;
		}
		int lastIndex = lastIndex(arr, idx + 1, x);
		if (lastIndex == -1) {
			if (arr[idx] == x) {
				return idx;
			} else {
				return -1;
			}
		} else {
			return lastIndex;
		}
	}

}
