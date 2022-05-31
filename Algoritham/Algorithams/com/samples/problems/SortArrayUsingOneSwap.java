package com.samples.problems;

import java.util.Arrays;

public class SortArrayUsingOneSwap {

	public static void main(String[] args) {

		int[] input = { 3, 8, 6, 7, 5, 9 };

		int frstConfPos = -1;
		int secdConfPos = -1;
		int previous = input[0];

		for (int t = 1; t < input.length; t++) {

			if (input[t] < previous) {
				if (frstConfPos == -1) {
					frstConfPos = t - 1;
				} else {

					secdConfPos = t;
				}
			}
			previous = input[t];
		}
		System.out.println("Result :" + frstConfPos + secdConfPos);

		int temp = input[secdConfPos];
		input[secdConfPos] = input[frstConfPos];
		input[frstConfPos] = temp;
		System.out.println("Arrsy " + Arrays.toString(input));

	}

}
