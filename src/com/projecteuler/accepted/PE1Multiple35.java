package com.projecteuler.accepted;

import java.util.Scanner;

/**
 * <h1>Multiple of 3 or 5 (E)</h1>
 * 
 * <a>https://www.hackerrank.com/contests/projecteuler/challenges/euler001<a>
 * <p>
 * Find the sum of multiples of 3 or 5 up to given n.<br>
 * n can be large -- up to 10<sup>9</sup>
 * </p>
 * 
 * @author Sumit
 *
 */
public class PE1Multiple35 {

	/**
	 * t is number of test cases<br>
	 * add sequence 1 -> divisible by 3<br>
	 * add sequence 2 -> divisible by 5<br>
	 * subtract sequence 3 -> divisible by 15<br>
	 * AP Sum = n/2*(2*a+(n-1)d)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			long sum3 = 0;
			long n3 = (long) Math.floor((n - 1) / 3.0);
			long sum5 = 0;
			long n5 = (long) Math.floor((n - 1) / 5.0);
			long sum15 = 0;
			long n15 = (long) Math.floor((n - 1) / 15.0);
			sum3 = (n3 * ((2 * 3) + ((n3 - 1) * 3))) / 2;
			sum5 = (n5 * ((2 * 5) + ((n5 - 1) * 5))) / 2;
			sum15 = (n15 * ((2 * 15) + ((n15 - 1) * 15))) / 2;
			System.out.println((sum3 + sum5 - sum15));
		}
		in.close();
	}

}
