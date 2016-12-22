package com.hackerrank.accepted;

public class Kangaroo {

	public static void main(String[] args) {
		int[] input1 = { 0, 3, 4, 2 }; // YES
		int[] input2 = { 0, 2, 5, 3 }; // NO
		int[] input3 = { 21, 6, 47, 3 }; // NO
		int[] input4 = { 45, 7, 56, 2 }; // NO
		System.out.println(kangaroo(input1[0], input1[1], input1[2], input1[3]));
		System.out.println(kangaroo(input2[0], input2[1], input2[2], input2[3]));
		System.out.println(kangaroo(input3[0], input3[1], input3[2], input3[3]));
		System.out.println(kangaroo(input4[0], input4[1], input4[2], input4[3]));
	}

	private static String kangaroo(int x1, int v1, int x2, int v2) {
		String value = "";
		if ((x1 > x2 && v1 > v2) || (x1 < x2 && v1 < v2) || (v1 == v2 && x1 != x2) || (x1 == x2 && v1 != v2)) {
			value = "NO";
		} else if (x1 == x2 && v1 == v2) {
			value = "YES";
		} else {
			float k = Math.abs(x2 - x1) / (Math.abs(v2 - v1) * 1.0f);
			if (k == Math.floor(k)) {
				value = "YES";
			} else {
				value = "NO";
			}
		}
		return value;
	}

}
