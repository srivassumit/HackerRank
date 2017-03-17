package com.hackerrank.accepted;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * <h1>QHeap1 (E)</h1> <a>https://www.hackerrank.com/challenges/qheap1</a>
 * 
 * @author Sumit
 *
 */
public class QHeap1 {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < q; i++) {
			String line = sc.nextLine();
			if (line.startsWith("1")) {
				pq.add(Integer.valueOf(line.split(" ")[1]));
			} else if (line.startsWith("2")) {
				pq.remove(Integer.valueOf(line.split(" ")[1]));
			} else if (line.startsWith("3")) {
				System.out.println(pq.peek());
			}
		}
		sc.close();
	}
}
