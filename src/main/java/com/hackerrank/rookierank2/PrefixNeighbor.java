package com.hackerrank.rookierank2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class PrefixNeighbor {

	private static List<BenefitWord> nonNeighborList = new ArrayList<BenefitWord>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<BenefitWord> list = new ArrayList<BenefitWord>();
		String str = null;
		for (int i = 0; i < n; i++) {
			str = in.next();
			list.add(new BenefitWord(str, getBenefitValue(str)));
		}
		list.sort(new Comparator<BenefitWord>() {
			@Override
			public int compare(BenefitWord o1, BenefitWord o2) {
				return o1.word.length() - o2.word.length();
			}
		});
		BenefitWord[] sortedArray = new BenefitWord[n];
		int i = 0;
		for (BenefitWord bw : list) {
			sortedArray[i++] = bw;
		}
		int j = 0;

		in.close();
	}

	private static int getBenefitValue(String str) {
		int benefitValue = 0;
		for (char ch : str.toCharArray()) {
			benefitValue += (int) ch;
		}
		return benefitValue;
	}

	static class BenefitWord {
		String word;
		int benefitValue;

		public BenefitWord(String word, int benefitValue) {
			this.word = word;
			this.benefitValue = benefitValue;
		}
	}

}
