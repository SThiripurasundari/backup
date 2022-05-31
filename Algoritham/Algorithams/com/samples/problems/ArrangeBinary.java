package com.samples.problems;

import java.util.Arrays;

public class ArrangeBinary {

	public static void main(String[] args) {

		int[] input = { 1, 1, 0, 0, 1, 0, 0, 1 };
		int zeroptr = 0;
		int twosptr = input.length - 1;
		int traversalptr = 0;

		while (traversalptr <= twosptr) {
			if (input[traversalptr] == 0) {
				int temp = input[zeroptr];
				input[zeroptr] = input[traversalptr];
				input[traversalptr] = temp;
				zeroptr++;
				traversalptr++;
			} else if (input[traversalptr] == 2) {
				int temp = input[twosptr];
				input[twosptr] = input[traversalptr];
				input[traversalptr] = temp;
				twosptr--;

			} else {
				traversalptr++;
			}

			System.out.println("Arrays >" + Arrays.toString(input));
		}
		System.out.println("Arrays >" + Arrays.toString(input));

	}
}
