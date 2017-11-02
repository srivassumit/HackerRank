package com.hackerrank.codesprint9;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/contests/world-codesprint-9/challenges/queens-attack-2</a>
 * 
 * @author Sumit
 *
 */
public class QueensAttack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[][] board = new int[n + 1][n + 1];
		int rQueen = in.nextInt();
		int cQueen = in.nextInt();
		board[rQueen][cQueen] = 2;
		for (int a0 = 0; a0 < k; a0++) {
			int rObstacle = in.nextInt();
			int cObstacle = in.nextInt();
			board[rObstacle][cObstacle] = -1;
		}
		// printBoard(board);
		int i = rQueen;
		int j = cQueen;
		// left
		// System.out.println("left");
		while (j > 0) {
			j--;
			if (board[i][j] == -1) {
				break;
			} else {
				board[i][j] = 99;
			}
		}
		// printBoard(board);
		i = rQueen;
		j = cQueen;
		// left-up
		// System.out.println("left-up");
		while (i > 0 && j > 0) {
			i--;
			j--;
			if (board[i][j] == -1) {
				break;
			} else {
				board[i][j] = 99;
			}
		}
		// printBoard(board);
		i = rQueen;
		j = cQueen;
		// left-down
		// System.out.println("left-down");
		while (i < n && j > 0) {
			i++;
			j--;
			if (board[i][j] == -1) {
				break;
			} else {
				board[i][j] = 99;
			}
		}
		// printBoard(board);
		i = rQueen;
		j = cQueen;
		// up
		// System.out.println("up");
		while (i > 0) {
			i--;
			if (board[i][j] == -1) {
				break;
			} else {
				board[i][j] = 99;
			}
		}
		// printBoard(board);
		i = rQueen;
		j = cQueen;
		// down
		// System.out.println("down");
		while (i < n) {
			i++;
			if (board[i][j] == -1) {
				break;
			} else {
				board[i][j] = 99;
			}
		}
		// printBoard(board);
		i = rQueen;
		j = cQueen;
		// right
		// System.out.println("right");
		while (j < n) {
			j++;
			if (board[i][j] == -1) {
				break;
			} else {
				board[i][j] = 99;
			}
		}
		// printBoard(board);
		i = rQueen;
		j = cQueen;
		// right-up
		// System.out.println("right-up");
		while (i > 0 && j < n) {
			j++;
			i--;
			if (board[i][j] == -1) {
				break;
			} else {
				board[i][j] = 99;
			}
		}
		// printBoard(board);
		i = rQueen;
		j = cQueen;
		// right-down
		// System.out.println("right-down");
		while (i < n && j < n) {
			j++;
			i++;
			if (board[i][j] == -1) {
				break;
			} else {
				board[i][j] = 99;
			}
		}
		// printBoard(board);
		int count = 0;
		for (int ii = 1; ii < board[0].length; ii++) {
			for (int jj = 1; jj < board[0].length; jj++) {
				if (board[ii][jj] == 99) {
					count++;
				}
			}
		}
		System.out.println(count);
		in.close();
	}

	// private static void printBoard(int[][] board) {
	// for (int i = 0; i < board[0].length; i++) {
	// for (int j = 0; j < board[0].length; j++) {
	// if (i == 0) {
	// System.out.print("[" + (j) + "]\t");
	// } else if (j == 0) {
	// System.out.print("[" + (i) + "]");
	// } else {
	// System.out.print("\t" + board[i][j]);
	// }
	// }
	// System.out.println("");
	// }
	// }

}
