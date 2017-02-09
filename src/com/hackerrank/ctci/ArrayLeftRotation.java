package com.hackerrank.ctci;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/ctci-array-left-rotation</a>
 * 
 * @author Sumit
 *
 */
public class ArrayLeftRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		for (int j = 0; j < k; j++) {
			int temp = a[0];
			for (int i = 0; i < n - 1; i++) {
				a[i] = a[i + 1];
			}
			a[n - 1] = temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		in.close();
	}

}
