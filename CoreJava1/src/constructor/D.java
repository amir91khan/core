package constructor;

public class D {
	D(int a) {
		System.out.println("in int-arg constructor");
	}

	public static void main(String[] args) {
		System.out.println("in main");
		// D d=new D();//CE bzcoz can not find symbol and symbol:constructor D()

	}

}
