package com.samples.problems;

import java.util.Arrays;

public class InsertAtInArray {

	public static void main(String[] args) {

		int[] array = { 14, 15, 16, 18, 19, 20 };
		int[] newArray = new int[array.length + 1];
		int position = 3;
		int insertThis = 17;
		int x = 0;

		for (int t = 0; t < position; t++) {
			newArray[x] = array[t];
			x++;
		}

		if (x == position) {
			newArray[x] = insertThis;
			x++;
		}
		for (int t = position; t < array.length; t++) {
			System.out.println("t :" + t + "x " + x);
			newArray[x] = array[t];
			x++;
		}
		System.out.println("Result 2--->" + Arrays.toString(newArray));
	}

}
