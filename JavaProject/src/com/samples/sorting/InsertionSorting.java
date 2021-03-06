package com.samples.sorting;

import java.util.Arrays;

public class InsertionSorting {

	public static void main(String[] args) {
		int data[] = { 2, 8, 1, 0, 6, -4 };

		for (int i = 1; i < data.length; i++) {
			int y = i - 1;
			int iterateThis = data[i];
			while (y >= 0 && data[y] > iterateThis) {
				data[y + 1] = data[y];
				y--;
			}
			y++;
			data[y] = iterateThis;
		}
		System.out.println("result  " + Arrays.toString(data));

	}

}
