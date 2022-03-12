public class P4B {
	public P4B() {
		System.out.println("Hello");
	}
	
	public void finalize() {
		System.out.println("Destroyed");
	}

	
	public static void main(String[] args) {
		P4B obj = new P4B();
		obj = null;
		System.gc();
	}
}
