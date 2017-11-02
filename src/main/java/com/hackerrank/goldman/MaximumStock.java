package com.hackerrank.goldman;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author sriva
 *
 */
public class MaximumStock {

	static class Stock {
		int day;
		long value;

		public Stock(int day, long value) {
			this.day = day;
			this.value = value;
		}
	}

	static long buyMaximumProducts(int n, long k, int[] a) {
		long maxStock = 0;
		Queue<Stock> pq = new PriorityQueue<Stock>(n, new Comparator<Stock>() {
			public int compare(Stock s1, Stock s2) {
				return (int) (s1.value - s2.value);
			}
		});
		for (int i = 0; i < n; i++) {
			Stock stk = new Stock((i + 1), (long) ((i + 1) * a[i]));
			pq.add(stk);
		}
		while (!pq.isEmpty()) {
			Stock s = pq.remove();
			int price = (int) (s.value / s.day);
			if (k - s.value > 0) {
				k -= s.value;
				maxStock += s.day;
			} else if (k - s.value == 0) {
				k -= s.value;
			} else if (k > price) {
				while (k > 0) {
					k -= price;
					if (k > 0) {
						maxStock++;
					}
				}
			}
			if (k <= 0) {
				break;
			}
		}
		return maxStock;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		long k = in.nextLong();
		long result = buyMaximumProducts(n, k, arr);
		System.out.println(result);
		in.close();
	}

}
