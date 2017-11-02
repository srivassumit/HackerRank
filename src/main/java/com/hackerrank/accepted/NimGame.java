package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/nim-game-1/problem</a>
 * 
 * @author srivassumit
 *
 */
public class NimGame {

	/**
	 * Sample Input:
	 * 
	 * <pre>
	 * 2
	 * 2
	 * 1 1
	 * 3
	 * 2 1 4
	 * </pre>
	 * 
	 * Sample Output:
	 * 
	 * <pre>
	 * Second
	 * First
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
			if (doXOR(piles) == 0) {
				System.out.println("First");
			} else {
				System.out.println("Second");
			}
		}
		in.close();
	}

	/**
	 * do a XOR operation on all the piles. if XOR of all piles ==0 then second
	 * player wins else first player wins.
	 * 
	 * @param piles
	 * @return
	 */
	private static int doXOR(int[] piles) {
		int xor = piles[0];
		for (int i = 1; i < piles.length; i++) {
			xor = (int) xor ^ piles[i];
		}
		return xor;
	}

}
