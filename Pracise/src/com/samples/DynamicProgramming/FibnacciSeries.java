package com.samples.DynamicProgramming;

import java.util.Arrays;

public class FibnacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5 8 13

		int n = 7;

		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.println(a);
		System.out.println(b);

		for (int t = 2; t <= n - 1; t++) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;

		}

		System.out.println("-------------------------2 nd way");
		int result = 0;
		if (n == 1) {

			System.out.println("1");
		}

		int[] results = new int[n];

		results[0] = 0;
		results[1] = 1;
		System.out.println("Array -->" + Arrays.toString(results));
		for (int y = 2; y <= n-1; y++) {
			results[y] = results[y - 1] + results[y - 2];
			System.out.println("Array -->" + Arrays.toString(results));
		}

		System.out.println(results[n - 1]);

	}

}
