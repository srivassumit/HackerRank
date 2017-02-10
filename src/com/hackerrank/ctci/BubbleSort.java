package com.hackerrank.ctci;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/ctci-bubble-sort</a>
 * 
 * @author Sumit
 *
 */
public class BubbleSort {

	private static int numSwaps = 0;

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
		System.out.println(bubbleSort(a));
		in.close();
	}

	private static String bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			// Track number of elements swapped during a single array traversal
			int numberOfSwaps = 0;

				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					numberOfSwaps++;
				}
			}
			// If no elements were swapped during a traversal, array is sorted
			if (numberOfSwaps == 0) {
				break;
			}
		}
		return "Array is sorted in " + numSwaps
				+ " swaps.\n".concat("First Element: " + a[0]).concat("\nLast Element: " + a[n - 1]);
	}

		numSwaps++;
	}

}
