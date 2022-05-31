package delete;

public class Factorial {

	public static void main(String[] args) {

		int factor = 1;
		int t = 5;

		for (int x = 2; x <= t; x++) {

			factor = factor * x;
		}

		System.out.println("Answer  :" + factor);

	}

}
