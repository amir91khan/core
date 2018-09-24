package inheritance;

class P {
	{
		System.out.println("Non Static Block ");
	}

	P() {
		System.out.println("NPCP");
	}

	P(int x) {
		System.out.println("OPCP");
	}
}

public class InheritanceTest13 {

	public static void main(String[] args) {
		P obj1 = new P();
		P obj2 = new P(10);

	}

}
