package inheritance;

class C {
	int x = 10;
	int y = 20;
}

class D extends C {
	int p = 30;
	int q = 40;
}

public class InheritanceTest3 {

	public static void main(String[] args) {
		D objd = new D();
		System.out.println(objd.x);
		System.out.println(objd.y);
		System.out.println(objd.p);
		System.out.println(objd.q);

	}

}
