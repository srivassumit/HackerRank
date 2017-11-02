package com.hackerrank.ctci;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/ctci-connected-cell-in-a-grid</a>
 * 
 * @author Sumit
 *
 */
public class DFSConnectedCellInGrid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int grid[][] = new int[n][m];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			for (int grid_j = 0; grid_j < m; grid_j++) {
				grid[grid_i][grid_j] = in.nextInt();
			}
		}
		System.out.println(getBiggestRegion(grid));
		in.close();
	}

	/**
	 * HackerRank accepted Code for DFS: Connected Cell in a Grid.<br>
	 * Can also try this approach:
	 * <a>http://stackoverflow.com/questions/11253027/algorithm-to-find-the-total-number-of-connected-sets-in-a-matrix</a>
	 * 
	 * @param matrix
	 * @return
	 */
	public static int getBiggestRegion(int[][] matrix) {
		int maxCount = 0;
		int m = matrix.length;
		int n = matrix[0].length;
		boolean visited[][] = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 1 && !visited[i][j]) {
					int count = doDFS(matrix, i, j, visited) + 1;
					if (count > maxCount) {
						maxCount = count;
					}
				}
			}
		}
		return maxCount;
	}

	private static int doDFS(int matrix[][], int row, int col, boolean visited[][]) {
		int count = 0;
		int adjacentRows[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
		int adjacentColumns[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };

		visited[row][col] = true;

		for (int k = 0; k < 8; ++k) {
			if (shouldCount(matrix, row + adjacentRows[k], col + adjacentColumns[k], visited, matrix.length,
					matrix[0].length)) {
				count++;
				count += doDFS(matrix, row + adjacentRows[k], col + adjacentColumns[k], visited);
			}
		}
		return count;
	}

	private static boolean shouldCount(int[][] matrix, int row, int column, boolean[][] visited, int maxRow,
			int maxColumn) {
		boolean rowNonViolation = (row >= 0) && (row < maxRow);
		boolean columnNonViolation = (column >= 0) && (column < maxColumn);
		return (rowNonViolation && columnNonViolation) && (matrix[row][column] == 1) && (!visited[row][column]);
	}

}
