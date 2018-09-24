package inheritance;

class Demo {
	int x;
	static int y;
	static {
		System.out.println("static block of parent class");
	}
	{
		System.out.println("non static block of child class");
	}

	Demo() {
		System.out.println("constructor of parent class");
	}
}

class Demo1 extends Demo {
	int p;
	static int q;
	static {
		System.out.println("static block of child class");
	}
	{
		System.out.println("non static block of child class");
	}

	Demo1() {
		System.out.println("constructor of child class");
	}
}

public class InheritanceTest18 {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();

	}

}
