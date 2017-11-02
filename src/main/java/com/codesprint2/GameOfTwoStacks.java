package com.codesprint2;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/contests/university-codesprint-2/challenges/game-of-two-stacks</a>
 * 
 * @author Sumit
 *
 */
public class GameOfTwoStacks {

	/**
	 * Sample Input:<br>
	 * 1<br>
	 * 5 4 10<br>
	 * 4 2 4 6 1<br>
	 * 2 1 8 5<br>
	 * Expected Output:<br>
	 * 4
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		for (int a0 = 0; a0 < g; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int x = in.nextInt();
			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}
			int[] b = new int[m];
			for (int b_i = 0; b_i < m; b_i++) {
				b[b_i] = in.nextInt();
			}
			if (x <= 0) {
				System.out.println("0");
				continue;
			} else {
				int count = 0;
				int sum = 0;
				int i = 0;
				int j = 0;
				while (sum < x && i < a.length && j < b.length) {
					if (a[i] > b[j]) {
						sum += b[j];
						if (sum < x) {
							count++;
						} else {
							break;
						}
						j++;
					} else if (a[i] < b[j]) {
						sum += a[i];
						if (sum < x) {
							count++;
						} else {
							break;
						}
						i++;
					} else {// a[i]==b[j]
						int subCount = 1;
						sum += a[i];
						if (sum > x) {
							break;
						} else {
							int minSize = Math.min(a.length, b.length);
							for (int k = 1; k < minSize; k++) {
								if (a[i + k] == b[j + k]) {
									subCount++;
									sum += a[i];
									if (sum > x) {
										break;
									}
								} else {
									break;
								}
							}
						}
						count += subCount;
						if (sum > x) {
							break;
						}
					}
				}
				System.out.println(count);
			}
		}
		in.close();
	}

}
