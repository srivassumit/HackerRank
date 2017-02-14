package com.hackerrank.rookierank2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class MigratoryBirds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 1; i < 6; i++) {
			map.put(i, 0);
		}
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int types_i = 0; types_i < n; types_i++) {
			int i = in.nextInt();
			map.put(i, (map.get(i) + 1));
		}
		int mostCommonValue = 0;
		int mostCommonCount = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > mostCommonCount) {
				mostCommonValue = entry.getKey();
				mostCommonCount = entry.getValue();
			}
		}
		System.out.println(mostCommonValue);
		in.close();
	}

}
