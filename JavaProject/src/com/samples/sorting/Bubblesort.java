package com.samples.sorting;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data[] = { 2, 8, 1, 0, 6, -4 };

		for (int i = 0; i < data.length-1; i++) {
		
			for (int j = i + 1; j < data.length; j++) {
				if(data[i]>data[j])
				{
					int temp = data[j];
					data[j] = data[i];
					data[i]= temp;
					
				}
				
			}

		

		}
		System.out.println("Result " + Arrays.toString(data));


	}

}
