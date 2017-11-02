package com.hackerrank;

import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class EqualizeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

	}

}
