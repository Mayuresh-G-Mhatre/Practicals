import java.io.*;

public class P8A {
	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream(".\\sample.txt");
		DataInputStream inst = new DataInputStream(input);
		int count = input.available();
		byte[] a = new byte[count];
		inst.read(a);
		for(byte b:a) {
			char k = (char)b;
			System.out.print(k + "-");
		}
	}
}
