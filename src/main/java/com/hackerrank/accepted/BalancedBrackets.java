package com.hackerrank.accepted;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * <h1>Balanced Brackets (M)</h1>
 * <a>https://www.hackerrank.com/challenges/balanced-brackets</a>
 * 
 * @author Sumit
 *
 */
public class BalancedBrackets {

	private static final List<Character> INBRACKETS = Arrays.asList('{', '[', '(');
	private static final List<Character> OUTBRACKETS = Arrays.asList('}', ']', ')');
	private static Map<Character, Character> inOutMap;

	static {
		inOutMap = new HashMap<Character, Character>();
		inOutMap.put('}', '{');
		inOutMap.put(']', '[');
		inOutMap.put(')', '(');
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();
			System.out.println(isBalanced(s));
		}
		in.close();
	}

	private static String isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		boolean balanced = true;
		for (char c : s.toCharArray()) {
			if (INBRACKETS.contains(c)) {
				stack.push(c);
			} else if (OUTBRACKETS.contains(c)) {
				if (stack.isEmpty() || inOutMap.get(c) != stack.pop()) {
					balanced = false;
					break;
				}
			}
		}
		if (stack.isEmpty() && balanced) {
			return "YES";
		} else {
			return "NO";
		}
	}

}
