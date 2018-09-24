package interfaceC;

interface DebitCard {
	void withdraw();
}

class SBIDebitCard implements DebitCard {
	public void withdraw() {
		System.out.println("50000");
	}
}

class HDFCDebitCard implements DebitCard {
	public void withdraw() {
		System.out.println("20000");
	}
}

public class InterfaceTest1 {

	public static void main(String[] args) {
		DebitCard dc = new SBIDebitCard();
		dc.withdraw();
		dc = new HDFCDebitCard();
		dc.withdraw();

	}

}
