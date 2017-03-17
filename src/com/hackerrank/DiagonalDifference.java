package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * <h1>Diagonal Difference</h1>
 * <a>https://www.hackerrank.com/challenges/diagonal-difference</a>
 * 
 * @author Sumit
 *
 */
public class DiagonalDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int mdSum = 0;
		int sdSum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
				if (i == j) {
					mdSum += arr[i][j];
				}
				if (i + j == n - 1) {
					sdSum += arr[i][j];
				}
			}
		}
		System.out.println(Math.abs(mdSum - sdSum));
		sc.close();
	}

}
