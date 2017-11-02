package com.goldman;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * runLengthEncoding
 * 
 * @author Sumit
 *
 */
public class RunLengthEncoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(runLengthEncode("GGGGGrrrrrrrrrrrrrrt"));
	}

	static String runLengthEncode(String input) {
		Map<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
		for (Character ch : input.toCharArray()) {
			if (hashMap.containsKey(ch)) {
				hashMap.put(ch, (hashMap.get(ch) + 1));
			} else {
				hashMap.put(ch, 1);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			sb.append(String.valueOf(entry.getValue()) + String.valueOf(entry.getKey()));
		}
		return sb.toString();
	}

}
