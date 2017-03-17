package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * <h1>Time Conversion (E)</h1>
 * <a>https://www.hackerrank.com/challenges/time-conversion</a>
 * 
 * @author Sumit
 *
 */
public class TimeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		if (time.endsWith("AM")) {
			String t2 = time.split("AM")[0];
			if ("12".equals(t2.split(":")[0])) {
				String hour = "00";
				String restTime = t2.split(":")[1].concat(":").concat(t2.split(":")[2]);
				System.out.println(hour.concat(":").concat(restTime));
			} else {
				System.out.println(t2);
			}
		}
		if (time.endsWith("PM")) {
			String t2 = time.split("PM")[0];
			if ("12".equals(t2.split(":")[0])) {
				System.out.println(t2);
			} else {
				String hour = String.valueOf(Integer.valueOf(t2.split(":")[0]) + 12);
				String restTime = t2.split(":")[1].concat(":").concat(t2.split(":")[2]);
				System.out.println(hour.concat(":").concat(restTime));
			}
		}
		sc.close();
	}

}
