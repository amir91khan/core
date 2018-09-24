package innerClass1;

public class TestMemberOuter {
	private int data=30;
	class Inner
	{
		void msg()
		{
			System.out.println("data is:"+data);
		}
	}

	public static void main(String[] args) {
		TestMemberOuter o=new TestMemberOuter();
		TestMemberOuter.Inner in=o.new Inner();
		in.msg();
		

	}


}
