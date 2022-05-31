package com.samples.DS;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given an array of integers nums and an integer target,
		// return indices of the two numbers such that they add up to target.
		/*
		 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
		 * nums[0] + nums[1] == 9, we return [0, 1].
		 */

		int[] nums = { 3, 3 };
		System.out.println(Arrays.toString(twoSum(nums, 6)));

	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap();
		int diff = 0;

		for (int t = 0; t < nums.length; t++) {
			diff = target - nums[t];

			if (map.containsKey(nums[t])) {

				result[0] = (int) map.get(nums[t]);
				result[1] = t;
				
				//for TwoSum-second sum
				result[0] = result[0] + 1;
				//System.out.println("result[0]"+result[0]);
				result[1] = result[1] + 1;
				//*/
				return result;

			} else {
				map.put(diff, t);
			}
		}
		System.out.println("result[0]"+result[0]);

		
		
		return result;

	}

}
