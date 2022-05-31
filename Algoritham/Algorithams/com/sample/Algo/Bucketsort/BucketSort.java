package com.sample.Algo.Bucketsort;

import java.util.Arrays;

public class BucketSort {

	public static void main(String[] args) {
		int a[] = { 90, 40, 5, 15, 30, 9 };
		BucketSort b1 = new BucketSort();
		System.out.println("Before sorting array elements are - \n");
		b1.printArr(a);
		b1.bucket(a);
		System.out.println("\nAfter sorting array elements are - \n");
		b1.printArr(a);
	}

	int getMax(int a[]) // function to get maximum element from the given

	{
		int n = a.length;
		int max = a[0];
		for (int i = 1; i < n; i++)
			if (a[i] > max)
				max = a[i];
		System.out.println("  Max -- "+max);
		return max;
	}

	void bucket(int a[]) // function to implement bucket sort
	{
		int n = a.length;
		int max = getMax(a); // max is the maximum element of array
		int bucket[] = new int[max + 1];
		/*
		 * for (int i = 0; i <= max; i++) { bucket[i] = 0; }
		 */
		
		System.out.println("***--->"+Arrays.toString(bucket));
		
		for (int i = 0; i < n; i++) {
			bucket[a[i]] = bucket[a[i]] + 1;

		}
		
		System.out.println("After **--->"+Arrays.toString(bucket));
		
		for (int i = 0, j = 0; i <= max; i++) {
			
			while (bucket[i] > 0) {
				System.out.println("bucket[] :"+bucket[i]);
				a[j++] = i;
				bucket[i]--;
			}
		}
		System.out.println("2--->"+Arrays.toString(bucket));
		
	}

	void printArr(int a[]) /* function to print the array */
	{
		int i;
		int n = a.length;
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

}
