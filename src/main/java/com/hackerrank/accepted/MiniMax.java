package com.hackerrank.accepted;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/mini-max-sum</a>
 * 
 * @author Sumit
 *
 */
public class MiniMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long e = in.nextLong();
		long[] arr = { a, b, c, d, e };
		Arrays.sort(arr);
		long min = 0;
		for (int i = 0; i < 4; i++) {
			min += arr[i];
		}
		long max = min - arr[0] + arr[4];
		System.out.println(min + " " + max);
		in.close();
	}

}
