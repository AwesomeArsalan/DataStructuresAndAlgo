package datastructures.Array;

import java.util.Arrays;

public class CopyAndClonning {
	public static void main(String[] args) {

		// intializing an array arr1
		int[] arr1 = new int[] { 45, 32, 75 };

		// printing the array
		System.out.println("Printing 1st array:");
    for (int j : arr1) {
      System.out.println(j);
    }

		// copying array arr1 to arr2 with newlength as 5
		int[] arr2 = Arrays.copyOf(arr1, 5);
		arr2[3] = 11;
		arr2[4] = 55;

		// printing the array arr2
		System.out.println("Printing new array:");
    for (int j : arr2) {
      System.out.println(j);
    }

		// declaring a source array
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };

		// declaring a destination array
		char[] copyTo = new char[7];

		// copying array using System.arraycopy() method
		// public static void arraycopy(Object src, int srcPos,Object dest, int destPos,
		// int length)
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);

		// printing the destination array
		System.out.println(String.valueOf(copyTo));
		System.out.println(copyFrom == copyTo);

		// clonning
		/*
		 * Since, Java array implements the Cloneable interface, we can create the clone
		 * of the Java array. If we create the clone of a single-dimensional array, it
		 * creates the deep copy of the Java array. It means, it will copy the actual
		 * value. But, if we create the clone of a multidimensional array, it creates
		 * the shallow copy of the Java array which means it copies the references.
		 */

		int arr[] = { 33, 3, 4, 5 };
		System.out.println("Printing original array:");
		for (int i : arr)
			System.out.print(i + ",");
		System.out.println();
		System.out.println("Printing clone of the array:");
		int[] carr = arr.clone();
		for (int i : carr)
			System.out.print(i + ",");

		System.out.println("Are both equal?");
		System.out.println(arr == carr);
	}

}
