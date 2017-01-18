package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/ctci-making-anagrams</a>
 * <p>
 * Alice is taking a cryptography class and finding anagrams to be very useful.
 * We consider two strings to be anagrams of each other if the first string's
 * letters can be rearranged to form the second string. In other words, both
 * strings must contain the same exact letters in the same exact frequency For
 * example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 * </p>
 * <p>
 * Alice decides on an encryption scheme involving two large strings where
 * encryption is dependent on the minimum number of character deletions required
 * to make the two strings anagrams. Can you help her find this number?
 * </p>
 * <p>
 * Given two strings, a and b, that may or may not be of the same length,
 * determine the minimum number of character deletions required to make and
 * anagrams. Any characters can be deleted from either of the strings.
 * </p>
 * <p>
 * Input Format
 * </p>
 * <p>
 * The first line contains a single string, a.<br>
 * The second line contains a single string, b.<br>
 * </p>
 * <p>
 * Constraints
 * </p>
 * <p>
 * 1 <= |a|, |b| <= 10000<br> It is guaranteed that and consist of lowercase English
 * alphabetic letters (i.e., through ).
 * </p>
 * <p>
 * Output Format
 * </p>
 * <p>
 * Print a single integer denoting the number of characters you must delete to
 * make the two strings anagrams of each other.
 * </p>
 * <p>
 * Sample Input
 * </p>
 * <p>
 * cde<br>
 * abc<br>
 * </p>
 * <p>
 * Sample Output
 * </p>
 * <p>
 * 4
 * </p>
 * <p>
 * Explanation
 * </p>
 * <p>
 * We delete the following characters from our two strings to turn them into
 * anagrams of each other:
 * </p>
 * <p>
 * Remove d and e from cde to get c.<br>
 * Remove a and b from abc to get c.<br>
 * </p>
 * <p>
 * We must delete 4 characters to make both strings anagrams, so we print 4 on a
 * new line.
 * </p>
 * 
 * @author Sumit
 *
 */
public class MakingAnagrams {

	public static int numberNeeded(String first, String second) {
		if (first.length() > second.length()) {
			for (char c : second.toCharArray()) {
				if (first.contains(String.valueOf(c))) {
					first = first.replaceFirst(String.valueOf(c), "*");
					second = second.replaceFirst(String.valueOf(c), "*");
				}
			}
		} else {
			for (char c : first.toCharArray()) {
				if (second.contains(String.valueOf(c))) {
					second = second.replaceFirst(String.valueOf(c), "*");
					first = first.replaceFirst(String.valueOf(c), "*");
				}
			}
		}
		int count = 0;
		for (char c : first.toCharArray()) {
			if (c != '*') {
				count++;
			}
		}
		for (char c : second.toCharArray()) {
			if (c != '*') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
		in.close();
	}

}
