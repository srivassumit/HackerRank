package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class ApplesAndOranges {

	/**
	 * HackerRank accepted code for Apples and Oranges<br> sample Input:
	 * 
	 * <pre>
	 * 7 11
	 * 5 15
	 * 3 2
	 * -2 2 1
	 * 5 -6
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int countApple = 0;
		int countOrange = 0;
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
			if (a + apple[apple_i] >= s && a + apple[apple_i] <= t) {
				countApple++;
			}
		}
		int[] orange = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
			if (b + orange[orange_i] >= s && b + orange[orange_i] <= t) {
				countOrange++;
			}
		}
		System.out.println(countApple);
		System.out.println(countOrange);
		in.close();
	}
}
