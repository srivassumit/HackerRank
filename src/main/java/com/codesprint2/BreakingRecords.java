package com.codesprint2;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/contests/university-codesprint-2/challenges</a>
 * 
 * @author Sumit
 *
 */
public class BreakingRecords {

	/**
	 * Input1:<br>
	 * 10<br>
	 * Output: 3 14 21 36 10 28 35 5 24 42 <br>
	 * <br>
	 * Input2:<br>
	 * 9<br>
	 * Output: 10 5 20 20 4 5 2 25 1
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		int minCount = 0;
		int maxCount = 0;
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}
		int min = score[0];
		int max = score[0];
		for (int score_i = 0; score_i < n; score_i++) {
			int sc = score[score_i];
			if (min < sc) {
				min = sc;
				minCount++;
			}
			if (max > sc) {
				max = sc;
				maxCount++;
			}
		}
		System.out.println(minCount + " " + maxCount);
		in.close();
	}

}
