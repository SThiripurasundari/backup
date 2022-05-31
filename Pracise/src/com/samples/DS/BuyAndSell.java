package com.samples.DS;

import java.util.HashMap;

public class BuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input: prices = [7,1,5,3,6,4] Output: 5
		
		int[] input = {7,1,5,3,6}; 
		System.out.println("Test-->"+maxProfit1(input));

	}
	
	public static int maxProfit1(int[] prices) {
        int min_price=Integer.MAX_VALUE;
        int profit=0;
        for(int val:prices){
        	System.out.println("val :"+val);
            min_price=Math.min(min_price,val);
            System.out.println("min_price :"+min_price);
            System.out.println("val-min_price :"+(val-min_price));
            profit=Math.max(profit,val-min_price);
            System.out.println("profit :"+profit);
            System.out.println("--------------------------");
        }
        return profit;
    }

	public static int maxProfit(int[] prices) {
		
		
		int maxProfit = 0;
		int size = prices.length - 1;

		// The loop starts from 1 as its 
		// comparing with the previous
				for (int i = 1; i < size; i++)
					if (prices[i] > prices[i - 1])
						maxProfit += prices[i] - prices[i - 1];
				return maxProfit;

	}

}
