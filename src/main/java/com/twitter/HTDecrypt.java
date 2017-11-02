package com.twitter;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author sriva
 *
 */
public class HTDecrypt {

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

	private static String decrypt(String encrypted_message) {
		String decrypted = "";
		String key = "8251220";
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
				System.out.println("keyChar: " + keyChar + ", shift: " + shift + ", current Character: " + ch
						+ ", current Character index: " + charIndex + ", shifted character index: "
						+ (shiftedIndex == 0 ? "0--------------" : shiftedIndex) + ", shifted Character: "
						+ shiftedCharacter);
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
				System.out.println("keyChar: " + keyChar + ", shift: " + shift + ", current Character: " + ch
						+ ", current Character index: " + charIndex + ", shifted character index: "
						+ (shiftedIndex == 0 ? "0--------------" : shiftedIndex) + ", shifted Character: "
						+ shiftedCharacter);
				decrypted += shiftedCharacter;
			} else {
				decrypted += ch;
			}
		}
		return decrypted;
	}

	public static void main(String[] args) {
		String encrypted = "Otjfvknou kskgnl, K mbxg iurtsvcnb ksgq hoz atv. Vje xcxtyqrl vt ujg smewfv vrmcxvtg rwqr ju vhm ytsf elwepuqyez. -Atvt hrqgse, Cnikg";
		System.out.println(decrypt(encrypted));
	}
}
