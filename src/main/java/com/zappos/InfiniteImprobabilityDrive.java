package com.zappos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class InfiniteImprobabilityDrive {

	public static void main(String[] args) {
		System.out.println(improbabilityCalculator("746209249", 5));
		System.out.println(improbabilityCalculator("64738929", 0));
		System.out.println(improbabilityCalculator("12345", 6));
	}

	static String improbabilityCalculator(String coordinates, int remove) {
		if (coordinates == null || remove >= coordinates.length()) {
			return "0";
		} else if (remove == 0) {
			return coordinates;
		} else {
			String returnValue = "";
			Queue<Integer> priorityQueue = new PriorityQueue<Integer>(coordinates.length(), Collections.reverseOrder());
			Map<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
			for (int i = 0; i < coordinates.length(); i++) {
				priorityQueue.add((Integer.valueOf(coordinates.charAt(i)) - 48));
				linkedHashMap.put((Integer.valueOf(coordinates.charAt(i)) - 48), i);
			}

			for (int i = 0; i < remove; i++) {
				priorityQueue.poll();
			}

			List<Integer> indexes = new ArrayList<Integer>();
			while (!priorityQueue.isEmpty()) {
				int idx = linkedHashMap.get(priorityQueue.remove());
				indexes.add(idx);
			}
			Collections.sort(indexes);
			for (int idx : indexes) {
				returnValue += coordinates.charAt(idx);
			}
			return returnValue;
		}
	}

	static String findLowest(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {

		}
		return null;
	}
}
