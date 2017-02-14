package com.hackerrank.rookierank;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/contests/rookierank/challenges/birthday-cake-candles</a>
 * 
 * @author Sumit
 *
 */
public class BirthdayCakeCandles {

	/**
	 * TestCases:<br>
	 * <br>
	 * i/p: 10<br>
	 * 18 90 90 13 90 75 90 8 90 43<br>
	 * o/p: 4 <br>
	 * <br>
	 * i/p: 10<br>
	 * 44 53 31 27 77 60 66 77 26 36<br>
	 * o/p: 2 <br>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int height[] = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		in.close();
		int maxHeight = height[0];
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (height[i] == maxHeight) {
				count++;
			}
			if (height[i] > maxHeight) {
				count = 1;
				maxHeight = height[i];
			}
		}
		System.out.println(count);
	}

}
