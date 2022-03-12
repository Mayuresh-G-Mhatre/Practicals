import java.io.*;

public class P8B {
	public static void main(String[] args) {
		FileInputStream instream = null;
		FileOutputStream outstream = null;
		try {
			File inF = new File(".\\test.txt");
			File outF = new File(".\\test1.txt");
			instream = new FileInputStream(inF);
			outstream = new FileOutputStream(outF);
			byte[] buffer = new byte[1024];
			int length;
			while((length = instream.read(buffer))>0) {
				outstream.write(buffer,0,length);
			}
			instream.close();
			outstream.close();
			System.out.println("Done");
		}

		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
