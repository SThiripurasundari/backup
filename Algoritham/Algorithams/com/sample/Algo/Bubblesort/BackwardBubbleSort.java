package com.sample.Algo.Bubblesort;

import java.util.Arrays;

public class BackwardBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 8, 5, 0, 9, 3, 1 };

		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				// do the swap if required
				if (data[j] > data[j + 1]) {
					int tmp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = tmp;
				}
				System.out.println("j enaswer "+ "j -->"+Arrays.toString(data));
			}
			
			System.out.println("i enaswer "+ "i -->"+Arrays.toString(data));
		}
	

	
	}

}
