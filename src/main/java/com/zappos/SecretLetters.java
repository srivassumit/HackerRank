package com.zappos;

/**
 * @author Sumit
 *
 */
public class SecretLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println(reverseButPreserveWhitespace("Let's meet in the
		// owlery today"));
		// System.out.println(reverseButPreserveWhitespace("Dumbledore army
		// meeting at five"));
		// // System.out.println(reverseButPreserveWhitespace(" "));
		// // System.out.println(reverseButPreserveWhitespace(""));
		// // System.out.println(reverseButPreserveWhitespace(null));
		// // System.out.println(reverseButPreserveWhitespace(" "));
		// System.out.println(reverseButPreserveWhitespace("Secret Message
		// test"));
		System.out.println("This is a sample\ttest\nTricky!");
		System.out.println(reverseButPreserveWhitespace("This is a sample\ttest\nTricky!"));
	}

	/**
	 * HackerRank accepted Code for Secret Letters
	 * 
	 * @param initialMessage
	 * @return
	 */
	static String reverseButPreserveWhitespace(String initialMessage) {
		if (null == initialMessage) {
			return "";
		}
		String reverseString = "";
		String word = "";

		for (char c : initialMessage.toCharArray()) {
			if (c != ' ' && c != '\t' && c != '\n') {
				word += c;
			} else {
				if (!"".equals(word)) {
					reverseString += reverseWord(word);
					word = "";
				}
				reverseString += c;
			}
		}
		if (!"".equals(word)) {
			reverseString += reverseWord(word);
			word = "";
		}
		return reverseString;
	}

	static String reverseWord(String word) {
		String reverseWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverseWord += word.charAt(i);
		}
		return reverseWord;
	}

}
