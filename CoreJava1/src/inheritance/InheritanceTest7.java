package inheritance;

class C1 {
	private int x = 10;
}

class D1 extends C1 {
	int p = 20;
}

public class InheritanceTest7 {

	public static void main(String[] args) {
		D1 objd = new D1();
		System.out.println(objd.p);
		// System.out.println(objd.x);CE

	}

}
