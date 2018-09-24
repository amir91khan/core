package classreusability;

class A1 {
	int x = 10;
}

class B1 {
	int y = 20;
	A obja = new A();
}

class C {
	int z = 30;
	B1 objb = new B1();
}

public class ComTest2 {

	public static void main(String[] args) {
		C objc = new C();
		System.out.println(objc.z);
		System.out.println(objc.objb.y);
		System.out.println(objc.objb.obja.x);

	}

}
