package com.pract.sample;

public class LeastPrimeFactor {

	public static void main(String[] args) {
		 int n = 51;
	        System.out.println (smallestDivisor(n));

	}
	
	static int smallestDivisor(int n)
	{
	    // if divisible by 2
	    if (n % 2 == 0)
	        return 2;
	 
	    // iterate from 3 to sqrt(n)
	  
	    for (int i = 3; i * i <= n; i += 2) {
	    	  System.out.println("SQRT :"+i*i);
	        if (n % i == 0)
	            return i;
	    }
	 
	    return n;
	}

}
