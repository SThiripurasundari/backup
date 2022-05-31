package com.sample.Algorithams;

public class SearchInsertPosition {

	// Given a sorted array of distinct integers and a target value,
	// return the index if the target is found. If not, return
	// the index where it would be if it were inserted in order.
	// Input: nums = [1,3,5,6], target = 5 Output: 2
	// Input: nums = [1,3,5,6], target = 2 Output: 1

	// solution , find the middle position and take that data and compare with
	// target , if same then mid is position , else
	// if mid is larger than given data , then target is between mid and 0th data ,
	// else target is between mid and end -
	// iterate using condition start position< end position

	public static void main(String[] args) {
		int[] input = { 3, 5, 6, 7, 19};
		System.out.println(search(input, 8));

	}

	public static int search(int[] nums, int target) {
		int l = 0, h = nums.length;
		while (l < h) {
			int mid = (l + h) / 2;
			System.out.println("mid-->" + mid);
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target) {
				l = mid + 1;
				System.out.println("l :" + l);
			} else {
				h = mid;
				System.out.println("h :" + h);
			}
		}
		return l;
	}
}
