package com.test;

import java.util.Random;

public class Test4 {
	static final String identifier_name= ""; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test4 test4 = new Test4();
		String player1 = args[0];
		int scoreA = 0;
		int scoreB = 0;
		String player2 = null;

		if (player1.equals("A")) {
			player2 = "B";
		} else {
			player2 = "A";
		}

		scoreA = test4.getScoreCalculated(player1);
		System.err.println(player1 +"score is "+scoreA);
		scoreB = test4.getScoreCalculated(player2);
		StringBuilder builder1 = new StringBuilder();
		builder1.append(player2 ).append("Score is ").append(scoreB);
		System.err.println(player2 +"score is  "+scoreB);
		System.out.println("333333333" +builder1);


		if (scoreA == scoreB) {
			System.out.println("same score");
		} else {
			if (scoreA > scoreB) {
				System.out.println(player1 +" wins  score " + scoreA);

			} else {
				System.out.println(scoreB + "  wins  score " + scoreB);

			}
		}
	}

	private int getScoreCalculated(String player) {
		int score = 0;
		int randDataA = 0;
		int randDataB = 0;
		Random random = new Random();
		Random random2 = new Random();

		for (int t = 0; t < 6; t++) {
			randDataA = random.nextInt(6);
			
			while(randDataA == 5)
			{
				randDataA = random.nextInt(6);
			}
			randDataB = random2.nextInt(6);
			while(randDataB == 5)
			{
				randDataB = random2.nextInt(6);
			}
			
			
			System.out.println("Random1 "+randDataA + "Random2 "+randDataB);
			
			if (randDataA == randDataB) {
				System.err.println("both same score" + player + " out");
				break;
			} else {
				if (player.equals("A")) {
					score = score + randDataA;
				} else {
					score = score + randDataB;
				}
			}

		}

		return score;
	}

}
