package abstractC;

abstract class Bike1 {
	Bike1() {
		System.out.println("bike is created...");

	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed..");
	}
}

class Honda1 extends Bike1 {
	void run() {
		System.out.println("running safely..");
	}
}

public class AbstractTest4 {

	public static void main(String[] args) {
		Bike1 b = new Honda1();
		b.run();
		b.changeGear();

	}

}
