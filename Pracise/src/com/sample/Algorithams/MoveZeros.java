package com.sample.Algorithams;

import java.util.Arrays;

//Given an integer array nums, move all 0's to the end of it while maintaining 

//the relative order of the non-zero elements.

//Input: nums = [0,1,0,3,12]
//      Output: [1,3,12,0,0]

public class MoveZeros {

	public static void main(String[] args) {
		int[] input = { 0, 1, 0, 3, 12 };
		moveZeroes(input);
	}

	// solution : is to have two pointer and move all non zero data to the starting
	// of the array and fill the rest of the space with zero,
	// using two pointers , one for iteration and another for holding position where
	// next non zero data to be filled

	public static void moveZeroes(int[] nums) {

		int ptr1 = 0;
		int ptr2 = 0; // will hold where

		while (ptr1 < nums.length && ptr2 < nums.length) {

			if (nums[ptr1] != 0) {
				nums[ptr2] = nums[ptr1];
				ptr2++;
				System.out.println("result-->" + Arrays.toString(nums));
			}
			ptr1++;

		}

		System.out.println("ptr1-->" + ptr1);
		System.out.println(" nums.length-->" + nums.length);
		System.out.println("leb=ngth -->" +(nums.length-ptr2));
		while (ptr2 < nums.length) {
			System.out.println("inside while");
			nums[ptr2] = 0;
			ptr2++;
			System.out.println("result 2-->" + Arrays.toString(nums));
		}
	}
	
	//my logic
	public static void moveZeroes2(int[] nums) {
		int [] newArray = new int [nums.length];
		int newPtr=0;
		
		for(int t=0;t<nums.length;t++)
		{
			int data =  nums[t];
			//System.out.println("data" + data);
			if(data!=0)
			{
				newArray[newPtr] = data;
				newPtr++;
				//System.out.println("result-->" + Arrays.toString(newArray));
			}
			
			
		}
		
		while (newPtr < nums.length) {
			//System.out.println("inside while");
			newArray[newPtr] = 0;
			newPtr++;
			//System.out.println("result 2-->" + Arrays.toString(newArray));
		}
	
	}
	
}
