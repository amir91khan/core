package inheritance;

class A1 {
	private int x = 10;

	int getX() {
		return x;
	}
}

class B1 extends A1 {
	void m1() {
		int p = getX();
		System.out.println(p);
	}

}

public class InheritanceTest2 {

	public static void main(String[] args) {
		B objb = new B();
		objb.m1();

	}

}
