package com.hackerrank;

import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class InsertionSort2 {

	public static void insertionSortPart2(int[] ar) {
		int n = ar.length;
		for (int i = 1; i < n; i++) {
			if (ar[i] > ar[i - 1]) {
				int elem = ar[i];
				int j = i - 1;
				while (j > -1) {
					if (ar[j] > elem) {
						int temp = ar[j];
						ar[j] = ar[j+1];
						ar[j + 1] = temp;						
					} else if (ar[j] <= elem) {
//						ar[j + 1] = elem;
						break;
					}
//					if (j == 0 && elem < ar[j]) {
//						ar[j] = elem;
//					}
					j--;
				}
			}
			printArray(ar);
		}
	}

	public static void insertIntoSorted(int[] ar) {
		int n = ar.length;
		int elem = ar[n - 1];
		int i = n - 2;
		while (i > -1) {
			if (ar[i] > elem) {
				ar[i + 1] = ar[i];
			} else if (ar[i] <= elem) {
				ar[i + 1] = elem;
				break;
			}
			if (i == 0 && elem < ar[i]) {
				ar[i] = elem;
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
		insertionSortPart2(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
