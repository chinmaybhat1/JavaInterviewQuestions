package com.hackerrank.solutions.chinmay;

/*
 * Warm-up Challenges
 * 
 * Link: https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class JumpingOnTheClouds {

	static int jumpingOnClouds(int[] c) {

		int totalLeaps = 0;
		int numberOfClouds = c.length;

		if (numberOfClouds < 2 || numberOfClouds > 100) {
			return totalLeaps;
		}

		int i = 0;
		while (i < numberOfClouds) {

			int leap = i + 2;

			if (leap == numberOfClouds) {
				leap = i + 1;
			} else if (leap > numberOfClouds) {
				i += leap;
				break;
			}

			leap = 1 == c[leap] ? 1 : 2;
			++totalLeaps;
			i += leap;
		}

		return totalLeaps;
	}

	public static void main(String[] args) {
		int c[] = { 0, 0, 1, 0, 0, 1, 0 };
		System.out.println(jumpingOnClouds(c));
	}
}
