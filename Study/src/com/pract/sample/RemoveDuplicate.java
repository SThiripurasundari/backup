package com.pract.sample;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] input = { 1, 2, 1 };
		Arrays.sort(input);
		int last = input[input.length - 1];
		System.out.println("i length :" + last);
		int[] output = new int[last];

		for (int t = 1; t <= input.length; t++) {

			System.out.println("T " + t + ":" + output[t]);
			if (output[t] >= 1) {
				output[t] = output[t] + 1;
				System.out.println("if" + output[t]);
			} else
				output[t] = 1;
			System.out.println("else" + output[t]);

		}

		for (int i = 1; i < output.length; i++) {
			if (output[i] == 0) {
				System.out.println("missing " + i);
			} else if (output[i] > 1) {
				System.out.println("dublicte :" + i);

			}
		}

	}

}
