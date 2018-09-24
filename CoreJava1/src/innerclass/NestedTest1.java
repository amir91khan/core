package innerclass;

class A {
	static class B {
		void m1() {
			System.out.println("m1 of B");
		}
	}
}

public class NestedTest1 {

	public static void main(String[] args) {
		A.B obj = new A.B();
		obj.m1();

	}

}
