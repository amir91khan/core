package abstractC;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle...");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle...");
	}
}

public class AbstractTest2 {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		s = new Rectangle();
		s.draw();

	}

}
