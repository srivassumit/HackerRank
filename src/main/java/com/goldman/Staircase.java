package com.goldman;

import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class Staircase {

	private static final int MAX = 100;
	private static long[] dynamic_table = new long[MAX + 1];

	static {
		for (int i = 0; i < MAX + 1; i++) {
			dynamic_table[i] = -1;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] n = new int[s];
		int max = 0;

		for (int a0 = 0; a0 < s; a0++) {
			n[a0] = in.nextInt();
			if (max < n[a0])
				max = n[a0];
		}

		for (int a1 = 0; a1 < s; a1++) {
			System.out.println(countSteps(n[a1]));
		}

		in.close();
	}

	static long countSteps(int n) {
		if (n == 0)
			return 0;
		else
			return recursivelyCountSteps(n);
	}

	static long recursivelyCountSteps(int n) {
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else if (dynamic_table[n] > -1)
			return dynamic_table[n];
		else {
			dynamic_table[n] = recursivelyCountSteps(n - 1) + recursivelyCountSteps(n - 2)
					+ recursivelyCountSteps(n - 3);
			return dynamic_table[n];
		}
	}

}
