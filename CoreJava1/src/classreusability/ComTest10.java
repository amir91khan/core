package classreusability;

class A2 {
	void printA2() {
		System.out.println("print method of A class");

	}
}

class B2 {
	private A2 a;

	public B2(A2 a) {
		this.a = a;

	}

	void printB2() {
		a.printA2();
		System.out.println("print method of B class");
	}
}

public class ComTest10 {

	public static void main(String[] args) {
		A2 obja = new A2();
		B2 objb = new B2(obja);
		objb.printB2();

	}

}
