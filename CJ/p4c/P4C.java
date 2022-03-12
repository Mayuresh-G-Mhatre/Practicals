abstract class Calc {
	public abstract int sqr(int n);
	public abstract int cube(int n);
	public void show() {
	System.out.println("Hello");
	}
}


public class P4C extends Calc {
	@Override
	public int sqr(int n) {
		return n*n;
	}

	@Override
	public int cube(int n) {
		return n*n*n;
	}
	
	public static void main(String[] args) {
		P4C obj = new P4C();

		int num = 15;

		int sq = obj.sqr(num);
		System.out.println("Square of " + num + " is " + sq);
		
		int cube = obj.cube(num);
		System.out.println("Cube of " + num + " is " + cube);
	}
}
