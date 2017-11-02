package com.hackerrank.codesprint9;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/contests/world-codesprint-9/challenges/box-operations</a>
 * 
 * @author Sumit
 *
 */
public class BoxOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		long[] box = new long[n];
		for (int box_i = 0; box_i < n; box_i++) {
			box[box_i] = in.nextLong();
		}
		for (int q_i = 0; q_i < q; q_i++) {
			int type = in.nextInt();
			if (type < 3) {
				int l = in.nextInt();
				int r = in.nextInt();
				int c = in.nextInt();
				if (type == 1) {
					for (int i = l; i <= r; i++) {
						box[i] += c;
					}
				} else {
					for (int i = l; i <= r; i++) {
						box[i] = (long) Math.floor(box[i] / (c * 1.0));
					}
				}
			} else {
				int l = in.nextInt();
				int r = in.nextInt();
				if (type == 3) {
					long min = Long.MAX_VALUE;
					for (int i = l; i <= r; i++) {
						if (box[i] < min) {
							min = box[i];
						}
					}
					System.out.println(min);
				} else {
					BigInteger sum = BigInteger.ZERO;
					for (int i = l; i <= r; i++) {
						sum = sum.add(BigInteger.valueOf(box[i]));
					}
					System.out.println(sum.toString());
				}
			}
		}
		in.close();
	}

}