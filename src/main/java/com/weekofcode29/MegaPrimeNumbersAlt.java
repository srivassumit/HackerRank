package com.weekofcode29;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class MegaPrimeNumbersAlt {

	private static List<Integer> lst = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long first = in.nextLong();
		long last = in.nextLong();
		in.close();
		lst.add(0);
		lst.add(1);
		lst.add(4);
		lst.add(6);
		lst.add(8);
		lst.add(9);
		long t = System.currentTimeMillis();
		long count = 0;
		for (long i = first; i <= last; i++) {
			if ((BigInteger.valueOf(i)).isProbablePrime(1) && isPrime(i) && isMegaPrime(i))
				count++;
		}
		System.out.println(count);
		System.out.println((System.currentTimeMillis() - t) / 1000.0);
	}

	private static boolean isMegaPrime(long num) {
		String s = String.valueOf(num);
		if (containsDigit(s)) {
			return false;
		} else {
			return true;
		}
	}

	private static boolean containsDigit(String s) {
		for (char c : s.toCharArray()) {
			if (lst.contains(c - 48)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isPrime(long num) {
		if (num > 2 && num % 2 == 0) {
			return false;
		}
		int top = (int) Math.sqrt(num) + 1;
		for (int i = 3; i < top; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
