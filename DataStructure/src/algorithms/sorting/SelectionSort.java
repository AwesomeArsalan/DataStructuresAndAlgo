package algorithms.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 8, 5, 3, 9, 2, 1 };
		selectionSort(arr);
    for (int j : arr) {
      System.out.print(j + " ");
    }
	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIdx = i;
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[i] > arr[k]) {
					minIdx = k;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}
	}
}
