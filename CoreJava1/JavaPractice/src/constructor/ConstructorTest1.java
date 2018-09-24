package constructor;

class Triangle {
	private float base;
	private float height;

	Triangle() {
		base = 1.5f;
		height = 2.5f;
	}

	float findArea() {
		return 0.5f * base * height;
	}

}

public class ConstructorTest1 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		System.out.println(t1.findArea());

	}

}
