package com.hackerrank.accepted;

import java.util.Scanner;

public class MakingAnagrams {

	public static int numberNeeded(String first, String second) {
		if (first.length() > second.length()) {
			for (char c : second.toCharArray()) {
				if (first.contains(String.valueOf(c))) {
					first = first.replaceFirst(String.valueOf(c), "*");
					second = second.replaceFirst(String.valueOf(c), "*");
				}
			}
		} else {
			for (char c : first.toCharArray()) {
				if (second.contains(String.valueOf(c))) {
					second = second.replaceFirst(String.valueOf(c), "*");
					first = first.replaceFirst(String.valueOf(c), "*");
				}
			}
		}
		int count = 0;
		for (char c : first.toCharArray()) {
			if (c != '*') {
				count++;
			}
		}
		for (char c : second.toCharArray()) {
			if (c != '*') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
		in.close();
	}

}
