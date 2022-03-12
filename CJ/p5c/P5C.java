interface s{
	public void show();
}

interface t extends s {
	public void display();
}

class P5C implements t {
	public void show() {
		System.out.println("from interface s");
	}

	public void display() {
		System.out.println("from interface t");
	}
	public static void main(String[] args) {
		P5C p = new P5C();
		p.show();
		p.display();	
	}
}
