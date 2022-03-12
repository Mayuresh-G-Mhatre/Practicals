import java.util.Scanner;


public class P2C {
	public static void main(String[] args) {
		String str;
		String reversedStr = "";
		int lenOfStr;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = sc.nextLine();

		lenOfStr = str.length();

		for(int i=(lenOfStr-1); i>=0; i--) {
			reversedStr += str.charAt(i);
		}

		System.out.println("Reversed string: " + reversedStr);
	}
}
