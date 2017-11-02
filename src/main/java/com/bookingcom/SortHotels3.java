/**
 * 
 */
package com.bookingcom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author srivassumit
 *
 */
public class SortHotels3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String hotels(String words, int[] hotel_ids, String[] reviews) {
		Map<Integer, Integer> hotelReviewCount = new HashMap<>();
		for (int x = 0; x < reviews.length; x++) {
			int hotelId = hotel_ids[x];
			int count = wordCountOnReview(words, reviews[x]);
			if (hotelReviewCount.containsKey(hotelId)) {
				count += hotelReviewCount.get(hotelId);
			}
			hotelReviewCount.put(hotelId, count);
		}

		return getSortedHotelId(hotelReviewCount);
	}

	private static String getSortedHotelId(Map<Integer, Integer> hotelReviewCount) {
		Map<Integer, Integer> orderedHotelReview = new LinkedHashMap<>();
		StringBuffer result = new StringBuffer();

		hotelReviewCount.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
				.forEachOrdered(x -> orderedHotelReview.put(x.getKey(), x.getValue()));

		orderedHotelReview.keySet().forEach(a -> result.append(a + " "));
		return result.toString().trim();
	}

	private static int wordCountOnReview(String words, String review) {
		Stream<String> str = Arrays.stream(review.split(" ")).filter(a -> {
			a = a.replace(",", "").replace(".", "");
			return words.matches(".*\\b" + a.trim().toLowerCase() + "\\b.*");
		});
		return (int) str.count();
	}

}
