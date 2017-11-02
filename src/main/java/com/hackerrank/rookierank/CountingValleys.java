package com.hackerrank.rookierank;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/contests/rookierank/challenges/counting-valleys</a>
 * 
 * @author Sumit
 *
 */
public class CountingValleys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.valueOf(in.nextLine());
		int base = 0;
		int valleyCount = 0;
		boolean isDownhill = false;
		boolean downhillFound = false;
		String stepsSequence = in.nextLine();
		for (int i = 0; i < n; i++) {
			char step = stepsSequence.charAt(i);
			if ('D' == step) {
				base--;
				isDownhill = true;
				downhillFound = true;
			} else if ('U' == step) {
				base++;
				isDownhill = false;
			}
			if (base == 0 && downhillFound) {
				downhillFound = false;
				valleyCount++;
			}
		}
//		if (base != 0 && !isDownhill && downhillFound) {
//			valleyCount++;
//		}
		System.out.println(valleyCount);
		in.close();
	}

}
