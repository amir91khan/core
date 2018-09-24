package oops;

public class Test12 {
	Test12(double d)
	{
		System.out.println("double-arg constructor");
	}
	Test12(int i)
	{
		this(10.5);
		System.out.println("int-arg constructor");
	}
	Test12()
	{
		this(10);
		System.out.println("no-arg constructor");
	}
	

	public static void main(String[] args) {
		Test12 t1=new Test12();
		Test12 t2=new Test12(10);
		Test12 t3=new Test12(10.5);
			
	}

}
