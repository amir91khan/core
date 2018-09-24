package finalT;

class Circle {
	private float r;
	private final float p1 = 3.14f;

	void setR(float r) {
		this.r = r;
	}

	float findArea() {
		return r * r * r;
	}
}

public class FinalTest1 {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setR(1.5f);
		float area = circle1.findArea();
		System.out.println(area);

	}

}
