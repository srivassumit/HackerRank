package com.ai;

import java.util.Scanner;

/**
 * <h1>Bot saves princess (E)</h1>
 * <a>https://www.hackerrank.com/challenges/saveprinces</a>
 * 
 * @author Sumit
 *
 */
public class BotSavesPrincess {

	static void displayPathtoPrincess(int n, String[] grid) {
		if (grid[0].startsWith("p")) {
			for (int i = 0; i < n / 2; i++) {
				System.out.println("UP");
				System.out.println("LEFT");
			}
		} else if (grid[0].endsWith("p")) {
			for (int i = 0; i < n / 2; i++) {
				System.out.println("UP");
				System.out.println("RIGHT");
			}
		} else if (grid[n - 1].startsWith("p")) {
			for (int i = 0; i < n / 2; i++) {
				System.out.println("DOWN");
				System.out.println("LEFT");
			}
		} else if (grid[n - 1].endsWith("p")) {
			for (int i = 0; i < n / 2; i++) {
				System.out.println("DOWN");
				System.out.println("RIGHT");
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m;
		m = in.nextInt();
		String grid[] = new String[m];
		for (int i = 0; i < m; i++) {
			grid[i] = in.next();
		}

		displayPathtoPrincess(m, grid);
	}

}
