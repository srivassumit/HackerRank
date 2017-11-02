package com.zappos;

public class GameOfThrones {

	public static void main(String[] args) {
		System.out.println(numberOfGroups(
				new int[][] { { 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 0, 0, 0 } }));
		System.out.println(numberOfGroups(new int[][] { { 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0, 1, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0, 0, 0, 1, 1, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 1, 1, 0 }, { 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 } }));
	}

	static int numberOfGroups(int[][] venue) {
		int numGroups = 0;
		int m = venue.length;
		int n = venue[0].length;
		boolean visited[][] = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (venue[i][j] == 1 && !visited[i][j]) {
					doDFS(venue, i, j, visited);
					numGroups++;
				}
			}
		}
		return numGroups;
	}

	static void doDFS(int venue[][], int row, int col, boolean visited[][]) {
		int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
		int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };

		visited[row][col] = true;

		for (int k = 0; k < 8; ++k)
			if (shouldBeCounted(venue, row + rowNbr[k], col + colNbr[k], visited, venue.length, venue[0].length))
				doDFS(venue, row + rowNbr[k], col + colNbr[k], visited);
	}

	static boolean shouldBeCounted(int[][] venue, int row, int column, boolean[][] visited, int maxRow, int maxColumn) {
		boolean isInRow = (row >= 0) && (row < maxRow);
		boolean isInColumn = (column >= 0) && (column < maxColumn);
		return (isInRow && isInColumn) && (venue[row][column] == 1) && (!visited[row][column]);
	}

}
