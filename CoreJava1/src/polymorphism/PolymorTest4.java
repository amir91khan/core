package polymorphism;

class Shape {

	void draw1() {
		System.out.println("drawing1...");
	}

	static void draw4() {
		System.out.println("drawing4...");
	}

	void draw() {
		System.out.println("drawing...");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle...");
	}
}

class Circle extends Shape {
	void draw2() {
		System.out.println("drawing circle2...");
	}

	void draw() {
		System.out.println("drawing circle...");
	}

	static void draw4() {
		System.out.println("drawing4c...");
	}

}

class Triangle extends Shape {
	void draw() {
		System.out.println("drawing triangle...");
	}
}

public class PolymorTest4 {

	public static void main(String[] args) {
		Shape s = new Rectangle();
		s.draw();
		s.draw1();
		// s.draw2();

		s.draw4();
	}

}
