package com.hackerrank.accepted;

/**
 * <a>https://www.hackerrank.com/challenges/kangaroo</a>
 * <p>
 * There are two kangaroos on an x-axis ready to jump in the positive direction
 * (i.e, toward positive infinity). The first kangaroo starts at location x1 and
 * moves at a rate of v1 meters per jump. The second kangaroo starts at location
 * x2 and moves at a rate of v2 meters per jump. Given the starting locations
 * and movement rates for each kangaroo, can you determine if they'll ever land
 * at the same location at the same time?
 * </p>
 * <p>
 * Input Format
 * </p>
 * <p>
 * A single line of four space-separated integers denoting the respective values
 * of x1, v1, x1, and v2.
 * </p>
 * <p>
 * Constraints:
 * 
 * <pre>
 * 0 < x1 < x2 < 10000
 * 1 < v1 < 1000
 * 1 < v2 < 10000
 * </pre>
 * </p>
 * <p>
 * 
 * Output Format
 * </p>
 * <p>
 * Print YES if they can land on the same location at the same time; otherwise,
 * print NO.
 * </p>
 * <p>
 * Note: The two kangaroos must land at the same location after making the same
 * number of jumps.
 * </p>
 * <p>
 * Sample Input 0
 * </p>
 * <p>
 * 0 3 4 2
 * </p>
 * <p>
 * Sample Output 0
 * </p>
 * <p>
 * YES
 * </p>
 * <p>
 * Explanation 0
 * </p>
 * <p>
 * The two kangaroos jump through the following sequence of locations:
 * 
 * <pre>
 * 0-3-6-9-12
 * 4-6-8-10-12
 * </pre>
 * 
 * Thus, the kangaroos meet after jumps and we print YES.
 * </p>
 * <p>
 * Sample Input 1
 * </p>
 * <p>
 * 0 2 5 3
 * </p>
 * <p>
 * Sample Output 1
 * </p>
 * <p>
 * NO
 * </p>
 * <p>
 * Explanation 1
 * </p>
 * <p>
 * The second kangaroo has a starting location that is ahead (further to the
 * right) of the first kangaroo's starting location (i.e., x2 > x1). Because the
 * second kangaroo moves at a faster rate (meaning v2 > v1) and is already ahead
 * of the first kangaroo, the first kangaroo will never be able to catch up.
 * Thus, we print NO.
 * </p>
 * 
 * @author Sumit
 *
 */
public class Kangaroo {

	public static void main(String[] args) {
		int[] input1 = { 0, 3, 4, 2 }; // YES
		int[] input2 = { 0, 2, 5, 3 }; // NO
		int[] input3 = { 21, 6, 47, 3 }; // NO
		int[] input4 = { 45, 7, 56, 2 }; // NO
		System.out.println(kangaroo(input1[0], input1[1], input1[2], input1[3]));
		System.out.println(kangaroo(input2[0], input2[1], input2[2], input2[3]));
		System.out.println(kangaroo(input3[0], input3[1], input3[2], input3[3]));
		System.out.println(kangaroo(input4[0], input4[1], input4[2], input4[3]));
	}

	private static String kangaroo(int x1, int v1, int x2, int v2) {
		String value = "";
		if ((x1 > x2 && v1 > v2) || (x1 < x2 && v1 < v2) || (v1 == v2 && x1 != x2) || (x1 == x2 && v1 != v2)) {
			value = "NO";
		} else if (x1 == x2 && v1 == v2) {
			value = "YES";
		} else {
			float k = Math.abs(x2 - x1) / (Math.abs(v2 - v1) * 1.0f);
			if (k == Math.floor(k)) {
				value = "YES";
			} else {
				value = "NO";
			}
		}
		return value;
	}

}
