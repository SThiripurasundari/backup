package com.pract.sample;

public class SecodnLargest {

	public static void main(String[] args) {
		int[] input = { 0, 17, 10, 0, 0, 2, 0, 0, 166 };
		int firstLargest = 0;
		int secodnLarget = 0;
		if (input[0] > input[1]) {
			firstLargest = input[0];
			secodnLarget = input[1];

		} else {
			firstLargest = input[1];
			secodnLarget = input[0];
		}

		for (int t = 1; t < input.length; t++) {
			if (input[t] > firstLargest) {
				secodnLarget = firstLargest;
				firstLargest = input[t];
			} else if (input[t] > secodnLarget) {

				secodnLarget = input[t];
			}

		}
		System.out.println("First :" + firstLargest);
		System.out.println("second :" + secodnLarget);

	}

}
