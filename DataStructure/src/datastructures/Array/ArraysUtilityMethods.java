package datastructures.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtilityMethods {

	public static void main(String[] args) {
		// Print datastructures.Array as string
		int[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(intArray));

		// Convert datastructures.Array to List
		String[] stringArray = { "a", "b", "c", "d", "e" };
		System.out.println(Arrays.asList(stringArray));

		// List to datastructures.Array
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
		String[] stringArr = new String[arrayList.size()];
		arrayList.toArray(stringArr);
	}

}
