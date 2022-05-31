package com.samples.DS;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		// You are given two integer arrays nums1 and nums2, sorted in non-decreasing
		// order,
		// and two integers m and n, representing the number of elements in nums1 and
		// nums2 respectively.
		// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
		int[] array1 = { 1, 0};
		int[] array2 = { 1 };
		merge(array1, 2, array2, 1);

	}

	public static void mergeMine(int[] array1, int array1length, int[] array2, int array2length) {
		int ptr1 = array1length - 1;
		int ptr2 = array2length - 1;

		for (int fullptr = array1.length - 1; fullptr >= 0; fullptr--) {

			System.out.println("ptr -->"+fullptr);
			System.out.println("ptr1-->"+ptr1);
			System.out.println("ptr2-->"+ptr2);
			
			if (ptr2 < 0) {
				break;

			}
			if (array1[ptr1] > array2[ptr2]) {
				System.out.println("--if part---");
				System.out.println("array1[ptr1]  :"+array1[ptr1]);
				System.out.println("array2[ptr2]  :"+array2[ptr2]);
				array1[fullptr] = array1[ptr1--];
				System.out.println("on iteration      ->"+ fullptr +"data-->" +Arrays.toString(array1));

			} else {
				System.out.println("--else part---");
				System.out.println("array1[ptr1]  :"+array1[ptr1]);
				System.out.println("array2[ptr2]  :"+array2[ptr2]);
				
				array1[fullptr] = array2[ptr2--];
				System.out.println("on iteration  ELSE ->"+ fullptr +"data-->" +Arrays.toString(array1));

			}

		}

		System.out.println("Ans  ->" + Arrays.toString(array1));

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		// initialize pointer p1 for nums1, p2 for nums2
		// starting from the end of arrays
		int p1 = m - 1;
		System.out.println("p ->" + (m + n - 1));
		System.out.println("p1 ->" + p1);
		int p2 = n - 1;
		System.out.println("p2 ->" + p2);

		// iterate pointer p from the end of nums1
		for (int p = m + n - 1; p >= 0; p--) {
			if (p2 < 0)
				break;
			// compare elements in nums1 and nums2

			System.out.println("in for loop p1 ->" + p1 + "  : " + nums1[p1]);
			System.out.println("in for loop p2 ->" + p2 + "  : " + nums2[p2]);
			if (p1 >= 0 && nums1[p1] > nums2[p2]) {
				// copy larger element to the end of nums1 array
				System.out.println("p1 before" + p1);
				nums1[p] = nums1[p1--];
				System.out.println("p1 after" + p1);
				System.out.println("in for loop 2 nums1[p] ->" + nums1[p]);
				System.out.println("in for loop 2 nums1[p] ->" + Arrays.toString(nums1));
			} else {
				nums1[p] = nums2[p2--];
				System.out.println("in for loop else nums1[p] ->" + nums1[p]);
				System.out.println("in for loop else nums1[p] ->" + Arrays.toString(nums1));
			}
		}

		System.out.println("result ->" + Arrays.toString(nums1));
	}
}
