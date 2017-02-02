package com.hackerrank.accepted;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/contests/codeagon/challenges/matchstick-warehouse-thief</a>
 * 
 * @author Sumit
 *
 */
public class MatchstickWarehouse {

	/**
	 * HackerRank accepted solution for Matchstick warehouse
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = in.nextInt();
		int[][] crate = new int[c][2];
		for (int crate_i = 0; crate_i < c; crate_i++) {
			for (int crate_j = 0; crate_j < 2; crate_j++) {
				crate[crate_i][crate_j] = in.nextInt();
			}
		}
		Queue<Crate> pQueue = new PriorityQueue<Crate>(c, new Comparator<Crate>() {
			@Override
			public int compare(Crate o1, Crate o2) {
				return (o2.matches - o1.matches);
			}
		});
		for (int[] row : crate) {
			Crate crt = (new MatchstickWarehouse()).new Crate(row[0], row[1]);
			pQueue.add(crt);
		}
		int j = 1;
		int maxMatches = 0;
		while (j <= n && !pQueue.isEmpty()) {
			Crate x = pQueue.remove();
			maxMatches += (x.boxes * x.matches);
			j += x.boxes;
			if (j > n) {
				maxMatches -= (x.matches * (j - n - 1));
			}
		}
		System.out.println(maxMatches);
		in.close();
	}

	class Crate {
		int boxes;
		int matches;

		public Crate(int boxes, int matches) {
			this.boxes = boxes;
			this.matches = matches;
		}
	}

}
