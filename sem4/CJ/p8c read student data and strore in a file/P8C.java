import java.io.*;
import java.util.Scanner;

public class P8C {
	public static void main(String[] args) throws IOException {
		String name, phoneNumber, address;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter Phone no.: ");
		phoneNumber = sc.nextLine();
		System.out.print("Enter Address: ");
		address = sc.nextLine();
		OutputStream fos = new FileOutputStream("student_data.txt");
		byte[] b1 = name.getBytes();
		fos.write(b1);
		byte[] b2 = phoneNumber.getBytes();
		fos.write(b2);
		byte[] b3 = address.getBytes();
		fos.write(b3);
		fos.close();
		System.out.println("File Created");
	}
}
