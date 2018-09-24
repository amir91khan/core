package inheritance;

class Demo2 {
	void m1() {
		System.out.println("m1 of Demo2");
	}

	void m2() {
		System.out.println("m2 of Demo2");
	}
}

class Demo3 extends Demo2 {
	void m3() {
		System.out.println("m3 of Demo3");
	}

	void m1() {
		System.out.println("overriding method");
	}
}

public class InheritanceTest19 {

	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
