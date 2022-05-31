package com.pract.sample;

public class SumOfAllDigit {

	public static void main(String[] args) {
	
		int givenNUmber = 1981;
		int sum=0;
		
		System.out.println("1 "+1982/10);
		while(givenNUmber !=0)
		{
			sum = sum + (givenNUmber%10);
			givenNUmber = givenNUmber/10;
			
		}
		
		//System.out.println("givenNumber "+givenNUmber);
		System.out.println("sum "+sum);
		
		
		
	}

}
