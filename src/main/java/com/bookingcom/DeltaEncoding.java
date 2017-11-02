/**
 * 
 */
package com.bookingcom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author srivassumit
 *
 */
public class DeltaEncoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] delta_encode(int[] array) {

		List<Integer> my_list = new ArrayList<>();
		int value;

		my_list.add(array[0]);
		for (int i = 1; i < array.length; i++) {
			value = array[i] - array[i - 1];
			if (value > -128 && value < 128) {
				my_list.add(value);
			} else {
				my_list.add(-128);
				my_list.add(value);
			}
		}
		int[] result = new int[my_list.size()];

		for (int i = 0; i < my_list.size(); i++) {
			result[i] = my_list.get(i);
		}
		return result;
	}

}
