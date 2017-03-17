package com.hackerrank.accepted;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * <h1>Jesse and Cookies (E)</h1>
 * <a>https://www.hackerrank.com/challenges/jesse-and-cookies</a>
 * 
 * @author Sumit
 *
 */
public class JesseAndCookies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		for (int i = 0; i < n; i++) {
			pq.add(sc.nextInt());
		}
		if (pq.peek() > k) {
			System.out.println("0");
		} else {
			int s = 0;
			int count = 0;
			while (pq.size() > 1) {
				if (s >= k) {
					break;
				} else {
					int min1 = pq.remove();
					int min2 = pq.remove();
					pq.add(min1 + 2 * min2);
					s = pq.peek();
					count++;
				}
			}
			if (s >= k) {
				System.out.println(count);
			} else {
				System.out.println("-1");
			}
		}
		sc.close();
	}

}
