import java.util.Scanner;


public class P3A {
	public static void getCount(String s) {
		char[] stringToCharArray = s.toCharArray();
		int lettersCount = 0;
		int spacesCount = 0;
		int numbersCount = 0;
		int othersCount = 0;

		for(char element : stringToCharArray) {
			if(Character.isLetter(element)) {
				lettersCount++;
			}
			else if(Character.isSpaceChar(element)) {
				spacesCount++;
			}
			else if(Character.isDigit(element)) {
				numbersCount++;
			}
			else {
				othersCount++;
			}
		}

		System.out.println("Count of letters: " + lettersCount);
		System.out.println("Count of spaces: " + spacesCount);
		System.out.println("Count of digits: " + numbersCount);
		System.out.println("Count of other characters: " + othersCount);
	}


	public static void main(String[] args) {
		String str;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		str = sc.nextLine();

		System.out.println();

		getCount(str);
	}

}