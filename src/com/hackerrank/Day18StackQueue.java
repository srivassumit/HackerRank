package com.hackerrank.accepted;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * <a>https://www.hackerrank.com/challenges/30-queues-stacks</a>
 * 
 * @author Sumit
 *
 */
public class Day18StackQueue {

	private Stack<Character> stack;
	private Queue<Character> queue;

	public Day18StackQueue() {
		this.stack = new Stack<Character>();
		this.queue = new LinkedList<Character>();
	}

	public char dequeueCharacter() {
		return queue.remove();
	}

	public char popCharacter() {
		return stack.pop();
	}

	public void enqueueCharacter(char c) {
		stack.push(c);
	}

	public void pushCharacter(char c) {
		queue.offer(c);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Day18StackQueue p = new Day18StackQueue();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare
		// them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}

}
