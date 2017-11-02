package com.projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * <h1>Largest Prime Factor</h1>
 * <a>https://www.hackerrank.com/contests/projecteuler/challenges/euler003</a>
 * <p>
 * Find the largest Prime Factor of N.<br>
 * N can be large -- up to 10<sup>12</sup>
 * </p>
 * 
 * @author Sumit
 *
 */
public class PE3LargestPrimeFactor {

	private static final BigInteger TWO = BigInteger.valueOf(2);

	/**
	 * t is the number of test cases.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			BigInteger n = BigInteger.valueOf(in.nextLong());
			System.out.println(findLargestPrimeFactor(n));
		}
		in.close();
	}

	private static BigInteger findLargestPrimeFactor(BigInteger n) {
		BigInteger largestPrimeFactor = BigInteger.ZERO;
		for (BigInteger i = n; i.compareTo(TWO) > 0; i = i.subtract(BigInteger.ONE)) {
			if (i.isProbablePrime(1) && n.mod(i) == BigInteger.ZERO) {
				return i;
			}
		}
		return largestPrimeFactor;
	}

}
