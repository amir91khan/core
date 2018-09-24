package innerClass1;
class Example
{
	static class B
	{
		static int a=10;
		 int x=20;
		private int y=30;
	}

	

	//public String x;

}
public class StaticClassTest1 {

	public static void main(String[] args) {
		 System.out.println("a:"+Example.B.a);
		 Example a1=new Example();
		 System.out.println("x:"+a1.x);

	}

}
