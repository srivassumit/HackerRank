package com.vmware;

public class MergeString {

	public static void main(String[] args) {
		System.out.println(mergeStrings("abc", "def"));
		System.out.println(mergeStrings("ab", "zsd"));
	}

	static String mergeStrings(String a, String b) {
		String merged = "";
		if (a == null || a.trim().length() == 0) {
			return b;
		}
		if (b == null || b.trim().length() == 0) {
			return a;
		}
		char[] ach = a.toCharArray();
		char[] bch = b.toCharArray();
		if (a.length() > b.length()){
			int i=0;
			for (i=0;i<b.length();i++) {
				merged = merged.concat(String.valueOf(ach[i])).concat(String.valueOf(bch[i]));
			}
			for (;i<a.length();i++) {
				merged = merged.concat(String.valueOf(ach[i]));
			}
		} else {
			int i=0;
			for (i=0;i<a.length();i++) {
				merged = merged.concat(String.valueOf(ach[i])).concat(String.valueOf(bch[i]));
			}
			for (;i<b.length();i++) {
				merged = merged.concat(String.valueOf(bch[i]));
			}
		}
		return merged;
	}

}