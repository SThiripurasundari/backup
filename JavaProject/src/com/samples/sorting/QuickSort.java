package com.samples.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int data[] ={ 2, -6, 1, 9, 4, 3 };

		new QuickSort().quickSort(data, 0, data.length - 1);
		System.out.println("Result "+ Arrays.toString(data));

	}

	private void quickSort(int[] data, int start, int end) {

		if (start < end) {
			int pivot = getPivot(data, start, end);
			quickSort(data, start, pivot - 1);
			quickSort(data, pivot + 1, end);

		}

	}

	private int getPivot(int[] data, int start, int end) {

		int pivot = data[end];
		int tempIndex = start;

		for (int i = start; i < end; i++) {

			if (data[i] < pivot) {
				int temp = data[i];
				data[i] = data[tempIndex];
				data[tempIndex] = temp;
				tempIndex++;

			}

		}
		data[end] = data[tempIndex];
		data[tempIndex] = pivot;
		

		return tempIndex;
	}

}
