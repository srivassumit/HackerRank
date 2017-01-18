package com.hackerrank.accepted;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/designer-pdf-viewer</a>
 * 
 * @author Sumit
 *
 */
public class DesPDFViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 26;
		char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int h[] = new int[n];
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int h_i = 0; h_i < n; h_i++) {
			h[h_i] = in.nextInt();
			charMap.put(chars[h_i], h[h_i]);
		}
		String word = in.next();
		int maxHeight = 0;
		int count = 0;
		for (char ch : word.toCharArray()) {
			if (charMap.get(ch) > maxHeight)
				maxHeight = charMap.get(ch);
			count++;
		}
		System.out.println(count * maxHeight);
		in.close();
	}

}
