package com.test;

import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		
		int[] player1 = new int[6];
		System.out.println("args.length -->" + args.length);
		for (int t = 0; t < args.length; t++) {
			String args1 = args[t];
			player1[t] = Integer.parseInt(args1);

		}
		for (int t = 0; t < 6; t++) {
			String args1 = args[t];
			player1[t] = Integer.parseInt(args1);
			System.out.println(" t" +t);
		}
		System.out.println("Input Array -->" + Arrays.toString(player1));
		int[] player2 = new int[11];
		for (int t = 6; t < args.length-1; t++) {
			System.out.println(" t" +t);
			String args1 = args[t];
			System.out.println(" args : " +args1);
			player2[t] = Integer.parseInt(args1);

		}
		System.out.println("Input Array -->" + Arrays.toString(player2));
		Random r = new Random();
		int score1 = 0;
		int score2 = 0;

		// first iteration
		for (int t = 0; t < player1.length; t++) {
			int y = r.nextInt(6);
			System.out.println("At index :" + t + " Comp generated No:" + y + "and Our Number is :" + player1[t]);
			if (!(player1[t] == y)) {
				score1 = score1 + player1[t];
				// score2 = score2 + y;

			} else {
				System.out.println("player1 out");
				break;
			}
		}

		// second iteration
		for (int t = 0; t < player1.length; t++) {
			int y = r.nextInt(6);
			System.out.println("At index :" + t + " Comp generated No:" + y + "and Our Number is :" + player1[t]);
			if (!(player1[t] == y)) {
				// score1 = score1 + player1[t];
				score2 = score2 + y;

			} else {
				System.out.println("player2 out");
				break;
			}
		}

		if (score1 == score2) {
			System.out.println("Both same score");
		} else {
			if (score1 > score2) {
				System.out.println("Player 1 wins " + score1 + " : " + score2);
			} else {
				System.out.println("player 2 wins" + score1 + " : " + score2);

			}
		}

	}

}
