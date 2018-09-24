package referencetypeconversion;

class Manager {
	void m1() {
		System.out.println("m1 of manager");
	}

	void m2() {
		System.out.println("m2 of manager");
	}
}

class SalesManager extends Manager {
	void m3() {
		System.out.println("m3 of salaesmanager");
	}

	void m1() {
		System.out.println("overriding m1 method");
	}
}

public class WideningConveTest1 {

	public static void main(String[] args) {
		SalesManager sm = new SalesManager();
		sm.m1();
		sm.m2();
		sm.m3();
		Manager m=sm;
		m.m1();
		m.m2();

	}

}
