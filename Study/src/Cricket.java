import java.util.Arrays;
import java.util.Random;

public class Cricket {

	public static void main(String[] args) {

		String x = args[0];
		String y = args[1];
		int[] playerAInput = getint(x);
		int[] playerBInput = getint(y);
		String player = args[2];
		Cricket crik = new Cricket();

		int player1score = crik.iterate(playerAInput, player);
		System.out.println(" end of round 1 " + player1score);

		int player2Score = crik.iterate(playerBInput, "B");
		System.out.println(" end of round 2 " + player2Score);

		if (player1score == player2Score) {
			System.out.println("Both have same score");
		} else {
			if (player1score > player2Score) {
				System.out.println("Player 1 wins --" + player1score + " : " + player2Score);
			} else {
				System.out.println("player 2 wins  --" + player1score + " : " + player2Score);

			}
		}

	}

	public int iterate(int[] player1, String player) {

		int score1 = 0;
		// int score2 = 0;
		Random r = new Random();
		for (int t = 0; t < player1.length; t++) {
			int y = r.nextInt(6);
			System.out.println("At index :" + t + " Comp generated No:" + y + "  and Our Number is :" + player1[t]);
			if (!(player1[t] == y)) {

				if (player.equals("A")) {
					System.out.println("A");
					score1 = score1 + player1[t];
					//System.out.println("score1 :" + score1);
				} else {
					System.out.println("B");
					score1 = score1 + y;
					//System.out.println("score2 :" + score1);
				}

			} else {
				System.out.println("player1 out");
				break;
			}
		}
		return score1;
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
