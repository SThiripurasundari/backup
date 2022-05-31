package com.samples.DS;

public class KandaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {-2,1,-3,4,-1,2,1,-5,4};

		int sum = maxSubArrayUsingBruteForceOptimized(array);
		System.out.println("sum:" + sum);
	}

	public static int maxSubArrayUsingBruteForceOptimized(int[] a) {
		int max_so_far = a[0];
		int curr_max = a[0];

		for (int i = 1; i < a.length; i++) {
			System.out.println("a[i] :" + a[i]);
			curr_max = Math.max(a[i], curr_max + a[i]);
			System.out.println("curr_max :" + curr_max);

			max_so_far = Math.max(max_so_far, curr_max);
			System.out.println("max_so_far after " + max_so_far);
		}
		return max_so_far;
	}

}

// my code , in one case it failed 
/*
 * public static int getMaxValue(int[] array) { int max_ending_here = 0; int
 * max_so_far = 0;
 * 
 * for (int t = 0; t < array.length; t++) {
 * 
 * max_ending_here = max_ending_here + array[t]; if (max_ending_here < 0) {
 * max_ending_here = 0; } else { if (max_ending_here > max_so_far) max_so_far =
 * max_ending_here;
 * 
 * }
 * 
 * }
 * 
 * return max_so_far; }
 */
