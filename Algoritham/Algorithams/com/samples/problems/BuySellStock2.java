package com.samples.problems;

public class BuySellStock2 {

	// This find the overall profit , keep iterating and find the place where
	// the previous value is less then current and that position find profit and
	// keep adding the profit

	public static void main(String[] args) {

		int[] arr = { 5, 2, 6, 1, 4, 7, 3, 6 };

		System.out.println("profit +" + getprofit(arr));

	}

	private static int getprofit(int[] arr) {

		int previousrate = arr[0];
		int profit = 0;

		for (int t = 1; t < arr.length; t++) {
			if (arr[t] > previousrate) {
				profit = profit + (arr[t] - previousrate);
			}
			previousrate = arr[t];
		}
		return profit;
	}

}
