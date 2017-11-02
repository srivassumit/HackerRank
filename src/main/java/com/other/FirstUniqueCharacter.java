package com.other;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Sumit
 *
 */
public class FirstUniqueCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(firstUniqueChar("racecars"));
	}

	static String firstUniqueChar(String input) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : input.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, (map.get(ch) + 1));
			} else {
				map.put(ch, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return String.valueOf(entry.getKey());
			}
		}
		return null;
	}

}
