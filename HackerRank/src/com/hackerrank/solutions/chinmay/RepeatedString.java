package com.hackerrank.solutions.chinmay;

/*
 * Problem Statement
 * 
 * Link: https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class RepeatedString {

	static long repeatedString(String s, long n) {

		int substringLength = s.length();
		long remainingLength = 0L;
		long charaterCountOfA = 0L;
		long totalRepeatedOccurance = 0L;

		if (substringLength < 1 || substringLength > 100 || n < 1 || n > Math.pow(10, 12)) {
			return charaterCountOfA;
		}

		if (s.length() == 1 && s.equals("a")) {
			return n;
		}

		charaterCountOfA = getCharacterOccuranceOfA(s, substringLength);

		totalRepeatedOccurance = charaterCountOfA * (n / substringLength);

		remainingLength = n % substringLength;

		totalRepeatedOccurance += getCharacterOccuranceOfA(s, remainingLength);

		return totalRepeatedOccurance;
	}

	private static int getCharacterOccuranceOfA(String s, long substringLength) {

		int charaterCountOfA = 0;
		for (int i = 0; i < substringLength; i++) {
			if ('a' == s.charAt(i)) {
				charaterCountOfA++;
			}
		}

		return charaterCountOfA;
	}

	public static void main(String[] args) {

		RepeatedString rs = new RepeatedString();

		long charactersToConsider = 872514961806L;
		String inputString = "udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps";

		System.out.println(repeatedString(inputString, charactersToConsider));
	}

}
