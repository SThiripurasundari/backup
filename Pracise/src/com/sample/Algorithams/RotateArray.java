package com.sample.Algorithams;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		rotateLeft(array, 2);

		
	}
	
	//rotate the array to the right by k steps
		public static void rotateright(int[] nums, int k) {

			int length = nums.length;

			for (int x = 0; x < k; x++) {
				int start = 0;
				int end = length - 1;
				int temp = 0;

				temp = nums[end];
				while (start < end) {
					nums[end] = nums[end -1];
					end--;
				}
				nums[start] = temp;
				System.out.println("x :" + x + "result-->" + Arrays.toString(nums));
			}

		}

	//rotate the array to the left by k steps
	public static void rotateLeft(int[] nums, int k) {

		int length = nums.length;

		for (int x = 0; x < k; x++) {
			int start = 0;
			int end = length - 1;
			int temp = 0;

			temp = nums[start];
			while (start < end) {
				nums[start] = nums[start + 1];
				start++;
			}
			nums[end] = temp;
			System.out.println("x :" + x + "result-->" + Arrays.toString(nums));
		}

	}
}
