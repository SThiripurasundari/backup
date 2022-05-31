package com.sample.Algo.Bubblesort;

import java.util.Arrays;

public class ForwardBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputString = { 8, 5, 0, 9, 3, 1 };
		int temp = 0;

		for (int y = 0; y <= inputString.length - 1; y++) {

			for (int x = y + 1; x <= inputString.length - 1; x++) {
				System.out.println(+y + " y " + inputString[y]);
				System.out.println(+x + " x " + inputString[x]);

				if (inputString[y] > inputString[x]) {
					temp = inputString[y];
					inputString[y] = inputString[x];
					inputString[x] = temp;
				}
			}
			System.out.println("End of iteration " + y + "-------------------");
			System.out.println(Arrays.toString(inputString));
		}

	}

}
