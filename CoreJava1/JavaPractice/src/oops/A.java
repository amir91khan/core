package oops;

public class A {
	private void m1()
	{
		System.out.println(" m1 of A");
	}
	void m2()
	{
		System.out.println("m2 of A");
		
	}
}
	class B extends A
	{
		 void m1()
		{
			System.out.println("B of m1");
		}
		
	

	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.m2();
		A a=new A();
		//a.m1();
		a.m2();
		
	}

}
