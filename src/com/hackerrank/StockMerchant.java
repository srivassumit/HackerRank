package com.hackerrank.accepted;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/sock-merchant</a>
 * <p>
 * John's clothing store has a pile of n loose socks where each sock i is
 * labeled with an integer, ci, denoting its color. He wants to sell as many
 * socks as possible, but his customers will only buy them in matching pairs.
 * Two socks, i and j, are a single matching pair if ci = cj.
 * </p>
 * <p>
 * Given n and the color of each sock, how many pairs of socks can John sell?
 * </p>
 * <p>
 * Input Format
 * </p>
 * <p>
 * The first line contains an integer, n, denoting the number of socks. The
 * second line contains n space-separated integers describing the respective
 * values of c0, c1, c2, ... , c(n-1).
 * </p>
 * <p>
 * Constraints<br>
 * 1 <= n <= 100<br>
 * 1 <= ci <= 100<br>
 * </p>
 * <p>
 * Output Format
 * </p>
 * <p>
 * Print the total number of matching pairs of socks that John can sell.
 * </p>
 * <p>
 * Sample Input
 * </p>
 * <p>
 * 9<br>
 * 10 20 20 10 10 30 50 10 20
 * </p>
 * <p>
 * Sample Output
 * </p>
 * <p>
 * 3
 * </p>
 * 
 * @author Sumit
 */
public class StockMerchant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : c) {
			if (!hm.containsKey(i)) {
				hm.put(i, 0);
			}
			hm.put(i, hm.get(i) + 1);
		}
		int count = 0;
		for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
			count += e.getValue() / 2;
		}
		System.out.println(count);
		in.close();
	}

}
