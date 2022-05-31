package delete;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] input = { 10, 9, -4, -1, 0, 4 };

		new QuickSort().getQuickerSorter(input, 0, input.length - 1);
		System.out.println("Ans " + Arrays.toString(input));

	}

	private void getQuickerSorter(int[] input, int start, int end) {

		if (start < end) {
			int pivot = getPivot(input, start, end);
			getQuickerSorter(input, start, pivot-1);
			getQuickerSorter(input, pivot+1, end);

		}

	}

	private int getPivot(int[] data, int start, int end) {

		int pivotData = data[end];
		int k = start;

		for (int i = start; i <= end; i++) {

			if (data[i] < pivotData) {
				int temp = data[i];
				data[i] = data[k];
				data[k] = temp;
				k++;

			}

		}
		
		data[end] = data[k];
		data[k] = pivotData;
		
		return k;
	}

}