package com.hack101_46;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class MarksCakewalk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] calories = new int[n];
		for (int calories_i = 0; calories_i < n; calories_i++) {
			calories[calories_i] = in.nextInt();
		}
		Arrays.sort(calories);
		long milesNeeded = 0;
		int i = 0;
		for (int j = n - 1; j >= 0; j--) {
			milesNeeded += calories[j] * Math.pow(2, i++);
		}
		System.out.println(milesNeeded);
		in.close();
	}

}
