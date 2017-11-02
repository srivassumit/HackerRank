package com.hackerrank.rookierank2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class MinAbsArrayDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		Arrays.sort(a);
		int minDiff = 999999999;
		for (int i = 0; i < n - 1; i++) {
			int diff = Math.abs(a[i] - a[i + 1]);
			if (diff < minDiff) {
				minDiff = diff;
			}
		}
		System.out.println(minDiff);
		in.close();
	}

}
