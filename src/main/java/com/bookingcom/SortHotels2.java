/**
 * 
 */
package com.bookingcom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author srivassumit
 *
 */
public class SortHotels2 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream(System.getProperty("user.home") + "/" + "in.txt"));
		Scanner in = new Scanner(System.in);

		// Read dictionary
		String[] words = in.nextLine().split(" ");
		Set<String> dict = new HashSet<String>();
		for (String word : words) {
			dict.add(word.toLowerCase());
		}

		// Read number of reviews
		int m = in.nextInt();

		// Read review
		Map<Integer, Integer> hotel2count = new HashMap<Integer, Integer>(); // hotel ID -> Word Count
		for (int i = 0; i < m; i++) {
			// Read hotel id
			int id = Integer.parseInt(in.next());
			in.nextLine();

			// Put id in map in case of new
			if (!hotel2count.containsKey(id)) {
				hotel2count.put(id, 0);
			}

			// Read review text
			String[] review = in.nextLine().split(" ");
			for (String word : review) {
				// Remove any ' ', ',', '.', '!' or '?' from word
				word = word.replaceAll("[$,.!?]", "").toLowerCase();
				if (dict.contains(word)) {
					hotel2count.put(id, hotel2count.get(id) + 1);
				}
			}
			in.close();
		}

		// Sort
		List<Map.Entry<Integer, Integer>> sorted = new ArrayList(hotel2count.entrySet());
		Collections.sort(sorted, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				if (o1.getValue() == o2.getValue()) {
					return o1.getKey() - o2.getKey();
				} else {
					return o2.getValue() - o1.getValue();
				}
			}
		});

		// Print sorted list
		for (Map.Entry<Integer, Integer> hotelEntry : sorted) {
			System.out.print(hotelEntry.getKey() + " ");
		}
	}

}
