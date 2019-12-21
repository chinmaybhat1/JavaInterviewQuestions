package com.hackerrank.solutions.chinmay;

import java.util.HashMap;
import java.util.Map;

/*
 * Warm-up Challenges
 * 
 * Link: https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {

		if (n < 1 || n > 100) {
			return 0;
		}

		int pairCount = 0;
		Map<Integer, Integer> sockMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {

			int sockColor = ar[i];
			if (sockColor < 1 || sockColor > 100) {
				return 0;
			}

			if (sockMap.containsKey(sockColor)) {
				int count = sockMap.get(sockColor);
				sockMap.put(sockColor, ++count);
			} else {
				sockMap.put(sockColor, 1);
			}
		}

		for (Integer key : sockMap.keySet()) {
			int pairs = sockMap.get(key);
			if (pairs > 1) {
				pairCount = pairCount + (pairs / 2);
			}
		}

		return pairCount;
	}

	public static void main(String[] args) {

		int sockStock = 9;
		int[] sockColors = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };

		System.out.println(sockMerchant(sockStock, sockColors));
	}
}
