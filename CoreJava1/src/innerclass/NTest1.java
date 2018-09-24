package innerclass;

class A1 {
	static class B1 {
		void m1() {
			System.out.println("m1 of B1");
		}
	}
}

public class NTest1 {

	public static void main(String[] args) {
		A1.B1 obj = new A1.B1();
		obj.m1();

	}

}
