package interfaceC;

interface Bank {
	float rateOfInterest();
}

abstract class SBI implements Bank {
	public float rateOfinterest() {
		return 9.15f;
	}
}

class PNB implements Bank {
	public float rateOfInterest() {
		return 9.7f;
	}
}

public class InterfaceTest6 {

	public static void main(String[] args) {
		Bank b = new PNB();
		System.out.println("RateOfInterest" + b.rateOfInterest());

		b = new PNB();
		System.out.println("RateOfInterest" + b.rateOfInterest());

	}

}
