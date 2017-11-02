package com.vmware;

import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayReduction {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3, 4 };
		System.out.println(reductionCost(a));
		System.out.println(reductionCost(b));
	}

	static int reductionCost(int[] num) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		for (int n : num) {
			q.add(n);
		}
		int totalMinCost = 0;
		int minCost = 0;
		while (!q.isEmpty()) {
			if (q.size() == 1) {
				break;
			}
			minCost += q.remove() + q.remove();
			totalMinCost += minCost;
			q.add(minCost);
			minCost = 0;
		}

		return totalMinCost;
	}

}
