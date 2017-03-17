package com.projecteuler.accepted;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * <h1>Even Fibonacci Numbers (E)</h1>
 * <a>https://www.hackerrank.com/contests/projecteuler/challenges/euler002</a>
 * <p>
 * Find sum of all even fionacci numbers up to n<br>
 * n can be large -- up to 4*10<sup>16</sup>
 * </p>
 * 
 * @author Sumit
 *
 */
public class PE2EvenFibonacci {

	private static final BigInteger TWO = BigInteger.valueOf(2);
	private static BigInteger SUM = BigInteger.ZERO;

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
			sumEvenFib(n);
			System.out.println(SUM.toString());
		}
		in.close();
	}

	private static void sumEvenFib(BigInteger n) {
		if (BigInteger.ONE.equals(n)) {
			return;
		} else if (TWO.equals(n)) {
			SUM = TWO;
		}
		BigInteger current = TWO;
		SUM = TWO;
		BigInteger prev = TWO;
		BigInteger prev2 = BigInteger.ONE;
		while (current.compareTo(n) < 0) {
			current = prev.add(prev2);
			if (current.compareTo(n) > 0) {
				break;
			}
			if (current.getLowestSetBit() != 0) {
				SUM = SUM.add(current);
			}
			prev2 = prev;
			prev = current;
		}
	}

}
