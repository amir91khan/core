package innerclass;

class D {
	private int x = 10;
	private int y = 20;

	void m1() {
		class D1 {
			void m2() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		D1 o = new D1();
		o.m2();
	}
}

public class LTest3 {

	public static void main(String[] args) {
		D o1 = new D();
		o1.m1();

	}

}
