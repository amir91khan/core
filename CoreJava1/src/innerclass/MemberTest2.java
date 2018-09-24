package innerclass;

class TestOuter {
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println("data is:" + data);
		}

	}
}

public class MemberTest2 {

	public static void main(String[] args) {
		TestOuter obj = new TestOuter();
		TestOuter.Inner in = obj.new Inner();
		in.msg();

	}

}
