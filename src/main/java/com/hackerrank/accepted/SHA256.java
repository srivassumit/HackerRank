package com.hackerrank.accepted;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/sha-256</a>
 * 
 * @author Sumit
 *
 */
public class SHA256 {

	/**
	 * sample values: <br>
	 * HelloWorld:
	 * 872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4 <br>
	 * Javarmi123:
	 * f1d5f8d75bb55c777207c251d07d9091dc10fe7d6682db869106aacb4b7df678
	 * 
	 * @param args
	 * @throws NoSuchAlgorithmException
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));
		StringBuffer stringValue = new StringBuffer();

		for (int i = 0; i < hash.length; i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			if (hex.length() == 1)
				stringValue.append('0');
			stringValue.append(hex);
		}

		System.out.println(stringValue.toString());
		sc.close();
	}

}
