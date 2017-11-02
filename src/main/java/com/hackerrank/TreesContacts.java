package com.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <a>https://www.hackerrank.com/challenges/ctci-contacts</a>
 * 
 * @author Sumit
 *
 */
public class TreesContacts {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		StringBuffer sb = new StringBuffer();
		int count = 0;
		Pattern pattern;
		Matcher matcher;
		for (int a0 = 0; a0 < n; a0++) {
			String op = in.next();
			String contact = in.next();
			if ("add".equals(op)) {
				sb.append("\t".concat(contact));
			} else if ("find".equals(op)) {
				count = 0;
				pattern = Pattern.compile(contact);
				matcher = pattern.matcher(sb.toString());
				while (matcher.find()) {
					count++;
				}
				System.out.println(count);
			}
		}
		in.close();
	}

}
