package com.test;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {

		int[] playerAInput = getint(args[0]);
		int[] playerBInput = getint(args[1]);

		String ply1;
		String ply2;
		Test2 crik = new Test2();

		if ("A".equals(args[2])) {
			ply1 = "User";
			ply2 = "Comp";

			System.out.println("Player 1 is User (batting) and Player 2 is Comp (bowling)");
		} else {
			ply1 = "Comp";
			ply2 = "User";
			System.out.println("Player 1 is Computer (batting) and Player 2 is User (bowling)");
		}

		int round1score = crik.iterate(playerAInput, ply1);
		System.out.println("End of round 1 score is " + round1score);

		int round2Score = crik.iterate(playerBInput, ply2);
		System.out.println("End of round 2 score is  " + round2Score);

		if (round1score == round2Score) {
			System.out.println("Both have same score");
		} else {
			if (round1score > round2Score) {
				System.out.println("Player 1 wins with Score :" + round1score + " : " + round2Score);
			} else {
				System.out.println("Player 2 wins with Score :" + round1score + " : " + round2Score);

			}
		}

	}

	public int iterate(int[] userInput, String player) {

		int score = 0;
		int y = 0;

		Random r = new Random();
		for (int t = 0; t < userInput.length; t++) {
			y = r.nextInt(6);
			while (y == 5) {
				y = r.nextInt(6);
			}
			if (!(userInput[t] == y)) {
				System.out.println("At index :" + t + " Computer generated No :  " + y + "  and User given Number is :"
						+ userInput[t]);

				if (player.equals("User")) {

					score = score + userInput[t];

				} else {
					score = score + y;
				}

			} else {
				System.out.println("At index :" + t + " both players got same gesture :   " + y + ":" + userInput[t]);
				System.out.println(player + "  is out !!");
				break;
			}
		}
		return score;
	}

	public static int[] getint(String x) {
		int[] input = new int[6];
		char[] charst = x.toCharArray();

		for (int q = 0; q < x.length(); q++) {
			input[q] = Integer.parseInt(String.valueOf((charst[q])));
		}
		return input;

	}

}
