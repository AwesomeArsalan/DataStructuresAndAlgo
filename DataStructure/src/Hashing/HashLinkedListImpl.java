package Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class HashLinkedListImpl {

	public static void main(String[] args) {
		/*
		 * In hashing there is a hash function that maps keys to some values. But these
		 * hashing function may lead to collision that is two or more keys are mapped to
		 * same value. Chain hashing avoids collision. The idea is to make each cell of
		 * hash table point to a linked list of records that have same hash function
		 * value.
		 */
		// In this example I used linear probing to avoid collision
		Scanner sc = new Scanner(System.in);
		HashLinkedListImpl hash = new HashLinkedListImpl();
		int size = 5;
		int[] arr = new int[size];
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number to insert: ");
			int num = sc.nextInt();
			hash.insertNum(arr, num);
		}
		System.out.println(Arrays.toString(arr));
		boolean cont = true;
		while (cont) {
			System.out.println("Enter number to search: ");
			int num = sc.nextInt();
			int pos = hash.searchNum(arr, num);
			if (pos != -1) {
				System.out.println("Number found at position: " + pos);
			}
			System.out.println("Do you want to continue(y/n): ");
			String res = sc.next();
			if (res.equalsIgnoreCase("n")) {
				cont = false;
			}
		}
		sc.close();
	}

	private void insertNum(int[] arr, int num) {
		// Using Linear probing
		int hashCode = getHashCode(num, arr.length - 1);
		while (arr[hashCode] != 0) {
			hashCode++;
			if (hashCode == arr.length) {
				hashCode = 0;
			}
		}
		arr[hashCode] = num;
	}

	private int searchNum(int[] arr, int num) {
		int hashCode = getHashCode(num, arr.length - 1);
		while (arr[hashCode] != num) {
			hashCode++;
		}
		if (hashCode < arr.length) {
			return hashCode;
		}
		return -1;
	}

	private int getHashCode(int num, int bucketSize) {
		return num % bucketSize;
	}
}
