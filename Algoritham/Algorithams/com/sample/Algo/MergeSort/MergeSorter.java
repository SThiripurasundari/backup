package com.sample.Algo.MergeSort;

import java.util.Arrays;

public class MergeSorter {

	public static void main(String[] args) {
		int arr[] = { 2, -6, 1, 9, 4, 3 };
		printArray(arr);
		MergeSorter ob = new MergeSorter();
		ob.mergeSorter(arr, 0, arr.length - 1);
		printArray(arr);
	}

	public static void mergeSorter(int[] data, int start, int end) {

		if (start < end) {
			// Find the middle point
			int mid = start + (end - start) / 2;
			mergeSorter(data, start, mid);
			mergeSorter(data, mid + 1, end);
			merge(data, start, mid, end);
		}
	}

	static void merge(int arr[], int start, int mid, int end) {

		// Find sizes of two subarrays to be merged

		int n1 = mid - start + 1;// +1 here bcoz the int size will start will 0, sosize has to be + 1
		int n2 = end - mid;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[start + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[mid + 1 + j];// mid +1 , bcoz second arry has to start from mid+1 as firrst array already
									// hold middle one

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = start;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
