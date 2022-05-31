package com.sample.Algo.MergeSort;

import java.util.Arrays;

public class MergeDelete {

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Given Array" + Arrays.toString(arr));
		mergeSort(arr, 0, arr.length - 1);
		System.out.println("Sorted  " + Arrays.toString(arr));

	}

	public static void mergeSort(int[] arr, int start, int end) {

		if (start < end) {
			int mid = start + (end - start) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);

		}

	}

	public static void merge(int[] data, int start, int mid, int end) {

		int n1 = mid - start + 1;
		int n2 = end - mid;

		int[] L = new int[n1];
		int[] R = new int[n2];

		// populate array

		for (int t = 0; t < n1; t++) {
			L[t] = data[start + t];

		}
		for (int y = 0; y < n2; y++) {
			R[y] = data[mid + 1 + y];

		}

		// compare both the arrays
		int i = 0, j = 0;
		int k = start;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				data[k] = L[i];
				i++;

			}

			else {
				data[k] = R[j];
				j++;

			}
			k++;
		}

		while (i < n1) {
			data[k] = L[i];
			k++;
			i++;
		}

		while (j < n2) {
			data[k] = R[j];
			k++;
			j++;
		}

	}

}
