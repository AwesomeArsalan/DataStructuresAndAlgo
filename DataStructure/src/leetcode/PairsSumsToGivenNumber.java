package leetcode;

import java.util.*;

public class PairsSumsToGivenNumber {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {4, 5, 7, 11, 9, 13, 8, 12};
		Integer input = 20;
		findAllPairs(arr, input);
	}

	public static void findAllPairs(Integer[] arr, Integer input) {
		if (arr.length == 0) {
			return;
		}
		List<Integer> integerList = Arrays.asList(arr);
		for (int i = 0; i < arr.length; i++) {
			Integer rem = input-arr[i];
			if(integerList.contains(rem)) {
				System.out.println(arr[i] + " " + integerList.get(integerList.indexOf(rem)));
			}
		}

	}

}
