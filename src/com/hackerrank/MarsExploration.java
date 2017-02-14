package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/mars-exploration</a>
 * 
 * @author Sumit
 *
 */
public class MarsExploration {

	/**
	 * HackerRank accepted code for Mars Exploration.<br>
	 * Test case 1: SOSSOT: 1 <br>
	 * Test case 2: SOSSPSSQSSOR: 3<br>
	 * Test case 3:
	 * SOSOSOSOSDSDSKWOSDOSDOASDOASDFAFJDFDOSOSOWNSOSOSNDSKDDOSOSOSJDSDSOOSOSDSDOSASSOASDSAOSOSODSDSOASDWS:
	 * 67
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		char charS = 'S';
		char charO = 'O';
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		int count = 0;
		if (s == null || s.trim().length() == 0) {
		} else {
			for (int i = 0; i <= (s.length() - 3); i += 3) {
				if (s.charAt(i) != charS) {
					count++;
				}
				if (s.charAt(i + 1) != charO) {
					count++;
				}
				if (s.charAt(i + 2) != charS) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
