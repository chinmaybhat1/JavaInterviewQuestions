package com.hackerrank.solutions.chinmay;

/*
 * Problem Statement
 * 
 * Link: https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class RepeatedString {

	static long repeatedString(String s, long n) {

		int index = 0;
		int substringLength = s.length();
		long charaterCountOfA = 0L;

		if (substringLength < 1 || substringLength > 100 || n < 1 || n > Math.pow(10, 12)) {
			return charaterCountOfA;
		}

		if (s.length() == 1 && s.equals("a")) {
			return n;
		}

		for (int i = 0; i < n; i++) {
			if (index > substringLength - 1) {
				index = 0;
			}
			if ('a' == s.charAt(index)) {
				charaterCountOfA += 1;
			}
			index++;
		}

		return charaterCountOfA;
	}

	public static void main(String[] args) {

		long charactersToConsider = 872514961806L;
		String inputString = "udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps";

		System.out.println(repeatedString(inputString, charactersToConsider));
	}

}
