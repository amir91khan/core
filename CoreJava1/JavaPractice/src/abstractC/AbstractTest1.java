package abstractC;

abstract class Bike {
	abstract void run(); 
		
	}
	



class Honda extends Bike {
	void run() {
		System.out.println("running safely...");
	}
}

public class AbstractTest1 {

	public static void main(String[] args) {
		Bike obj = new Honda();
		obj.run();

	}

}
