package com.samples.problems;

import java.util.Arrays;

public class Arrage0EndInorder {

	public static void loopMethods() {

		int[] input = { 1, 9, 0, 0, 0, 7, 4 };

		int fillThis = 0;
		for (int i : input) {
			if (i != 0) {
				input[fillThis] = i;
				fillThis++;
			}
		}

		while (fillThis < input.length) {
			input[fillThis] = 0;
			fillThis++;
		}
		System.out.println("FInal Resut " + Arrays.toString(input));

	}

	public static void ptrMethods() {
		int[] input = { 0, 1, 5, 8, 0, 7, 4 };
		int endptr = input.length - 1;
		int initialptr = 0;
		int temptr = 0;

		while (initialptr < endptr) {
			if (input[initialptr] == 0) {
				temptr = initialptr;
				while (temptr < endptr) {
					input[temptr] = input[temptr + 1];
					temptr++;
				}
				input[endptr] = 0;
				endptr--;

			} else {
				initialptr++;
			}

		}
		System.out.println("FInal Resut " + Arrays.toString(input));
	}

	public static void main(String[] args) {
		loopMethods();
	}

}
