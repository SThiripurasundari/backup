package com.sample.Algo.Selectionsort;

import java.util.Arrays;

//The main difference between bubble sort and selection sort
//is that the bubble sort operates by repeatedly swapping the adjacent
// elements if they are in the wrong order while the selection 
//sort sorts an array by repeatedly finding the minimum element 
//from the unsorted part and placing 
//that at the beginning of the array.
public class SelectionSort {

	public static void main(String[] args) {

		int[] data = { 8, 5, 0, 9, 3, 1 };

		for (int x = 0; x < data.length - 1; x++) {

			// this will hold the position having the least amount
			int minlength = x;
			System.err.println("x :" + x + "data :" + data[x]);

			// iterate from next index till length and just find the position of min data
			for (int y = x + 1; y < data.length; y++) {

				if (data[minlength] > data[y]) {
					minlength = y;

				}
			}
			// swap the data from starting position in x to min data in the rest of the
			// array and that is present in minlength
			int temp = data[minlength];
			data[minlength] = data[x];
			data[x] = temp;

			System.out.println("at :"+ x +"Result--+" +  Arrays.toString(data));

		}

		System.out.println("inal--+" + Arrays.toString(data));
	}

}
