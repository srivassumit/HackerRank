package com.hackerrank.accepted;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/camelcase</a>
 * <p>
 * Alice wrote a sequence of words in CamelCase as a string of letters,
 * <i>s</i>, having the following properties:
 * <ul>
 * <li>It is a concatenation of one or more <i>words</i> consisting of English
 * letters.</li>
 * <li>All letters in the first word are <i>lowercase</i>.</li>
 * <li>For each of the subsequent words, the first letter is <i>uppercase</i>
 * and rest of the letters are <i>lowercase</i>.</li>
 * </ul>
 * Given <i>s</i>, print the number of words in <i>s</i> on a new line.<br>
 * <br>
 * <b> Input Format<br>
 * </b> A single line containing string <i>s</i>. <br>
 * <br>
 * <b> Constraints<br>
 * </b>
 * <ul>
 * <li>1 &le; s &ge; 10<sup>5</sup></li>
 * </ul>
 * <b> Output Format</b><br>
 * 
 * Print the number of words in string <i>s</i>. <br>
 * <br>
 * <b> Sample Input </b><br>
 * 
 * <pre>
 * saveChangesInTheEditor
 * </pre>
 * 
 * <b> Sample Output </b><br>
 * 
 * <pre>
 * 5
 * </pre>
 * 
 * <b> Explanation </b><br>
 * String contains five words: <br>
 * <ol>
 * <li>save<br>
 * </li>
 * <li>Changes<br>
 * </li>
 * <li>In<br>
 * </li>
 * <li>The<br>
 * </li>
 * <li>Editor<br>
 * </li>
 * </ol>
 * Thus, we print <i>5</i> on a new line.
 * </p>
 * 
 * @author Sumit
 *
 */
public class CamelCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int count = 0;
		count = s.length() > 0 ? 0 : 1;
		int val = 0;
		for (char c : s.toCharArray()) {
			val = c;
			if (val >= 65 && val <= 90) {
				count++;
			}
		}
		System.out.println(count + 1);
		in.close();
	}

}
