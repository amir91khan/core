package polymorphism;

class Bike {
	void run() {
		System.out.println("running");
	}
}

class Splender extends Bike {
	void run() {
		System.out.println("running safely with 50km");
	}
}

public class PolymorTest2 {

	public static void main(String[] args) {
		Bike b = new Splender();
		b.run();

	}

}
