package interfaceC;

import interfaceC.Showable5.Message;

interface Showable5 {
	void show();

	interface Message {
		void msg();

	}

}

class Test5 implements Showable5.Message {
	public void msg() {
		System.out.println("Hello msg");
	}

	public void show() {
		System.out.println("Hello show");
	}

}

public class NestedInterfaceTest1 {

	public static void main(String[] args) {
		Showable5 s = null;
		Showable5.Message message = null;
		Test5 t = new Test5();
		message = t;

		// Showable5 message1=(Showable5) new Test5();
		message.msg();
		// message.show();
		// ((Showable5) message1).show();
		// message1.show();

	}

}
