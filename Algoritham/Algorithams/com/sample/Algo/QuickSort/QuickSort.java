package com.sample.Algo.QuickSort;

import java.util.Arrays;

public class QuickSort {

	// take last element as pivot and then all number greater than pivot is on right
	// and lesser on left
	// and then again iterate a. data which lies before pivot and data after pivot
	// in recurrsive way

	public static void main(String[] args) {
		// int[] data = { 1, 5, 7, 12, 2, 8 };

		int[] data = { 2, -6, 1, 9, 4, 3 };
		new QuickSort().quicksort(data, 0, data.length - 1);
		System.out.println(Arrays.toString(data));
	}

	public void quicksort(int[] data, int start, int end) {
		if (start < end) {
			//System.out.println("Stat :" + start + "end :" + end);
			int pivot = partition(data, start, end);
			//System.out.println("pivot   :" + pivot);
			quicksort(data, start, pivot - 1);
			quicksort(data, pivot + 1, end);
		}
	}

	
	// this method will return the final location of the pivot data after tbelow iteration
	public int partition(int[] data, int start, int end) {
//	int[] data = { 8, 4, -1, 5, 9, 2 };

		int i = start;// 0=1, // to hold the next lowest number hold position
		int pivot = data[end];// 12
		int temp = 0;

		for (int j = start; j <= end - 1; j++) {
				if (data[j] < pivot) {
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
				i++;
			}
		}

		data[end] = data[i];
		data[i] = pivot;
		
		return i;
	}

}
