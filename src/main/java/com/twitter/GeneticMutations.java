/**
 * 
 */
package com.twitter;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 * @author sriva
 *
 */
public class GeneticMutations {

	static int findMutationDistance(String start, String end, String[] bank) {
		if (start.equals(end)) {
			return 0;
		}

		Set<String> bankSet = new HashSet<>();
		for (String b : bank) {
			bankSet.add(b);
		}

		char[] bases = new char[] { 'A', 'C', 'G', 'T' };

		int level = 0;

		Queue<String> linkedList = new LinkedList<String>();
		linkedList.offer(start);

		Set<String> visitedSet = new HashSet<String>();
		visitedSet.add(start);

		while (!linkedList.isEmpty()) {
			int size = linkedList.size();
			while (size-- > 0) {
				String current = linkedList.poll();
				if (current.equals(end))
					return level;

				char[] currentArray = current.toCharArray();
				for (int i = 0; i < currentArray.length; i++) {
					char previous = currentArray[i];
					for (char base : bases) {
						currentArray[i] = base;
						String next = new String(currentArray);
						if (!visitedSet.contains(next) && bankSet.contains(next)) {
							visitedSet.add(next);
							linkedList.offer(next);
						}
					}
					currentArray[i] = previous;
				}
			}
			level++;
		}
		return -1;
	}

	/**
	 * <p>
	 * input 1
	 * </p>
	 * 
	 * <pre>
	 AAAAAAAA
	 AAAAAATT
	 4
	 AAAAAAAA
	 AAAAAAAT
	 AAAAAATT
	 AAAAATTT
	 * </pre>
	 * <p>
	 * input 2
	 * </p>
	 * 
	 * <pre>
	 AAAAAAAA
	 GGAAAAAA
	 4
	 GAAAAAAA
	 AAGAAAAA
	 AAAAGAAA
	 GGAAAAAA
	 * </pre>
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String _start;
		try {
			_start = in.nextLine();
		} catch (Exception e) {
			_start = null;
		}

		String _end;
		try {
			_end = in.nextLine();
		} catch (Exception e) {
			_end = null;
		}

		int _bank_size = 0;
		_bank_size = Integer.parseInt(in.nextLine().trim());
		String[] _bank = new String[_bank_size];
		String _bank_item;
		for (int _bank_i = 0; _bank_i < _bank_size; _bank_i++) {
			try {
				_bank_item = in.nextLine();
			} catch (Exception e) {
				_bank_item = null;
			}
			_bank[_bank_i] = _bank_item;
		}
		in.close();
		System.out.println(findMutationDistance(_start, _end, _bank));
	}
}
