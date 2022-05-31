package com.sample.Algorithams;


//Given an array of integers nums which is sorted in ascending order,
//and an integer target, write a function to search target in nums.
//If target exists, then return its index. Otherwise, return -1.



public class BinarySearch {

	public static void main(String[] args) {

		int[] input = { 12, 1, 12, 18, 19 };
		System.out.println(search(input, 19));

	}

	
	//using while statement  - 2ms  and memory -52 MB 
	//using below 1ms,and memory 39.7 mb
	public static int search(int[] nums, int target) {
		int l = nums.length;
		// int t = 0;
		
		

		for (int q = 0; q < l; q++) {

			if (nums[q] == target) {
				return q;

			}

		}

		return -1;

	}
}