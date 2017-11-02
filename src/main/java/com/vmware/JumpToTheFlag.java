package com.vmware;

public class JumpToTheFlag {

	public static void main(String[] args) {
		System.out.println(jumps(3, 1));
		System.out.println(jumps(3, 2));
		System.out.println(jumps(3, 3));
	}

	static int jumps(int k, int j) {
		int jumps = 0;
		if (k % j == 0) {
			jumps = k / j;
		} else if (j == 1) {
			jumps = k;
		} else {
			jumps = k / j + k % j;
		}
		return jumps;
	}
}
