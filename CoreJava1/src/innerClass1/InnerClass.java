package innerClass1;

public class InnerClass {
	static class A
	{
		private int x=20;
		static void m1()
		{
			System.out.println("inner class SM m1");
		}
		void m2()
		{
			System.out.println("inner class NSM m2");
			
		}
	}

	public static void main(String[] args) {
		
		A.m1();
		A a=new A();
		System.out.println(a.x);
		a.m2();
	}

}
