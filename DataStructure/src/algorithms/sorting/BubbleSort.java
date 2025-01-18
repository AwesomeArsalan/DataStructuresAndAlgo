package algorithms.sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 8, 5, 3, 9, 2, 1 };
		bubbleSort(arr);
    for (int j : arr) {
      System.out.print(j + " ");
    }
	}

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean alreadySorted = true;
			for (int k = 0; k < arr.length - 1; k++) {
				if (arr[k] > arr[k + 1]) {
					int temp = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = temp;
					alreadySorted = false;
				}
			}
			if (alreadySorted) {
				break;
			}
		}
	}
}
