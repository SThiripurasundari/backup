package com.samples.problems;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = { 12, 13, 15, 16, 17 ,20};
		System.out.println(""+array.length);
		int ret = search(array, 13, 0, array.length);
		System.err.println("Result " + ret);

	}

	public static int search(int[] array, int target, int start, int end) {

		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;
		System.err.println("mid "+mid + " : data "+ array[mid]);
		if (array[mid] == target) {

			return mid;
		}

		if (array[mid] > target) {
			// b/w start and mid
			System.err.println("start " +start + "mid-1 "+(mid-1));
			return search(array, target, start, mid - 1);

		} else {
			// b/w mid and end
			System.err.println("mid + 1 " +(mid + 1) + "  end "+(end));
			return search(array, target, mid + 1, end);

		}

	}

}
