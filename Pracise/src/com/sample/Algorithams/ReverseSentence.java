package com.sample.Algorithams;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Let's take LeetCode contest";
		System.out.println("final -->" + reverseWords(test));
	}

	public static String reverseWords(String s) {

		String[] strArray = s.split("\\s");
		String reversed = "   ";

		for (int i = 0; i < strArray.length; i++) {
			char[] charStr = strArray[i].toCharArray();
			String wordEachReverse = " ";

			int length = charStr.length - 1;

			for (int y = length; y >= 0; y--) {

				wordEachReverse = wordEachReverse + Character.toString(charStr[y]);
			}
			reversed = reversed + " " + wordEachReverse;
		}
		return reversed;
	}

}
