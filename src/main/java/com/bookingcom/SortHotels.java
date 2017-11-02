/**
 * 
 */
package com.bookingcom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author srivassumit
 *
 */
public class SortHotels {

	public static void main(String[] args) throws IOException {
		// Scanner in = new Scanner(System.in);
		// final String fileName = System.getenv("OUTPUT_PATH");
		// BufferedWriter bw = null;
		// if (fileName != null) {
		// bw = new BufferedWriter(new FileWriter(fileName));
		// } else {
		// bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// }
		//
		// int[] res;
		// String keywords;
		// try {
		// keywords = in.nextLine();
		// } catch (Exception e) {
		// keywords = null;
		// }
		//
		// int hotel_ids_size = 0;
		// hotel_ids_size = Integer.parseInt(in.nextLine().trim());
		//
		// int[] hotel_ids = new int[hotel_ids_size];
		// for (int i = 0; i < hotel_ids_size; i++) {
		// int hotel_ids_item;
		// hotel_ids_item = Integer.parseInt(in.nextLine().trim());
		// hotel_ids[i] = hotel_ids_item;
		// }
		//
		// int reviews_size = 0;
		// reviews_size = Integer.parseInt(in.nextLine().trim());
		//
		// String[] reviews = new String[reviews_size];
		// for (int i = 0; i < reviews_size; i++) {
		// String reviews_item;
		// try {
		// reviews_item = in.nextLine();
		// } catch (Exception e) {
		// reviews_item = null;
		// }
		// reviews[i] = reviews_item;
		// }
		//
		// res = sort_hotels(keywords, hotel_ids, reviews);
		// for (int res_i = 0; res_i < res.length; res_i++) {
		// bw.write(String.valueOf(res[res_i]));
		// bw.newLine();
		// }
		//
		// bw.close();]
		int[] arr1 = { 1, 2, 1, 1, 2 };
		String[] arr2 = { "This hotel has a nice view of the citycenter. The location is perfect.",
				"The breakfast is ok. Regarding the location, it is quite far from citycenter but price is cheap so it is worth.",
				"Location is excellent, 5 minutes from citycenter. There is also a metro station very close to the hotel.",
				"They said I could't take my dog and there were other guests with dogs! That is not fair!",
				"Very friendly staff and goof cost-benefit ratio. Its location is a bit far from citycenter." };
		sort_hotels("breakfast beach citycenter location metro view staff price", arr1, arr2);
	}

	static int[] sort_hotels2(String keywords, int[] hotel_ids, String[] reviews) {
		Map<Integer, Integer> hotelReviewCount = new HashMap<>();
		for (int x = 0; x < reviews.length; x++) {
			int hotelId = hotel_ids[x];
			int count = wordCountOnReview(keywords, reviews[x]);
			if (hotelReviewCount.containsKey(hotelId)) {
				count += hotelReviewCount.get(hotelId);
			}
			hotelReviewCount.put(hotelId, count);
		}

		return getSortedHotelId(hotelReviewCount);
	}

	private static int[] getSortedHotelId(Map<Integer, Integer> hotelReviewCount) {
		Map<Integer, Integer> orderedHotelReview = new LinkedHashMap<>();
		int[] arr = new int[hotelReviewCount.size()];
		hotelReviewCount.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
				.forEachOrdered(x -> orderedHotelReview.put(x.getKey(), x.getValue()));
		int i = 0;
		for (int val : orderedHotelReview.keySet()) {
			arr[i++] = val;
		}
		return arr;
	}

	private static int wordCountOnReview(String words, String review) {
		Stream<String> str = Arrays.stream(review.split(" ")).filter(a -> {
			a = a.replace(",", "").replace(".", "");
			return words.matches(".*\\b" + a.trim().toLowerCase() + "\\b.*");
		});
		return (int) str.count();
	}

	/*
	 * Complete the function below.
	 */
	static int[] sort_hotels(String keywords, int[] hotel_ids, String[] reviews) {
		Set<String> uniqueKeywords = new HashSet<String>();
		Map<Integer, Integer> reviewCountMap = new HashMap<Integer, Integer>();
		List<Integer> sortedHotelsArray = new ArrayList<Integer>();

		for (String word : keywords.split(" ")) {
			uniqueKeywords.add(word.toLowerCase());
		}

		for (int i = 0; i < hotel_ids.length; i++) {
			if (!reviewCountMap.containsKey(hotel_ids[i])) {
				reviewCountMap.put(hotel_ids[i], 0);
			}
			String[] review = reviews[i].split(" ");
			for (String word : review) {
				word = word.replaceAll("[$,.!?]", "").toLowerCase();
				if (uniqueKeywords.contains(word)) {
					reviewCountMap.put(hotel_ids[i], reviewCountMap.get(hotel_ids[i]) + 1);
				}
			}
		}
		List<Map.Entry<Integer, Integer>> sortedHotels = new ArrayList<Map.Entry<Integer, Integer>>(
				reviewCountMap.entrySet());
		Collections.sort(sortedHotels, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
				if (e1.getValue() == e2.getValue()) {
					return (e1.getKey() - e2.getKey());
				} else {
					return (e2.getValue() - e1.getValue());
				}
			}
		});
		int i = 0;
		for (Map.Entry<Integer, Integer> hotel : sortedHotels) {
			sortedHotelsArray.add(hotel.getKey());
		}
		int[] returnArray = new int[sortedHotelsArray.size()];
		for (int j = 0; j < sortedHotelsArray.size(); j++) {
			returnArray[j] = sortedHotelsArray.get(j);
		}
		return returnArray;
	}

}
