/**
 * 
 */
package com.bookingcom;

/**
 * @author srivassumit
 *
 */
public class Polygon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * Complete the function below.
	 */
	static int polygon(int a, int b, int c, int d) {
		if (a < 0 || b < 0 || c < 0 || d < 0) {
			return 0;
		}
		if (a == b && b == c && c == d) {
			return 2;
		}
		if (a == c && b == d) {
			return 1;
		}
		return 0;
	}

}
