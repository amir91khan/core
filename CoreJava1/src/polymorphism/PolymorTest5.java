package polymorphism;

class Shape1 {
	void draw1() {
		System.out.println("drawing...");
	}
}

class Rectangle1 extends Shape1 {
	void draw1() {
		System.out.println("Rectangle drawing ");
	}
}

class Circle1 extends Shape1 {
	void draw1() {
		System.out.println("Circle drwaing...");
	}
}

class Triangle1 extends Shape1 {
	void draw1() {
		System.out.println("Triangle drawing...");
	}
}

public class PolymorTest5 {

	public static void main(String[] args) {
		Shape1 s = new Rectangle1();
		s.draw1();
		s = new Circle1();
		s.draw1();
		s = new Triangle1();
		s.draw1();

	}

}
