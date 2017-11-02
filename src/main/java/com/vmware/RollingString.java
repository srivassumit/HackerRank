package com.vmware;

import java.util.HashMap;
import java.util.Map;

public class RollingString {

	static Map<String, String> increase = new HashMap<String, String>();
	static Map<String, String> decrease = new HashMap<String, String>();
	static String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
			"r", "s", "t", "u", "v", "w", "x", "y", "z" };

	public static void main(String[] args) {
		String s = "abc";
		String ops[] = { "0 0 L", "2 2 L", "0 2 R" };
		System.out.println("ANSWER:");
		// System.out.println(rollingString(s, ops));
		System.out.println("1 - " + "abc".substring(0, 1));
		System.out.println("2 - " + "abc".substring(2));
		System.out.println("3 - " + "abc".substring(0, 2));
	}

	static void init() {
		int i = 0;
		for (String s : alphabet) {
			if ("z".equalsIgnoreCase(s)) {
				increase.put("z", "a");
			} else {
				increase.put(s, alphabet[i + 1]);
				i++;
			}
		}
		i = 1;
		for (String s : alphabet) {
			if ("a".equalsIgnoreCase(s)) {
				decrease.put("a", "z");
			} else {
				decrease.put(s, alphabet[i - 1]);
				i++;
			}
		}
	}

	static String rollingString(String s, String[] operations) {
		init();
		String returnVal = "";
		for (String op : operations) {
			String tokens[] = op.split(" ");
			int i = Integer.valueOf(tokens[0]);
			int j = Integer.valueOf(tokens[1]);
			String ch = tokens[2];
			String substr = s.substring(i, j);
			String newSubstr = "";
			for (char c : substr.toCharArray()) {
				if ("L".equalsIgnoreCase(ch)) {
					newSubstr.concat(decrease.get(String.valueOf(c)));
				} else if ("R".equalsIgnoreCase(ch)) {
					newSubstr.concat(increase.get(String.valueOf(c)));
				}
			}
			String buildNewStr = "";
			if (i == 0) {
				buildNewStr.concat(newSubstr).concat(s.substring(j + 1));
			} else if (j == s.length() - 1) {
				buildNewStr.concat(s.substring(0, i - 1)).concat(newSubstr);
			} else {
				buildNewStr.concat(s.substring(0, i - 1)).concat(newSubstr).concat(s.substring(j + 1));
			}
			System.out.println(buildNewStr);
			s = buildNewStr;
		}
		returnVal = s;
		return returnVal;
	}

}
