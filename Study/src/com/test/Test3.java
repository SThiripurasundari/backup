package com.test;

import java.util.Arrays;
import java.util.Random;

public class Test3 {

	public static void main(String[] args) {
		Test3 test = new Test3();
		
		
		int[] input1 = test.getIntArray(args[0]);
		int[] input2 = test.getIntArray(args[1]);
		
		
		
		// String player = ;
		System.out.println("1 :" + Arrays.toString(input1));
		System.out.println("2 :" + Arrays.toString(input2));
		int scoreA = 0;
		int scoreB = 0;

		String player1 = null;
		String player2 = null;

		player1 = args[2];
		if (player1.equals("A")) {
			System.out.println("Player A (User) bats first");
			player2 = "B";

		} else {
			System.out.println("Player B (Computer) bats first");
			player2 = "A";

		}

		scoreA = test.getScoreCalculated(input1, player1);
		
		scoreB = test.getScoreCalculated(input2, player2);

		if (scoreA == scoreB) {
			System.out.println("same score");
		} else {
			if (scoreA > scoreB) {
				System.out.println("A wins  score" + scoreA);

			} else {
				System.out.println("B wins  score" + scoreB);

			}
		}
	}

	private int getScoreCalculated(int[] input, String player) {
		int score = 0;
		int randData = 0;
		Random random = new Random();

		for (int t = 0; t < input.length; t++) {
			randData = random.nextInt(6);
			while (randData == 5) {
				randData = random.nextInt(6);
			}

			if (randData != input[t]) {

				if (player.equals("A")) {
					System.out.println("At index :" + t + " " + player + " gesture is  :  " + input[t]
							+ " and  next player  gesture is :" + randData);
					score = score + input[t];

				} else {
					System.out.println("At index :" + t + " " + player + " gesture is  :  " + randData
							+ " and  next player  Number is :" + input[t]);
					score = score + randData;
				}

			} else {
				System.out.println("Same gesture so player" + player + " s out");
				break;
			}

		}

		return score;
	}

	private int[] getIntArray(String input) {
		int[] output = new int[6];
		char[] charInput = input.toCharArray();

		for (int t = 0; t < input.length(); t++) {

			output[t] = Integer.parseInt(String.valueOf(charInput[t]));
		}
		return output;
	}

}
