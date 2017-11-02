package com.hackerrank.ctci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/ctci-lonely-integer</a>
 * 
 * @author Sumit
 *
 */
public class LonelyIntegerBitManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		System.out.println(lonelyInteger(a));
		in.close();
	}

	/**
	 * HackerRank accepted solution for Lonely Integer
	 * 
	 * @param a
	 * @return
	 */
	public static int lonelyInteger(int[] a) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int val : a) {
			if (hashMap.containsKey(val)) {
				hashMap.put(val, (hashMap.get(val) + 1));
			} else {
				hashMap.put(val, 0);
			}
		}
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() == 0) {
				return entry.getKey();
			}
		}
		return -1;
	}

	/**
	 * recommended solution
	 * 
	 * @param a
	 * @return
	 */
	public static int fastLonelyInteger(int[] a) {
		int value = 0;

		for (int i : a) {
			value ^= i;// XOR
		}
		return value;
	}

}
