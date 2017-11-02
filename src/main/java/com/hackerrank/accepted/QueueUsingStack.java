package com.hackerrank.accepted;

import java.util.Scanner;
import java.util.Stack;

/**
 * <h1>Queue using Two stacks (M)</h1>
 * <a>https://www.hackerrank.com/challenges/queue-using-two-stacks</a>
 * 
 * @author Sumit
 *
 */
public class QueueUsingStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> inStack = new Stack<Integer>();
		Stack<Integer> outStack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < q; i++) {
			String line = sc.nextLine();
			if (line.startsWith("1")) {
				inStack.push(Integer.valueOf(line.split(" ")[1]));
			} else if (line.startsWith("2")) {
				if (outStack.isEmpty()) {
					while (!inStack.isEmpty()) {
						outStack.push(inStack.pop());
					}
				}
				outStack.pop();
			} else if (line.startsWith("3")) {
				if (outStack.isEmpty()) {
					while (!inStack.isEmpty()) {
						outStack.push(inStack.pop());
					}
				}
				System.out.println(outStack.peek());
			}
		}
		sc.close();
	}

}
