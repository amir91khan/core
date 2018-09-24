package inheritance;

class Vihicle {
	void run() {

		System.out.println("vihicle is running");
	}
}

class Bike extends Vihicle {
	void run() {
		System.out.println("bike is running safely");
	}
}

public class InheritanceTes20 {

	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.run();

	}

}
