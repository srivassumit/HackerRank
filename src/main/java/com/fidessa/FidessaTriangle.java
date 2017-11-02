package com.fidessa;

import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class FidessaTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < n; i++) {
			int a = Integer.valueOf(sc.nextInt());
			int b = Integer.valueOf(sc.nextInt());
			int c = Integer.valueOf(sc.nextInt());
			if (a + b < c || a + c < b || b + c < a) {
				System.out.println("None of these");
			} else if (a == b && b == c) {
				System.out.println("Equilateral");
			} else if ((a == b) || (b == c) || (a == c)) {
				System.out.println("Isosceles");
			} else {
				System.out.println("None of these");
			}
		}
		sc.close();
	}

}
