package com.samples.DynamicProgramming;

public class Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		System.out.println("result--->"+rob(nums));
	
	}

	//ot working ---- logic is wrong 
	public static int rob(int[] nums) {
	    int length = nums.length;
		int evenSum= 0;
		int oddSum= 0;
		System.out.println("length%2--->"+10%2);
		System.out.println("length%2--->"+5/2);
		
		
			for(int t=0;t<nums.length;t=t+2)
				evenSum= evenSum + nums[t];
					
			
			for(int t=1;t<nums.length;t=t+2)
				oddSum = oddSum + nums[t];
					
			
		
		System.out.println("odd--->"+oddSum);
		System.out.println("even--->"+evenSum);
		
		if(oddSum>evenSum)
		{
			return oddSum;
		}else 
			return evenSum;
		
		
		
	}
}
