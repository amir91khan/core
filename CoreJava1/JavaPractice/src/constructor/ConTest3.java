package constructor;

class Rectangle1 {
	private float l;
	private float b;

	Rectangle1(float l, float b) {
		this.l = l;
		this.b = b;
	}

	float findArea() {
		return l * b;
	}

	void setL(float l) {
		this.l = l;

	}

	void setB(float b) {
		this.b = b;
	}
}

public class ConTest3 {

	public static void main(String[] args) {
		Rectangle1 rectangle1 = new Rectangle1(1.2f, 2.5f);
		Rectangle1 rectangle2 = new Rectangle1(3.5f, 4.5f);
		float area1 = rectangle1.findArea();
		float area2 = rectangle2.findArea();
		System.out.println("Area is" + area1);
		System.out.println("Area is" + area2);

	}

}
