class P9C {
	public static void main(String args[]) {
		int a[] = {5, 10};
		int b = 5;

		try {
			int x = a[2]/(b-a[0]);
		}
		catch(ArithmeticException e) {
			System.out.println("Division By Zero Not Possible");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Error");
		}
		finally {
			int  y = a[1]/a[0];
			System.out.println("Result: " + y);
		}
	}
}
