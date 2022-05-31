package com.sample.Algo.MergeSort;

import java.util.Arrays;

public class MgerDelet {

	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Unsorted array" + Arrays.toString(arr));
		
		MergeSorter.mergeSorter(arr, 0, arr.length-1);
		System.out.println("Sorted array" + Arrays.toString(arr));
	}

	public void mergeSorter(int[] array, int start, int end) {

		if (start < end) {
			int mid = start + (end - start) / 2 ;

			mergeSorter(array, start, mid);
			mergeSorter(array, mid + 1, end);
			merge(array, start, mid, end);

		}

	}

	private void merge(int[] array, int start, int mid, int end) {

		int lLength = mid - start+1;
		int rLength = end - mid;
		int[] left = new int[lLength];
		int[] right = new int[rLength];

		for (int i = 0; i < lLength; i++) {
			left[i] = array[start + i];

		}

		for (int i = 0; i < rLength; i++) {
			right[i] = array[mid +1+ i];

		}
		
		
		int k= start; int i=0;int j=0;
		while(i <lLength && j <rLength)
		{
			if(left[i] < right [i])
			{
				array[k]= left[i];
				i++;
				k++;
			}else
			{
				array[k]= right[j];
				j++;
				k++;
			}
			
			
		}
		
		if(i<lLength)
		{
			array[k]= left[i];
			k++;i++;
			
		}
		if(j<rLength)
		{
			array[k]= right[j];
			k++;j++;
			
		}
		
		
		
		
		
		

	}

}
