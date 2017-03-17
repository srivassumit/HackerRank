package com.hackerrank.codesprint9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a>https://www.hackerrank.com/contests/world-codesprint-9/challenges/weighted-uniform-string</a>
 * 
 * @author Sumit
 *
 */
public class WeightedUniformString {

	private static Set<Integer> costSet = new HashSet<Integer>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		processString(s);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			int x = in.nextInt();
			if (costSet.contains(x)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		in.close();
	}

	/**
	 * HackerRank accepted Code for Weighted Uniorm String
	 * 
	 * @param s
	 */
	private static void processString(String s) {
		if (null == s || s.length() == 0) {
			return;
		} else {
			char prevChar = s.charAt(0);
			int continuousCost = Integer.valueOf(prevChar) - 96;
			for (char ch : s.toCharArray()) {
				if (prevChar == ch) {
					prevChar = ch;
					costSet.add(continuousCost);
					continuousCost += Integer.valueOf(ch) - 96;
				} else {
					costSet.add(continuousCost);
					prevChar = ch;
					continuousCost = Integer.valueOf(ch) - 96;
				}
			}
			costSet.add(continuousCost);
		}
	}

}
