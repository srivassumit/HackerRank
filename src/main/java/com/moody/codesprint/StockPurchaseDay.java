package com.moody.codesprint;

import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author srivassumit
 *
 */
public class StockPurchaseDay {

	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	static NavigableMap<Integer, Integer> tm = new TreeMap<Integer, Integer>(Collections.reverseOrder());

	static int stockPurchaseDay(int[] A, int xi) {
		if (xi < min) {
			return -1;
			// } else if (xi > max) {
			// return A.length - 1;
		} else {
			// if (tm.containsKey(xi)) {
			// return tm.get(xi);
			// } else {
			Map.Entry<Integer, Integer> lessThanEqualTo = tm.ceilingEntry(xi);// it is a reverse map so ceil = next
																				// smaller value
			int indexOfNextHighestValue = lessThanEqualTo.getValue();
			int secondHighestValue = lessThanEqualTo.getKey();
			// check if there is a lower value after this index.
			for (int i = A.length - 1; i >= indexOfNextHighestValue; i--) {
				if (A[i] < secondHighestValue) {
					return i;
				}
			}
			// if there is no other smaller value then return the 2nd highest index only.
			return indexOfNextHighestValue;
			// }
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] A = new int[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
			tm.put(A[A_i], (A_i + 1));
			if (A[A_i] < min)
				min = A[A_i];
			if (A[A_i] > max)
				max = A[A_i];
		}
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int xi = in.nextInt();
			int result = stockPurchaseDay(A, xi);
			System.out.println(result);
		}
		in.close();
	}
}
