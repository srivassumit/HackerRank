package com.moody.codesprint;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/contests/moodys-analytics-fall-university-codesprint/challenges/cost-balancing</a>
 * <h1>Cost Balancing</h1> Anita and her friends, go on a trip. Now, they are
 * back home and need to balance their expenses. During the trip, they perform
 * many transactions but don't divide the expenses equally all the time. The
 * total expenses should be balanced in such a way that everyone pays an equal
 * amount. Given the information about the transactions, Anita needs to find who
 * owes others and who should get money. <br>
 * Anita has an ID number of 1 and her friends are represented by IDs from 2 to
 * m. <br>
 * There will be n transactions, each consisting of a person's ID and the amount
 * of money that he/she paid. Note that, the required payment for all might be
 * fractional. To avoid this situation, Anita has decided to pay some extra
 * money (if needed) so that everybody has to pay a whole amount after that.
 * <br>
 * For example, if an amount of 100 units is split across 3 people(Anita, Bret
 * and Cathy) each has a share of 33.33 per person. To make the amount a whole
 * number Anita decides to pay 1 extra unit, thus making her share to be 34. And
 * for Bret and Cathy, the share becomes 33 each. <br>
 * <br>
 * <b> Input Format </b><br>
 * The first line contains two space-separated integers n and m, denoting total
 * number of transactions and total number of friends in the group. <br>
 * Each of the next n lines contains two space-separated integers, first one is
 * the ID of the friend and second one denotes the amount paid. <br>
 * <br>
 * <b> Constraints </b><br>
 * <li>1 &le; m &le; n &le 50
 * <li>0 &le; amountofmoney &le; 10<sup>3</sup>
 * <li>ID numbers will be all the numbers from 1 to m. <br>
 * <br>
 * <b> Output Format </b> <br>
 * For each ID from 1 to m print a line with two space separated integers, first
 * one is the ID of the friend and second one is the amount that the person owes
 * or gets. <br>
 * Note that, a positive amount next to an ID indicates that the person should
 * receive that amount, while a negative amount indicates that he/she owes that
 * amount to the rest of the group. <br>
 * <br>
 * <b> Sample Input 0 </b>
 * 
 * <pre>
 * 7 5
 * 1 200
 * 2 200
 * 3 100
 * 4 10
 * 5 54
 * 5 54
 * 3 100
 * </pre>
 * 
 * <b> Sample Output 0 </b>
 * 
 * <pre>
 * 1 54
 * 2 57
 * 3 57
 * 4 -133
 * 5 -35
 * </pre>
 * 
 * @author srivassumit
 *
 */
public class CostBalancing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Integer, Integer> costs = new HashMap<Integer, Integer>();
		int n = in.nextInt();
		int m = in.nextInt();
		int total = 0;
		for (int a0 = 0; a0 < n; a0++) {
			int id_number = in.nextInt();
			int amount = in.nextInt();
			total += amount;
			if (!costs.containsKey(id_number)) {
				costs.put(id_number, amount);
			} else {
				costs.put(id_number, costs.get(id_number) + amount);
			}
		}
		int share = total / m;
		int extra = total - share * m;
		boolean flag = true;
		for (Map.Entry<Integer, Integer> entry : costs.entrySet()) {
			if (flag) {
				entry.setValue(entry.getValue() - extra);
				flag = false;
			}
			System.out.println(entry.getKey() + " " + (entry.getValue() - share));
		}
		in.close();
	}

}
