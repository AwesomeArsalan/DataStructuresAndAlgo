package Array;

public class TwoDArray {

	public static void main(String[] args) {
		// 2D Array declaration
		int[][] arr1; // (or)
		int[][] arr2; // (or)
		int arr3[][]; // (or)
		int[] arr4[];

		// instantiate
		arr3 = new int[3][3];// 3 row and 3 column

		// declaring and initializing 2D array
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
		// printing 2D array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		// printing the class name of Java array
		Class c = arr.getClass();
		String name = c.getName();
		System.out.println(name);
	}
}
