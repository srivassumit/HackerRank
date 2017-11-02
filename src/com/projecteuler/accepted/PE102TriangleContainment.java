package com.projecteuler.accepted;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/contests/projecteuler/challenges/euler102</a>
 * Three distinct points are plotted at random on a Cartesian plane, for which
 * -1000 &le; x, y &le; 1000, such that a triangle is formed. <br>
 * You are given coordinates of N "random" triangles, find the number of
 * triangles for which the interior contains the origin. <br>
 * <b>Input Format</b>
 * 
 * First line contains an integer N i.e. number of triangles, followed by N
 * lines each having 6 space separated integers (x<sub>1</sub>, y<sub>1</sub>,
 * x<sub>2</sub>, y<sub>2</sub>, x<sub>3</sub>, y<sub>3</sub>) representing a
 * triangle. <br>
 * <b>Constraints</b>
 * 
 * <pre>
 * 1 &le; N &le; 10<sup>5</sup>
 * -10<sup>6</sup> &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>6</sup>
 * </pre>
 * 
 * <b> Output Format</b>
 * 
 * Print 1 line, the number of triangles that contain origin. <br>
 * <b> Sample Input </b>
 * 
 * <pre>
 * 2
 * -1 -2 1 -2 1 3
 * -2 -1 -2 1 -1 2
 * </pre>
 * 
 * <b> Sample Output <b>
 * 
 * <pre>
 * 1
 * </pre>
 * 
 * 
 * @author srivassumit
 *
 */
public class PE102TriangleContainment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long count = 0;
		for (long i = 0; i < n; i++) {
			long x1 = sc.nextLong();
			long y1 = sc.nextLong();
			long x2 = sc.nextLong();
			long y2 = sc.nextLong();
			long x3 = sc.nextLong();
			long y3 = sc.nextLong();
			if (area(0, 0, x1, y1, x2, y2) + area(0, 0, x2, y2, x3, y3) + area(0, 0, x1, y1, x3, y3) == area(x1, y1, x2,
					y2, x3, y3)) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

	private static double area(long x1, long y1, long x2, long y2, long x3, long y3) {
		return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
	}

}
