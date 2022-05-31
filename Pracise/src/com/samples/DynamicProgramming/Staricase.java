package com.samples.DynamicProgramming;

import java.util.Arrays;

public class Staricase {

	public static void main(String[] args) {

		System.out.println("No of ways -->"+climbStairs(6));;

	}

	public static int climbStairs(int n) {

		int result = 0;
		if (n == 1) {

			return 1;
		}

		int[] results = new int[n];
	
		results[0] = 1;
		results[1] = 2;
		System.out.println("Array -->"+Arrays.toString(results));
		for(int y=2;y<n;y++)
		{
			results[y] = results[y-1] + results[y-2];
			System.out.println("Array -->"+Arrays.toString(results));
		}
		

		return results[n-1];
	}
}