import java.util.Scanner;


class P2B {
	public static void main(String[] args) {
		int decimalNumber;
		String binaryNumber;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");  
		decimalNumber = sc.nextInt();

		sc.nextLine();  // to catch the new line character after entering the integer value and pressing enter

		System.out.print("Enter a binary number: ");  // taking binary number input as a string
		binaryNumber = sc.nextLine();
 
		System.out.println("\nDecimal to Binary: " + Integer.toBinaryString(decimalNumber));  // converting binary number to decimal
		System.out.println("Binary to Decimal: " + Integer.parseInt(binaryNumber, 2));  // converting decimal number to binary
	}
}