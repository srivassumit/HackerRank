package com.informatica;

import java.util.ArrayList;
import java.util.List;

public class FindNumber {

	public static void main(String[] args) {
		int[] a = { 1, 3, 2, 3, 4, 1 };
		String[] str = BitPattern(a);
		for (String s : str) {
			System.out.println(s);
		}
	}

	static String[] BitPattern(int[] num) {
		int len = num.length;
		String[] output = new String[2];
		String op = "";
		List<Integer> visited = new ArrayList<Integer>();
		if (num != null && len > 0) {
			for (int i = 0; i < len; i++) {
				if (i == 0) {
					op = op.concat("0");
					visited.add(num[i]);
				} else if (visited.contains(num[i])) {
					op = op.concat("1");
				} else {
					visited.add(num[i]);
					op = op.concat("0");
				}
			}
			visited.clear();
			output[0] = op;
			op = "";
			for (int i = len - 1; i >= 0; i--) {
				if (i == len - 1) {
					op = "0".concat(op);
					visited.add(num[i]);
				} else if (visited.contains(num[i])) {
					op = "1".concat(op);
				} else {
					visited.add(num[i]);
					op = "0".concat(op);
				}
			}
			output[1] = op;
		}
		return output;
	}

}
