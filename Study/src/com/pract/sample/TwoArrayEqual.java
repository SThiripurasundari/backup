package com.pract.sample;

import java.util.Arrays;

public class TwoArrayEqual {

	public static void main(String[] args) {
		//Input  : arr1[] = {1, 2, 5, 4, 0};
        //arr2[] = {2, 4, 5, 0, 1}; 
        //Output : Yes

		
		int arr1[] = {1, 3, 5, 4, 0};
		int arr2[] = {2, 4, 5, 0, 1}; 
		Arrays.sort(arr2);
		Arrays.sort(arr1);
		// Option 1
	//	System.out.println(Arrays.equals(arr1, arr2));
		
		
		//Option 2
		for(int t =0;t<arr1.length;t++)
		{
			if(arr1[t] != arr2[t])
			{
				System.out.println("Not equal ");
				break;
			}
		}
		

	}

}
