package abstractC;

abstract class Bank {
	abstract int getRateOfInterest();
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class PNB extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

public class AbstractTest3 {

	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("Rate of interest is" + b.getRateOfInterest() + "%");
		b = new PNB();
		System.out.println("Rate of interest is" + b.getRateOfInterest() + "%");
		b = new AXIS();
		System.out.println("Rate of interest is" + b.getRateOfInterest() + "%");

	}

}
