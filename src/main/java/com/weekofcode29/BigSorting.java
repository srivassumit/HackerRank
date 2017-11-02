package com.weekofcode29;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class BigSorting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] unsorted = new String[n];
		for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
			unsorted[unsorted_i] = in.next();
		}
		Arrays.sort(unsorted, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() != o2.length() ? o1.length() - o2.length()
						: (new BigInteger(o1)).compareTo(new BigInteger(o2));
			}
		});
		for (String val : unsorted) {
			System.out.println(val);
		}
		in.close();
	}

}
