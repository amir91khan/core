package oops;

public class Overload {
	public void m1()
	{
		System.out.println("no-org method");
	}
	public void m1(int i)
	{
		System.out.println("int-org method");
	}
	public void m1(float f)
	{
		System.out.println("float-org method");
	}
	

	public static void main(String[] args) {
		Overload o=new Overload();
		o.m1();
		o.m1(10);
		o.m1(10.5f);
		
	}

}
