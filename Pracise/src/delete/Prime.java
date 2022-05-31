package delete;

public class Prime {

	public static void main(String[] args) {

		int test = 10;
		boolean isPrime = true;

		for (int t = 2; t < test / 2; t++) {
			if (test % t == 0) {
				
				System.out.println("Not prime -->" + test + "divided by " + t);
				isPrime = false;
				break;
			}
		}
		
		System.out.println("isprime "+isPrime);

	}

}
