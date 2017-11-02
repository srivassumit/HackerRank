package com.informatica;

import java.util.ArrayList;
import java.util.List;

public class GoodNodes {

	private static List<Integer> visitedNodes = new ArrayList<Integer>();

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 5, 5, 5, 5, 5 };
		int[] c = { 1, 1, 2, 3 };
		System.out.println(goodNodes2(a));
		System.out.println(goodNodes2(b));
		System.out.println(goodNodes2(c));
	}

	private static int goodNodes3(int[] points_to) {
		int res = 0;
		for (int i = 0; i < points_to.length; i++) {
			if (i != 0 && ((i + 1) == points_to[i])) {
				res++;
			}
		}
		return res;
	}

	private static int goodNodes2(int[] points_to) {
		int res = 0;
		for (int i = 1; i <= points_to.length; i++) {
			if (!isGoodNode(points_to, i)) {
				res++;
				points_to[i - 1] = 1;
			}
		}
		return res;
	}

	static int goodNodes(int[] points_to) {
		int res = 0;
		List<Integer> goodNodes = new ArrayList<Integer>();
		for (int i = 1; i <= points_to.length; i++) {
			if (points_to[i - 1] < i) {
				if (points_to[i - 1] == 1 || goodNodes.contains(points_to[i - 1]) || goodNodes.contains(i)) {
					goodNodes.add(i);
				} else {
					points_to[i - 1] = 1;
					goodNodes.add(i);
					res++;
				}
			} else {
				if (points_to[points_to[i - 1]] == 1) {

				}
			}
		}
		return res;
	}

	static boolean isGoodNode(int[] A, int i) {
		if (visitedNodes.contains(i - 1)) {
			return false;
		} else {
			visitedNodes.add(i - 1);
		}
		if (i == A[i - 1]) {
			return false;
		} else if (A[i - 1] == 1 || A[A[i - 1] - 1] == 1 || isGoodNode(A, A[i - 1] - 1)) {
			return true;
		} else {
			return false;
		}
	}

}