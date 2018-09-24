package toString;

class A1 {
	int x = 10;

	public String toString() {
		return x + "";
	}
}

public class ToStringTest2 {

	public static void main(String[] args) {
		A1 obj = new A1();
		System.out.println(obj);
		System.out.println(obj.toString());

	}

}
