package com.hackerrank.accepted;

import java.util.Comparator;
import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/ctci-comparator-sorting</a>
 * <p>
 * 
 * Comparators are used to compare two objects. In this challenge, you'll create
 * a comparator and use it to sort an array. The Player class is provided in the
 * editor below; it has two fields:
 * </p>
 * <p>
 * A string, name.<br>
 * An integer, score.<br>
 * </p>
 * <p>
 * Given an array of n Player objects, write a comparator that sorts them in
 * order of decreasing score; if 2 or more players have the same score, sort
 * those players alphabetically by name. To do this, you must create a Checker
 * class that implements the Comparator interface, then write an int
 * compare(Player a, Player b) method implementing the Comparator.compare(T o1,
 * T o2) method.
 * </p>
 * <p>
 * Input Format
 * </p>
 * <p>
 * Locked stub code in the Solution class handles the following input from
 * stdin: The first line contains an integer, n, denoting the number of players.
 * Each of the n subsequent lines contains a player's respective name and score.
 * </p>
 * <p>
 * Constraints<br>
 * 0 <= score <= 1000<br>
 * Two or more players can have the same name.<br>
 * Player names consist of lowercase English alphabetic letters.
 * </p>
 * <p>
 * Output Format
 * </p>
 * <p>
 * You are not responsible for printing any output to stdout. Locked stub code
 * in Solution will create a Checker object, use it to sort the Player array,
 * and print each sorted element.
 * </p>
 * <p>
 * Sample Input
 * </p>
 * <p>
 * 5<br>
 * amy 100<br>
 * david 100<br>
 * heraldo 50<br>
 * aakansha 75<br>
 * aleksa 150<br>
 * </p>
 * <p>
 * Sample Output
 * </p>
 * <p>
 * aleksa 150<br>
 * amy 100<br>
 * david 100<br>
 * aakansha 75<br>
 * heraldo 50<br>
 * </p>
 * <p>
 * Explanation
 * </p>
 * <p>
 * As you can see, the players are first sorted by decreasing score and then
 * sorted alphabetically by name.
 * </p>
 * 
 * @author Sumit
 *
 */
public class ComparatorSorting {

	class Checker implements Comparator<Player> {
		@Override
		public int compare(Player o1, Player o2) {
			if (o1.score > o2.score) {
				return 1;
			} else if (o1.score < o2.score) {
				return -1;
			} else {
				return o1.name.compareTo(o2.name);
			}
		}

	}

	class Player {
		String name;
		int score;

		Player(String name, int score) {
			this.name = name;
			this.score = score;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		// Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			// player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		// Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}

}
