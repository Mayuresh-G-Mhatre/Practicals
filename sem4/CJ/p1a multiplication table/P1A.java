import java.util.Scanner;


public class P1A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // create a scanner object
        
        System.out.print("Enter a number: "); // asked user to give input
        int num = sc.nextInt(); // read user input
        
        // initialised i as 1 and gave condition to stop after i reaches 10 when incremented by 1 everytime
        for(int i=1;i<=10;i++){ 
            System.out.println(num + " * " + i + " = " + (num*i)); // printed the table in format
        }
	}
}