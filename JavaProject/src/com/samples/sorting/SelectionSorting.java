package com.samples.sorting;

import java.util.Arrays;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SelectionSorting {

	public static void main(String[] args) {
		int data[] = { 2, 8, 1, 0, 6, -4 };

		for (int i = 0; i < data.length; i++) {
			int minDataPosition = i;

			for (int j = i + 1; j < data.length; j++) {

				if (data[minDataPosition] > data[j]) {
					minDataPosition = j;

				}

			}

			int temp = data[minDataPosition];
			data[minDataPosition] = data[i];
			data[i] = temp;

		}
		System.out.println("Result " + Arrays.toString(data));

	}

}
