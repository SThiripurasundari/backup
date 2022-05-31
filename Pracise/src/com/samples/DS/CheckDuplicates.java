package com.samples.DS;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicates {

	public static void main(String[] args) {

		int[] nums = { 2, 4, 2 };

		System.out.println("nums " + containsDuplicate(nums));

	}

	public static boolean containsDuplicate(int[] nums) {
		int t = 0;
		Set<Integer> set = new HashSet<Integer>();

		while (t < nums.length) {

			if (set.contains(nums[t])) {

				return true;
			} else {

				set.add(nums[t]);
			}
			t++;
		}
		return false;

	}

}
