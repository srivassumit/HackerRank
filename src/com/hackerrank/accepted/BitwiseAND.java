package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/30-bitwise-and</a>
 * 
 * @author Sumit
 *
 */
public class BitwiseAND {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int maxValue;
		int value;
		for (int a0 = 0; a0 < t; a0++) {
			maxValue = Integer.MIN_VALUE;
			value = 0;
			int n = in.nextInt();
			int k = in.nextInt();
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					value = i & j;
					if (value > maxValue && value < k) {
						maxValue = value;
					}
				}
			}
			System.out.println(maxValue);
		}
		in.close();
	}

	private int bitwiseAndOptimized(int n, int k) {
		if (((k - 1) | k) > n && k % 2 == 0) {
			return (k - 2);
		} else {
			return (k - 1);
		}
	}

}
