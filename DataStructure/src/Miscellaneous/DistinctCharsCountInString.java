package Miscellaneous;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DistinctCharsCountInString {

	public static void main(String[] args) {
		String input = "Arsalan Mahmood";
		Map<Character, Integer> res = distinctCharsCountInString(input);
		for(Map.Entry<Character, Integer> entrySet: res.entrySet()) {
			System.out.println(entrySet.getKey() + " -> " + entrySet.getValue());
		}
	}

	public static Map<Character, Integer> distinctCharsCountInString(String input) {
		if (null == input || "".equals(input)) {
			return Collections.emptyMap();
		}
		Map<Character, Integer> res = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			Character ch = input.charAt(i);
			if(res.containsKey(ch)) {
				res.put(ch, res.get(ch)+1);
			} else {
				res.put(ch, 1);
			}
		}
		return res;
	}

}
