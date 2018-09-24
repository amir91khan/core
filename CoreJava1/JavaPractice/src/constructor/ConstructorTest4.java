package constructor;

class Point {
	private int x;
	private int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void setXY(int x, int y) {
		// void print XY()
		// {
		System.out.println(x);
		System.out.println(y);
	}

}

public class ConstructorTest4 {

	public static void main(String[] args) {
		Point p1 = new Point(100, 200);
		// p1.print XY();
		Point p2 = new Point(300, 400);
		// p2.print XY();
		p1.setXY(100, 400);
		// p2.printXY(100, 600);
		// p2.printXY();

	}

}
