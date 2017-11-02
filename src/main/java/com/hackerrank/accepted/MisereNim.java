package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/misere-nim-1/problem</a>
 * 
 * @author srivassumit
 *
 */
public class MisereNim {

	/**
	 * Sample Input:
	 * 
	 * <pre>
	 * 2
	 * 2
	 * 1 1
	 * 3
	 * 2 1 3
	 * </pre>
	 * 
	 * Sample Output:
	 * 
	 * <pre>
	 * First
	 * Second
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		for (int i = 0; i < g; i++) {
			int n = in.nextInt();
			int[] piles = new int[n];
			for (int j = 0; j < n; j++) {
				piles[j] = in.nextInt();
			}
			if (firstWinner(piles)) {
				System.out.println("First");
			} else {
				System.out.println("Second");
			}
		}
		in.close();
	}

	public static boolean firstWinner(int[] piles) {
		if (piles.length == 1) {
			return piles[0] > 1;
		}
		int xor = piles[0];
		int numStones = xor;
		for (int i = 1; i < piles.length; i++) {
			int stones = piles[i];
			xor = (int) xor ^ stones;
			numStones += stones;
		}
		if (numStones == piles.length) {
			return numStones % 2 == 0;
		}
		return xor > 0;
	}

}
