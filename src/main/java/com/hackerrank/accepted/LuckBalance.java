package com.hackerrank.accepted;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/luck-balance</a>
 * <p>
 * Lena is preparing for an important coding competition that is preceded by N
 * sequential preliminary contests. She believes in "saving luck", and wants to
 * check her theory. Each contest is described by two integers, Li and Ti:
 * <p>
 * </p>
 * Li is the amount of luck that can be gained by winning the contest. If Lena
 * wins the contest, her luck balance will decrease by Li; if she loses it, her
 * luck balance will increase by Li.<br>
 * Ti denotes the contest's importance rating. It's equal to 1 if the contest is
 * important, and it's equal to 0 if it's unimportant.
 * <p>
 * </p>
 * If Lena loses no more than K important contests, what is the maximum amount
 * of luck she can have after competing in all the preliminary contests? This
 * value may be negative.
 * <p>
 * </p>
 * Input Format
 * <p>
 * </p>
 * The first line contains two space-separated integers, N (the number of
 * preliminary contests) and K (the maximum number of important contests Lena
 * can lose), respectively.<br>
 * Each line i of the N subsequent lines contains two space-separated integers,
 * Li (the contest's luck balance) and Ti (the contest's importance rating),
 * respectively.
 * <p>
 * </p>
 * Constraints<br>
 * 1 <= N <= 100<br>
 * 0 <= K <= N<br>
 * 1 <= Li <= 10000<br>
 * 0 <= Ti <= 1
 * <p>
 * </p>
 * Output Format
 * <p>
 * </p>
 * Print a single integer denoting the maximum amount of luck Lena can have
 * after all the contests.
 * <p>
 * </p>
 * Sample Input
 * <p>
 * </p>
 * 6 3<br>
 * 5 1<br>
 * 2 1<br>
 * 1 1<br>
 * 8 1<br>
 * 10 0<br>
 * 5 0<br>
 * <p>
 * </p>
 * Sample Output
 * <p>
 * </p>
 * 29
 * <p>
 * </p>
 * Explanation
 * <p>
 * </p>
 * There areN=6 contests. Of these contests, 4 are important (so she cannot lose
 * any more than K=3 of them). Lena maximizes her luck if she wins the 3rd
 * important contest (where Li = 1) and loses all of the other five contests for
 * a total luck balance of 5 + 2 + 8 + 10 + 5 - 1 = 29.
 * </p>
 * 
 * @author Sumit
 *
 */
public class LuckBalance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		int n = Integer.valueOf(line.split(" ")[0]);
		int k = Integer.valueOf(line.split(" ")[1]);
		Integer[] games = new Integer[n];
		Arrays.fill(games, 0);
		int total = 0;
		int j = 0;
		for (int i = 0; i < n; i++) {
			line = in.nextLine();
			String[] tokens = line.split(" ");
			if ("1".equalsIgnoreCase(tokens[1])) {
				games[j++] = Integer.valueOf(tokens[0]);
			} else {
				total += Integer.valueOf(tokens[0]);
			}
		}
		Arrays.sort(games, Collections.reverseOrder());
		for (int i = 0; i < k; i++) {
			total += games[i];
		}
		for (int i = k; i < n; i++) {
			total -= games[i];
		}
		System.out.println(total);
		in.close();
	}

}
