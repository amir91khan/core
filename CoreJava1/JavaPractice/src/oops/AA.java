package oops;

public class AA {
	static int i=BB.j;

}
class BB extends A
{
	static int j=C.m1();
}
class C extends BB
{
	public static int m1()
	{
		return D.k;
	}
}
	class D extends C
	{
		static int k=10;
		public static void main(String arg[])
		{
			D d=new D();
			System.out.println(d);
		}
	}

