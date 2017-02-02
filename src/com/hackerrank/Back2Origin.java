package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/contests/codeagon/challenges/back-to-origin</a>
 * 
 * @author Sumit
 *
 */
public class Back2Origin {

	/**
	 * HackerRank accepted Code for Back to the Origin
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long xTreasure = in.nextLong();
		long yTreasure = in.nextLong();
		int n = in.nextInt();
		long[][] direction = new long[n][2];
		for (int direction_i = 0; direction_i < n; direction_i++) {
			for (int direction_j = 0; direction_j < 2; direction_j++) {
				direction[direction_i][direction_j] = in.nextLong();
			}
			xTreasure -= direction[direction_i][0];
			yTreasure -= direction[direction_i][1];
		}
		System.out.println(xTreasure + " " + yTreasure);
		in.close();
	}

}
