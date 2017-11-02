package com.vmware;

import java.util.HashMap;
import java.util.Map;

public class ModifyPrices {

	public static void main(String[] args) {
		// String origItems[] = { "rice", "sugar", "wheat", "cheese" };
		// float origPrices[] = { 16.89f, 56.92f, 20.89f, 345.99f };
		// String items[] = { "rice", "cheese" };
		// float prices[] = { 18.99f, 400.89f };
		// System.out.println(verifyItems(origItems, origPrices, items,
		// prices));
		String origItems2[] = { "Chocolate", "cheese", "tomato" };
		float origPrices2[] = { 15f, 300.90f, 23.44f };
		String items2[] = { "Chocolate", "cheese", "tomato" };
		float prices2[] = { 15f, 300.90f, 10f };
		System.out.println(verifyItems(origItems2, origPrices2, items2, prices2));
	}

	static int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices) {
		int cheatCount = 0;
		Map<String, Float> original = new HashMap<String, Float>();
		Map<String, Float> sold = new HashMap<String, Float>();
		for (int i = 0; i < origPrices.length; i++) {
			original.put(origItems[i], origPrices[i]);
		}
		for (int i = 0; i < items.length; i++) {
			sold.put(items[i], prices[i]);
		}
		for (Map.Entry<String, Float> entry : sold.entrySet()) {
			if ((original.get(entry.getKey()) < sold.get(entry.getKey()))
					|| (original.get(entry.getKey()) > sold.get(entry.getKey()))) {
				cheatCount++;
			}
		}
		return cheatCount;
	}

}
