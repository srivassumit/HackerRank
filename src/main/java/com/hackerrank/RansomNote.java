package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RansomNote {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		List<String> mag = new ArrayList<String>();
		for (int magazine_i = 0; magazine_i < m; magazine_i++) {
			magazine[magazine_i] = in.next();
			mag.add(magazine[magazine_i]);
		}
		String ransom[] = new String[n];
		boolean flag = true;
		for (int ransom_i = 0; ransom_i < n; ransom_i++) {
			ransom[ransom_i] = in.next();
			if (mag.contains(ransom[ransom_i])) {
				mag.remove(ransom[ransom_i]);
			} else {
				System.out.println("No");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Yes");
		}
		in.close();
	}

}
