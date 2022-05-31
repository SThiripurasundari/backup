package delete;

import java.util.Arrays;
import java.util.Iterator;

public class InsertinSort {

	public static void main(String[] args) {
		int[] input = { 10, 9, -4, -1, 0, 4 };

		for (int i = 1; i < input.length; i++) {
			int y = i-1;
			int current = input[i];
			
			while(y >= 0 && current < input[y])
			
			{
				input[y+1] = input[y];
				y--;
							
			}
			
			y++;
			input[y] = current;
			
		}
		System.out.println("Ans "+  Arrays.toString(input));
		
	}
	}
