package com.codesprint2;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/contests/university-codesprint-2/challenges/separate-the-numbers</a>
 * 
 * @author Sumit
 *
 */
public class SeparateNumbers {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			System.out.println(isBeautiful(s));
		}
		in.close();
	}

	private static String isBeautiful(String s) {
		String returnVal = "";
		if (s.length() == 1) {
			return "NO";
		}
		String value;
		// check length 1 strings first then length 2 then length 3.. etc.
		for (int i = 1; i < s.length() / 2; i++) {
			value = "";
			for (int j = 0; j < i; j++) {
				value += s.charAt(j);
			}
			int val = (s.charAt(i) - 48);
			System.out.println(val);
		}
		return returnVal;
	}

}
