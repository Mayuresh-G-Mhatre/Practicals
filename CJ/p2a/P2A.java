import java.util.Scanner;


public class P2A {
    public static void main(String[] args) {
        String num1;
        String num2;
        int num1Binary;
        int num2Binary;
        int sum;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextLine();  // take binary number input as a string

        System.out.print("Enter second number: ");
        num2 = sc.nextLine();  // take binary number input as a string

        // convert the binary string to binary number 
        num1Binary = Integer.parseInt(num1, 2);
        num2Binary = Integer.parseInt(num2, 2);
        
        sum = num1Binary + num2Binary;

        System.out.println("Sum: "+Integer.toBinaryString(sum));  // print the sum in binary format
    }
}