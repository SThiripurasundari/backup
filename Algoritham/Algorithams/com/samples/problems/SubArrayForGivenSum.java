package com.samples.problems;

import java.util.HashMap;

public class SubArrayForGivenSum {

	public static void main(String[] args) {
		int a[] = { 10, 15, -5, 15, -10, 5 };
		int sum = 20;
		SubArrayForGivenSum array = new SubArrayForGivenSum();
		array.getSubArray(a, sum);

	}

	void getSubArray(int a[], int sum) {
		int start = 0;
		int end = -1;
		int currentSum = 0;
		HashMap<Integer, Integer> basemap = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			currentSum = currentSum + a[i];
			if (currentSum - sum == 0) {
				start = 0;
				end = i;
				break;
			}

			if (basemap.containsKey(currentSum - sum)) {
				start = basemap.get(currentSum - sum) + 1;
				end = i;
				break;
			}

			basemap.put(currentSum, i);
		}

		if (end == -1) {

			System.out.println("Not Found");
		} else
			System.out.println("Start :" + start + "," + "End " + end);

	}

}
