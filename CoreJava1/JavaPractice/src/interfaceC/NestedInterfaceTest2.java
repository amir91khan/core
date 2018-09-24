package interfaceC;

class AA {
	interface Message1 {
		void msg();
	}
}

class Test2 implements AA.Message1 {
	public void msg() {
		System.out.println("Hello Test");
	}
}

public class NestedInterfaceTest2 {

	public static void main(String[] args) {
		AA.Message1 message = new Test2();
		message.msg();

	}

}
