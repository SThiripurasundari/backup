package com.sample.Algorithams;

import java.util.Arrays;

public class SquareSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 6, 8, 9 };
		array = sortedSquares2(array);

		System.out.println("Resut -->" + Arrays.toString(array));
	}

	// This method has sorting also included but will work for non-decreasing order
	// with negative and positive values

	
	
	// solution - iterate in while with condition starting<ending , check square of
	// first and last , which is big put it at the end of new array and also move
	// the pointer either at end or begining depending the data moved to new array
	public static int[] sortedSquares2(int[] nums) {
		int len = nums.length;
		int start = 0;
		int end = nums.length - 1;

		int arr[] = new int[len];
		int index = len - 1;

		while (start <= end) {
			System.out.println("called in while");
			if (nums[start] * nums[start] > nums[end] * nums[end]) {
				arr[index--] = nums[start] * nums[start];
				System.out.println("if ");
				start++;
			} else {
				arr[index--] = nums[end] * nums[end];
				end--;
				System.out.println("else");
			}

		}

		return arr;

	}

	// my solution using array sort 
	public static int[] sortedSquares1(int[] nums) {
		int[] array = new int[nums.length];
		int test = 0;

		for (int y = 0; y < nums.length; y++) {
			test = nums[y];
			test = test * test;
			array[y] = test;

		}

		Arrays.sort(array);
		return array;

	}

}
