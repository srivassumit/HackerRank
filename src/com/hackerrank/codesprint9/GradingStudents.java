package com.hackerrrank.codesprint9;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/contests/world-codesprint-9/challenges/grading</a>
 * 
 * @author Sumit
 *
 */
public class GradingStudents {

	/**
	 * HackerRank accepted Code for Student Grading
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			int grade = in.nextInt();
			if ((40 - grade >= 3) || (((int) (5 * Math.ceil(grade / 5.0))) - grade >= 3)) {
				System.out.println(grade);
			} else {
				System.out.println((int) (5 * Math.ceil(grade / 5.0)));
			}
		}
		in.close();
	}
}
