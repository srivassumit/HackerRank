package com.hackerrank.rookierank2;

import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class HackerRankString {

	public static final String H = "h";
	public static final String A = "a";
	public static final String C = "c";
	public static final String K = "k";
	public static final String E = "e";
	public static final String R = "r";
	public static final String N = "n";
	public static final String[] word = { H, A, C, K, E, R, R, A, N, K };
	public static final String YES = "YES";
	public static final String NO = "NO";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			String result = findWord(s, 0) ? YES : NO;
			System.out.println(result);
		}
		in.close();
	}

	private static boolean findWord(String s, int position) {
		if (position >= word.length) {
			return true;
		} else if (s.contains(word[position])) {
			return findWord(s.substring(s.indexOf(word[position]) + 1), ++position);
		} else {
			return false;
		}
	}

}
