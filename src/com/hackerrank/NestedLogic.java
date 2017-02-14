package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/30-nested-logic</a>
 * 
 * @author Sumit
 *
 */
public class NestedLogic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int actD = sc.nextInt();
		int actM = sc.nextInt();
		int actY = sc.nextInt();
		int expD = sc.nextInt();
		int expM = sc.nextInt();
		int expY = sc.nextInt();
		sc.close();
		System.out.println("A: " + actD + " " + actM + " " + actY);
		System.out.println("E: " + expD + " " + expM + " " + expY);
		System.out.println(calculateFine(actD, actM, actY, expD, expM, expY));
	}

	/**
	 * Test Cases: <br>
	 * 9 6 2015<br>
	 * 6 6 2015<br>
	 * 
	 * @param actD
	 *            actual Date
	 * @param actM
	 *            actual Month
	 * @param actY
	 *            actual Year
	 * @param expD
	 *            expected Date
	 * @param expM
	 *            expected Month
	 * @param expY
	 *            expected Year
	 * @return
	 */
	private static int calculateFine(int actD, int actM, int actY, int expD, int expM, int expY) {
		if (expY >= actY) {
			if (expM >= actM) {
				if (expD >= actD) {
					return 0;
				} else if (expM == actM) {
					return 15 * (actD - expD);
				}
			} else if (expY == actY) {
				return 500 * (actM - expM);
			}
		} else {
			return 10000;
		}
		return 0;
	}

}
