package com.hackerrank.ctci;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/ctci-fibonacci-numbers</a>
 * 
 * @author Sumit
 *
 */
public class RecursiveFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(fibonacci(n));
	}

	public static int fibonacci(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}
