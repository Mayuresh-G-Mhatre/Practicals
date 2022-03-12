
public class P3B {
	public static long sumOfDigits() {
		char[] charArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		long sum = 0L;
		long temp = 0L;

		for(char ch : charArray) {
			// // converted the character to string and then used parseInt method to get the integer value from the string
			// sum += Integer.parseInt(Character.toString(ch)); 

			temp = ch - '0';
			sum += temp;
		}

		return sum;
	}


	public static void main(String[] args) {
		System.out.println("Sum is " + sumOfDigits());
	}
}
