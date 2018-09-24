package constructor;

class Point1 {
	private int x;
	private int y;

	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void printXY() {
		System.out.println(x);
		System.out.println(y);
	}
}

public class ConTest4 {

	public static void main(String[] args) {
		Point1 point = new Point1(100, 200);
		point.printXY();
		Point1 point1 = new Point1(400, 500);
		point.printXY();
		point.setXY(900, 400);
		point1.printXY();
		point1.setXY(100, 600);

	}

}
