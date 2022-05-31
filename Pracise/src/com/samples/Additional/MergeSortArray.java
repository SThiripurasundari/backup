package com.samples.Additional;

import java.util.Arrays;

public class MergeSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] foo = { 3, 7 };
		int[] bar = { 4, 8, 11 };

		System.out.println("foo " + Arrays.toString(foo));
		System.out.println("bar " + Arrays.toString(bar));
		int fooLength = foo.length;
		int barLength = bar.length;

		copied(foo, bar);

		mergeArray(foo, bar);

	}

	public static void mergeArray(int[] first, int[] second) {
		int firstsize = first.length;
		int secondsize = second.length;
		int resultArraysize = first.length + second.length;
		int x = 0, y = 0, z = 0;
		int[] resultArray = new int[resultArraysize];

		// first iterate and copy both arary
		System.out.println("------------------");
		while (x < firstsize && y < secondsize) {
			if (first[x] < second[y]) {
				resultArray[z++] = first[x++];
				System.out.println("1 :" + Arrays.toString(resultArray));
			} else {
				resultArray[z++] = second[y++];
				System.out.println("2 :" + Arrays.toString(resultArray));

			}

			while (x < firstsize)
				resultArray[z++] = first[x++];
			System.out.println("3 :" + Arrays.toString(resultArray));

			while (y < secondsize)
				resultArray[z++] = second[y++];
			System.out.println("5 :" + Arrays.toString(resultArray));

		}
		System.out.println("6 :" + Arrays.toString(resultArray));
	}

	private static void copied(int[] foo, int[] bar) {
		int fooLength = foo.length;
		int barLength = bar.length;

		int[] merged = new int[fooLength + barLength];

		int fooPosition, barPosition, mergedPosition;
		fooPosition = barPosition = mergedPosition = 0;

		while (fooPosition < fooLength && barPosition < barLength) {
			if (foo[fooPosition] < bar[barPosition]) {
				merged[mergedPosition++] = foo[fooPosition++];
			} else {
				merged[mergedPosition++] = bar[barPosition++];
			}
			System.out.println("1 :" + Arrays.toString(merged));
		}

		System.out.println("1 :" + fooPosition + ":" + fooLength);
		while (fooPosition < fooLength) {
			merged[mergedPosition++] = foo[fooPosition++];
		}

		System.out.println("2 :" + Arrays.toString(merged));

		System.out.println("2 :" + barPosition + ":" + barLength);
		while (barPosition < barLength) {
			merged[mergedPosition++] = bar[barPosition++];
		}

		System.out.println("2 :" + Arrays.toString(merged));
	}
}
