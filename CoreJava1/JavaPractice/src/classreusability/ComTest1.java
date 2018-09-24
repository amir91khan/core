package classreusability;

class A {
	int x = 10;
	
}

class B {
	int y = 20;
	A obja = new A();
}

public class ComTest1 {

	public static void main(String[] args) {
		B objb = new B();
		System.out.println(objb.y);
		System.out.println(objb.obja.x);

	}

}
