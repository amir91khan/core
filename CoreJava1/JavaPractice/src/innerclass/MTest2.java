package innerclass;

class Test1 {
	private int data = 40;

	class Inner1 {
		void msg() {
			System.out.println("data is:" + data);
		}

	}

}

public class MTest2 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		Test1.Inner1 i = t.new Inner1();
		i.msg();

	}

}
