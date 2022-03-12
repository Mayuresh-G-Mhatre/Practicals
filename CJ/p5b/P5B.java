class A {
	void show() {
		System.out.println("Base Class");
	}
}

class B extends A {
	void show() {
		System.out.println("Derived Class");
	}
}

class P5B {
	public static void main(String[] args) {
	B p=new B();
	p.show();
	}
}
