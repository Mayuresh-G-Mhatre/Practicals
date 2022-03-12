import java.io.*;

class A extends Thread {
	public void run() {
		System.out.println("Start A");
		for(int i=1; i<=5; i++) {
			System.out.println("Thread A i: "+i);
		}	
		System.out.println("Exit A");
	}
}

class B extends Thread {
		public void run() {
		System.out.println("Start B");
		for(int j=1; j<=5; j++) {
			System.out.println("Thread B j: "+j);
		}	
		System.out.println("Exit B");
	}
}
class C extends Thread {
	public void run() {
		System.out.println("Start C");
		for(int k=1; k<=5; k++) {
			System.out.println("Thread C k: "+k);
		}	
		System.out.println("Exit C");
	}
}
class D extends Thread {
	public void run() {
		System.out.println("Start D");
		for(int l=1; l<=5; l++) {
			System.out.println("Thread D l: "+l);
		}	
		System.out.println("Exit D");
	}
}
class P7C {
	public static void main(String[] args) {
		new A().start();
		new B().start();
		new C().start();
		new D().start();
	}
}
