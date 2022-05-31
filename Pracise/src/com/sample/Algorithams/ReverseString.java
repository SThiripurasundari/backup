package com.sample.Algorithams;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] charArray ={ 'h','e','l','l','o' }; 
		reverseString(charArray);
			//	Output: ["o","l","l","e","h"]

	}
	
	 public static void reverseString(char[] s)
	 {
		 int l= s.length-1;
		 int ptr =0;
		 char temp =0;
		 while(ptr<l)
		 {
			 temp = s[l];
			 s[l] = s[ptr];
			 s[ptr] = temp;
			 ptr++;
			 l--;
			 
			 System.out.println("result "+Arrays.toString(s));
			 
		 }
		 
	 }
	

}
