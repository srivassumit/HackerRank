package com.ai;

import java.util.Scanner;

/**
 * <h1>Tron (E)</h1> <a>https://www.hackerrank.com/challenges/tron</a>
 **/
public class Tron {
	static void nextMove(String player, int[] pos, String[] board) {
		System.out.println(player);
		System.out.println(pos[0]);
		System.out.println(pos[1]);
		System.out.println(pos[2]);
		System.out.println(pos[3]);
		System.out.println(board[0]);
		System.out.println(board[14]);
		String otherPlayer = "";
		int px = 0;
		int py = 0;
		if (player == "r") {
			otherPlayer = "g";
			px = pos[2];
			py = pos[3];
		} else {
			otherPlayer = "r";
			px = pos[0];
			py = pos[1];
		}

	}

	static boolean isValid(int[] move, String[] board, String player, int px, int py) {
		int mx = move[0];
		int my = move[1];
		char chp = board[mx].toCharArray()[my];
		if (String.valueOf(chp) == player || chp == '#' || (mx == px && my == py)) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useDelimiter("\n");
		String player = in.next();
		String pos = in.next();
		String[] str_pos = pos.split(" ");
		int[] position = new int[4];
		for (int i = 0; i < 4; i++) {
			position[i] = Integer.parseInt(str_pos[i]);
		}
		String board[] = new String[15];
		for (int i = 0; i < 15; i++) {
			board[i] = in.next();
		}
		in.close();
		nextMove(player, position, board);
	}
}
