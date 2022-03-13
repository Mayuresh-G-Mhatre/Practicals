public class P1B {
	public static void main(String[] args) {
		int noOfSpaces=0;
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=noOfSpaces;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
			noOfSpaces++;
		}	
	}
}

	