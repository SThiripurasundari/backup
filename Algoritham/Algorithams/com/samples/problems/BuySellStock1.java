package com.samples.problems;

public class BuySellStock1 {
// This logic is find the max profit , when to buy and when to sell
// iterate the list and find the min so far from starting position and the profit at that position	
// keep checking to find min so far and max profit so far 

	
	
	public static void main(String[] args) {
		int[] arr = { 3, 1, 6, 9, 8 };
		System.out.println(" RESULT  " + calProfit(arr));
	}

	public static int calProfit(int[] arr) {
		int minsofar = arr[0]; // 5 2
		int maxproit = 0; // 0

		for (int t = 0; t < arr.length; t++) {
			minsofar = Math.min(minsofar, arr[t]);
			int profit = arr[t] - minsofar;
			maxproit = Math.max(maxproit, profit);
		}

		System.out.println(" minsofar  " + minsofar);
		System.out.println(" minsofar  " + (maxproit + minsofar));
		return maxproit;

	}

}
