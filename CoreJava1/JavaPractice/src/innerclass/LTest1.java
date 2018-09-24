package innerclass;

class A2 {
	void m1() {
		class B2 {
			void m2() {
				System.out.println("m2 of B2");
			}
		}
		B2 obj = new B2();
		obj.m2();
	}
}

public class LTest1 {

	public static void main(String[] args) {
		A2 obj1 = new A2();
		obj1.m1();

	}

}
