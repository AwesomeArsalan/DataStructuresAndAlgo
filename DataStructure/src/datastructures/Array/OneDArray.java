package datastructures.Array;

import java.util.Arrays;

public class OneDArray {

	public static void main(String[] args) {
		// datastructures.Array declaration
		int[] arr; // (or)
		int[] arr1; // (or)
		int arr2[];
		int size = 8;
		// datastructures.Array Initialization
		arr = new int[size];
		arr[0] = 9;
		System.out.println(arr.length + ", " + Arrays.toString(arr));
		arr = new int[size + 5];
		arr[1] = 1;
		System.out.println(arr.length + ", " + Arrays.toString(arr));

		System.out.println(arr[0] + " " + arr[1]);
		// declaration, instantiation and initialization
		int[] arr3 = { 33, 3, 4, 5 };

		// printing array
    // length is the property of array
    for (int j : arr3) {
      System.out.print(j + ", ");
    }
		System.out.println();
		for (int item : arr3) {
			System.out.print(item + ", ");
		}
		System.out.println();
		min(arr3);
	}

	static void min(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min + ", ");
	}
}
