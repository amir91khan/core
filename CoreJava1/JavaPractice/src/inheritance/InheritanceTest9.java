package inheritance;

class A4 {
	A4(int x) {
		System.out.println("OPCA");
	}
}

class B4 extends A4 {
	B4() {
		super(10);
		System.out.println("NPCB");
	}
}

public class InheritanceTest9 {

	public static void main(String[] args) {
		B4 objb = new B4();
		//B4 objb1=new B4();

	}

}
