package com.hackerrank.codesprint3;

import java.util.Scanner;

/**
 * @author srivassumit
 *
 */
public class Calculators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String opr = in.next();
		int result = solve(opr);
		System.out.println(result);
		in.close();
	}

	private static int solve(String opr) {
		if (opr.contains("+")) {
			String[] tokens = opr.split("\\+");
			return Integer.valueOf(tokens[0]) + Integer.valueOf(tokens[1]);
		}
		if (opr.contains("-")) {
			String[] tokens = opr.split("\\-");
			return Integer.valueOf(tokens[0]) - Integer.valueOf(tokens[1]);
		}
		return 0;
	}

}
