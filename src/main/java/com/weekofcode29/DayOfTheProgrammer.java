package com.weekofcode29;

import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class DayOfTheProgrammer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		boolean leapYear = false;
		boolean gregorian = false;
		if (y == 1918) {
			System.out.println("26.09.1918");
		} else {
			if (y <= 1917) {
				gregorian = false;
			} else {
				gregorian = true;
			}
			if (gregorian) {
				if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
					leapYear = true;
				} else {
					leapYear = false;
				}
			} else if (y % 4 == 0) {
				leapYear = true;
			}
			if (leapYear) {
				System.out.println("12.09." + y);
			} else {
				System.out.println("13.09." + y);
			}
		}
		in.close();
	}

}
