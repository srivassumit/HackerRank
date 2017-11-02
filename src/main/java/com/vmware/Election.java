package com.vmware;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

public class Election {

	public static void main(String[] args) {
		String a[] = { "Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry", "Alex", "Mary", "Mary" };
		String b[] = { "Victor", "Veronica", "Ryan", "Dave", "Maria", "Maria", "Farah", "Farah", "Ryan", "Veronica" };
		System.out.println(electionWinner(a));
		System.out.println(electionWinner(b));
	}

	static String electionWinner(String[] votes) {
		String winner = "";
		Map<String, Integer> candidateVotes = new HashMap<String, Integer>();
		for (String name : votes) {
			if (candidateVotes.containsKey(name)) {
				int vote = candidateVotes.get(name) + 1;
				candidateVotes.put(name, vote);
			} else {
				candidateVotes.put(name, 1);
			}
		}
		Queue<String> winners = new PriorityQueue<String>(100000, Collections.reverseOrder());
		int maxVotes = 0;
		for (Integer i : candidateVotes.values()) {
			if (i > maxVotes) {
				maxVotes = i;
			}
		}
		for (Entry<String, Integer> i : candidateVotes.entrySet()) {
			if (i.getValue() == maxVotes) {
				winners.add(i.getKey());
			}
		}
		
		winner = winners.remove();
		return winner;
	}

}
