package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/30-running-time-and-complexity</a>
 * 
 * @author Sumit
 *
 */
public class PrimeChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			System.out.println(checkPrime(n));
		}
		in.close();
	}

	private static String checkPrime(int n) {
		if (n == 2) {
			return "Prime";
		} else if (n == 1 || n % 2 == 0) {
			return "Not prime";
		} else {
			for (int i = 3; i < n; i += 2) {//can improve by using <= Math.sqrt(n) here.
				if (n % i == 0) {
					return "Not prime";
				}
			}
			return "Prime";
		}
	}

}
