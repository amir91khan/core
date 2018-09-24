package interfaceC;

interface Printable1 {
	void print();
}

interface Showable1 extends Printable {
	void show();
}

class Test implements Showable1 {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

}

public class InterfaceTest8 {

	public static void main(String[] args) {
		Test t = new Test();
		t.print();
		t.show();

	}

}
