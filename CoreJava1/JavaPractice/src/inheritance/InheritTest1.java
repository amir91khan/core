package inheritance;

class A {
	int x = 10;
}

class B extends A {
	void m1() {
		System.out.println(x);
	}
}

public class InheritTest1 {

	public static void main(String[] args) {
		B objb = new B();
		objb.m1();

	}

}
