package finalT;

class A {
	final int x = 10;
	final int y;

	// final static z=50;
	A() {
		y = 20;
	}
}

public class FinalTest2 {

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.x);
		System.out.println(obj.y);
		// System.out.println(A.z);

	}

}
