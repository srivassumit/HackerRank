package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * @author Sumit
 */
public class DivisibleSumPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[][] mat = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = a[i] + a[j];
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (mat[j][i] % k == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
		in.close();
	}

}
