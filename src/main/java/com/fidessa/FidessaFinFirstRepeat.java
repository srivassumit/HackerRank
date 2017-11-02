package com.fidessa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class FidessaFinFirstRepeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, (map.get(ch) + 1));
			} else {
				map.put(ch, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		sc.close();
	}

}
