package com.pract.sample;

import java.util.Arrays;

public class MovingZero {

	public static void main(String[] args) {

		int[] input = { 0, 1, 0, 3, 12,0,45,100 };
		moveZeroAtBegining(input);
		moveZerosAtEnd(input);

	}

	public static void moveZeroAtBegining(int[] input) {

		int[] result = new int[input.length];
		int t = 0;
		int zeroCount = 0;

		while (t < input.length) {
			if (input[t] == 0) {
				zeroCount++;
			}
			t++;
		}
		for (int x = 0; x < input.length; x++) {
			if (input[x] != 0) {
				result[zeroCount] = input[x];
				zeroCount++;
			}
		}
		System.out.println("Arrays-->" + Arrays.toString(result));
	}

	public static void moveZerosAtEnd(int[] input) {

		int pointerfordata = 0;
		int[] resultArray = new int[input.length];

		for (int t = 0; t < input.length; t++) {
			if (input[t] != 0) {
				resultArray[pointerfordata] = input[t];
				pointerfordata++;
			}
		}
		System.out.println("Arrays-->" + Arrays.toString(resultArray));
	}

}
