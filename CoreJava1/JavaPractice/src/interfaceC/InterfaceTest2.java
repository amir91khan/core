package interfaceC;

interface Sim {
	void connect();
}

class AirtelSim implements Sim {
	public void connect() {
		System.out.println("connect to airtel sim");
	}
}

class BSNLSim implements Sim {
	public void connect() {
		System.out.println("connect to bsnl sim");
	}
}

class Mobile {
	void insert(Sim s) {
		s.connect();

	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		BSNLSim sim1 = new BSNLSim();
		AirtelSim sim2 = new AirtelSim();
		m.insert(sim1);
		m.insert(sim2);

	}

}
