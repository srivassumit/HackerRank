package com.zappos;

import java.util.HashMap;
import java.util.Map;

public class Gigawatts {
	public static void main(String[] args) {
		System.out.println(GigawattPower(new int[] { 5, 7, 2, 4 }, new int[] { -3, 0, 1 }, 8));
		System.out.println(GigawattPower(new int[] { 6, 3, 1, 9, 5, 4, 0, 1, -29, 12, 45, 2, 6 },
				new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 }, 100));
	}

	static boolean GigawattPower(int[] batteryOne, int[] batteryTwo, int gigawattTarget) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < batteryOne.length; i++) {
			if (batteryOne[i] < gigawattTarget) {
				hashMap.put(gigawattTarget - batteryOne[i], batteryOne[i]);
			}
		}
		for (int i = 0; i < batteryTwo.length; i++) {
			if (hashMap.containsKey(batteryTwo[i])) {
				return true;
			}
		}
		return false;
	}
}
