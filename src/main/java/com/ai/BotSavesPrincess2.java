package com.ai;

import java.util.Scanner;

/**
 * <h1>Bot saves princess-2 (E)</h1>
 * <a>https://www.hackerrank.com/challenges/saveprincess2</a>
 * 
 * @author Sumit
 *
 */
public class BotSavesPrincess2 {

	private static int px = 0;
	private static int py = 0;

	static void nextMove(int n, int r, int c, String[] grid) {
		if (py < c) {
			System.out.println("LEFT");
		} else if (py > c) {
			System.out.println("RIGHT");
		} else if (px < r) {
			System.out.println("UP");
		} else if (py > r) {
			System.out.println("DOWN");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, r, c;
		n = in.nextInt();
		r = in.nextInt();
		c = in.nextInt();
		in.useDelimiter("\n");
		String grid[] = new String[n];

		for (int i = 0; i < n; i++) {
			String x = in.next();
			if (x.contains("p")) {
				px = i;
				for (int j = 0; j < n; j++) {
					char ch = x.charAt(j);
					if (ch == 'p') {
						py = j;
						break;
					}
				}
			}
			grid[i] = x;
		}
		in.close();
		nextMove(n, r, c, grid);
	}

}
