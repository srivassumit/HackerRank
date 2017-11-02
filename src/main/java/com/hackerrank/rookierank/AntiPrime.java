package com.hackerrank.rookierank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/contests/rookierank/challenges/antiprime-numbers</a>
 * 
 * @author Sumit
 *
 */
public class AntiPrime {

	private static int[] numFactors = new int[1000000];
	private static Map<Integer, Integer> factors = new HashMap<Integer, Integer>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			System.out.println(findAntiPrime(num));
		}
		sc.close();
	}

	private static int findAntiPrime(int num) {
		for (int i = 1; i <= num; i++) {

		}
		return 0;
	}

	private static int findNumDivisors(int num) {
		if (factors.containsKey(num)) {
			return factors.get(num);
		} else {
			return calculateDivisors(num);
		}
	}

	private static int calculateDivisors(int num) {
		return 0;
	}

}
