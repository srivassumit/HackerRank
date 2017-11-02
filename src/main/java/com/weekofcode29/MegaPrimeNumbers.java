package com.weekofcode29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class MegaPrimeNumbers {

	private static List<Long> primes;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long first = in.nextLong();
		long last = in.nextLong();
		in.close();
		long t = System.currentTimeMillis();
		if (last <= first) {
			if (isPrime(first) && isMegaPrime(first)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		} else {
			primes = new ArrayList<Long>();
			long count = 0;
			for (long i = first; i <= last; i++) {
				if (isPrime(i))
					primes.add(i);
			}
			for (Long l : primes) {
				if (isMegaPrime(l)) {
					count++;
				}
			}
			System.out.println(count);
		}
		System.out.println((System.currentTimeMillis() - t) / 1000.0);
	}

	private static boolean isMegaPrime(long num) {
		String s = String.valueOf(num);
		if (s.matches(".*[014689].*")) {
			return false;
		} else {
			return true;
		}
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
