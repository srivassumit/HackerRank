package com.hackerrank.accepted;

import java.util.Scanner;
import java.util.Stack;

/**
 * <h1>Maximum Element (E)</h1>
 * <a>https://www.hackerrank.com/challenges/maximum-element</a>
 * 
 * @author Sumit
 *
 */
public class MaximumElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<StackElem> stack = new Stack<StackElem>();
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < q; i++) {
			String line = sc.nextLine();
			if (line.startsWith("1")) {
				int value = Integer.valueOf(line.split(" ")[1]);
				int newMax = 0;
				int oldMax = stack.isEmpty() ? 0 : stack.peek().max;
				if (value > oldMax) {
					newMax = value;
				} else {
					newMax = oldMax;
				}
				stack.push(new StackElem(value, newMax));
			} else if (line.startsWith("2")) {
				stack.pop();
			} else {
				System.out.println(stack.peek().max);
			}
		}
		sc.close();
	}

}

class StackElem {
	int value;
	int max;

	public StackElem(int value, int max) {
		this.value = value;
		this.max = max;
	}

}
