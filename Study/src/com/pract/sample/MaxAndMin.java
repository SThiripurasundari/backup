package com.pract.sample;

public class MaxAndMin {

	public static void main(String[] args) {
		int[] xyz = new int[] { -20, 34, 21, -98, 76, -6, 1234 };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int t = 0; t < xyz.length; t++) {
			if (xyz[t] > max) {
				max = xyz[t];

			} else if (xyz[t] < min) {
				min = xyz[t]; 
			}

		}

		System.out.println("MIN L"+min);
		System.out.println("MAX L"+max);
	}

}
