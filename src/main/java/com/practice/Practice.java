package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {
		// m1();
		// m2();
		// m3();
	}

	private static void m4() {
		Map<String, List<String>> rd = new HashMap<String, List<String>>();
		rd.put("1", new ArrayList<String>());
		
	}

	private static void m3() {
		String returnVal = "";
		List<String> citiesInPath = new ArrayList<String>();
		citiesInPath.add("A");
		citiesInPath.add("B");
		citiesInPath.add("C");
		if (citiesInPath != null) {
			for (String city : citiesInPath) {
				returnVal = returnVal.concat(", " + city);
			}
		}
		System.out.println(returnVal.replaceFirst(", ", "").trim());
	}

	private static void m2() {
		List<String> l = new ArrayList<String>();
		l.add("1");
		l.add("2");
		System.out.println(l.get(l.size() - 1));
	}

	private static void m1() {
		// TODO Auto-generated method stub
		String lines[] = { "city(ASS,2,2)", "road(ASS,BASS,5)" };
		for (String line : lines) {
			line = line.replaceFirst("\\(", " ").replaceFirst("\\)", " ").trim();
			System.out.println(line);
			if (line.startsWith("road")) {
				line = line.replaceFirst("road", "").trim();
			} else if (line.startsWith("city")) {
				line = line.replaceFirst("city", "").trim();
			}
			System.out.println(line);
		}
	}
}
