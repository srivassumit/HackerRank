package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/insertionsort1</a>
 * 
 * @author Sumit
 *
 */
public class InsertionSort1 {

	/**
	 * NackerRank accepted code for insertion sort 1
	 * 
	 * @param ar
	 */
	public static void insertIntoSorted(int[] ar) {
		int n = ar.length;
		int elem = ar[n - 1];
		int i = n - 2;
		while (i > -1) {
			if (ar[i] > elem) {
				ar[i + 1] = ar[i];
				printArray(ar);
			} else if (ar[i] <= elem) {
				ar[i + 1] = elem;
				printArray(ar);
				break;
			}
			if (i == 0 && elem < ar[i]) {
				ar[i] = elem;
				printArray(ar);
			}
			i--;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
