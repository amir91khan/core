package oops;

class Exmpale {
	static void m1() {
		System.out.println("example m1");
	}

	void m2() {
		System.out.println("example m2");
	}

	void m3() {
		System.out.println("example m3");
	}

	void m4() {
		System.out.println("example m4(no-param)");
	}
}

class Sample extends Exmpale {
	static void m1() {
		System.out.println("sample m1");
	}

	void m2() {
		System.out.println("sample m2");
	}

	void m4(String s) {
		System.out.println("sample m3(int-param)");
	}
}

public class Exmple {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
		s.m4("hello");
		Exmpale e = new Exmpale();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
		

	}

}
