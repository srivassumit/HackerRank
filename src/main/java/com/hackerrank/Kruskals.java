package com.hackerrank;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/kruskalmstrsub</a>
 * 
 * @author Sumit
 *
 */
public class Kruskals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mn = sc.nextLine();
		int m = Integer.valueOf(mn.split(" ")[0]);
		int n = Integer.valueOf(mn.split(" ")[1]);
		int graph[][] = new int[n][n];
		for (int i_edge = 0; i_edge < m; i_edge++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			int w = sc.nextInt();
			graph[i][j] = w;
		}

		sc.close();
	}

	private void doKruskalMST() {

	}
	
	class Edge {
		int source;
		int destination;
		int weight;

		public Edge(int source, int destination, int weight) {
			this.source = source;
			this.destination = destination;
			this.weight = weight;
		}
	}

}
