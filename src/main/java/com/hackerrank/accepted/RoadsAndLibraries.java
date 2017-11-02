package com.hackerrank.accepted;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/torque-and-development/problem</a>
 * 
 * @author srivassumit
 *
 */
public class RoadsAndLibraries {

	private static ArrayList<Integer>[] adjacencyList;
	private static long connectedComponents;
	private static boolean[] visited;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int numberOfCities = in.nextInt();
			int numberOfRoads = in.nextInt();
			int libraryCost = in.nextInt();
			int roadCost = in.nextInt();
			//
			if (roadCost >= libraryCost || numberOfRoads == 0) {
				BigInteger cost = BigInteger.valueOf(libraryCost).multiply(BigInteger.valueOf(numberOfCities));
				System.out.println(cost);
				for (int i = 0; i < (numberOfRoads * 2); i++) {
					in.nextInt();
				}
				continue;
			} else {// connected components
				adjacencyList = (ArrayList<Integer>[]) new ArrayList[numberOfCities + 1];
				for (int c = 0; c <= numberOfCities; c++) {
					adjacencyList[c] = new ArrayList<Integer>();
				}

				for (int a1 = 0; a1 < numberOfRoads; a1++) {
					int city_1 = in.nextInt();
					int city_2 = in.nextInt();

					adjacencyList[city_1].add(city_2);
					adjacencyList[city_2].add(city_1);
				}

				visited = new boolean[numberOfCities + 1];

				for (int c = 1; c <= numberOfCities; c++) {
					if (!visited[c]) {
						visit(c);
						connectedComponents++;
					}
				}
				BigInteger cost = BigInteger.valueOf(roadCost)
						.multiply(BigInteger.valueOf(numberOfCities - connectedComponents))
						.add(BigInteger.valueOf(libraryCost).multiply(BigInteger.valueOf(connectedComponents)));
				System.out.println(cost);
				connectedComponents = 0;
				visited = new boolean[10];
				adjacencyList = (ArrayList<Integer>[]) new ArrayList[10];
			}
		}
		in.close();
	}

	private static void visit(int city) {
		visited[city] = true;
		for (int c = 0; c < adjacencyList[city].size(); c++) {
			if (!visited[adjacencyList[city].get(c)]) {
				visit(adjacencyList[city].get(c));
			}
		}
	}

}