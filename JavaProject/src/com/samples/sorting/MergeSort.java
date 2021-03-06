package com.samples.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int data[] = { 2, -6, 1, 9, 4, 3 };

		new MergeSort().mergerSort(data, 0, data.length - 1);
		System.out.println("Answer  :" + Arrays.toString(data));

	}

	private void mergerSort(int[] data, int start, int end) {

		if (start < end) {
			int mid = start + (end - start) / 2;
			System.out.println("mide "+ mid +"   start"+start);
			mergerSort(data, start, mid);
			mergerSort(data, mid + 1, end);
			merger(data, start, mid, end);

		}

	}

	private void merger(int[] data, int start, int mid, int end) {

		int l1 = mid - start + 1;
		int l2 = end - mid;
		
		System.out.println("l1 :"+ l1);
		System.out.println("l2 :"+ l2);

		int[] L1 = new int[l1];
		int[] R2 = new int[l2];

		for (int t = 0; t < l1; t++) {

			System.out.println("start+t" + (start+t));
			L1[t] = data[start + t];
		}

		for (int x = 0; x < l2; x++) {
			System.out.println("start+t   " + (mid+1+x));
			R2[x] = data[mid + 1 + x];
		}

		int i = 0, y = 0;
		int k = start;

		while (i < l1 && y < l2) {

			if (L1[i] <= R2[y]) {
				data[k] = L1[i];
				// k++;
				i++;

			} else {
				data[k] = R2[y];
				// k++;
				y++;

			}
			k++;
		}

		while (i < l1) {
			data[k] = L1[i];
			k++;
			i++;
		}

		while (y < l2) {
			data[k] = R2[y];
			k++;
			y++;
		}

	}

}
