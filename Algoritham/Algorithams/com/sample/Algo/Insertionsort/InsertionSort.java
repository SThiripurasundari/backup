package com.sample.Algo.Insertionsort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		// divide the array into sorted and unsorted array , sorted will be handled by y
		// and
		// unsorted by i.y will be iterating data before data at i. Take first element
		// at
		// i and
		// compare with each elements in Y and iterate till u find the position so that
		// element at i
		// can be inserted at y and till then u keep shifting the data one position next
		// very important - while checking while statement , always use iteratethis
		// instead of data [i] ,
		// because the i value is keeping changing inside the while loop

		int[] data = { 8, 4, 10, 5, 9, 2 };

		for (int i = 1; i < data.length; i++) {
			int iterateThis = data[i];
			int y = i - 1;

			while (y >= 0 && iterateThis < data[y]) {
				data[y + 1] = data[y];
				y--;
			}

			data[y + 1] = iterateThis;
		}
		System.out.println("Result -->" + Arrays.toString(data));

	}
}
