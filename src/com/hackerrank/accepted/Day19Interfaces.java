package com.hackerrank.accepted;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

/**
 * <a>https://www.hackerrank.com/challenges/30-queues-stacks</a>
 * 
 * @author Sumit
 *
 */
class Calculator2 implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		int sum = 0;
		for (int i = n; i > 0; i--) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}

/**
 * @author Sumit
 *
 */
public class Day19Interfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator2();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);

	}

}