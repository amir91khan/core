package interfaceC;

interface Printable {
	void print();
}

interface Showable {
	void show();
}

class A2 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}
}

public class InterfaceTest7 {

	public static void main(String[] args) {
		A2 obj = new A2();
		obj.print();
		obj.show();

	}

}
