package com.vmware;

public class LastSubstring {

	public static void main(String[] args) {
		System.out.println(compute("ba"));
		System.out.println(compute("aaa"));
		System.out.println(compute("banana"));
	}

	static String compute(String s) {
		boolean flag = false;
		String maxsubstr = "";
		String maxChar = "a";
		maxChar = String.valueOf(s.toCharArray()[0]);
		for (char c : s.toCharArray()) {
			if (String.valueOf(c).compareTo(maxChar) >= 0) {
				maxChar = String.valueOf(c);
			}
		}
		for (char c : s.toCharArray()) {
			if (maxChar.equalsIgnoreCase(String.valueOf(c))) {
				flag = true;
			}
			if (flag) {
				maxsubstr = maxsubstr.concat(String.valueOf(c));
			}
		}
		return maxsubstr;
	}

}
