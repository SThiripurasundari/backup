package com.pract.sample;

import java.util.Arrays;

public class Arrange01 {

	public static void main(String[] args) {

		Arrange01 arra = new Arrange01();
		int[] test1 = { 0, 2, 1, 0, 1, 0 };
		// arra.whileMethod(test1);
		// int[] test2 = { 0, 0, 1, 0, 1, 0 };
		// arra.bubble(test2);

		arra.verySimple();

	}

	public void verySimple() {
		int[] test1 = { 1, 2, 1, 0, 1, 1 };
		int size = test1.length;

		int zeros = 0;
		int twos = 0;

		for (int t = 0; t < test1.length; t++) {
			if (test1[t] == 0) {
				zeros++;
			} else if (test1[t] == 2) {
				twos++;
			}

		}

		System.out.println("zeros " + zeros);
		System.out.println("twos " + twos);
		System.out.println("1 " + (size - twos));
		int ptr = 0;
		while (zeros != 0) {
			test1[ptr] = 0;
			ptr++;
			zeros--;

		}

		while (ptr < size - twos) {
			test1[ptr] = 1;
			ptr++;

		}
		while (ptr < size) {
			test1[ptr] = 2;
			ptr++;
		}
		System.out.println("result bubble" + Arrays.toString(test1));
	}

	public void bubble(int[] test) {

		int swap = 0;

		for (int x = 0; x < test.length - 1; x++) {

			for (int y = x + 1; y < test.length; y++) {

				if (test[x] > test[y]) {
					swap = test[x];
					test[x] = test[y];
					test[y] = swap;

				}
			}

		}
		System.out.println("result bubble" + Arrays.toString(test));

	}

	public void whileMethod(int[] data) {

		{

			int startptr = 0;
			int endptr = data.length - 1;
			int counter = 0;
			int swap = 0;
			while (counter <= endptr) {

				System.out.println("Counter Data -- >" + data[counter]);
				if (data[counter] == 0) {

					swap = data[counter];
					data[counter] = data[startptr];
					data[startptr] = swap;
					counter++;
					startptr++;

				} else if (data[counter] == 2) {
					swap = data[counter];
					data[counter] = data[endptr];
					data[endptr] = swap;
					// counter++;
					endptr--;

				} else {

					counter++;

				}

				System.out.println("startptr :" + startptr + "  counter :" + counter + " endptr " + endptr);
				System.out.println("still " + Arrays.toString(data));

			}

			System.out.println("result while" + Arrays.toString(data));

		}
	}
}
