package com.hackerrank.accepted;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
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
