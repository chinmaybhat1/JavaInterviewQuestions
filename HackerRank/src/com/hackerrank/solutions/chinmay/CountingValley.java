package com.hackerrank.solutions.chinmay;

/*
 * Problem Statement
 * 
 * Link: https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

public class CountingValley {

	static int countingValleys(int n, String s) {

		int vallyCount = 0;
		int stepCount = 0;
		boolean startedWithDownStep = false;

		if (n < 2 || n > (int) Math.pow(10, 6)) {
			return 0;
		}

		for (int i = 0; i < s.length(); i++) {
			char path = s.charAt(i);
			if ('U' == path) {
				stepCount = stepCount + 1;
			} else if ('D' == path) {
				if (0 == stepCount) {
					startedWithDownStep = true;
				}
				stepCount = stepCount - 1;
			} else {
				return 0;
			}

			if (0 == stepCount) {
				if (startedWithDownStep) {
					vallyCount = vallyCount + 1;
					startedWithDownStep = false;
				}
			}
		}
		return vallyCount;
	}

	public static void main(String[] args) {
		int numberOfSteps = 8;
		String path = "UDDDUDUUDUDU";

		System.out.println(countingValleys(numberOfSteps, path));

	}

}
