package com.hackerrank.ctci;

public class CheckPrime {

	public static void main(String[] args) {
		for (int a0 = 0; a0 < 100; a0++) {
			System.out.println("value: " + a0 + " is " + checkPrime(a0));
		}
	}

	private static String checkPrime(int n) {
		if (n == 1 || n == 2) {
			return "Prime";
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return "Not prime";
				}
			}
			return "Prime";
		}
	}
}
