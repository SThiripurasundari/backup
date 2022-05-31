package com.pract.sample;

import java.util.Arrays;

public class WaveProblem {

	public static void main(String[] args) {

		int[] arr = { 20, 10, 8, 6, 4, 2 };
		int[] sorted = getDataSorted(arr);

		System.out.println("sorted " + Arrays.toString(sorted));

		for (int t = 0; t < sorted.length; t = t + 2) {
			int temp = sorted[t];
			sorted[t] = sorted[t+1];
			sorted[t+1] = temp;
			}
		System.out.println("final  " + Arrays.toString(sorted));
	}

	private static int[] getDataSorted(int[] data) {

		int y = 0;
		int temp = 0;

		for (int i = 1; i < data.length; i++) {
			y = i - 1;
			temp = data[i];
			while (y >= 0 && data[y] > temp) {
				data[y + 1] = data[y];
				y--;	
			}
			y++;
			data[y] = temp;
		}
		return data;

	}

}


