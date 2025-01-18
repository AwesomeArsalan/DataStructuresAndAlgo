package leetcode;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String input1 = "silent";
		String input2 = "listen";
		boolean res = areAnagram(input1, input2);
		if(res) {
			System.out.println(input1 + " and " + input2 + " are Anagram.");
		} else {
			System.out.println(input1 + " and " + input2 + " are not Anagram");
		}
	}

	public static boolean areAnagram(String input1, String input2) {
		boolean areAnagram = true;
		if (null == input1 || null == input2 || input1.length() != input2.length()) {
			return false;
		}
		char[] str1 = input1.toCharArray();
		char[] str2 = input2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < str1.length; i++) {
			if(str1[i] != str2[i]) {
				areAnagram = false;
				break;
			}
		}
		return areAnagram;
	}

}
