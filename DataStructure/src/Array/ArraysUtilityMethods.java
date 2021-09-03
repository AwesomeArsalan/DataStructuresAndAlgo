package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtilityMethods {

	public static void main(String[] args) {
		// Print Array as string
		int[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println(intArray);
		System.out.println(Arrays.toString(intArray));

		// Convert Array to List
		String[] stringArray = { "a", "b", "c", "d", "e" };
		System.out.println(Arrays.asList(stringArray));

		// List to Array
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		String[] stringArr = new String[arrayList.size()];
		arrayList.toArray(stringArr);
	}

}
