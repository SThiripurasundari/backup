package com.pract.sample;

public class Palindrome {

	public static void main(String[] args) {
		String str = "TEET";
		String rev = palid(str);
		System.out.println("Result " + rev);
		
		if(str.equals(rev))
		{
			System.out.println("same");
		}else
		{
			System.out.println("Not same");
			
		}
			
		
		
		
	}

	private static String palid(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}
		String c = str.substring(str.length() - 1, str.length());
		c = c + palid(str.substring(0, str.length() - 1));
		return c;
	}
}
