package com.pract.sample;

public class ReverseTheSentence {

	public static void main(String[] args) {
		// Input: s = “geeks quiz practice code”
		// Output: s = “code practice quiz geeks”

		String input = "geeks quiz practice code";

		String[] inputArray = input.split("\\s");

		String reverseSentence = "  ";

		for (int t = 0; t < inputArray.length; t++) {

			// reverseSentence = getWordReversed(inputArray[t]) +" "+reverseSentence;

			reverseSentence = inputArray[t] + "  "+ reverseSentence;

		}
		System.out.println("reverseSentence " + reverseSentence);

	}

	private static String getWordReversed(String word) {
		String reveredWord = "";

		for (int t = 0; t < word.length(); t++) {

			reveredWord = word.charAt(t) + reveredWord;
		}

		System.out.println("reveredWord " + reveredWord);
		return reveredWord;
	}

}
