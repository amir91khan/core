package inheritance;

class P2 {
	int x;
	static int y;

	P2() {
		System.out.println("inside constructor");
	}

	{
		System.out.println("non static block");
	}
	static {
		System.out.println("inside static block");
	}
}

public class StaticBlockTest17 {

	public static void main(String[] args) {
		P2 obj1 = new P2();

	}

}
