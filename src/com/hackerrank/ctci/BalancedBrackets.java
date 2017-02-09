package com.hackerrank.ctci;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * <a> https://www.hackerrank.com/challenges/ctci-balanced-brackets </a>
 * 
 * @author Sumit
 *
 */
public class BalancedBrackets {

	private static final List<Character> OPEN_BRACKETS = Arrays.asList('{', '[', '(');
	private static final List<Character> CLOSE_BRACKETS = Arrays.asList('}', ']', ')');
	private static final Map<Character, Character> BRACKET_MAP = new HashMap<Character, Character>();

	public static void main(String[] args) {
		BRACKET_MAP.put('}', '{');
		BRACKET_MAP.put(']', '[');
		BRACKET_MAP.put(')', '(');
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
		in.close();
	}

	/**
	 * HackerRank accepted code for Balanced Brackets
	 * 
	 * @param expression
	 * @return
	 */
	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for (char ch : expression.toCharArray()) {
			if (OPEN_BRACKETS.contains(ch)) {
				stack.push(ch);
			} else if (CLOSE_BRACKETS.contains(ch)) {
				if (stack.isEmpty() || BRACKET_MAP.get(ch) != stack.pop()) {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
