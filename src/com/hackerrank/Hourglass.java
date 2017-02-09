package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/2d-array</a>
 * 
 * @author Sumit
 *
 */
public class Hourglass {

	public static void main(String[] args) {
		// int arr[][] = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1,
		// 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
		// { 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		int[][] arr = new int[6][6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int hourGlassSum = 0;
		int maxHourGlassSum = -9999999;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				hourGlassSum += arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				if (maxHourGlassSum < hourGlassSum) {
					maxHourGlassSum = hourGlassSum;
				}
				hourGlassSum = 0;
			}
		}
		System.out.println(maxHourGlassSum);
		sc.close();
	}

}
