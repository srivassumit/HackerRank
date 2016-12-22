package com.hackerrank.accepted;

public class ScopeDay14 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5 };
		Difference d = new Difference(a);
		System.out.println(d.maximumDifference);
	}

}

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		this.elements = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			this.elements[i] = a[i];
		}
		this.maximumDifference = 0;
	}

	public void computeDifference() {
		int max = 0;
		int min = 9999;
		for (int i : this.elements) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}
		// System.out.println("max:" + max + "min:" + min);
		this.maximumDifference = (max - min);
	}
}