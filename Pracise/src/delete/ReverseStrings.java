package delete;

public class ReverseStrings {

	public static void main(String[] args) {

		// method1();
		// method2();
		method3("ABCDEF");
		reverseString("ABCDEF");
		// System.out.println("Answer :" + test);
	}

	// recursive function to reverse a string
	static void reverseString(String string) {
		if ((string == null) || (string.length() <= 1))
			System.out.println(string);
		else {
			System.out.print(string.charAt(string.length() - 1));
			reverseString(string.substring(0, string.length() - 1));
		}
	}

	private static String method3(String input1) {

		String one = "";
		//one = one + ;
		System.out.print("One :" + one);

		

		String result = reverThis(input1)
				+ method3(input1.substring(0, input1.length() - 1));

		return result;
	}

	private static String reverThis(String input1) {
		if (input1 == null || input1.length() <=1) {
			return "";
		} else

			return input1.substring(input1.length() - 1, input1.length());
	}

	private static void method2() {

		String input1 = "ABCDEF";
		String result = "";

		for (int t = input1.length() - 1; t >= 0; t--) {
			result = result + input1.charAt(t);
		}
		System.out.println("Answer : " + result);

	}

	private static void method1() {

		String input1 = "ABCDEF";
		char[] charArray = input1.toCharArray();
		String finalString = "";
		for (char c : charArray) {
			finalString = c + finalString;
		}
		System.out.println("Answer : " + finalString);

	}

}
