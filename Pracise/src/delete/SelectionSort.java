package delete;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] input = { 10, 9, -4, -1, 0, 4 };

		for (int i = 0; i < input.length-1; i++) {
			int minPosition = i;

			for (int j = i + 1; j < input.length; j++) {

				if (input[minPosition] > input[j]) {

					minPosition = j;

				}
				
			
			}
			int swap = input[minPosition];
			input[minPosition] = input[i];
			input[i] = swap;
			

		}
		System.out.println("Ans "+  Arrays.toString(input));
	}

}
