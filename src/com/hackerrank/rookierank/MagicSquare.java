package com.hackerrank.rookierank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class MagicSquare {

	private static final int[] M1 = { 8, 1, 6, 3, 5, 7, 4, 9, 2 };
	private static final int[] M2 = { 6, 1, 8, 7, 5, 3, 2, 9, 4 };
	private static final int[] M3 = { 8, 3, 4, 1, 5, 9, 6, 7, 2 };
	private static final int[] M4 = { 4, 3, 8, 9, 5, 1, 2, 7, 6 };
	private static final int[] M5 = { 8, 1, 6, 3, 5, 7, 4, 9, 2 };
	private static final int[] M6 = { 6, 1, 8, 7, 5, 3, 2, 9, 4 };
	private static final int[] M7 = { 8, 3, 4, 1, 5, 9, 6, 7, 2 };
	private static final int[] M8 = { 4, 3, 8, 9, 5, 1, 2, 7, 6 };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			M5[i] = 10 - M1[i];
			M6[i] = 10 - M2[i];
			M7[i] = 10 - M3[i];
			M8[i] = 10 - M4[i];
		}
		Scanner in = new Scanner(System.in);
		int arr[] = new int[9];
		int diffCount[] = new int[8];
		for (int i = 0; i < 9; i++) {
			int j = 0;
			int x = in.nextInt();
			arr[i] = x;
			diffCount[j++] += Math.abs(M1[i] - arr[i]);
			diffCount[j++] += Math.abs(M2[i] - arr[i]);
			diffCount[j++] += Math.abs(M3[i] - arr[i]);
			diffCount[j++] += Math.abs(M4[i] - arr[i]);
			diffCount[j++] += Math.abs(M5[i] - arr[i]);
			diffCount[j++] += Math.abs(M6[i] - arr[i]);
			diffCount[j++] += Math.abs(M7[i] - arr[i]);
			diffCount[j++] += Math.abs(M8[i] - arr[i]);
		}
		Arrays.sort(diffCount);
		System.out.println(diffCount[0]);
		in.close();
	}

	static void wrongWay(int arr[], Map<Integer, Integer> hashMap) {
		for (int i = 0; i < 9; i++) {
			int x = arr[i];
			if (hashMap.containsKey(x)) {
				hashMap.put(x, (hashMap.get(x) + 1));
			} else {
				hashMap.put(x, 1);
			}
		}
		int twoTime = 0;
		int noTime = 0;
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() == 2) {
				twoTime = entry.getKey();
			}
			if (entry.getValue() == 0) {
				noTime = entry.getKey();
			}
		}
		System.out.println(Math.abs(twoTime - noTime));
	}

}
