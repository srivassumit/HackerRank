package com.twitter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sriva
 *
 */
public class HackingTime {

	static char[] lowercase = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	static char[] uppercase = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
			'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	static Map<Character, Integer> uMap = new HashMap<Character, Integer>();
	static Map<Character, Integer> lMap = new HashMap<Character, Integer>();
	static Map<Integer, Character> revUMap = new HashMap<Integer, Character>();
	static Map<Integer, Character> revLMap = new HashMap<Integer, Character>();

	static {
		for (int i = 0; i < lowercase.length; i++) {
			lMap.put(lowercase[i], i + 1);
			uMap.put(uppercase[i], i + 1);
			revLMap.put(i + 1, lowercase[i]);
			revUMap.put(i + 1, uppercase[i]);
		}
	}

	private static String findKey(String encrypted) {
		String partDecrypt = "-Your friend, Alice";
		int dLen = partDecrypt.length();
		int eLen = encrypted.length();
		String knownPart = encrypted.substring(eLen - dLen);
		String foundKey = "";
		for (int i = 0; i < knownPart.length(); i++) {
			char ech = knownPart.charAt(i);
			char dch = partDecrypt.charAt(i);
			if (uMap.keySet().contains(ech)) {
				if (uMap.get(ech) - uMap.get(dch) < 0) {
					foundKey += String.valueOf((uMap.size() - uMap.get(dch) + uMap.get(ech)));
				} else {
					foundKey += String.valueOf((uMap.get(ech) - uMap.get(dch)));
				}
			}
			if (lMap.keySet().contains(ech)) {
				if (lMap.get(ech) - lMap.get(dch) < 0) {
					foundKey += String.valueOf((lMap.size() - lMap.get(dch) + lMap.get(ech)));
				} else {
					foundKey += String.valueOf((lMap.get(ech) - lMap.get(dch)));
				}
			}
		}
		String possibleKey = findRepeataPattern(foundKey);
		int keyLength = possibleKey.length();
		int previousLength = findPreviousLength(encrypted, partDecrypt);
		int keyShift = possibleKey.length() - previousLength % keyLength;
		String calculatedKey = possibleKey.substring(keyShift).concat(possibleKey.substring(0, keyShift));
		return calculatedKey; // The Calculated Key is: 8251220
	}

	private static int findPreviousLength(String encrypted, String partDecrypt) {
		String e2 = "";
		String d2 = "";
		for (char ch : encrypted.toCharArray()) {
			if (lMap.keySet().contains(ch) || uMap.keySet().contains(ch)) {
				e2 += ch;
			}
		}
		for (char ch : partDecrypt.toCharArray()) {
			if (lMap.keySet().contains(ch) || uMap.keySet().contains(ch)) {
				d2 += ch;
			}
		}
		return (e2.length() - d2.length());
	}

	private static String findRepeataPattern(String s) {
		Matcher m = Pattern.compile("(\\S{2,})(?=.*?\\1)").matcher(s);
		while (m.find()) {
			return m.group(1);
		}
		return null;
	}

	static String decrypt(String encrypted_message) {
		String decrypted = "";
		String key = findKey(encrypted_message);
		int keyCount = -1;
		for (char ch : encrypted_message.toCharArray()) {
			if (uMap.containsKey(ch)) {
				String keyChar = String.valueOf(key.charAt(++keyCount % key.length()));
				int shift = -1 * Integer.valueOf(keyChar);
				int charIndex = uMap.get(ch);
				int shiftedIndex = charIndex + shift;
				if (shiftedIndex <= 0) {
					shiftedIndex = revUMap.size() + shiftedIndex;
				}
				String shiftedCharacter = String.valueOf(revUMap.get(shiftedIndex));
				decrypted += shiftedCharacter;
			} else if (lMap.containsKey(ch)) {
				String keyChar = String.valueOf(key.charAt(++keyCount % key.length()));
				int shift = -1 * Integer.valueOf(keyChar);
				int charIndex = lMap.get(ch);
				int shiftedIndex = charIndex + shift;
				if (shiftedIndex <= 0) {
					shiftedIndex = revLMap.size() + shiftedIndex;
				}
				String shiftedCharacter = String.valueOf(revLMap.get(shiftedIndex));
				decrypted += shiftedCharacter;
			} else {
				decrypted += ch;
			}
		}
		return decrypted;
	}

	public static void main(String[] args) throws IOException {
		String res = decrypt(
				"Otjfvknou kskgnl, K mbxg iurtsvcnb ksgq hoz atv. Vje xcxtyqrl vt ujg smewfv vrmcxvtg rwqr ju vhm ytsf elwepuqyez. -Atvt hrqgse, Cnikg");
		System.out.println(res);
	}

}
